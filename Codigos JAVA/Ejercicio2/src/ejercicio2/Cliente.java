
package ejercicio2;

public class Cliente {
    private String dni;
    private String nombte;
    private Cuenta[] cuenta;
    
    public Cliente() {
        this.dni= "";
        this.nombte= "";
        this.cuenta= new Cuenta[0] ;
        
    }
    public Cliente(String dni, String nombte, Cuenta[] cuenta) {
        this.dni = dni;
        this.nombte = nombte;
        this.cuenta = cuenta.clone();
        
    }
    public Cliente(Cliente cliente){
        this.dni = cliente.dni;
        this.nombte = cliente.nombte;
        this.cuenta = cliente.cuenta.clone();
    }

    public String getDni() {
        return this.dni;
    }

    public String getNombte() {
        return this.nombte;
    }

    public Cuenta[] getCuenta() {
        return this.cuenta;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombte(String nombte) {
        this.nombte = nombte;
    }

    public void setCuenta(Cuenta[] cuenta) {
        this.cuenta = cuenta;
    }
    
    
    
    
}

