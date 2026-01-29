
package ejercicio7;

public class Cliente {
    private String dni;
    private String nombre;
    
    public Cliente(){
     this.dni="";
     this.nombre="";
    }
    public Cliente(String dni,String nombre ){
     this.dni= dni;
     this.nombre= nombre;
    }
    public Cliente(Cliente clienteCopia){
     this.dni= clienteCopia.dni;
     this.nombre= clienteCopia.nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
   
  
}
