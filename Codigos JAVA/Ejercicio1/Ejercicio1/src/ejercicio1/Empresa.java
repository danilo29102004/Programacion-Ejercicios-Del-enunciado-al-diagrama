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
    private Vehiculo[] VehiculosRegistrados;
// Constructores
// Constructor por defecto
    public Empresa(){
        this.VehiculosRegistrados = new Vehiculo[0];

    }
    // Constructor por parámetros
    public Empresa(Vehiculo[] VehiculosRegistrados){
        this.VehiculosRegistrados = VehiculosRegistrados;
    }
    // Constructor de copia
    public Empresa(Empresa VehiculosReg ){
        this.VehiculosRegistrados = VehiculosReg.VehiculosRegistrados;
    }
    // Declaración de getters (1 por atributo)
    public  Vehiculo[] getVehiculosRegistrados(){
        return this.VehiculosRegistrados;
    }
    
    // Declaración de setters (1 por atributo)
    public void setVehiculosRegistrados(Vehiculo[] VehiculosRegistrados){
        this.VehiculosRegistrados = VehiculosRegistrados;
    }
    // Declaración de métodos personalizados
    
    
    // Declaración toString() (con @Override)
   
}
