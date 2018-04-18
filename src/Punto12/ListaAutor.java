
package Punto12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 
 * @author Emanuel L.
 */
public class ListaAutor {    
    private List<Autor> listaAutores;

    public ListaAutor() {
        listaAutores = new ArrayList<>();
        listaAutores.add(new Autor("Stacia","Misner",56));
        listaAutores.add(new Autor("Chris","Rose",35));
        listaAutores.add(new Autor("Dan","Brown",50));
    }

    public void mostrarListadoAutores(){
        int contador = 0;
        for(Autor a:listaAutores){
            System.out.println(contador + " - "+a.getApellido());
            contador++;
        }
    }
    /**
    public void mostrarSoloAutor(){
        Scanner teclado = new Scanner (System.in);         
        System.out.println("Elija un autor: ");
        int opcion = teclado.nextInt();
        listaAutores.get(opcion);
        listaAutores.
    }**/
        
    /*
    System.out.println("Elija un autor por su orden: ");
        Scanner s = new Scanner(System.in);
        int orden = s.nextInt();
        Autor a = listAutor.getListaAutores().get(orden);
        arregloLibro.mostrarLibrosPorAutor(a);
    */
    
    
    
    public List<Autor> getListaAutores() {
        return listaAutores;
    }

    public void setListaAutores(List<Autor> listaAutores) {
        this.listaAutores = listaAutores;
    }    
}
