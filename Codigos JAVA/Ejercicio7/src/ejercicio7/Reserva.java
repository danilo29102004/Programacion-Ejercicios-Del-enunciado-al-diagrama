
package ejercicio7;

public class Reserva {
    private String fechaEntrada;
    private String fechaSalida;
    private Reserva reserva;
    private Cliente cliente;
    private Habitacion habitacion;
    
    public Reserva(){
        this.fechaEntrada = "";
        this.fechaSalida = "";
        this.reserva = null;
        this.cliente = null;
        this.habitacion = null;
        
        
      
    
    }
    public Reserva (String fechaEntrada, String fechaSalida, Reserva reserva, Cliente cliente, Habitacion habitacion){
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.reserva = reserva;
        this.cliente = cliente;
        this.habitacion = habitacion;
        }
    private Reserva (Reserva reservaCopia){
        
        this.fechaEntrada = reservaCopia.fechaEntrada;
        this.fechaSalida = reservaCopia.fechaSalida;
        this.reserva = reservaCopia.reserva;
        this.cliente = reservaCopia.cliente;
        this.habitacion = reservaCopia.habitacion;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
    
    
    
    
    
    
}
