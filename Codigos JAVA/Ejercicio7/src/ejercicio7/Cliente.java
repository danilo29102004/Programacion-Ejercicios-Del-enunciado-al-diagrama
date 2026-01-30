
package ejercicio7;

public class Cliente {
    private String dni;
    private String nombre;
    private Reserva[] reserva;
    
    public Cliente(){
     this.dni="";
     this.nombre="";
     this.reserva = new Reserva [0];
    }
    public Cliente(String dni,String nombre,Reserva[] reserva ){
     this.dni= dni;
     this.nombre= nombre;
     this.reserva= reserva;
    }
    public Cliente(Cliente clienteCopia){
     this.dni= clienteCopia.dni;
     this.nombre= clienteCopia.nombre;
     this.reserva= clienteCopia.reserva;
    }

    public String getDni() {
        return this.dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Reserva[] getReserva() {
        return this.reserva;
    }
    

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setReserva(Reserva[] reserva) {
        this.reserva = reserva;
    }
    public void registrarReserva (Reserva reserva){
        
        Reserva[] arrayNuevoReserva = new Reserva [this.reserva.length + 1];
        
 
        for(int i =0; i<this.reserva.length; i++){
            arrayNuevoReserva[i] = this.reserva[i];
            
        }
         arrayNuevoReserva[arrayNuevoReserva.length - 1] = reserva;
         this.setReserva(arrayNuevoReserva); 
    }

    @Override
    public String toString() {
        
        return "Cliente{" + "dni=" + dni + ", nombre=" + nombre + ", reserva=";
        
    }
    
    
}
