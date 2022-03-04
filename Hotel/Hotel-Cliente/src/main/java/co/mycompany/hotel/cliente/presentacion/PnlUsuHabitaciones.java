/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package co.mycompany.hotel.cliente.presentacion;

import co.mycompany.hotel.cliente.domain.services.HotelService;
import co.mycompany.hotel.commons.domain.Habitacion;
import co.mycompany.hotel.commons.domain.TipoHabitacion;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose Ricardo
 */
public class PnlUsuHabitaciones extends javax.swing.JPanel {
    private FrmMain panel;
    private final HotelService service;
    private ArrayList<Habitacion> habitaciones;
    private final DefaultTableModel modelo;
    private final int id_hotel;
    Date fechaIni;
    Date fechaFin;
    String usuario;

    /**
     * Creates new form PnlVistaHabitaciones
     */
    public PnlUsuHabitaciones(FrmMain panel, int id_hotel,String usuario) {
        
        this.panel = panel;
        this.id_hotel = id_hotel;
        habitaciones = new ArrayList<>();
        this.service = new HotelService();
        initComponents();
        this.modelo = (DefaultTableModel) tabUsuHabitaciones.getModel();
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabUsuHabitaciones = new javax.swing.JTable();
        btnUsuHabRegresar = new javax.swing.JButton();
        dccUsuHabInicio = new com.toedter.calendar.JDateChooser();
        dccUsuHabFin = new com.toedter.calendar.JDateChooser();
        btnUsuHabBuscar = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        tabUsuHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Habitacion", "Carateristicas"
            }
        ));
        tabUsuHabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabUsuHabitacionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabUsuHabitaciones);
        if (tabUsuHabitaciones.getColumnModel().getColumnCount() > 0) {
            tabUsuHabitaciones.getColumnModel().getColumn(0).setMinWidth(120);
            tabUsuHabitaciones.getColumnModel().getColumn(0).setPreferredWidth(120);
            tabUsuHabitaciones.getColumnModel().getColumn(0).setMaxWidth(120);
        }

        btnUsuHabRegresar.setText("Regresar");
        btnUsuHabRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuHabRegresarActionPerformed(evt);
            }
        });

        btnUsuHabBuscar.setText("Buscar");
        btnUsuHabBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuHabBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dccUsuHabFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsuHabBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsuHabRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(dccUsuHabInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(dccUsuHabInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dccUsuHabFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsuHabBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(btnUsuHabRegresar)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tabUsuHabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabUsuHabitacionesMouseClicked
        // TODO add your handling code here:
        int fila = tabUsuHabitaciones.getSelectedRow();
        int opc =JOptionPane.showConfirmDialog(null, "Reservar habitacion", "Desea reservar la habitacion?", JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
        if (opc == 0){
            try{
                service.addReserva(id_hotel, habitaciones.get(fila),fechaIni,fechaFin,service.getPersona(usuario));     
                cargarHabitaciones(fechaIni,fechaFin);
            }
            catch(Exception e){
                
            }
        } 
    }//GEN-LAST:event_tabUsuHabitacionesMouseClicked

    private void btnUsuHabRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuHabRegresarActionPerformed
        // TODO add your handling code here:
        panel.mostrarSucursales();
    }//GEN-LAST:event_btnUsuHabRegresarActionPerformed

    private void btnUsuHabBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuHabBuscarActionPerformed
        // TODO add your handling code here:
        //System.out.println(dccUsuHabInicio.getDateFormatString());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = simpleDateFormat.format(dccUsuHabInicio.getDate());
        //dccUsuHabInicio.getDateFormatString()
        fechaIni = Date.valueOf(formattedDate);
        formattedDate = simpleDateFormat.format(dccUsuHabFin.getDate());
        fechaFin = Date.valueOf(formattedDate);
        
        cargarHabitaciones(fechaIni,fechaFin);
        
    }//GEN-LAST:event_btnUsuHabBuscarActionPerformed

    public void cargarHabitaciones(Date fechaIni, Date fechaFin){
        for (int i = modelo.getRowCount()-1; i>=0;i--){
            modelo.removeRow(i);
        }

        habitaciones.clear();
        habitaciones = service.getHabitaciones(id_hotel,fechaIni,fechaFin);
        tabUsuHabitaciones.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dt.addColumn("Habitacion");
        dt.addColumn("Descripcion");

        if (habitaciones.size() > 0) {
            for (int i = 0; i < habitaciones.size(); i++) {
                Object fila[] = new Object[2];

                String descripcion = "<html>";
                descripcion += "<body><h3>"+habitaciones.get(i).getDescripcion()+"</h3>";
                descripcion += "--->Tipo:   " + habitaciones.get(i).getTipo().toString();
                descripcion += "<br>--->Precio: " + habitaciones.get(i).getPrecio();
                descripcion += "<br>--->Id:     "+ habitaciones.get(i).getId();
                descripcion += "</body></html>";

                Image imagen = new ImageIcon(habitaciones.get(i).getFoto()).getImage();
                ImageIcon icono = new ImageIcon(imagen.getScaledInstance(120, 120, 0));

                //JOptionPane.showMessageDialog(null," Aprendiendo a poner imagenes ", "Imagen Java", JOptionPane.PLAIN_MESSAGE, icono);
                try {

                    fila[0] = new JLabel(icono);
                    fila[1] = new JLabel(descripcion);
                     
                    modelo.addRow(fila);

                } catch (Exception ex) {
                    modelo.addRow(new Object[]{"No imagen", descripcion});
                }

                tabUsuHabitaciones.setModel(modelo);
                tabUsuHabitaciones.setRowHeight(120);

            }//*/
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUsuHabBuscar;
    private javax.swing.JButton btnUsuHabRegresar;
    private com.toedter.calendar.JDateChooser dccUsuHabFin;
    private com.toedter.calendar.JDateChooser dccUsuHabInicio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tabUsuHabitaciones;
    // End of variables declaration//GEN-END:variables
}
