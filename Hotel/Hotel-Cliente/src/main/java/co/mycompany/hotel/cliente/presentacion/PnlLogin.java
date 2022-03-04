/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package co.mycompany.hotel.cliente.presentacion;

import co.mycompany.hotel.cliente.domain.services.UserService;

/**
 *
 * @author Jose Ricardo
 */
public class PnlLogin extends javax.swing.JPanel {

    private FrmMain panel;
     private javax.swing.JPanel aux;

    /**
     * Creates new form PnlLogin
     */
    public PnlLogin(FrmMain panel) {
        this.panel = panel;
        aux = new javax.swing.JPanel();
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

        pnlLogLogin = new javax.swing.JPanel();
        lbLogTitulo = new javax.swing.JLabel();
        lbLogUsuario = new javax.swing.JLabel();
        lbLogPassword = new javax.swing.JLabel();
        txtLogUsuario = new javax.swing.JTextField();
        btnLogIniciar = new javax.swing.JButton();
        txtLogPassword = new javax.swing.JPasswordField();
        btnLogRegistrarse = new javax.swing.JButton();

        pnlLogLogin.setPreferredSize(new java.awt.Dimension(700, 300));

        lbLogTitulo.setText("Iniciar Seccion");

        lbLogUsuario.setText("Usuario");

        lbLogPassword.setText("Password");

        btnLogIniciar.setText("Iniciar");
        btnLogIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogIniciarActionPerformed(evt);
            }
        });

        btnLogRegistrarse.setText("Registrarse");
        btnLogRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogRegistrarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLogLoginLayout = new javax.swing.GroupLayout(pnlLogLogin);
        pnlLogLogin.setLayout(pnlLogLoginLayout);
        pnlLogLoginLayout.setHorizontalGroup(
            pnlLogLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogLoginLayout.createSequentialGroup()
                .addContainerGap(280, Short.MAX_VALUE)
                .addGroup(pnlLogLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLogLoginLayout.createSequentialGroup()
                        .addGroup(pnlLogLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlLogLoginLayout.createSequentialGroup()
                                .addComponent(lbLogPassword)
                                .addGap(18, 18, 18)
                                .addComponent(txtLogPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlLogLoginLayout.createSequentialGroup()
                                .addComponent(btnLogIniciar)
                                .addGap(34, 34, 34)
                                .addComponent(btnLogRegistrarse))
                            .addGroup(pnlLogLoginLayout.createSequentialGroup()
                                .addComponent(lbLogUsuario)
                                .addGap(28, 28, 28)
                                .addComponent(txtLogUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(220, 220, 220))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLogLoginLayout.createSequentialGroup()
                        .addComponent(lbLogTitulo)
                        .addGap(301, 301, 301))))
        );
        pnlLogLoginLayout.setVerticalGroup(
            pnlLogLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogLoginLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(lbLogTitulo)
                .addGap(18, 18, 18)
                .addGroup(pnlLogLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLogUsuario)
                    .addComponent(txtLogUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(pnlLogLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLogPassword)
                    .addComponent(txtLogPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlLogLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogIniciar)
                    .addComponent(btnLogRegistrarse))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlLogLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlLogLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogIniciarActionPerformed
        // TODO add your handling code here:
        String tipo = "";
        String usuario = txtLogUsuario.getText();
        String password = txtLogPassword.getText();
        if(!usuario.equals("All_Hotels")){
            tipo = UserService.autenticacion(usuario, password);
            panel.cargarUsuario(usuario);
        }
        switch (tipo) {
            case "Master":    
                panel.cargarAdmMaster();
                break;
            case "Junior":
                panel.cargarAdmJunior();
                break;
            case "Cliente":
                panel.cargarCliente();
                break;
            default:
                panel.cargarUsuario("");
                panel.cargarCliente();
                System.out.println("No se pudo conectar");
        }

    }//GEN-LAST:event_btnLogIniciarActionPerformed

    private void btnLogRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogRegistrarseActionPerformed
        // TODO add your handling code here:
           panel.cargarRegistrar("Cliente");
           
        
    }//GEN-LAST:event_btnLogRegistrarseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogIniciar;
    private javax.swing.JButton btnLogRegistrarse;
    private javax.swing.JLabel lbLogPassword;
    private javax.swing.JLabel lbLogTitulo;
    private javax.swing.JLabel lbLogUsuario;
    private javax.swing.JPanel pnlLogLogin;
    private javax.swing.JPasswordField txtLogPassword;
    private javax.swing.JTextField txtLogUsuario;
    // End of variables declaration//GEN-END:variables
}
