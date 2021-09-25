
public class Destinatario extends Cliente {
    
    private Direccion direcciones;
    private Zona_de_Entrega zona_de_entrega;
    private Soporte soporte;
    

    public Destinatario(String calle, String numero_vivienda, int codpostal, String nombre, String telefono) {
        super(nombre, telefono);
        this.direcciones = new Direccion(calle, numero_vivienda);
        this.zona_de_entrega = new Zona_de_Entrega(codpostal);
        soporte = new Soporte("05/09/2021 11:00 am");
    }

    public Direccion getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(Direccion direcciones) {
        this.direcciones = direcciones;
    }

    public Zona_de_Entrega getZona_de_entrega() {
        return zona_de_entrega;
    }

    public void setZona_de_entrega(Zona_de_Entrega zona_de_entrega) {
        this.zona_de_entrega = zona_de_entrega;
    }
    
 
    
    
}
