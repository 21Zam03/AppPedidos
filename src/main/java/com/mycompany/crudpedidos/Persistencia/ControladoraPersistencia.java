/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudpedidos.Persistencia;

import com.mycompany.crudpedidos.Logica.Cliente;
import com.mycompany.crudpedidos.Logica.DetallePedido;
import com.mycompany.crudpedidos.Logica.Pedido;
import com.mycompany.crudpedidos.Logica.Producto;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    ProductoJpaController productoJpa = new ProductoJpaController();
    ClienteJpaController clienteJpa = new ClienteJpaController();
    PedidoJpaController pedidoJpa = new PedidoJpaController();
    DetallePedidoJpaController detallePedidoJpa = new DetallePedidoJpaController();
    
    public void registrarProducto(Producto producto) {
        productoJpa.create(producto);
    }

    public void registrarCliente(Cliente cliente) {
        try {
            clienteJpa.create(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Cliente> traerClientes() {
        List<Cliente> listaClientes;
        listaClientes = clienteJpa.findClienteEntities();
        return listaClientes;
    }

    public List<Producto> traerProductos() {
        List<Producto> listaProductos;
        listaProductos = productoJpa.findProductoEntities();
        return listaProductos;
    }

    public Producto traerProductos(int id) {
        return productoJpa.findProducto(id);
    }

    public void crearPedido(Pedido pedido) {
        pedidoJpa.create(pedido);
    }

    public void crearDetallePedido(DetallePedido detallePedido) {
        detallePedidoJpa.create(detallePedido);
    }

}
