
public class Soporte {

    private String fecha_y_hora_visita;
    
    private Repartidor repartidor;
    private Destinatario destinatario;
    private Paquete paquete;

    public Soporte(String fecha_y_hora_visita) {
        this.fecha_y_hora_visita = fecha_y_hora_visita;
    }

    public String getFecha_y_hora_visita() {
        return fecha_y_hora_visita;
    }

    public void setFecha_y_hora_visita(String fecha_y_hora_visita) {
        this.fecha_y_hora_visita = fecha_y_hora_visita;
    }

    public Repartidor getRepartidor() {
        return repartidor;
    }

    public void setRepartidor(Repartidor repartidor) {
        this.repartidor = repartidor;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Destinatario destinatario) {
        this.destinatario = destinatario;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }
    
    
    
    
    
    
}
