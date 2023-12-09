/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudpedidos.Persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.crudpedidos.Logica.Cliente;
import com.mycompany.crudpedidos.Logica.DetallePedido;
import com.mycompany.crudpedidos.Logica.Pedido;
import com.mycompany.crudpedidos.Persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PedidoJpaController implements Serializable {

    public PedidoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public PedidoJpaController() {
        emf = Persistence.createEntityManagerFactory("CrudPedidosPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Pedido pedido) {
        if (pedido.getDetalle_Pedido() == null) {
            pedido.setDetalle_Pedido(new ArrayList<DetallePedido>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente cliente = pedido.getCliente();
            if (cliente != null) {
                cliente = em.getReference(cliente.getClass(), cliente.getDni());
                pedido.setCliente(cliente);
            }
            List<DetallePedido> attachedDetalle_Pedido = new ArrayList<DetallePedido>();
            for (DetallePedido detalle_PedidoDetallePedidoToAttach : pedido.getDetalle_Pedido()) {
                detalle_PedidoDetallePedidoToAttach = em.getReference(detalle_PedidoDetallePedidoToAttach.getClass(), detalle_PedidoDetallePedidoToAttach.getCodigo_DetallePedido());
                attachedDetalle_Pedido.add(detalle_PedidoDetallePedidoToAttach);
            }
            pedido.setDetalle_Pedido(attachedDetalle_Pedido);
            em.persist(pedido);
            if (cliente != null) {
                cliente.getPedidos().add(pedido);
                cliente = em.merge(cliente);
            }
            for (DetallePedido detalle_PedidoDetallePedido : pedido.getDetalle_Pedido()) {
                Pedido oldPedidoOfDetalle_PedidoDetallePedido = detalle_PedidoDetallePedido.getPedido();
                detalle_PedidoDetallePedido.setPedido(pedido);
                detalle_PedidoDetallePedido = em.merge(detalle_PedidoDetallePedido);
                if (oldPedidoOfDetalle_PedidoDetallePedido != null) {
                    oldPedidoOfDetalle_PedidoDetallePedido.getDetalle_Pedido().remove(detalle_PedidoDetallePedido);
                    oldPedidoOfDetalle_PedidoDetallePedido = em.merge(oldPedidoOfDetalle_PedidoDetallePedido);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Pedido pedido) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Pedido persistentPedido = em.find(Pedido.class, pedido.getCodigo_Pedido());
            Cliente clienteOld = persistentPedido.getCliente();
            Cliente clienteNew = pedido.getCliente();
            List<DetallePedido> detalle_PedidoOld = persistentPedido.getDetalle_Pedido();
            List<DetallePedido> detalle_PedidoNew = pedido.getDetalle_Pedido();
            if (clienteNew != null) {
                clienteNew = em.getReference(clienteNew.getClass(), clienteNew.getDni());
                pedido.setCliente(clienteNew);
            }
            List<DetallePedido> attachedDetalle_PedidoNew = new ArrayList<DetallePedido>();
            for (DetallePedido detalle_PedidoNewDetallePedidoToAttach : detalle_PedidoNew) {
                detalle_PedidoNewDetallePedidoToAttach = em.getReference(detalle_PedidoNewDetallePedidoToAttach.getClass(), detalle_PedidoNewDetallePedidoToAttach.getCodigo_DetallePedido());
                attachedDetalle_PedidoNew.add(detalle_PedidoNewDetallePedidoToAttach);
            }
            detalle_PedidoNew = attachedDetalle_PedidoNew;
            pedido.setDetalle_Pedido(detalle_PedidoNew);
            pedido = em.merge(pedido);
            if (clienteOld != null && !clienteOld.equals(clienteNew)) {
                clienteOld.getPedidos().remove(pedido);
                clienteOld = em.merge(clienteOld);
            }
            if (clienteNew != null && !clienteNew.equals(clienteOld)) {
                clienteNew.getPedidos().add(pedido);
                clienteNew = em.merge(clienteNew);
            }
            for (DetallePedido detalle_PedidoOldDetallePedido : detalle_PedidoOld) {
                if (!detalle_PedidoNew.contains(detalle_PedidoOldDetallePedido)) {
                    detalle_PedidoOldDetallePedido.setPedido(null);
                    detalle_PedidoOldDetallePedido = em.merge(detalle_PedidoOldDetallePedido);
                }
            }
            for (DetallePedido detalle_PedidoNewDetallePedido : detalle_PedidoNew) {
                if (!detalle_PedidoOld.contains(detalle_PedidoNewDetallePedido)) {
                    Pedido oldPedidoOfDetalle_PedidoNewDetallePedido = detalle_PedidoNewDetallePedido.getPedido();
                    detalle_PedidoNewDetallePedido.setPedido(pedido);
                    detalle_PedidoNewDetallePedido = em.merge(detalle_PedidoNewDetallePedido);
                    if (oldPedidoOfDetalle_PedidoNewDetallePedido != null && !oldPedidoOfDetalle_PedidoNewDetallePedido.equals(pedido)) {
                        oldPedidoOfDetalle_PedidoNewDetallePedido.getDetalle_Pedido().remove(detalle_PedidoNewDetallePedido);
                        oldPedidoOfDetalle_PedidoNewDetallePedido = em.merge(oldPedidoOfDetalle_PedidoNewDetallePedido);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = pedido.getCodigo_Pedido();
                if (findPedido(id) == null) {
                    throw new NonexistentEntityException("The pedido with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Pedido pedido;
            try {
                pedido = em.getReference(Pedido.class, id);
                pedido.getCodigo_Pedido();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The pedido with id " + id + " no longer exists.", enfe);
            }
            Cliente cliente = pedido.getCliente();
            if (cliente != null) {
                cliente.getPedidos().remove(pedido);
                cliente = em.merge(cliente);
            }
            List<DetallePedido> detalle_Pedido = pedido.getDetalle_Pedido();
            for (DetallePedido detalle_PedidoDetallePedido : detalle_Pedido) {
                detalle_PedidoDetallePedido.setPedido(null);
                detalle_PedidoDetallePedido = em.merge(detalle_PedidoDetallePedido);
            }
            em.remove(pedido);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Pedido> findPedidoEntities() {
        return findPedidoEntities(true, -1, -1);
    }

    public List<Pedido> findPedidoEntities(int maxResults, int firstResult) {
        return findPedidoEntities(false, maxResults, firstResult);
    }

    private List<Pedido> findPedidoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Pedido.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Pedido findPedido(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Pedido.class, id);
        } finally {
            em.close();
        }
    }

    public int getPedidoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Pedido> rt = cq.from(Pedido.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
