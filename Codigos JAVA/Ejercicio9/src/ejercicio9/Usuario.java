
package ejercicio9;

public class Usuario {
    private String nombre;
    private String correoElectronico;
    private String dni;
    
    public Usuario() {
        this.nombre = "";
        this.correoElectronico = "";
        this.dni = "";
    }
    
    public Usuario(String nombre, String correoElectronico, String dni) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.dni = dni;
    }
    public Usuario(Usuario usuarioCopia){
        this.nombre = usuarioCopia.nombre;
        this.correoElectronico = usuarioCopia.correoElectronico;
        this.dni = usuarioCopia.dni;

    }

    public String getNombre() {
        return this.nombre;
    }

    public String getCorreoElectronico() {
        return this.correoElectronico;
    }

    public String getDni() {
        return this.dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", correoElectronico=" + correoElectronico + ", dni=" + dni + '}';
    }
    
    
    
    
    
}
