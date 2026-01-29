/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author EAG
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Cuenta cuent1 = new Cuenta (111, 500); 
        Cuenta cuent2 = new Cuenta (222, 1500); 
        Cuenta cuent3 = new Cuenta (333, 2500); 
       
        
        
        Cliente clien1= new Cliente ("15428765C","calamardo",cuent1 );
        Cliente clien2= new Cliente ("15428765D","Javier",cuent2 );
        Cliente clien3= new Cliente ("15428765A","Daniel",cuent3 );
        
        System.out.println(clien1);
        System.out.println(clien2);
        System.out.println(clien3);
        
        
       
    }
    
    
 
 
  
}
