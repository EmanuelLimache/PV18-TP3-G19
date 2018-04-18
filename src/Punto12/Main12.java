package Punto12;

import java.util.Scanner;

/**
 *
 * @author Emanuel L.
 */
public class Main12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    ListaCategoria arregloCategoria = new ListaCategoria();
        ListaAutor listAutor = new ListaAutor();
        ListaLibro arregloLibro = new ListaLibro();
        listAutor.mostrarListadoAutores();
        System.out.println("Desea realizar la busqueda por Categoria(1) y/o Autor?(2) ambos(3) ");
        Scanner es = new Scanner(System.in);
        int resp= es.nextInt();
       // If ( resp == 1){
        
        
        System.out.println("Elija un autor por su orden: ");
        Scanner s = new Scanner(System.in);
        int orden = s.nextInt();
        Autor a = listAutor.getListaAutores().get(orden);
        arregloLibro.mostrarLibrosPorAutor(a);    
        
    }

    
}
