/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

/**
 *
 * @author EAG
 */
public class Jugador {
    private String nombre;
    private int nivelInicial;
    
    public Jugador(){
        this.nombre = "";
        this.nivelInicial = 0; 
    }
    
    public Jugador(String nombre, int nivelInicial ){
        this.nombre = nombre;
        this.nivelInicial = nivelInicial; 
    }
    
    public Jugador(Jugador jugadorCopia){
        this.nombre = jugadorCopia.nombre;
        this.nivelInicial = jugadorCopia.nivelInicial;

    }

    public String getNombre() {
        return this.nombre;
    }

    public int getNivelInicial() {
        return this.nivelInicial;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivelInicial(int nivelInicial) {
        this.nivelInicial = nivelInicial;
    }
    public  subidaNivel(Nivel nivel){
    
    
    
    }
    
    
    
}
