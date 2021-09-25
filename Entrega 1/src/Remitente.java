
public class Remitente extends Cliente {

    private String ciudad;
    private String pais;
    
    private Direccion direcciones;

    public Remitente(String ciudad, String pais, String calle, String numero_vivienda, String nombre, String telefono) {
        super(nombre, telefono);
        this.ciudad = ciudad;
        this.pais = pais;
        this.direcciones = new Direccion(calle, numero_vivienda);
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Direccion getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(Direccion direcciones) {
        this.direcciones = direcciones;
    }
    
    
    
}
