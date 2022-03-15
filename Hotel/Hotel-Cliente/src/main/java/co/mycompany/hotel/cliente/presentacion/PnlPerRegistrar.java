/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package co.mycompany.hotel.cliente.presentacion;

import co.mycompany.hotel.cliente.domain.services.HotelService;
import co.mycompany.hotel.commons.domain.Persona;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author Jose Ricardo
 */
public class PnlPerRegistrar extends javax.swing.JPanel {

    private HotelService service;
    private String tipo;
    private FrmMain panel;

    /**
     * Creates new form PnlAdmHabAdd
     */
    public PnlPerRegistrar(FrmMain panel,String tipo) {
        this.panel = panel;
        service = new HotelService();
        this.tipo = tipo;
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
        lbAdmPersNombre = new javax.swing.JLabel();
        lbAdmPersId = new javax.swing.JLabel();
        txtAdmPersNombre = new javax.swing.JTextField();
        txtAdmPersDir = new javax.swing.JTextField();
        txtAdmPersId = new javax.swing.JTextField();
        txtAdmPersTel = new javax.swing.JTextField();
        lbAdmPersUser = new javax.swing.JLabel();
        lbAdmPersClave = new javax.swing.JLabel();
        txtAdmPersContr = new javax.swing.JTextField();
        txtAdmPersUser = new javax.swing.JTextField();
        lbAdmPersDireccion = new javax.swing.JLabel();
        lbAdmPersTelefono = new javax.swing.JLabel();
        btnPersonaAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);

        bgAdmHabAdd.setOpaque(false);
        bgAdmHabAdd.setPreferredSize(new java.awt.Dimension(570, 202));

        lbAdmPersNombre.setText("Nombre");

        lbAdmPersId.setText("Numero cedula");

        lbAdmPersUser.setText("Usuario");

        lbAdmPersClave.setText("Contraseña nueva");

        lbAdmPersDireccion.setText("Direccion");

        lbAdmPersTelefono.setText("Telefono");

        javax.swing.GroupLayout bgAdmHabAddLayout = new javax.swing.GroupLayout(bgAdmHabAdd);
        bgAdmHabAdd.setLayout(bgAdmHabAddLayout);
        bgAdmHabAddLayout.setHorizontalGroup(
            bgAdmHabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgAdmHabAddLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(bgAdmHabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAdmPersId)
                    .addComponent(lbAdmPersNombre)
                    .addComponent(lbAdmPersUser)
                    .addComponent(lbAdmPersClave)
                    .addComponent(lbAdmPersDireccion)
                    .addComponent(lbAdmPersTelefono))
                .addGap(50, 50, 50)
                .addGroup(bgAdmHabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAdmPersNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdmPersId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdmPersDir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdmPersTel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdmPersUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdmPersContr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        bgAdmHabAddLayout.setVerticalGroup(
            bgAdmHabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgAdmHabAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgAdmHabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAdmPersId)
                    .addComponent(txtAdmPersId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgAdmHabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAdmPersNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAdmPersNombre, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(6, 6, 6)
                .addGroup(bgAdmHabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdmPersDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAdmPersDireccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgAdmHabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdmPersTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAdmPersTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgAdmHabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdmPersUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAdmPersUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgAdmHabAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdmPersContr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAdmPersClave))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnPersonaAgregar.setText("Crear Usuario");
        btnPersonaAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonaAgregarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nuevo Usuario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(bgAdmHabAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnPersonaAgregar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(jLabel1)))
                .addGap(0, 119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bgAdmHabAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnPersonaAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPersonaAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonaAgregarActionPerformed
        // TODO add your handling code here:
        //public Habitacion(int id, String descripcion, int precio, TipoHabitacion tipo);
        int id=Integer.parseInt(txtAdmPersId.getText());
        String nombre = txtAdmPersNombre.getText();
        String telefono = txtAdmPersTel.getText();
        String direccion= txtAdmPersDir.getText();
        String User=txtAdmPersUser.getText();
        String clave=txtAdmPersContr.getText();
        Persona Persona=new Persona(User, clave, id, nombre, telefono, direccion);
        JFrame jFrame = new JFrame();
        System.out.println(tipo);
        JOptionPane.showMessageDialog(jFrame, service.addPersona(Persona, tipo));
//        txtAdmHotNombre.setText("");
//        txtAdmHotDir.setText("");
//        txtAdmHotCiudad.setText("");
//        txtAdmHotTel.setText("");
//        txtAdmHabFoto.setText("");
        if(tipo.equals("Cliente")){
            panel.cargarLogin();
        }
       
    }//GEN-LAST:event_btnPersonaAgregarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgAdmHabAdd;
    private javax.swing.JButton btnPersonaAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbAdmPersClave;
    private javax.swing.JLabel lbAdmPersDireccion;
    private javax.swing.JLabel lbAdmPersId;
    private javax.swing.JLabel lbAdmPersNombre;
    private javax.swing.JLabel lbAdmPersTelefono;
    private javax.swing.JLabel lbAdmPersUser;
    private javax.swing.JTextField txtAdmPersContr;
    private javax.swing.JTextField txtAdmPersDir;
    private javax.swing.JTextField txtAdmPersId;
    private javax.swing.JTextField txtAdmPersNombre;
    private javax.swing.JTextField txtAdmPersTel;
    private javax.swing.JTextField txtAdmPersUser;
    // End of variables declaration//GEN-END:variables
}
