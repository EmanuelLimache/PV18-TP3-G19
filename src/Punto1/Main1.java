package Punto1;

/**
 *
 * @author Emanuel L.
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Punto unPunto =new Punto(1,2);
        Punto dosPunto =new Punto(3,5);
        System.out.println("La distancia entre el punto1 (1,2) y punto2(3,5) es: " 
                         + dosPunto.calcularDistaciaEntrePuntos(unPunto) );
        
    }
    
}
