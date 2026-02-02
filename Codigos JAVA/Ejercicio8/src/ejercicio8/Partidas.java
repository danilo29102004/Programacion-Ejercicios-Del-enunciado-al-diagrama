
package ejercicio8;


public class Partidas {
    private double duracion;
    private Jugador jugador;
    private boolean partidaActiva;
        
    public Partidas(){
        this.duracion = 0 ;
        this.jugador = null; 
        this.partidaActiva = true;
    }
    
    public Partidas(double duracion,Jugador[] jugadores, boolean partida ){
        this.duracion = duracion;
        this.jugador = jugador;
        this.partidaActiva = partidaActiva;
    }

    public double getDuracion() {
        return this.duracion;
    }

    public Jugador getJugador() {
        return this.jugador;
    }

    public boolean getPartida() {
        return partidaActiva;
    }
    

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugador = jugador;
    }

    public void setPartidaActiva(boolean partidaActiva) {
        this.partidaActiva = partidaActiva;
    }
    
    public void finalizarPartida (){
        
        this.partidaActiva = false;

        this.duracion = 200 + (400 - 200) * Math.random();

        this.jugador.subidaDeNivel();

    } 
    

    
}
