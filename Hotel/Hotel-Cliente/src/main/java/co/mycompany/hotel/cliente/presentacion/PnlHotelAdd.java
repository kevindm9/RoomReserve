/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package co.mycompany.hotel.cliente.presentacion;

import co.mycompany.hotel.cliente.domain.services.HotelService;
import co.mycompany.hotel.commons.domain.Hotel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Jose Ricardo
 */
public class PnlHotelAdd extends javax.swing.JPanel {

    private HotelService service;
    
    //private Hotel hotel;
    private String usuario;

    /**
     * Creates new form PnlAdmHabAdd
     */
    public PnlHotelAdd(String usuario) {
        this.usuario = usuario;
        service = new HotelService();
        //hotel = new Hotel();
        initComponents();

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
        btnAdmHotAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbAdmHotNombre = new javax.swing.JLabel();
        txtAdmHotNombre = new javax.swing.JTextField();
        lbAdmHotDireccion = new javax.swing.JLabel();
        txtAdmHotDir = new javax.swing.JTextField();
        lbAdmHotCiudad = new javax.swing.JLabel();
        txtAdmHotCiudad = new javax.swing.JTextField();
        lbAdmHotTelefono = new javax.swing.JLabel();
        txtAdmHotTel = new javax.swing.JTextField();
        btnAdmHabFoto = new javax.swing.JButton();
        txtAdmHotFoto = new javax.swing.JTextField();

        setOpaque(false);

        bgAdmHabAdd.setOpaque(false);
        bgAdmHabAdd.setPreferredSize(new java.awt.Dimension(570, 202));

        btnAdmHotAgregar.setText("Agregar Hotel");
        btnAdmHotAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmHotAgregarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Crear Hotel");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevos Datos"));
        jPanel1.setOpaque(false);

        lbAdmHotNombre.setText("Nombre");

        lbAdmHotDireccion.setText("Direccion");

        lbAdmHotCiudad.setText("Ciudad");

        lbAdmHotTelefono.setText("Telefono");

        btnAdmHabFoto.setText("Foto");
        btnAdmHabFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmHabFotoActionPerformed(evt);
            }
        });

        txtAdmHotFoto.setEnabled(false);
        txtAdmHotFoto.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAdmHotCiudad)
                    .addComponent(lbAdmHotTelefono)
                    .addComponent(lbAdmHotDireccion)
                    .addComponent(lbAdmHotNombre)
                    .addComponent(btnAdmHabFoto))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAdmHotNombre)
                    .addComponent(txtAdmHotDir)
                    .addComponent(txtAdmHotFoto)
                    .addComponent(txtAdmHotCiudad)
                    .addComponent(txtAdmHotTel, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdmHotNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAdmHotNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdmHotDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAdmHotDireccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdmHotCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAdmHotCiudad))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAdmHotTelefono)
                    .addComponent(txtAdmHotTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdmHabFoto)
                    .addComponent(txtAdmHotFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgAdmHabAddLayout = new javax.swing.GroupLayout(bgAdmHabAdd);
        bgAdmHabAdd.setLayout(bgAdmHabAddLayout);
        bgAdmHabAddLayout.setHorizontalGroup(
            bgAdmHabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgAdmHabAddLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(bgAdmHabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(btnAdmHotAgregar)
                .addContainerGap(168, Short.MAX_VALUE))
        );
        bgAdmHabAddLayout.setVerticalGroup(
            bgAdmHabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgAdmHabAddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(bgAdmHabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgAdmHabAddLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(btnAdmHotAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgAdmHabAddLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(bgAdmHabAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgAdmHabAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdmHotAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmHotAgregarActionPerformed
        // TODO add your handling code here:
        //public Habitacion(int id, String descripcion, int precio, TipoHabitacion tipo);
        
        String nombre = txtAdmHotNombre.getText();
        String direccion= txtAdmHotDir.getText();
        String ciudad=txtAdmHotCiudad.getText();
        String telefono = txtAdmHotTel.getText();
        Hotel hotel = new Hotel(0,nombre, direccion,ciudad,telefono,null);
        hotel.setFoto(txtAdmHotFoto.getText());
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, service.addHotel(hotel,usuario));
        txtAdmHotNombre.setText("");
        txtAdmHotDir.setText("");
        txtAdmHotCiudad.setText("");
        txtAdmHotTel.setText("");
        txtAdmHotFoto.setText("");
    }//GEN-LAST:event_btnAdmHotAgregarActionPerformed

    private void btnAdmHabFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmHabFotoActionPerformed
        // TODO add your handling code here:

        JFileChooser j = new JFileChooser();
        FileNameExtensionFilter fil = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        j.setFileFilter(fil);

        int s = j.showOpenDialog(this);
        if (s == JFileChooser.APPROVE_OPTION) {
            String ruta = j.getSelectedFile().getAbsolutePath();
            txtAdmHotFoto.setText(ruta);
        }
    }//GEN-LAST:event_btnAdmHabFotoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgAdmHabAdd;
    private javax.swing.JButton btnAdmHabFoto;
    private javax.swing.JButton btnAdmHotAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAdmHotCiudad;
    private javax.swing.JLabel lbAdmHotDireccion;
    private javax.swing.JLabel lbAdmHotNombre;
    private javax.swing.JLabel lbAdmHotTelefono;
    private javax.swing.JTextField txtAdmHotCiudad;
    private javax.swing.JTextField txtAdmHotDir;
    private javax.swing.JTextField txtAdmHotFoto;
    private javax.swing.JTextField txtAdmHotNombre;
    private javax.swing.JTextField txtAdmHotTel;
    // End of variables declaration//GEN-END:variables
}
