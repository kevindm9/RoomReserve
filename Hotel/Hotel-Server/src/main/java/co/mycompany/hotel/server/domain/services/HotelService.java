package co.mycompany.hotel.server.domain.services;

import co.mycompany.hotel.commons.domain.DiaSemana;
import co.mycompany.hotel.commons.domain.Hotel;
import co.mycompany.hotel.commons.domain.Habitacion;
import co.mycompany.hotel.commons.domain.Persona;
import co.mycompany.hotel.commons.domain.Reserva;
import java.util.ArrayList;
import co.mycompany.hotel.server.access.IHotelRepository;
import java.sql.Date;


/**
 * Servicio de clientes. Da acceso a la lógica de negocio
 *
 * @author Kevin Morales
 */
public class HotelService {

    /**
     * Repositorio de clientes
     */
    IHotelRepository repo;

    /**
     * Constructor parametrizado. Hace inyeccion de dependencias
     *
     * @param repo repositorio de tipo IHotelRepository
     */
    public HotelService(IHotelRepository repo) {
        this.repo = repo;
    }

    public ArrayList<Habitacion> getDiaHabitaciones(int id_Persona) {
        return repo.getDiaHabitaciones(id_Persona);
    }

    public ArrayList<Hotel> getHoteles(String usuario) {
        return repo.getHoteles(usuario);
    }

    public String addHabitacion(Habitacion habitacion) {
        return repo.addHabitacion(habitacion);
    }

    public String addHotel(Hotel hotel,String usuario) {
        return repo.addHotel(hotel,usuario);
    }
    
    public String updateHotel(Hotel hotel,String usuario) {
        return repo.updateHotel(hotel,usuario);
    }

    public String addPersona(Persona persona, String tipo) {
        return repo.addPersona(persona, tipo);
    }

    public ArrayList<Habitacion> getHabitaciones(int id_hotel, Date fechaInicio, Date fechafin) {
        return repo.getHabitaciones(id_hotel, fechaInicio, fechafin);
    }

    /**
     *
     * @param id
     * @return
     */
    public Habitacion getHabitacion(int id) {

        return repo.getHabitacion(id);
    }

    /**
     *
     * @param habitacion
     * @return
     */
    public String ModificarHabitacion(Habitacion habitacion) {

        return repo.ModificarHabitacion(habitacion);
    }

    public Persona getPersona(String usuario) {
        return repo.getPersona(usuario);
    }

    public String getSesionTipo(String usuario) {
        return repo.getSesionTipo(usuario);
    }

    public String getSesionClave(String usuario) {
        return repo.getSesionClave(usuario);
    }

    public ArrayList<Reserva> getReservaCliente(int id_cliente) {
        return repo.getReservaCliente(id_cliente);
    }
        public ArrayList<Reserva> getReservaHotel(int id_hotel) {
        return repo.getReservaHotel(id_hotel);
    }
    public String updatePersona(Persona persona, String tipo){
        
    return repo.updatePersona(persona, tipo);
    
    } 
    public String deleteHabitacion(Habitacion habitacion){
    
    return repo.deleteHabitacion(habitacion);
    }
    public String addReserva(int idHotel, Habitacion habitacion, Date fecha_inicio, Date fecha_fin, Persona sesion) {
        return repo.addReserva(idHotel, habitacion, fecha_inicio, fecha_fin, sesion);
    }

    public String deleteHabitacionSemanal(int idHotel, Habitacion habitacion, DiaSemana dia) {
        return repo.deleteHabitacionSemanal(idHotel, habitacion, dia);
    }
        public String deleteHotel(int idHotel) {
        return repo.deleteHotel(idHotel);
    }  
        public String deleteReserva(Reserva reserva) {
        return repo.deleteReserva(reserva);
    }  
        public String deletePersona(int id_Persona,String tipo) {
        return repo.deletePersona(id_Persona,tipo);
    }
    public String updateReserva(Reserva reserva){
        return repo.updateReserva(reserva);
    
    }
}
