
package ejercicio7;

public class Reserva {
    private String[] diasReserva;
    private Cliente cliente;
    private Habitacion habitacion;
    private double precioDia;

    
    public Reserva(){
        this.diasReserva = new String [0];
        this.cliente = null;
        this.habitacion = null;
        this.precioDia = 0;
 
    }
    public Reserva (String fechaEntrada, String fechaSalida, Reserva reserva, Cliente cliente, Habitacion habitacion, String[] diasReserva){
        this.diasReserva = diasReserva;
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.precioDia  = precioDia;
        }
    private Reserva (Reserva reservaCopia){
        
        this.diasReserva = reservaCopia.diasReserva;
        this.cliente = reservaCopia.cliente;
        this.habitacion = reservaCopia.habitacion;
        this.precioDia = reservaCopia.precioDia;
    }

    public String[] getDiasReserva() {
        return this.diasReserva;
    }


    public Cliente getCliente() {
        return this.cliente;
    }

    public Habitacion getHabitacion() {
        return this.habitacion;
    }
    
    public double getPrecioDia() {
        return this.precioDia;
    }

    public void setDiasReserva(String[] diasReserva) {
        this.diasReserva = diasReserva;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
    public void setPrecioDia(double precioDia) {
        this.precioDia = precioDia;
    }
    public double importeAPagar (){
        
        double precioTotal;
        precioTotal = this.diasReserva.length * this.precioDia;
        
        
        return precioTotal;
        
    }

    @Override
    public String toString() {
        
        String cadena = "Reserva{cliente=" + this.cliente.getNombre() + ", habitacion=" + this.habitacion.getNumero() + ", precioDia=" + this.precioDia + " dias reservados ";
        for(int i =0; i<this.diasReserva.length; i++){
            
            cadena += this.diasReserva[i] + ", ";
            
             
        }
         
        return cadena;
    }
}
    
    
    
    
    

    
    
    
    
    
    
    

