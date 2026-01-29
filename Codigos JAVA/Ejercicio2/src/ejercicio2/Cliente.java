
package ejercicio2;

public class Cliente {
    private String dni;
    private String nombte;
    private Cuenta cuenta;
    
    public Cliente() {
        this.dni= "";
        this.nombte= "";
        this.cuenta= new Cuenta(123,123132);
        
    }
    public Cliente(String dni, String nombte, Cuenta cuenta) {
        this.dni = dni;
        this.nombte = nombte;
        this.cuenta = cuenta;
        
    }
    public Cliente(Cliente cliente){
        this.dni = cliente.dni;
        this.nombte = cliente.nombte;
        this.cuenta = new Cuenta(123,123132);
    }

    public String getDni() {
        return this.dni;
    }

    public String getNombte() {
        return this.nombte;
    }

    public Cuenta getCuenta() {
        return this.cuenta;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombte(String nombte) {
        this.nombte = nombte;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    public void retitarDinero (int dinero){
    
        if (cuenta.getSaldoDisponible () < dinero){
            System.out.println("no puede bro tiene poco saldo ");

        }else{
           cuenta.setSaldoDisponible (cuenta.getSaldoDisponible() - dinero);
           System.out.println("eres el puto amo");
        }
    }
    
    
    public void ingresarDinero(int dinero){
        
        if(dinero<0){
            System.out.println("ingresa mas dinero");
        
        }else{
            cuenta.setSaldoDisponible (cuenta.getSaldoDisponible() + dinero);
        
        }
    }
    
    public double consultarDinero (){
        
    
        return cuenta.getSaldoDisponible();
    }

    @Override
    public String toString() {
        return "Cliente dni=" + dni + ", nombte=" + nombte + ", cuenta=" + cuenta + '}';
    }
    
    
    
}
    
    
    
    

