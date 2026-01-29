/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {
        // añadir empresa
        Empresa empresa = new Empresa();
        //añadir vehiculos
        Vehiculo veh1 = new Vehiculo("1234 BCD", "VOLKSWAGEN", "GTI", true );
        Vehiculo veh2 = new Vehiculo("1234 FGT", "AUDI", "RS7", true );
        Vehiculo veh3 = new Vehiculo("1234 DFG", "BMW", "X3", true );
        Vehiculo veh4 = new Vehiculo("1234 ERW", "BMW", "M4", true );
        Vehiculo veh5 = new Vehiculo("1234 DSA", "BMW", "M4COMPETITION", true );
       //registrar vehiculos en al empresa 
        empresa.registrarVehiculo(veh1);
        empresa.registrarVehiculo(veh2);
        empresa.registrarVehiculo(veh3);
        empresa.registrarVehiculo(veh4);
        empresa.registrarVehiculo(veh5);

        // Alquilar vehículo
        empresa.alquilarVehiculo("1234 BCD");
        empresa.alquilarVehiculo("1234 DFG");
        empresa.alquilarVehiculo("1234 DSA");
        

        // Consultar vehículo
        Vehiculo consultado = empresa.consultarVehiculo("1234ABC");
        
        System.out.println(empresa);
        
        

        
        

    }
    
}
