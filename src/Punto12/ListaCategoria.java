
package Punto12;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emanuel L.
 */
public class ListaCategoria {    
    List<String> categorias;

    public ListaCategoria() {
        categorias = new ArrayList<>(); 
        categorias.add("Programacion");
        categorias.add("Informatica");
        categorias.add("Novela");        
    }

    public List<String> getCategoria() {
        return categorias;
    }

    public void setCategoria(List<String> categoria) {
        this.categorias = categoria;
    }    
}
