package Punto5;

import java.util.ArrayList;


/**
 *
 * @author Emanuel L.
 */
public class GestorCirculos {
    private ArrayList<Circulos> circulos = new ArrayList();

    /**
     * @return the circulos
     */
    public ArrayList<Circulos> getCirculos() {
        return circulos;
    }

    /**
     * @param circulos the circulos to set
     */
    public void setCirculos(ArrayList<Circulos> circulos) {
        this.circulos = circulos;
    }
    
    public void agregarCirculo(Circulos circulo){
        
        this.circulos.add(circulo);
    }
    
}
