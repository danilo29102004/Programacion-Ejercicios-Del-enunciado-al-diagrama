
package ejercicio2;

public class Cuenta {
    private int numeroIdentificativo;
    private double saldoDisponible;
    private Cliente cliente;

    public Cuenta() {
        this.numeroIdentificativo= 0;
        this.saldoDisponible= 0;
        this.cliente= null;
        
    }

    public Cuenta(int numeroIdentificativo, double saldoDisponible, Cliente cliente) {
        this.numeroIdentificativo = numeroIdentificativo;
        this.saldoDisponible = saldoDisponible;
        this.cliente = cliente;
    }
     public Cuenta(Cuenta cuenta){
        this.numeroIdentificativo = cuenta.numeroIdentificativo;
        this.saldoDisponible = cuenta.saldoDisponible;
        this.cliente = cuenta.cliente;
    }

    public int getNumeroIdentificativo() {
        return this.numeroIdentificativo;
    }

    public double getSaldoDisponible() {
        return this.saldoDisponible;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setNumeroIdentificativo(int numeroIdentificativo) {
        this.numeroIdentificativo = numeroIdentificativo;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
    
    
}
