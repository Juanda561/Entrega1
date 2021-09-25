
public class Direccion {
    
    private String calle;
    private String numero_vivienda;

    public Direccion(String calle, String numero_vivienda) {
        this.calle = calle;
        this.numero_vivienda = numero_vivienda;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero_vivienda() {
        return numero_vivienda;
    }

    public void setNumero_vivienda(String numero_vivienda) {
        this.numero_vivienda = numero_vivienda;
    }
    
    
}
