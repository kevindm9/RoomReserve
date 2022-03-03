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
public class PnlAdmHabModificar extends javax.swing.JPanel {

    private HotelService service;
    private TipoHabitacion tipos[];
    private ArrayList<Hotel> hoteles;
    private String usuario;

    /**
     * Creates new form PnlAdmHabAdd
     */
    public PnlAdmHabModificar(String usuario) {
        this.usuario = usuario;
        service = new HotelService();
        this.service = service;
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
        btnAdmHabModificar = new javax.swing.JButton();
        cbxAdmHabTipo = new javax.swing.JComboBox<>();
        txtAdmHabFoto = new javax.swing.JTextField();
        btnAdmHabFoto = new javax.swing.JButton();
        txtIdHabitacion = new javax.swing.JTextField();
        lblIdHabitacion = new javax.swing.JLabel();
        btnBuscarId = new javax.swing.JButton();

        bgAdmHabAdd.setPreferredSize(new java.awt.Dimension(570, 202));

        lbAdmHabDescripcion.setText("Descripcion");

        lbAdmHabPrecio.setText("Precio");

        lbAdmHabTipo.setText("Tipo");

        btnAdmHabModificar.setText("Modificar Habitacion");
        btnAdmHabModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmHabModificarActionPerformed(evt);
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

        lblIdHabitacion.setText("Id");

        btnBuscarId.setText("Buscar");
        btnBuscarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIdActionPerformed(evt);
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
                    .addComponent(lbAdmHabPrecio)
                    .addComponent(lbAdmHabDescripcion)
                    .addComponent(btnAdmHabFoto))
                .addGap(28, 28, 28)
                .addGroup(bgAdmHabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAdmHabDescripcion)
                    .addComponent(txtAdmHabPrecio)
                    .addComponent(cbxAdmHabTipo, 0, 178, Short.MAX_VALUE)
                    .addComponent(txtAdmHabFoto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(lblIdHabitacion)
                .addGap(18, 18, 18)
                .addGroup(bgAdmHabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdmHabModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(btnBuscarId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIdHabitacion))
                .addContainerGap())
        );
        bgAdmHabAddLayout.setVerticalGroup(
            bgAdmHabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgAdmHabAddLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(bgAdmHabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdmHabDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAdmHabDescripcion)
                    .addComponent(txtIdHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdHabitacion))
                .addGap(17, 17, 17)
                .addGroup(bgAdmHabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdmHabPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAdmHabPrecio)
                    .addComponent(btnBuscarId))
                .addGap(18, 18, 18)
                .addGroup(bgAdmHabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxAdmHabTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAdmHabTipo))
                .addGap(18, 18, 18)
                .addGroup(bgAdmHabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdmHabModificar)
                    .addComponent(btnAdmHabFoto)
                    .addComponent(txtAdmHabFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        txtIdHabitacion.getAccessibleContext().setAccessibleName("txtIdHabitacion");
        lblIdHabitacion.getAccessibleContext().setAccessibleName("lblIdhotel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgAdmHabAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgAdmHabAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdmHabModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmHabModificarActionPerformed
        // TODO add your handling code here:
        //public Habitacion(int id, String descripcion, int precio, TipoHabitacion tipo);
//        TipoHabitacion tipo = this.tipos[cbxAdmHabTipo.getSelectedIndex()];
//        String descripcion = txtAdmHabDescripcion.getText();
//        int precio = Integer.parseInt(txtAdmHabPrecio.getText());
        Habitacion habitacion = new Habitacion();
        
        habitacion.setFoto(txtAdmHabFoto.getText());
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, service.addHabitacion(habitacion));
        txtAdmHabDescripcion.setText("");
        txtAdmHabPrecio.setText("");
        txtAdmHabFoto.setText("");
    }//GEN-LAST:event_btnAdmHabModificarActionPerformed

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

    private void btnBuscarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIdActionPerformed
       int id=Integer.parseInt(txtIdHabitacion.getText());
       Habitacion habitacion=new Habitacion();
       habitacion=service.getHabitacion(id);
       txtIdHabitacion.setEnabled(false);
       txtAdmHabDescripcion.setText(habitacion.getDescripcion());
       txtAdmHabPrecio.setText(String.valueOf(habitacion.getPrecio()));
       txtAdmHabFoto.setText(habitacion.getFoto());
       
    }//GEN-LAST:event_btnBuscarIdActionPerformed

    private void cargarValoresIniciales() {
        TipoHabitacion tipos[] = TipoHabitacion.values();
        this.tipos = tipos;
        cbxAdmHabTipo.removeAllItems();
        for (int i = 0; i < tipos.length; i++) {
            cbxAdmHabTipo.addItem(tipos[i].toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgAdmHabAdd;
    private javax.swing.JButton btnAdmHabFoto;
    private javax.swing.JButton btnAdmHabModificar;
    private javax.swing.JButton btnBuscarId;
    private javax.swing.JComboBox<String> cbxAdmHabTipo;
    private javax.swing.JLabel lbAdmHabDescripcion;
    private javax.swing.JLabel lbAdmHabPrecio;
    private javax.swing.JLabel lbAdmHabTipo;
    private javax.swing.JLabel lblIdHabitacion;
    private javax.swing.JTextField txtAdmHabDescripcion;
    private javax.swing.JTextField txtAdmHabFoto;
    private javax.swing.JTextField txtAdmHabPrecio;
    private javax.swing.JTextField txtIdHabitacion;
    // End of variables declaration//GEN-END:variables
}
