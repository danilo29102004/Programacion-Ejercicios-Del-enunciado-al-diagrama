
package ejercicio7;

public class Habitacion {
    private int numero ;
    private String tipoHabitacion;
    private boolean habitacionDisponible;
    
    
    public Habitacion(){
        this.numero=0;
        this.tipoHabitacion="";
        this.habitacionDisponible=true;
    }
    
    public Habitacion(int numero, String tipoHabitacion, boolean habitacionDisponible ){
        this.numero=numero;
        this.tipoHabitacion= tipoHabitacion;
        this.habitacionDisponible=habitacionDisponible;
    }
    public Habitacion(Habitacion habitacionCopia){
     this.numero= habitacionCopia.numero;
     this.tipoHabitacion= habitacionCopia.tipoHabitacion;
     this.habitacionDisponible= habitacionCopia.habitacionDisponible;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public boolean isHabitacionDisponible() {
        return habitacionDisponible;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public void setHabitacionDisponible(boolean habitacionDisponible) {
        this.habitacionDisponible = habitacionDisponible;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "numero=" + numero + ", tipoHabitacion=" + tipoHabitacion + ", habitacionDisponible=" + habitacionDisponible + '}';
    }
    
    
    
}
