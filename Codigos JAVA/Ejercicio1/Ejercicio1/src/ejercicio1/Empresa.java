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
   
}
