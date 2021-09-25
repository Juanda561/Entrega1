
import java.text.ParseException;

public class Paquete {
  
    private long numero_paquete;
    private String fecha_ingreso;
    private String tipo_paquete;
    private String descripcion;
    private int ancho;
    private int largo;
    private int alto;
    private int peso;
    private int valor_declarado;
    private String fecha_limite;
    private String observaciones;
    private String estado_paquete;
    
    private Zona_de_Entrega zona_de_entrega;
    private Destinatario destinatario;
    private Direccion direccion;
    private Remitente remitente;
    private Repartidor repartidor;
    private Soporte soporte;
    
    public Paquete(long numero_paquete, String fecha_ingreso, String tipo_paquete, String descripcion, int ancho, int largo, int alto, int peso, int valor_declarado, String fecha_limite, String observaciones, String estado_paquete, int codpostal) throws ParseException {
        this.numero_paquete = numero_paquete;
        this.fecha_ingreso = fecha_ingreso;
        this.tipo_paquete = tipo_paquete;
        this.descripcion = descripcion;
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
        this.peso = peso;
        this.valor_declarado = valor_declarado;
        this.fecha_limite = fecha_limite;
        this.observaciones = observaciones;
        this.estado_paquete = estado_paquete;
        this.zona_de_entrega = new Zona_de_Entrega(codpostal);
        
        soporte = new Soporte("05/09/2021 11:00 am");
        
    }

    public long getNumero_paquete() {
        return numero_paquete;
    }

    public void setNumero_paquete(long numero_paquete) {
        this.numero_paquete = numero_paquete;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getTipo_paquete() {
        return tipo_paquete;
    }

    public void setTipo_paquete(String tipo_paquete) {
        this.tipo_paquete = tipo_paquete;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getValor_declarado() {
        return valor_declarado;
    }

    public void setValor_declarado(int valor_declarado) {
        this.valor_declarado = valor_declarado;
    }

    public String getFecha_limite() {
        return fecha_limite;
    }

    public void setFecha_limite(String fecha_limite) {
        this.fecha_limite = fecha_limite;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEstado_paquete() {
        return estado_paquete;
    }

    public void setEstado_paquete(String estado_paquete) {
        this.estado_paquete = estado_paquete;
    }

    public Zona_de_Entrega getZona_de_entrega() {
        return zona_de_entrega;
    }

    public void setZona_de_entrega(Zona_de_Entrega zona_de_entrega) {
        this.zona_de_entrega = zona_de_entrega;
    }
    
    public void setDestinatario(Destinatario destinatario) {
        this.destinatario = destinatario;
    }
    
    public Destinatario getDestinatario() {
        return destinatario;
    }
    
     public Remitente getRemitente() {
        return remitente;
    }

    public void setRemitente(Remitente remitente) {
        this.remitente = remitente;
    }
    
    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Repartidor getRepartidor() {
        return repartidor;
    }

    public void setRepartidor(Repartidor repartidor) {
        this.repartidor = repartidor;
    }

    public Soporte getSoporte() {
        return soporte;
    }

    public void setSoporte(Soporte soporte) {
        this.soporte = soporte;
    }
    
    public int volumenPaquete(){
        return getAncho()*getAlto()*getLargo();
    }
    
    
    
    public String imprimirNumeroPaquete(){
        String nps="";
        String num_paquete_string = String.valueOf(getNumero_paquete());
        int limitenumeropaquete =10;
        int residuo=limitenumeropaquete-num_paquete_string.length();
        for (int i = 0; i <residuo ; i++) {
            System.out.print("0"); 
        }
        System.out.print(""+getNumero_paquete());
        
        return nps;
       
    }
   
    
    public void MostrarDatosDelPaqueteIngresado(){
       
        System.out.println("");
        System.out.println("*****DATOS DEL PAQUETE INGRESADO*****");
        System.out.print("N° del paquete: ");
        System.out.println(""+imprimirNumeroPaquete());
        System.out.println("Fecha de Ingreso: "+getFecha_ingreso());
        System.out.println("Tipo: "+getTipo_paquete());
        System.out.println("Ancho: "+getAncho());
        System.out.println("Largo: "+getLargo());
        System.out.println("Alto: "+getAlto());
        System.out.println("Peso: "+getPeso());
        System.out.println("Descripcion: "+getDescripcion());
        System.out.println("Estado: "+getEstado_paquete());
        System.out.printf("Valor declarado: $%.0f%n ",getValor_declarado());
        System.out.println("");
        System.out.println("*****Destinatario*****");
        System.out.println("Nombre: "+destinatario.getNombre());
        System.out.println("Codigo Postal: "+zona_de_entrega.getCodigo_postal());
        System.out.println("Direccion: Calle "+destinatario.getDirecciones().getCalle()+", #: "+destinatario.getDirecciones().getNumero_vivienda());
        System.out.println("");
        System.out.println("*****Remitente*****");
        System.out.println("Nombre: "+remitente.getNombre());
        System.out.println("Direccion: Calle "+remitente.getDirecciones().getCalle()+", #"+remitente.getDirecciones().getNumero_vivienda());
        System.out.println("Telefono: "+remitente.getTelefono());
        System.out.println("Ciudad: "+remitente.getCiudad());
        System.out.println("Pais: "+remitente.getPais());
        System.out.println("----------------------------------------");
        System.out.println("");
        
    }
    
    public void MostrarRepartidor(Paquete p, Repartidor r1, Repartidor r2, Repartidor r3){
        
        if (p.getTipo_paquete().equals("sobre") || p.getTipo_paquete().equals("caja") && p.getPeso()<1 || p.getTipo_paquete().equals("caja") && p.volumenPaquete()>=0 && p.volumenPaquete()<=1000) {
            
            System.out.println("----------------------------------------");
            System.out.println("*****ASIGNACION DE PAQUETE AL REPARTIDOR*****");
            System.out.print("El Paquete ");
            System.out.println(" "+p.imprimirNumeroPaquete()+"se le asignó al repartidor: "+r1.getNombre()+" "+r1.getApellido());
            System.out.println("N° Documento: "+r1.getNumero_documento());
            System.out.println("Categoria: "+r1.getCategoria());
            System.out.println("----------------------------------------");
            setEstado_paquete("Repartido");
            MostrarPaqueteRepartido();
            
        }else{}
            if (p.getTipo_paquete().equals("caja") && p.getPeso()>=1 && p.getPeso()<=20 || p.getTipo_paquete().equals("caja") && p.volumenPaquete()>1000 && p.volumenPaquete()<100000000) {
                System.out.println("*****ASIGNACION DE PAQUETE AL REPARTIDOR*****");
                System.out.print("El Paquete ");
                System.out.println(" "+p.imprimirNumeroPaquete()+"se le asignó al repartidor: "+r2.getNombre()+" "+r2.getApellido());
                System.out.println("N° Documento: "+r2.getNumero_documento());
                System.out.println("Categoria: "+r2.getCategoria());
                System.out.println("----------------------------------------");
                setEstado_paquete("Repartido");
                MostrarPaqueteRepartido();
            }else{}
                if (p.getTipo_paquete().equals("caja") && p.getPeso()>20 || p.getTipo_paquete().equals("caja") && p.volumenPaquete()>100000000) {
                    System.out.println("*****ASIGNACION DE PAQUETE AL REPARTIDOR*****");
                    System.out.print("El Paquete ");
                    System.out.println(" "+p.imprimirNumeroPaquete()+"se le asignó al repartidor: "+r3.getNombre()+" "+r3.getApellido());
                    System.out.println("N° Documento: "+r3.getNumero_documento());
                    System.out.println("Categoria: "+r3.getCategoria());
                    System.out.println("----------------------------------------");
                    setEstado_paquete("Repartido");
                    MostrarPaqueteRepartido();
                }
        
    }
    
    public void MostrarPaqueteRepartido(){
        System.out.println("");
        System.out.println("----------------------------------------");
        System.out.println("*****DATOS DEL PAQUETE ACTUALMENTE*****");
        System.out.print("N° del paquete: ");
        System.out.println(""+imprimirNumeroPaquete());
        System.out.println("Fecha de Ingreso: "+getFecha_ingreso());
        System.out.println("Tipo: "+getTipo_paquete());
        System.out.println("Ancho: "+getAncho());
        System.out.println("Largo: "+getLargo());
        System.out.println("Alto: "+getAlto());
        System.out.println("Peso: "+getPeso());
        System.out.println("Descripcion: "+getDescripcion());
        System.out.println("Estado: "+getEstado_paquete());
        System.out.printf("Valor declarado: $%.0f%n ",getValor_declarado());
        System.out.println("----------------------------------------");
        System.out.println("");
    }
    
    public void MostrarSoporte(){
        setEstado_paquete("Entregado");
        System.out.println("----------------------------------------");
        System.out.println("*****SOPORTE DE VISITA*****");
        System.out.println("*Datos del Paquete*");
        System.out.print("N° del paquete: ");
        System.out.println(""+imprimirNumeroPaquete());
        System.out.println("Fecha de Ingreso: "+getFecha_ingreso());
        System.out.println("Tipo: "+getTipo_paquete());
        System.out.println("Ancho: "+getAncho());
        System.out.println("Largo: "+getLargo());
        System.out.println("Alto: "+getAlto());
        System.out.println("Peso: "+getPeso());
        System.out.println("Descripcion: "+getDescripcion());
        System.out.printf("Valor declarado: $%.0f%n ",getValor_declarado());
        System.out.println("Fecha y hora de la visita: "+soporte.getFecha_y_hora_visita());
        System.out.println("Estado: "+getEstado_paquete());
        System.out.println("*Destinatario*");
        System.out.println("Nombre: "+destinatario.getNombre());
        System.out.println("Codigo Postal: "+zona_de_entrega.getCodigo_postal());
        System.out.println("Direccion: Calle "+destinatario.getDirecciones().getCalle()+", #: "+destinatario.getDirecciones().getNumero_vivienda());
        System.out.println("Observaciones: "+getObservaciones());
        System.out.println("----------------------------------------");
        
    }
 
}
