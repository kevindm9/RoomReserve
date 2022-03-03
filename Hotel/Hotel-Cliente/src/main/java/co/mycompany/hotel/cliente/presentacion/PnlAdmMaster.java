/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package co.mycompany.hotel.cliente.presentacion;

import co.mycompany.hotel.cliente.domain.services.HotelService;

/**
 *
 * @author Jose Ricardo
 */
public class PnlAdmMaster extends javax.swing.JPanel {

    private FrmMain panel;
    private HotelService service;

    /**
     * Creates new form PnlAdm
     */
    public PnlAdmMaster(FrmMain panel) {
        this.service = new HotelService();
        this.panel = panel;
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

        GrupoHab = new javax.swing.ButtonGroup();
        pnlAdmPrincipal = new javax.swing.JPanel();
        tbpMadMenu = new javax.swing.JTabbedPane();
        pnlAdmHabitaciones = new javax.swing.JPanel();
        pnlAdmHabMain = new javax.swing.JPanel();
        bgAdmHabCrear = new javax.swing.JRadioButton();
        bgAdmHabModificar = new javax.swing.JRadioButton();
        bgAdmHabEliminar = new javax.swing.JRadioButton();
        bgAdmHabConsultar = new javax.swing.JRadioButton();
        pnlAdmHabControl = new javax.swing.JPanel();
        pnlAdmSucursales = new javax.swing.JPanel();
        pnlAdmHabMain1 = new javax.swing.JPanel();
        bgAdmHabCrear1 = new javax.swing.JRadioButton();
        bgAdmHabModificar1 = new javax.swing.JRadioButton();
        bgAdmHabEliminar1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        pnlAdmHabControl1 = new javax.swing.JPanel();
        pnlAdmHabitaciones1 = new javax.swing.JPanel();
        pnlAdmHabMain2 = new javax.swing.JPanel();
        bgAdmHabCrear2 = new javax.swing.JRadioButton();
        bgAdmHabModificar2 = new javax.swing.JRadioButton();
        bgAdmHabEliminar2 = new javax.swing.JRadioButton();
        bgAdmHabConsultar1 = new javax.swing.JRadioButton();
        pnlAdmHabControl2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        pnlAdmPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlAdmPrincipal.setPreferredSize(new java.awt.Dimension(700, 300));

        pnlAdmHabMain.setBorder(javax.swing.BorderFactory.createTitledBorder("Procesos"));

        GrupoHab.add(bgAdmHabCrear);
        bgAdmHabCrear.setText("Crear");
        bgAdmHabCrear.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                bgAdmHabCrearStateChanged(evt);
            }
        });
        bgAdmHabCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bgAdmHabCrearMouseClicked(evt);
            }
        });

        GrupoHab.add(bgAdmHabModificar);
        bgAdmHabModificar.setText("Modificar");

        GrupoHab.add(bgAdmHabEliminar);
        bgAdmHabEliminar.setText("Eliminar");

        GrupoHab.add(bgAdmHabConsultar);
        bgAdmHabConsultar.setText("Consutar");
        bgAdmHabConsultar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                bgAdmHabConsultarStateChanged(evt);
            }
        });
        bgAdmHabConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bgAdmHabConsultarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlAdmHabMainLayout = new javax.swing.GroupLayout(pnlAdmHabMain);
        pnlAdmHabMain.setLayout(pnlAdmHabMainLayout);
        pnlAdmHabMainLayout.setHorizontalGroup(
            pnlAdmHabMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdmHabMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAdmHabMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bgAdmHabEliminar)
                    .addComponent(bgAdmHabModificar)
                    .addComponent(bgAdmHabCrear)
                    .addComponent(bgAdmHabConsultar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAdmHabMainLayout.setVerticalGroup(
            pnlAdmHabMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdmHabMainLayout.createSequentialGroup()
                .addComponent(bgAdmHabCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bgAdmHabConsultar)
                .addGap(5, 5, 5)
                .addComponent(bgAdmHabModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bgAdmHabEliminar)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pnlAdmHabControl.setRequestFocusEnabled(false);
        pnlAdmHabControl.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout pnlAdmHabitacionesLayout = new javax.swing.GroupLayout(pnlAdmHabitaciones);
        pnlAdmHabitaciones.setLayout(pnlAdmHabitacionesLayout);
        pnlAdmHabitacionesLayout.setHorizontalGroup(
            pnlAdmHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdmHabitacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAdmHabMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlAdmHabControl, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlAdmHabitacionesLayout.setVerticalGroup(
            pnlAdmHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAdmHabControl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlAdmHabitacionesLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(pnlAdmHabMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        tbpMadMenu.addTab("Habitaciones", pnlAdmHabitaciones);

        pnlAdmHabMain1.setBorder(javax.swing.BorderFactory.createTitledBorder("Procesos"));

        GrupoHab.add(bgAdmHabCrear1);
        bgAdmHabCrear1.setText("Crear");
        bgAdmHabCrear1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bgAdmHabCrear1MouseClicked(evt);
            }
        });

        GrupoHab.add(bgAdmHabModificar1);
        bgAdmHabModificar1.setText("Modificar");

        GrupoHab.add(bgAdmHabEliminar1);
        bgAdmHabEliminar1.setText("Eliminar");

        jRadioButton2.setText("Consutar");

        javax.swing.GroupLayout pnlAdmHabMain1Layout = new javax.swing.GroupLayout(pnlAdmHabMain1);
        pnlAdmHabMain1.setLayout(pnlAdmHabMain1Layout);
        pnlAdmHabMain1Layout.setHorizontalGroup(
            pnlAdmHabMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdmHabMain1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAdmHabMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bgAdmHabEliminar1)
                    .addComponent(bgAdmHabModificar1)
                    .addComponent(bgAdmHabCrear1)
                    .addComponent(jRadioButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAdmHabMain1Layout.setVerticalGroup(
            pnlAdmHabMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdmHabMain1Layout.createSequentialGroup()
                .addComponent(bgAdmHabCrear1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addGap(5, 5, 5)
                .addComponent(bgAdmHabModificar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bgAdmHabEliminar1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pnlAdmHabControl1.setRequestFocusEnabled(false);
        pnlAdmHabControl1.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout pnlAdmSucursalesLayout = new javax.swing.GroupLayout(pnlAdmSucursales);
        pnlAdmSucursales.setLayout(pnlAdmSucursalesLayout);
        pnlAdmSucursalesLayout.setHorizontalGroup(
            pnlAdmSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdmSucursalesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAdmHabMain1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlAdmHabControl1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlAdmSucursalesLayout.setVerticalGroup(
            pnlAdmSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAdmHabControl1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlAdmSucursalesLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(pnlAdmHabMain1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        tbpMadMenu.addTab("Sucursales", pnlAdmSucursales);

        pnlAdmHabMain2.setBorder(javax.swing.BorderFactory.createTitledBorder("Procesos"));

        GrupoHab.add(bgAdmHabCrear2);
        bgAdmHabCrear2.setText("Crear");
        bgAdmHabCrear2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                bgAdmHabCrear2StateChanged(evt);
            }
        });
        bgAdmHabCrear2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bgAdmHabCrear2MouseClicked(evt);
            }
        });

        GrupoHab.add(bgAdmHabModificar2);
        bgAdmHabModificar2.setText("Modificar");

        GrupoHab.add(bgAdmHabEliminar2);
        bgAdmHabEliminar2.setText("Eliminar");

        GrupoHab.add(bgAdmHabConsultar1);
        bgAdmHabConsultar1.setText("Consutar");
        bgAdmHabConsultar1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                bgAdmHabConsultar1StateChanged(evt);
            }
        });
        bgAdmHabConsultar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bgAdmHabConsultar1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlAdmHabMain2Layout = new javax.swing.GroupLayout(pnlAdmHabMain2);
        pnlAdmHabMain2.setLayout(pnlAdmHabMain2Layout);
        pnlAdmHabMain2Layout.setHorizontalGroup(
            pnlAdmHabMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdmHabMain2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAdmHabMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bgAdmHabEliminar2)
                    .addComponent(bgAdmHabModificar2)
                    .addComponent(bgAdmHabCrear2)
                    .addComponent(bgAdmHabConsultar1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAdmHabMain2Layout.setVerticalGroup(
            pnlAdmHabMain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdmHabMain2Layout.createSequentialGroup()
                .addComponent(bgAdmHabCrear2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bgAdmHabConsultar1)
                .addGap(5, 5, 5)
                .addComponent(bgAdmHabModificar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bgAdmHabEliminar2)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pnlAdmHabControl2.setRequestFocusEnabled(false);
        pnlAdmHabControl2.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout pnlAdmHabitaciones1Layout = new javax.swing.GroupLayout(pnlAdmHabitaciones1);
        pnlAdmHabitaciones1.setLayout(pnlAdmHabitaciones1Layout);
        pnlAdmHabitaciones1Layout.setHorizontalGroup(
            pnlAdmHabitaciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdmHabitaciones1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAdmHabMain2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlAdmHabControl2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlAdmHabitaciones1Layout.setVerticalGroup(
            pnlAdmHabitaciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAdmHabControl2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlAdmHabitaciones1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(pnlAdmHabMain2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        tbpMadMenu.addTab("Administradores Junior", pnlAdmHabitaciones1);

        jLabel1.setText("Menu Administracion");

        javax.swing.GroupLayout pnlAdmPrincipalLayout = new javax.swing.GroupLayout(pnlAdmPrincipal);
        pnlAdmPrincipal.setLayout(pnlAdmPrincipalLayout);
        pnlAdmPrincipalLayout.setHorizontalGroup(
            pnlAdmPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdmPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbpMadMenu)
                .addContainerGap())
            .addGroup(pnlAdmPrincipalLayout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAdmPrincipalLayout.setVerticalGroup(
            pnlAdmPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdmPrincipalLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbpMadMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAdmPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, 708, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlAdmPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bgAdmHabConsultar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgAdmHabConsultar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bgAdmHabConsultar1MouseClicked

    private void bgAdmHabConsultar1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_bgAdmHabConsultar1StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_bgAdmHabConsultar1StateChanged

    private void bgAdmHabCrear2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgAdmHabCrear2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bgAdmHabCrear2MouseClicked

    private void bgAdmHabCrear2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_bgAdmHabCrear2StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_bgAdmHabCrear2StateChanged

    private void bgAdmHabCrear1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgAdmHabCrear1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_bgAdmHabCrear1MouseClicked

    private void bgAdmHabConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgAdmHabConsultarMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_bgAdmHabConsultarMouseClicked

    private void bgAdmHabConsultarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_bgAdmHabConsultarStateChanged
        // TODO add your handling code here:
        if (bgAdmHabConsultar.isSelected()) {
            PnlVistaHabitaciones panelHabVista = new PnlVistaHabitaciones(service);
            pnlAdmHabControl.removeAll();
            pnlAdmHabControl.add(panelHabVista);
            pnlAdmHabControl.repaint();
            pnlAdmHabControl.revalidate();
        }
    }//GEN-LAST:event_bgAdmHabConsultarStateChanged

    private void bgAdmHabCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgAdmHabCrearMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_bgAdmHabCrearMouseClicked

    private void bgAdmHabCrearStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_bgAdmHabCrearStateChanged
        // TODO add your handling code here:
        if (bgAdmHabCrear.isSelected()) {
            PnlAdmHabAdd panelHabAdd = new PnlAdmHabAdd("All_Hotels");
            pnlAdmHabControl.removeAll();
            pnlAdmHabControl.add(panelHabAdd);
            pnlAdmHabControl.repaint();
            pnlAdmHabControl.revalidate();
        }
    }//GEN-LAST:event_bgAdmHabCrearStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoHab;
    private javax.swing.JRadioButton bgAdmHabConsultar;
    private javax.swing.JRadioButton bgAdmHabConsultar1;
    private javax.swing.JRadioButton bgAdmHabCrear;
    private javax.swing.JRadioButton bgAdmHabCrear1;
    private javax.swing.JRadioButton bgAdmHabCrear2;
    private javax.swing.JRadioButton bgAdmHabEliminar;
    private javax.swing.JRadioButton bgAdmHabEliminar1;
    private javax.swing.JRadioButton bgAdmHabEliminar2;
    private javax.swing.JRadioButton bgAdmHabModificar;
    private javax.swing.JRadioButton bgAdmHabModificar1;
    private javax.swing.JRadioButton bgAdmHabModificar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JPanel pnlAdmHabControl;
    private javax.swing.JPanel pnlAdmHabControl1;
    private javax.swing.JPanel pnlAdmHabControl2;
    private javax.swing.JPanel pnlAdmHabMain;
    private javax.swing.JPanel pnlAdmHabMain1;
    private javax.swing.JPanel pnlAdmHabMain2;
    private javax.swing.JPanel pnlAdmHabitaciones;
    private javax.swing.JPanel pnlAdmHabitaciones1;
    private javax.swing.JPanel pnlAdmPrincipal;
    private javax.swing.JPanel pnlAdmSucursales;
    private javax.swing.JTabbedPane tbpMadMenu;
    // End of variables declaration//GEN-END:variables
}
