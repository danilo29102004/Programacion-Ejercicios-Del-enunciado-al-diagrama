/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author EAG
 */
public class Empresa {
// Declaración de atributos
    private Vehiculo[] vehiculosRegistrados;
// Constructores
// Constructor por defecto
    public Empresa(){
        this.vehiculosRegistrados = new Vehiculo[0];

    }
    // Constructor por parámetros
    public Empresa(Vehiculo[] vehiculosRegistrados){
        this.vehiculosRegistrados = vehiculosRegistrados;
    }
    // Constructor de copia
    public Empresa(Empresa VehiculosReg ){
        this.vehiculosRegistrados = VehiculosReg.vehiculosRegistrados;
    }
    // Declaración de getters (1 por atributo)
    public  Vehiculo[] getVehiculosRegistrados(){
        return this.vehiculosRegistrados;
    }
    
    // Declaración de setters (1 por atributo)
    public void setVehiculosRegistrados(Vehiculo[] VehiculosRegistrados){
        this.vehiculosRegistrados = VehiculosRegistrados;
    }
    // Declaración de métodos personalizados
    // Declaración toString() (con @Override)
    

  
    public boolean registrarVehiculo(Vehiculo vehiculo) {
        // El vehículo entra disponible
        vehiculo.setDisponible(true);

        Vehiculo[] nuevoArray = new Vehiculo[this.vehiculosRegistrados.length + 1];

        for (int i = 0; i < this.vehiculosRegistrados.length; i++) {
            nuevoArray[i] = this.vehiculosRegistrados[i];
        }

        nuevoArray[nuevoArray.length - 1] = vehiculo;
        this.vehiculosRegistrados = nuevoArray;

        return true;
        
    }
    //alquilar por matriocula el vehiculo
    public boolean alquilarVehiculo(String matricula) {
        for (Vehiculo vehiculo : vehiculosRegistrados) {
            if (vehiculo.getMatricula().equals(matricula) && vehiculo.getDisponible()) {
                vehiculo.setDisponible(false);
                return true;
            }
        }
        return false;
    }

    // Consultar información de un vehículo
    public Vehiculo consultarVehiculo(String matricula) {
        for (Vehiculo v : vehiculosRegistrados) {
            if (v.getMatricula().equals(matricula)) {
                return v;
            }
        }
        return null;
    }
    
    @Override
    public String toString() {
        String resultado = "Vehículos registrados en la empresa:\n";

        
            for (Vehiculo v : vehiculosRegistrados) {
                resultado += v.toString() + "\n";
            }
        
        return resultado;
}
    
    
    
    
}
    
   
   

