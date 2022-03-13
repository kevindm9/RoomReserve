/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package co.mycompany.hotel.cliente.presentacion;

import co.mycompany.hotel.cliente.domain.services.HotelService;
import co.mycompany.hotel.commons.domain.Habitacion;
import co.mycompany.hotel.commons.domain.Hotel;
import java.awt.Image;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose Ricardo
 */
public class PnlHabConsultar extends javax.swing.JPanel {

    private HotelService service;
    private ArrayList<Habitacion> habitaciones;
    private ArrayList<Hotel> hoteles;
    private DefaultTableModel modelo;
    private String usuario;

    /**
     * Creates new form PnlVistaHabitaciones
     */
    public PnlHabConsultar(String usuario) {
        habitaciones = new ArrayList<>();
        hoteles = new ArrayList<>();
        this.service = new HotelService();
        this.usuario = usuario;
        initComponents();
        this.modelo = (DefaultTableModel) tabvisHabitaciones.getModel();
        lanzar();
    }

    private void lanzar() {
        hoteles = null;
        String tipo = service.getSecionTipo(usuario);
        if(tipo.equals("Master")){
            hoteles = service.getHotels("All_Hotels");
        }
        else{
            hoteles = service.getHotels(usuario);        
        }
        if(hoteles ==null){
            return;
        }
                
        for(Hotel hotel:hoteles){
            ArrayList<Habitacion> habitsxhotel = service.getHabitaciones(hotel.getId(),Date.valueOf("1800-01-01"), Date.valueOf("1800-01-01"));
            if(habitsxhotel == null)
                continue;
            habitsxhotel.forEach((habitacion)-> habitacion.setId_hotel(hotel.getId()));
            habitaciones.addAll(habitsxhotel);
        }


        tabvisHabitaciones.setDefaultRenderer(Object.class, new Render());
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
                descripcion += "--->Tipo:    " + habitaciones.get(i).getTipo().toString();
                descripcion += "<br>--->Precio:  " + habitaciones.get(i).getPrecio();
                descripcion += "<br>--->Id Hab:  "+ habitaciones.get(i).getId();
                descripcion += "<br>--->Id Hotel:"+ habitaciones.get(i).getId_hotel();
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

                tabvisHabitaciones.setModel(modelo);
                tabvisHabitaciones.setRowHeight(120);

            }//*/
        }
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
        tabvisHabitaciones = new javax.swing.JTable();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setPreferredSize(new java.awt.Dimension(740, 216));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(740, 402));

        tabvisHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Habitacion", "Carateristicas"
            }
        ));
        jScrollPane1.setViewportView(tabvisHabitaciones);
        if (tabvisHabitaciones.getColumnModel().getColumnCount() > 0) {
            tabvisHabitaciones.getColumnModel().getColumn(0).setMinWidth(120);
            tabvisHabitaciones.getColumnModel().getColumn(0).setPreferredWidth(120);
            tabvisHabitaciones.getColumnModel().getColumn(0).setMaxWidth(120);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tabvisHabitaciones;
    // End of variables declaration//GEN-END:variables
}