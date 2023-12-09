/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudpedidos.Logica;

import com.mycompany.crudpedidos.Persistencia.ControladoraPersistencia;
import java.util.Date;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void registrarProducto(String nombre, int precio) {
        
        Producto producto = new Producto();
        producto.setNombre(nombre);
        producto.setPrecio(precio);
        
        controlPersis.registrarProducto(producto);
    }

    public void registrarCliente(String nombre, String apellido, String telefono, String dni) {
        Cliente cliente = new Cliente();
        cliente.setDni(dni);
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setCelular(telefono);
        
        controlPersis.registrarCliente(cliente);
    }

    public List<Cliente> traerClientes() {
        return controlPersis.traerClientes();
    }

    public List<Producto> traerProductos() {
        return controlPersis.traerProductos();
    }

    public Producto traerProducto(int id) {
        return controlPersis.traerProductos(id);
    }

    public void crearPedido(Cliente cliente, List<Producto> listaProductos, List<Integer> cantidades) {
        
        Pedido pedido = new Pedido();
        
        pedido.setCliente(cliente);
        pedido.setFecha(new Date());
        
        controlPersis.crearPedido(pedido);
        this.crearDetallePedido(listaProductos, cantidades, pedido);       
    }
    
    public void crearDetallePedido(List<Producto> listaProductos, List<Integer> cantidades, Pedido pedido) {
        for (int i=0; i<listaProductos.size(); i++) {
            DetallePedido detallePedido = new DetallePedido();
            detallePedido.setPrecio(listaProductos.get(i).getPrecio());
            detallePedido.setCantidad(cantidades.get(i));
            detallePedido.setPedido(pedido);
            detallePedido.setProducto(listaProductos.get(i));
            controlPersis.crearDetallePedido(detallePedido);
        }
        
    }

}
