/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudpedidos.Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Producto implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo_Producto;
    
    @Basic
    @Column(name="Nombre")
    private String nombre;
    
    @Column(name="Precio")
    private double precio;
    
    /*
    @ManyToMany
    private List<Pedido> pedidos;
    */
    public Producto() {
    }

    public Producto(int codigo_Producto, String nombre, double precio) {
        this.codigo_Producto = codigo_Producto;
        this.nombre = nombre;
        this.precio = precio;      
    }

    public int getCodigo_Producto() {
        return codigo_Producto;
    }

    public void setCodigo_Producto(int codigo_Producto) {
        this.codigo_Producto = codigo_Producto;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
