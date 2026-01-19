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
public class Vehiculo {
    private String matricula ;
    private String marca ;
    private String modelo ;
    private boolean disponible ;
    
    public Vehiculo(){
        this.matricula="";
        this.marca="";
        this.modelo="";
        this.disponible=true;
    } 
    // Constructor por parámetros
    public Vehiculo(String matricula,String marca,String modelo, boolean disponible){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.disponible = disponible;
    }
    public Vehiculo(Vehiculo vehiculoCopia){
        this.matricula = vehiculoCopia.matricula;
        this.marca = vehiculoCopia.marca;
        this.modelo = vehiculoCopia.modelo;
        this.disponible = vehiculoCopia.disponible;
    }
    // Declaración de getters (1 por atributo)
    public String getMatricula(){
        return this.matricula;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public boolean getDisponible(){
        return this.disponible;
        
    // Declaración de setters (1 por atributo)    
    }
     public void setMatricula(String matricula){
        this.matricula = matricula;
    }
     public void setMarca(String marca){
        this.marca = marca;
    }
     public void setModelo(String modelo){
        this.modelo = modelo;
    }
     public void setDisponible(boolean disponible){
        this.disponible = disponible;
    } 
    @Override
    public String toString(){
        return "Nombre matricula: " + this.matricula +
                "Nombre marca: " + this.marca +
                "Nombre modelo: " + this.modelo +
                "Nombre disponible: " ;
        if(this.disponible){
            return+="si";
            
        
        }else{
            return+="no";
        
        }
                
               
          
    }
    
}
