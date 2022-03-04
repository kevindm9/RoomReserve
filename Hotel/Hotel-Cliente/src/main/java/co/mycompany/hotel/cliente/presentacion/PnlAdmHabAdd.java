/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package co.mycompany.hotel.cliente.presentacion;

import co.mycompany.hotel.cliente.domain.services.HotelService;
import co.mycompany.hotel.commons.domain.Habitacion;
import co.mycompany.hotel.commons.domain.Hotel;
import co.mycompany.hotel.commons.domain.TipoHabitacion;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Jose Ricardo
 */
public class PnlAdmHabAdd extends javax.swing.JPanel {

    private final HotelService service;
    private TipoHabitacion tipos[];
    private ArrayList<Hotel> hoteles;
    private final String usuario;

    /**
     * Creates new form PnlAdmHabAdd
     * @param usuario
     */
    public PnlAdmHabAdd(String usuario) {
        this.usuario = usuario;
        service = new HotelService();
        hoteles = new ArrayList<>();
        initComponents();
        cargarValoresIniciales();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgAdmHabAdd = new javax.swing.JPanel();
        lbAdmHabDescripcion = new javax.swing.JLabel();
        lbAdmHabPrecio = new javax.swing.JLabel();
        lbAdmHabTipo = new javax.swing.JLabel();
        txtAdmHabDescripcion = new javax.swing.JTextField();
        txtAdmHabPrecio = new javax.swing.JTextField();
        cbxAdmHabSucursal = new javax.swing.JComboBox<>();
        lbAdmHabSucursal = new javax.swing.JLabel();
        btnAdmHabAgregar = new javax.swing.JButton();
        cbxAdmHabTipo = new javax.swing.JComboBox<>();
        txtAdmHabFoto = new javax.swing.JTextField();
        btnAdmHabFoto = new javax.swing.JButton();

        bgAdmHabAdd.setPreferredSize(new java.awt.Dimension(570, 202));

        lbAdmHabDescripcion.setText("Descripcion");

        lbAdmHabPrecio.setText("Precio");

        lbAdmHabTipo.setText("Tipo");

        cbxAdmHabSucursal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbAdmHabSucursal.setText("Sucursal");

        btnAdmHabAgregar.setText("Agregar Habitacion");
        btnAdmHabAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmHabAgregarActionPerformed(evt);
            }
        });

        cbxAdmHabTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtAdmHabFoto.setEnabled(false);
        txtAdmHabFoto.setFocusable(false);

        btnAdmHabFoto.setText("Foto");
        btnAdmHabFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmHabFotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgAdmHabAddLayout = new javax.swing.GroupLayout(bgAdmHabAdd);
        bgAdmHabAdd.setLayout(bgAdmHabAddLayout);
        bgAdmHabAddLayout.setHorizontalGroup(
            bgAdmHabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgAdmHabAddLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(bgAdmHabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAdmHabTipo)
                    .addComponent(lbAdmHabSucursal)
                    .addComponent(lbAdmHabPrecio)
                    .addComponent(lbAdmHabDescripcion)
                    .addComponent(btnAdmHabFoto))
                .addGap(28, 28, 28)
                .addGroup(bgAdmHabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxAdmHabSucursal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAdmHabDescripcion)
                    .addComponent(txtAdmHabPrecio)
                    .addComponent(cbxAdmHabTipo, 0, 178, Short.MAX_VALUE)
                    .addComponent(txtAdmHabFoto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(btnAdmHabAgregar)
                .addGap(33, 33, 33))
        );
        bgAdmHabAddLayout.setVerticalGroup(
            bgAdmHabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgAdmHabAddLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(bgAdmHabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdmHabDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAdmHabDescripcion))
                .addGroup(bgAdmHabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgAdmHabAddLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(bgAdmHabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAdmHabPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbAdmHabPrecio))
                        .addGap(18, 18, 18)
                        .addGroup(bgAdmHabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxAdmHabTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbAdmHabTipo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgAdmHabAddLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdmHabAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(bgAdmHabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxAdmHabSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAdmHabSucursal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bgAdmHabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdmHabFoto)
                    .addComponent(txtAdmHabFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgAdmHabAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgAdmHabAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdmHabAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmHabAgregarActionPerformed
        // TODO add your handling code here:
        //public Habitacion(int id, String descripcion, int precio, TipoHabitacion tipo);
        TipoHabitacion tipo = this.tipos[cbxAdmHabTipo.getSelectedIndex()];
        String descripcion = txtAdmHabDescripcion.getText();
        String nombre_hotel = cbxAdmHabSucursal.getSelectedItem().toString();


        int id_hotel = -1;
        System.out.println("id hotel: "+nombre_hotel);
        int precio = Integer.parseInt(txtAdmHabPrecio.getText());
        for (Hotel hotel : hoteles){
            if (hotel.getNombre().equals(nombre_hotel)){
                id_hotel = hotel.getId();
                break;
            }
        }
        JFrame jFrame = new JFrame();
        if(id_hotel != -1){
            Habitacion habitacion = new Habitacion(0,descripcion, precio, tipo,id_hotel);
            habitacion.setFoto(txtAdmHabFoto.getText());
            JOptionPane.showMessageDialog(jFrame, service.addHabitacion(habitacion));
        }
        else{
            JOptionPane.showMessageDialog(jFrame,"No se pudo adiccionar la habitacion");
        }
        txtAdmHabDescripcion.setText("");
        txtAdmHabPrecio.setText("");
        txtAdmHabFoto.setText("");
        
        
    }//GEN-LAST:event_btnAdmHabAgregarActionPerformed

    private void btnAdmHabFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmHabFotoActionPerformed
        // TODO add your handling code here:

        JFileChooser j = new JFileChooser();
        FileNameExtensionFilter fil = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        j.setFileFilter(fil);

        int s = j.showOpenDialog(this);
        if (s == JFileChooser.APPROVE_OPTION) {
            String ruta = j.getSelectedFile().getAbsolutePath();
            txtAdmHabFoto.setText(ruta);
        }
    }//GEN-LAST:event_btnAdmHabFotoActionPerformed

    private void cargarValoresIniciales() {
        TipoHabitacion tipos[] = TipoHabitacion.values();
        this.tipos = tipos;
        cbxAdmHabTipo.removeAllItems();
        for (int i = 0; i < tipos.length; i++) {
            cbxAdmHabTipo.addItem(tipos[i].toString());
        }
        hoteles = service.getHotels("All_Hotels");
        cbxAdmHabSucursal.removeAllItems();
        if(hoteles !=null){
            for (int i = 0; i < hoteles.size(); i++) {
                cbxAdmHabSucursal.addItem(hoteles.get(i).getNombre());
            }
        }    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgAdmHabAdd;
    private javax.swing.JButton btnAdmHabAgregar;
    private javax.swing.JButton btnAdmHabFoto;
    private javax.swing.JComboBox<String> cbxAdmHabSucursal;
    private javax.swing.JComboBox<String> cbxAdmHabTipo;
    private javax.swing.JLabel lbAdmHabDescripcion;
    private javax.swing.JLabel lbAdmHabPrecio;
    private javax.swing.JLabel lbAdmHabSucursal;
    private javax.swing.JLabel lbAdmHabTipo;
    private javax.swing.JTextField txtAdmHabDescripcion;
    private javax.swing.JTextField txtAdmHabFoto;
    private javax.swing.JTextField txtAdmHabPrecio;
    // End of variables declaration//GEN-END:variables
}
