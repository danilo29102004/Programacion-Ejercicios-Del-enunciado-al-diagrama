
package ejercicio2;

public class Cuenta {
    private int numeroIdentificativo;
    private double saldoDisponible;

    public Cuenta() {
        this.numeroIdentificativo= 0;
        this.saldoDisponible= 0;
   
    }

    public Cuenta(int numeroIdentificativo, double saldoDisponible) {
        this.numeroIdentificativo = numeroIdentificativo;
        this.saldoDisponible = saldoDisponible;

    }
     public Cuenta(Cuenta cuenta){
        this.numeroIdentificativo = cuenta.numeroIdentificativo;
        this.saldoDisponible = cuenta.saldoDisponible;
    }

    public int getNumeroIdentificativo() {
        return this.numeroIdentificativo;
    }

    public double getSaldoDisponible() {
        return this.saldoDisponible;
    }


    public void setNumeroIdentificativo(int numeroIdentificativo) {
        this.numeroIdentificativo = numeroIdentificativo;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }
    

    @Override
    public String toString() {
        return "Cuenta{" + "numeroIdentificativo=" + numeroIdentificativo + ", saldoDisponible=" + saldoDisponible + '}';
    }


   
    
   
        
        
    
    }
    
    
    
    
    
    
    
