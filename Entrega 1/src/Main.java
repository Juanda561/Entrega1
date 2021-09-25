
import java.text.ParseException;

public class Main {
    
    public static void main(String[] args) throws ParseException {
        Destinatario d1= new Destinatario("transversal 16","18-32", 200004, "Juan Ayala", "3113964407");
        Remitente r1= new Remitente("Caracas", "Venezuela", "Simón Bolivar", "45-22", "Daniel Novoa", "04246284248");
        Repartidor rp1=new Repartidor(77930434, "Ramón Eduardo", "Lopez Mejia", 'A', "RamonL", "123Ramon");
        Repartidor rp2=new Repartidor(55934421, "Pedro Antonio", "Manjarrez", 'B', "PedroL", "123Pedro");
        Repartidor rp3=new Repartidor(34366128, "Alberto", "Sanchez", 'C', "AlbertoL", "123Alberto");
        Paquete p1 = new Paquete(0000000001, "02/09/2021", "sobre", "Es delicada la caja", 12 , 5 , 4 , 1 , 20000 , "26/02/2021", "Ninguna", "Ingresado", 200004);   
        
        p1.setDestinatario(d1);
        p1.setRemitente(r1);
        p1.setRepartidor(rp1);
        p1.MostrarDatosDelPaqueteIngresado();//muestra los datos del paquete, remitente, destinatario
        
        //Comparar, para asignar paquetes al repartidor adecuado
        p1.MostrarRepartidor(p1, rp1,rp2,rp3);
        
        //muestra el soporte de la visita
        p1.setObservaciones("Ninguna novedad");
        p1.MostrarSoporte();
        
    }
}
