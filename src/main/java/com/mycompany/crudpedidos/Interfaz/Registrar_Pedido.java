/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.crudpedidos.Interfaz;

import com.mycompany.crudpedidos.Logica.Cliente;
import com.mycompany.crudpedidos.Logica.Controladora;
import com.mycompany.crudpedidos.Logica.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Registrar_Pedido extends javax.swing.JFrame {
    
    Controladora control = null;
    
    DefaultTableModel tablaGeneral = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
    
    List<Producto> listaProductos = new ArrayList();
    
    public Registrar_Pedido() {
        this.control = new Controladora();
        initComponents();
        precio_Total.setText("0");
        txtCantidad.setText("1");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cmbClientes = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTabla2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        precio_Total = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar Pedido");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        btnMenu.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        btnMenu.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\CrudPedidos\\Imagenes\\casita.png")); // NOI18N
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 40, -1));

        btnRegistrar.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\CrudPedidos\\Imagenes\\guardar.png")); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, -1, -1));

        jLabel3.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jLabel3.setText("Cliente: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        cmbClientes.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jPanel1.add(cmbClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 110, 30));

        tblTabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTabla1);

        jLabel2.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        jLabel2.setText("Lista de productos: ");

        btnAgregar.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtCantidad.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        jLabel7.setText("Cantidad: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 380, 320));

        tblTabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblTabla2);

        jLabel4.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        jLabel4.setText("Lista de compras: ");

        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\CrudPedidos\\Imagenes\\eliminar.png")); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        jLabel5.setText("Total a pagar: ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(precio_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(215, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(precio_Total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 360, 320));

        Fondo.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\CrudPedidos\\Imagenes\\Fondo1.png")); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Principal principal = new Principal();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.obtenerClientes();
        this.cargarTabla1();
        this.cargarTabla2();
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (tblTabla2.getRowCount()>0) {
            if (tblTabla2.getSelectedRow() != -1) {
                int id = tblTabla2.getSelectedRow();
                tablaGeneral.removeRow(id);
                listaProductos.remove(id);
                this.cargarTabla2();
                /////////////////////////////////////////
                for (int i=0; i<listaProductos.size(); i++) {
                    System.out.println(listaProductos.get(i).getNombre());
                }
            } else {
                this.mostrarMensaje("No ha seleccionado una columna", "Error", "Columna no seleccionada");
            }
        } else {
            this.mostrarMensaje("No hay aun registros!!", "Error", "Tabla vacia");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (String.valueOf(cmbClientes.getSelectedItem()).equals("-")) {
            this.mostrarMensaje("Porfavor elija un cliente", "Error", "Cliente no seleccionado");
        } else {
            //Hallamos el cliente
            int id = cmbClientes.getSelectedIndex();
            Cliente cliente;
            List<Cliente> listaClientes = control.traerClientes();
            cliente = listaClientes.get(id-1);
            
            List<Integer> cantidades = new ArrayList<>(); 
            for (int i=0; i<tblTabla2.getColumnCount(); i++) {
                int numero = Integer.parseInt(String.valueOf(tblTabla2.getValueAt(i, 2)));
                cantidades.add(numero);
            }
            
            control.crearPedido(cliente, listaProductos, cantidades);
                       
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int id = Integer.parseInt(String.valueOf(tblTabla1.getValueAt(tblTabla1.getSelectedRow(), 0)));
        Producto producto = control.traerProducto(id);
        listaProductos.add(producto);
        int cantidad = Integer.parseInt(txtCantidad.getText());
        this.AgregarProducto(id, cantidad); 
        /////////////////////////////////////////////
        /*for (int i=0; i<listaProductos.size(); i++) {
            System.out.println(listaProductos.get(i).getNombre());
        }*/
    }//GEN-LAST:event_btnAgregarActionPerformed
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel precio_Total;
    private javax.swing.JTable tblTabla1;
    private javax.swing.JTable tblTabla2;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables

    
    public void obtenerClientes() {
        List<Cliente> listaClientes;
        listaClientes = control.traerClientes();
        cmbClientes.addItem("-");
        for (int i=0; i<listaClientes.size(); i++) {
            cmbClientes.addItem(listaClientes.get(i).getNombre());
        }
    }
    
    private void cargarTabla1() {
        
        List<Producto> listaProductos = control.traerProductos();
        
        DefaultTableModel tabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        String titulos[] = {"Id","Nombre", "Precio"};
        tabla.setColumnIdentifiers(titulos);
        
        if (listaProductos != null) {
            for (int i=0; i<listaProductos.size(); i++) {
                Object[] objecto = {listaProductos.get(i).getCodigo_Producto(), listaProductos.get(i).getNombre(), 
                listaProductos.get(i).getPrecio()};
                tabla.addRow(objecto);
            }
            tblTabla1.setModel(tabla);
        }
    }

    private void cargarTabla2() {
        double precio_final = 0;
        
        String titulos[] = {"Nombre", "Precio", "Cantidad", "Precio Final"};
        tablaGeneral.setColumnIdentifiers(titulos);
        tblTabla2.setModel(tablaGeneral);
        
        for (int i=0; i<tblTabla2.getRowCount(); i++) {
            precio_final += Double.parseDouble(String.valueOf(tblTabla2.getValueAt(i, 3)));
        }
        precio_Total.setText(String.valueOf(precio_final));
    }
    
    private void AgregarProducto(int id, int cantidad) {
        double precio_final = 0;
        Producto producto = control.traerProducto(id);
        Object[] objecto = {producto.getNombre(), producto.getPrecio(), cantidad, cantidad*producto.getPrecio()};
        tablaGeneral.addRow(objecto);
        tblTabla2.setModel(tablaGeneral);
        for (int i=0; i<tblTabla2.getRowCount(); i++) {
            precio_final += Double.parseDouble(String.valueOf(tblTabla2.getValueAt(i, 3)));
        }
        precio_Total.setText(String.valueOf(precio_final));
    }
    
    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        } else if (tipo.equals("Confir")) {
            optionPane.setMessageType(JOptionPane.YES_NO_CANCEL_OPTION);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
}
