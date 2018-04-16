package Punto8;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Emanuel L.
 */
public class Main8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ArrayList <Libro> listaLi = new ArrayList<Libro>();
                
        boolean band=true;
        ArrayList <Libro> listaLi = new ArrayList<Libro>();
        while (band == true) {          //Condición trivial: siempre cierta
            System.out.println("Ingrese ISBN del libro a agregar: ");
            String isbn =sc.next();
            System.out.println("Ingrese TITULO del libro a agregar: ");
            String titu =sc.next();
            System.out.println("Ingrese AUTOR del libro a agregar: ");
            String aut =sc.next();
            System.out.println("Ingrese PRECIO del libro a agregar: ");
            double pre =sc.nextDouble();
            Libro aLibro = new Libro(isbn,titu,aut,pre);
            System.out.println("Desea continuar agregando libros? 1/0");
            int op=sc.nextInt();
            
            listaLi.add(aLibro);
            System.out.println("el libro se ha agregado");
            if (op==1){
                mostrarElementosDeLaLista(listaLi);
            } 
            if (op==0){
                band = false;
            }
            
        }
        mostrarElementosDeLaLista(listaLi);
    }

    public static void mostrarElementosDeLaLista (ArrayList<Libro> list){
       
        for(Libro tLibro :list){
            System.out.println("******");
            System.out.println("El ISBN del libro es:"+ tLibro.getIsbn());
            System.out.println("El TITULO del libro es: "+ tLibro.getTitulo());
            System.out.println("El AUTOR del libro es: "+ tLibro.getAutor());
            System.out.println("El PRECIO del libro es: $"+ tLibro.getPrecio());
            System.out.println("********");
            
        }
    
    }
}
