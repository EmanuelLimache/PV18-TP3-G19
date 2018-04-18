
package Punto9;
import Punto8.Libro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Emanuel L.
 */
public class Main9 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Libro> listaLi = new ArrayList<Libro>();
        Libro aLibro = new Libro("1","Fundamentos de Programacion","Joyanes",120);
        Libro bLibro = new Libro("2","Rojo I","Armando Rojo",100);
        Libro cLibro = new Libro("3","Rojo II","Armando Rojo",150);
        Libro dLibro = new Libro("4","Matematicas para Ingeniera","Sara Arancibia",250);
        
        System.out.println("Ingrese titulo del libro a buscar.. ");
        String titulo = sc.nextLine();
        
        ArrayList <Libro> listLi = new ArrayList<Libro>();
        listaLi.add(aLibro);
        listaLi.add(bLibro);
        listaLi.add(cLibro);
        listaLi.add(dLibro);
       // System.out.println("sss" + titulo);
        for(Libro tLibro : listLi){
             if ( tLibro.getTitulo == titulo){
                System.out.println("*****************************************************");
                System.out.println("* El TITULO del libro es:  "+ tLibro.getTitulo()+"                     *");
                System.out.println("* El ISBN del libro es:    "+ tLibro.getIsbn()+"                       *");
                System.out.println("* El AUTOR del libro es:   "+ tLibro.getAutor()+"                      *");
                System.out.println("* El PRECIO del libro es: $"+ tLibro.getPrecio()+"                     *");
                System.out.println("******************************************************");
                System.out.println("");
                }else{
                        System.out.println("No se ha encontrado el libro");
                }
        
        }
        
        
    }
         
        
    
    
    
    
    
}
