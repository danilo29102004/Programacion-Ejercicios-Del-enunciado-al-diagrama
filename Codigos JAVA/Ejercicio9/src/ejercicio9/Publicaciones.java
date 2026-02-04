
package ejercicio9;

public class Publicaciones {
    private String titulo;
    private String comentarios;
    private String[] reacciones;
    private Usuario usuario;
    
    public Publicaciones() {
        this.titulo = "";
        this.comentarios = "";
        this.reacciones = new String[0];
        this.usuario = null;
    }
    
    

    public Publicaciones(String titulo, String comentarios, String[] reacciones, Usuario usuario) {
        this.titulo = titulo;
        this.comentarios = comentarios;
        this.reacciones = new String[0];
        this.usuario = usuario;
    }
    public Publicaciones(Publicaciones publicacionesCopia){
        this.titulo = publicacionesCopia.titulo;
        this.comentarios = publicacionesCopia.comentarios;
        this.usuario = publicacionesCopia.usuario;
        this.reacciones = publicacionesCopia.reacciones;
    }
    
    public String getTitulo() {
        return this.titulo;
    }

    public String getComentarios() {
        return this.comentarios;
    }

    public String[] getReacciones() {
        return this.reacciones;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public void setReacciones(String[] reacciones) {
        this.reacciones = reacciones;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void anadirComentarios(String nuevoComentario) {
        if (comentarios.isEmpty()) {
            comentarios = nuevoComentario;
        } else {
            comentarios += "" + nuevoComentario;
        }
    }
     public int contabilizarLasReacciones() {
        return reacciones.length;
    }

    @Override
    public String toString() {
        return "Publicaciones{" + "titulo=" + titulo + ", comentarios=" + comentarios + ", reacciones=" + reacciones + ", usuario=" + usuario + '}';
    }
     
    
    
        
    
    
    
}

    