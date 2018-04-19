package Punto12;
import Punto12.ListaLibro;
import java.util.List;
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
        
        ListaCategoria lCategoria = new ListaCategoria();
        ListaAutor lAutor = new ListaAutor();
        ListaLibro lLibro = new ListaLibro();
        
        System.out.println("Desea realizar la busqueda por Categoria(1) y/o Autor?(2) ambos(3) ");
        Scanner es = new Scanner(System.in);
        int op=es.nextInt();
        //1 Llamado al metodo mostrar categoria
        Scanner en = new Scanner(System.in);
        switch (op) {
            

            case 1:
                lLibro.mostrarLibro();
                System.out.println("Busqueda por Categoria");
                System.out.println("Elija una categoria por orden");
                int or=en.nextInt();
                Libro b=lLibro.getListaLibros().get(or);
                lLibro.buscarLibroCategoria(b);
            break;
            case 2:
                System.out.println("Busqueda por Autor");
                lAutor.mostrarListadoAutores();
                System.out.println("Elija un autor por su orden: ");
                Scanner s = new Scanner(System.in);
                int orden = s.nextInt();
                Autor a = lAutor.getListaAutores().get(orden);
                lLibro.mostrarLibrosPorAutor(a);    
            break;
        
            case 3:
                System.out.println("*******************************");
                lLibro.mostrarLibro();
                System.out.println("Busqueda por Categoria");
                System.out.println("Elija una categoria por orden");
                int orr=en.nextInt();
                Libro bb=lLibro.getListaLibros().get(orr);
                lLibro.buscarLibroCategoria(bb);
                System.out.println("*******************************");
                System.out.println("Busqueda por Autor");
                lAutor.mostrarListadoAutores();
                System.out.println("Elija un autor por su orden: ");
                Scanner ss = new Scanner(System.in);
                int ordenn = ss.nextInt();
                Autor aa = lAutor.getListaAutores().get(ordenn);
                lLibro.mostrarLibrosPorAutor(aa);   
                System.out.println("*******************************");
                break;
            default: System.out.println("Opcion Incorrecta");break;

            
         }
                
        
        
    }

    
}
