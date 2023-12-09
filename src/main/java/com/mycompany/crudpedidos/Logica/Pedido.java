    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudpedidos.Logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

@Entity
public class Pedido implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name="Pedido_id")
    private int codigo_Pedido;
    
    //Relacion
    @ManyToOne
    @JoinColumn(name = "cliente", referencedColumnName="Dni")
    private Cliente cliente;
    
    @Basic
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    
    @OneToMany (mappedBy="pedido")
    private List<DetallePedido> detalle_Pedido;
    
    public Pedido() {
    }

    public Pedido(int codigo_Pedido, Cliente cliente) {
        this.codigo_Pedido = codigo_Pedido;
        this.cliente = cliente;
    }

    public int getCodigo_Pedido() {
        return codigo_Pedido;
    }

    public void setCodigo_Pedido(int codigo_Pedido) {
        this.codigo_Pedido = codigo_Pedido;
    }
  
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    } 

    public List<DetallePedido> getDetalle_Pedido() {
        return detalle_Pedido;
    }

    public void setDetalle_Pedido(List<DetallePedido> detalle_Pedido) {
        this.detalle_Pedido = detalle_Pedido;
    }

}
