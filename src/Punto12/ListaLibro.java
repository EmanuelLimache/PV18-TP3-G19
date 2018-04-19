
package Punto12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
//import punto12.dominio.Autor;

/**
 *
 * @author Emanuel L.
 */
public class ListaLibro {    
    public List<Libro> listaLibros;
        
    public ListaLibro() {
        listaLibros = new ArrayList<>();
        listaLibros.add(new Libro("Informatica","Visual Studio Add-Ins Succinctly",4568,200,new Autor("Stacia","Misner",56)));
        listaLibros.add(new Libro("Programacion","Fundamentos de la programacion",7894,124,new Autor("Luis","Joyanes Aguilar",66)));
        listaLibros.add(new Libro("Programacion","Estructura de Datos en java",9788,924,new Autor("Luis","Joyanes Aguilar",66)));
        listaLibros.add(new Libro("Novela","Ángeles y Demonios",7264,45,new Autor("Dan","Brown",50)));
    }

    
    public void mostrarLibrosPorAutor(Autor autorBuscado){
        for(Libro l:listaLibros){
            if(autorBuscado.getApellido().equals(l.getAutor().getApellido())){
                System.out.println("Nombre del libro: "+l.getTitulo());
            }
        }
    }
    
    public void mostrarLibrosPorCategoria(Libro categoria){
        for(Libro l:listaLibros){
            if(categoria.getCategoria().equals(l.getCategoria())){
                System.out.println("Categoria del libro: "+l.getCategoria());
            }
        }
    }
    public void buscarLibroCategoria(Libro categoria){
        for(Libro l:listaLibros){
            if(categoria.getCategoria().equals(l.getCategoria())){
                System.out.println("Libro Buscado es: "+l.getCategoria()+
                                                   " -- "+l.getTitulo()+
                                                    " -- "+l.getISBN()+
                                                    " -- "+l.getPrecio()+
                                                    " -- "+l.getAutor());
            }
        }
    }
    
    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    
    
    public void cargarLibro(){
                       
    }
    
    public void mostrarLibro(){
        int cont=0;
        for(Libro l:listaLibros){
            System.out.println(cont +"Categoria: "+l.getCategoria()+" Titulo: "+l.getTitulo());
            cont++;
        }
    }
    
    public int obtenerPosicionCategoria(String categoria){
        int indice=0;
        List<Libro> listLibros = null;
        Iterator iterator = listaLibros.iterator();
        while (iterator.hasNext()){
            if(listLibros.get(indice).getCategoria().equals(categoria)){
                break;
            }else{
                indice++;
            }
        }
        return indice;
    }
    
    public int obtenerPosicionTitulo(String titulo){
        int indice=0;
        Iterator iterator = listaLibros.iterator();
        while(iterator.hasNext()){
            if(listaLibros.get(indice).getTitulo().equals(titulo)){
                break;
            }else{
                indice++;
            }
        }
        return indice;
    }
    /*
    public void buscarLibro(){
        int indice,indice2;
        Scanner teclado1 = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        System.out.println("1) Categoria");
        System.out.println("2) Titulo");
        System.out.println("Elija una opcion para buscar el libro: ");
        int opcion = teclado1.nextInt();
        switch(opcion){
            case 1:
                System.out.println("Ingrese la cateria del libro: ");
                String cate = teclado2.nextLine();
                String palabra = cate.toUpperCase();
                indice = obtenerPosicionCategoria(palabra);
                System.out.println("Categoria: "+listaLibros.get(indice).getCategoria()+" Titulo :"+listaLibros.get(indice).getTitulo());
                System.out.println("Se encontro");
                break;
            case 2:
                System.out.println("Ingrese el titulo del libro: ");
                String titulo = teclado2.nextLine();
                String palabra2 = titulo.toUpperCase();
                indice2 = obtenerPosicionTitulo(palabra2);
                System.out.println("Categoria: "+listaLibros.get(indice2).getCategoria()+" Titulo :"+listaLibros.get(indice2).getTitulo());
                break;
                default: System.out.println("OPCION INCORRECTA");break;
        }               
    }**/  
}
