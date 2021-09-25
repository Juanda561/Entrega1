
public class Repartidor extends Usuario {
    
    private long numero_documento;
    private String nombre;
    private String apellido;
    private char categoria;

    public Repartidor(long numero_documento, String nombre, String apellido, char categoria, String nombre_usuario, String password) {
        super(nombre_usuario, password);
        this.numero_documento = numero_documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.categoria = categoria;
    }
    

    public long getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(long numero_documento) {
        this.numero_documento = numero_documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }
    
    
    
    
    
}
