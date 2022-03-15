/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package co.mycompany.hotel.cliente.presentacion;

import co.mycompany.hotel.cliente.domain.services.HotelService;
import co.mycompany.hotel.commons.domain.Habitacion;
import co.mycompany.hotel.commons.domain.Hotel;
import co.mycompany.hotel.commons.domain.TipoHabitacion;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Jose Ricardo
 */
public class PnlHabEliminar extends javax.swing.JPanel {

    private HotelService service;
    private TipoHabitacion tipos[];
    private ArrayList<Hotel> hoteles;
    private String usuario;
    private Habitacion habitacion;

    /**
     * Creates new form PnlAdmHabAdd
     */
    public PnlHabEliminar(String usuario) {
        Habitacion habitacion = new Habitacion();
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

        pnlHabEliminar = new javax.swing.JPanel();
        pnlHabEliConsultar = new javax.swing.JPanel();
        lblIdHabitacion = new javax.swing.JLabel();
        btnHabEliBuscarId = new javax.swing.JButton();
        cbxHabEliHoteles = new javax.swing.JComboBox<>();
        txtHabEliIdHabitacion = new javax.swing.JTextField();
        btnHabEliEliminar = new javax.swing.JButton();
        pnlHabEliDatos = new javax.swing.JPanel();
        lbHabEliDescripcion = new javax.swing.JLabel();
        txtHabEliDescripcion = new javax.swing.JTextField();
        lbHabEliPrecio = new javax.swing.JLabel();
        txtHabEliPrecio = new javax.swing.JTextField();
        lbHabEliTipo = new javax.swing.JLabel();
        cbxHabEliTipo = new javax.swing.JComboBox<>();
        lbHabEliTitulo = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(740, 235));

        pnlHabEliminar.setOpaque(false);
        pnlHabEliminar.setPreferredSize(new java.awt.Dimension(570, 202));

        pnlHabEliConsultar.setBorder(javax.swing.BorderFactory.createTitledBorder("Consular habitación"));
        pnlHabEliConsultar.setOpaque(false);

        lblIdHabitacion.setText("Id");

        btnHabEliBuscarId.setText("Buscar");
        btnHabEliBuscarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabEliBuscarIdActionPerformed(evt);
            }
        });

        cbxHabEliHoteles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtHabEliIdHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtHabEliIdHabitacionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlHabEliConsultarLayout = new javax.swing.GroupLayout(pnlHabEliConsultar);
        pnlHabEliConsultar.setLayout(pnlHabEliConsultarLayout);
        pnlHabEliConsultarLayout.setHorizontalGroup(
            pnlHabEliConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHabEliConsultarLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnHabEliBuscarId)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHabEliConsultarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlHabEliConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHabEliConsultarLayout.createSequentialGroup()
                        .addComponent(lblIdHabitacion)
                        .addGap(18, 18, 18)
                        .addComponent(txtHabEliIdHabitacion))
                    .addComponent(cbxHabEliHoteles, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        pnlHabEliConsultarLayout.setVerticalGroup(
            pnlHabEliConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHabEliConsultarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlHabEliConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdHabitacion)
                    .addComponent(txtHabEliIdHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxHabEliHoteles, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(btnHabEliBuscarId)
                .addContainerGap())
        );

        lblIdHabitacion.getAccessibleContext().setAccessibleName("lblIdhotel");

        btnHabEliEliminar.setText("Eliminar Habitacion");
        btnHabEliEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabEliEliminarActionPerformed(evt);
            }
        });

        pnlHabEliDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevos  datos"));
        pnlHabEliDatos.setOpaque(false);

        lbHabEliDescripcion.setText("Descripcion");

        txtHabEliDescripcion.setEditable(false);

        lbHabEliPrecio.setText("Precio");

        txtHabEliPrecio.setEditable(false);

        lbHabEliTipo.setText("Tipo");

        cbxHabEliTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout pnlHabEliDatosLayout = new javax.swing.GroupLayout(pnlHabEliDatos);
        pnlHabEliDatos.setLayout(pnlHabEliDatosLayout);
        pnlHabEliDatosLayout.setHorizontalGroup(
            pnlHabEliDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHabEliDatosLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(pnlHabEliDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbHabEliTipo)
                    .addComponent(lbHabEliPrecio)
                    .addComponent(lbHabEliDescripcion))
                .addGap(29, 29, 29)
                .addGroup(pnlHabEliDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtHabEliDescripcion)
                    .addComponent(txtHabEliPrecio)
                    .addComponent(cbxHabEliTipo, 0, 178, Short.MAX_VALUE))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        pnlHabEliDatosLayout.setVerticalGroup(
            pnlHabEliDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHabEliDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHabEliDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHabEliDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHabEliDescripcion))
                .addGap(17, 17, 17)
                .addGroup(pnlHabEliDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHabEliPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHabEliPrecio))
                .addGap(18, 18, 18)
                .addGroup(pnlHabEliDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxHabEliTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHabEliTipo))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        lbHabEliTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbHabEliTitulo.setText("Eliminar habitación");

        javax.swing.GroupLayout pnlHabEliminarLayout = new javax.swing.GroupLayout(pnlHabEliminar);
        pnlHabEliminar.setLayout(pnlHabEliminarLayout);
        pnlHabEliminarLayout.setHorizontalGroup(
            pnlHabEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHabEliminarLayout.createSequentialGroup()
                .addGroup(pnlHabEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHabEliminarLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(pnlHabEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlHabEliConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHabEliEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(pnlHabEliDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlHabEliminarLayout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(lbHabEliTitulo)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        pnlHabEliminarLayout.setVerticalGroup(
            pnlHabEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHabEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbHabEliTitulo)
                .addGap(18, 18, 18)
                .addGroup(pnlHabEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlHabEliDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlHabEliminarLayout.createSequentialGroup()
                        .addComponent(pnlHabEliConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHabEliEliminar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHabEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHabEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHabEliEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabEliEliminarActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null,
                "Esta seguro de eliminar la habitacion con id " + habitacion.getId(),
                "Eliminar habitación", JOptionPane.OK_CANCEL_OPTION) == 0) {
            JOptionPane.showMessageDialog(null, service.deleteHabitacion(habitacion), "Alerta", JOptionPane.INFORMATION_MESSAGE);
            txtHabEliIdHabitacion.setText("");
            txtHabEliDescripcion.setText("");
            txtHabEliPrecio.setText("");
            habitacion = null;
            btnHabEliEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_btnHabEliEliminarActionPerformed

    private void btnHabEliBuscarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabEliBuscarIdActionPerformed
        try {
            int id = Integer.parseInt(txtHabEliIdHabitacion.getText());
            habitacion = service.getHabitacion(id);
            if (habitacion.getId_hotel() == hoteles.get(cbxHabEliHoteles.getSelectedIndex()).getId()) {
                txtHabEliDescripcion.setText(habitacion.getDescripcion());
                txtHabEliPrecio.setText(String.valueOf(habitacion.getPrecio()));
                btnHabEliEliminar.setEnabled(true);

                System.out.println(habitacion.getId_hotel());

            } else {
                JOptionPane.showMessageDialog(null, "Habitacion no encontrada");
                txtHabEliIdHabitacion.setText("");
                txtHabEliDescripcion.setText("");
                txtHabEliPrecio.setText("");
                habitacion = null;
                btnHabEliEliminar.setEnabled(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No es un id valido");
        }
    }//GEN-LAST:event_btnHabEliBuscarIdActionPerformed

    private void txtHabEliIdHabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHabEliIdHabitacionMouseClicked
        // TODO add your handling code here:
        btnHabEliEliminar.setEnabled(false);
        txtHabEliDescripcion.setText("");
        txtHabEliPrecio.setText("");

    }//GEN-LAST:event_txtHabEliIdHabitacionMouseClicked

    private void cargarValoresIniciales() {
        btnHabEliEliminar.setEnabled(false);
        TipoHabitacion tipos[] = TipoHabitacion.values();
        this.tipos = tipos;
        cbxHabEliTipo.removeAllItems();
        for (int i = 0; i < tipos.length; i++) {
            cbxHabEliTipo.addItem(tipos[i].toString());
        }

        cbxHabEliHoteles.addItem("Seleccione un hotel");
        String tipo = service.getSecionTipo(usuario);

        if (tipo.equals("Master")) {
            hoteles = service.getHotels("All_Hotels");
        } else {
            hoteles = service.getHotels(usuario);
        }
        cbxHabEliHoteles.removeAllItems();
        if (hoteles != null) {
            for (int i = 0; i < hoteles.size(); i++) {
                cbxHabEliHoteles.addItem(hoteles.get(i).getNombre());
            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHabEliBuscarId;
    private javax.swing.JButton btnHabEliEliminar;
    private javax.swing.JComboBox<String> cbxHabEliHoteles;
    private javax.swing.JComboBox<String> cbxHabEliTipo;
    private javax.swing.JLabel lbHabEliDescripcion;
    private javax.swing.JLabel lbHabEliPrecio;
    private javax.swing.JLabel lbHabEliTipo;
    private javax.swing.JLabel lbHabEliTitulo;
    private javax.swing.JLabel lblIdHabitacion;
    private javax.swing.JPanel pnlHabEliConsultar;
    private javax.swing.JPanel pnlHabEliDatos;
    private javax.swing.JPanel pnlHabEliminar;
    private javax.swing.JTextField txtHabEliDescripcion;
    private javax.swing.JTextField txtHabEliIdHabitacion;
    private javax.swing.JTextField txtHabEliPrecio;
    // End of variables declaration//GEN-END:variables
}
