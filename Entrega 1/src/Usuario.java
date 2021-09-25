
public class Usuario {

    private String nombre_usuario;
    private String password;

    public Usuario(String nombre, String password) {
        this.nombre_usuario = nombre;
        this.password = password;
    }

    public String getNombre() {
        return nombre_usuario;
    }

    public void setNombre(String nombre) {
        this.nombre_usuario = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
