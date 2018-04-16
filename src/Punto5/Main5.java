package Punto5;
import java.util.ArrayList;

/**
 *
 * @author Emanuel L.
 */
public class Main5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulos c1 = new Circulos(3.4, "Rojo");
        Circulos c2 = new Circulos(5.4, "Verde");
        
        GestorCirculos gc = new GestorCirculos();
        gc.agregarCirculo(c1);
        gc.agregarCirculo(c2);
        
        for(Circulos circulo: gc.getCirculos()){
            System.out.println("Radio:" + circulo.getRadio());
            System.out.println("Color:" + circulo.getColor());
            System.out.println("Superficie del circulo es: "+ circulo.superficieCirculos());
        }

    }
    
}
