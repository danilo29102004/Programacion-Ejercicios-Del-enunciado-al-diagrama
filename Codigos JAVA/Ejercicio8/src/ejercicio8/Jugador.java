/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

public class Jugador {
    private String nombre;
    private int nivel;
    private Partidas[] partidas;
    
    public Jugador(){
        this.nombre = "";
        this.nivel = 1; 
        this.partidas = new Partidas[0];
    }
    
    public Jugador(String nombre, int nivelInicial, Partidas[] partidas ){
        this.nombre = nombre;
        this.nivel = nivelInicial; 
        this.partidas = new Partidas[0];
    }
    
    public Jugador(Jugador jugadorCopia){
        this.nombre = jugadorCopia.nombre;
        this.nivel = jugadorCopia.nivel;

    }

    public String getNombre() {
        return this.nombre;
    }

    public int getNivel() {
        return this.nivel;
    }

    public Partidas[] getPartidas() {
        return partidas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivel(int nivelInicial) {
        this.nivel = nivelInicial;
    }

    public void setPartidas(Partidas[] partidas) {
        this.partidas = partidas;
    }
    
    public void subidaDeNivel ( ){
            this.nivel += 1;
   
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", nivel=" + nivel + ", partidas=" + partidas + '}';
    }
    
    
    
    
}
