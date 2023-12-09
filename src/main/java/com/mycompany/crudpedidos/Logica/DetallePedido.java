/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudpedidos.Logica;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class DetallePedido implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="DetallePedido_id")
    private int codigo_DetallePedido;
    
    @Column(name="Precio")
    private double precio;
    
    @Column(name="Cantidad")
    private int cantidad;
      
    @ManyToOne
    @JoinColumn(name = "pedido", referencedColumnName="Pedido_id")
    private Pedido pedido;
    
    @ManyToOne
    @JoinColumn(name= "producto", referencedColumnName="codigo_Producto")
    private Producto producto;

    public DetallePedido() {
    }

    public DetallePedido(int codigo_DetallePedido, double precio, int cantidad, Pedido pedido, Producto producto) {
        this.codigo_DetallePedido = codigo_DetallePedido;
        this.precio = precio;
        this.cantidad = cantidad;
        this.pedido = pedido;
        this.producto = producto;
    }

    public int getCodigo_DetallePedido() {
        return codigo_DetallePedido;
    }

    public void setCodigo_DetallePedido(int codigo_DetallePedido) {
        this.codigo_DetallePedido = codigo_DetallePedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getProductos() {
        return producto;
    }

    public void setProductos(Producto producto) {
        this.producto = producto;
    }
     
}
