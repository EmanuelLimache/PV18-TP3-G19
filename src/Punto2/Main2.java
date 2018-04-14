package Punto2;
import Punto1.Punto;
import java.util.Scanner;
/**
 * 
 * @author Emanuel L.
 */
public class Main2 {
    public static void Main2 (String []args){
        
        Scanner sc =new Scanner(System.in);
        Rectangulo objRectangulo = new Rectangulo();
        System.out.println("Ingrese valor de coordenada x del 1er punto ");
        double x = sc.nextDouble();
        System.out.println("Ingrese valor de coordenada y del 1er punto ");
        double y = sc.nextDouble();
        Punto unPunto =new Punto(x,y);
        
        System.out.println("Ingrese base del Rectangulo ");
        double base = sc.nextDouble();
        System.out.println("Ingrese altura del Rectangulo");
        double altura = sc.nextDouble();
        double superfR = objRectangulo.superficieRectangulo(base, altura);
        double perimR = objRectangulo.perimetroRectangulo(base, altura);
        // PUNTOS RESTANTESE DEL RECTANGULO
        //2do Punto
        double x2= unPunto.getX()+base;
        double y2= unPunto.getY();
        //3er Punto
        double x3= unPunto.getX();
        double y3= unPunto.getY()+altura;
        //4to punto
        double x4=unPunto.getX()+base;
        double y4=unPunto.getY()+altura;
        //se muestra por pantalla los resultados
        System.out.println("***** RESULTADOS ******");
        System.out.println("La posicion del 2do PUNTO del rectangulo es: (x="+x2+")" + "(y="+y2+")" );
        System.out.println("La posicion del 3er PUNTO del rectangulo es: (x="+x3+")" + "(y="+y3+")" );
        System.out.println("La posicion del 4to PUNTO del rectangulo es: (x="+x4+")" + "(y="+y4+")" );
        System.out.println("La superficie del rectangulo es: " + superfR);
        System.out.println("El perimetro del rectangulo es: " + perimR);
    }

    
}
