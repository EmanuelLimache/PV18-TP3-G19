package Punto6;
import Punto1.Punto;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Emanuel L.
 */
public class Main6 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Valores de la Lista precargada del arraylist de tipo Rectangulo
        Punto aPunto =new Punto(3,1);
        Punto bPunto =new Punto(1,1);
        Punto cPunto =new Punto(5,9);
         
        Rectangulo aRectang = new Rectangulo(1,4,aPunto,2,3);
        Rectangulo bRectang = new Rectangulo(2,3,bPunto,5,7);        
        Rectangulo cRectang = new Rectangulo(5,7,bPunto,12,6);        
        
        ArrayList <Rectangulo> lista = new ArrayList<Rectangulo>();
        //se agrega elementos de tipo rectangulo a la lista
            lista.add(aRectang);
            lista.add(bRectang);
            lista.add(cRectang);
        //Llamado al metodo mostrar elementos de la lista
        mostrarElementosDeLaLista(lista);
        Scanner sc =new Scanner(System.in);
        System.out.println("*******************************************************");
        System.out.println("Indique que posicion desear eliminar (>= 0 Y <=" + (lista.size()-1)+")" );
        int a = sc.nextInt();
        // Elimina dato por posicio ingresada por el usuario
        if (lista.isEmpty()){
            System.out.println("La lista esta vacia");
        }else{
            lista.remove(a); // ELIMINA EL ELEMENTO EN DICHA POSICION DE LA LISTA
            System.out.println("SE HA ELIMINADO EL ELEMENTO SELECCIONADO");
            mostrarElementosDeLaLista(lista);
            System.out.println("************************");
        }
    }
    
    public static void mostrarElementosDeLaLista (ArrayList<Rectangulo> list){
       
        for(Rectangulo tRectangulo :list){
            System.out.println("******");
            System.out.println("El PUNTO del objeto es: (" +tRectangulo.getUnPunto().getX()+","+tRectangulo.getUnPunto().getY()+")");
            System.out.println("La ALTURA del objeto es: " +tRectangulo.getAltura());
            System.out.println("La BASE objeto es: " +tRectangulo.getBase());
            System.out.println("La superficie del rectangulo es: " + tRectangulo.superficieRectangulo() );
            System.out.println("El perimetro del rectangulo es: " + tRectangulo.perimetroRectangulo() );
        }
    
    }
    
    
}
