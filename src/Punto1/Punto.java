
package Punto1;

/**
 * 
 * @author Emanuel L.
 */
public class Punto {
    private double x;
    private double y;
    
    public Punto(double x, double y) {
        this.x=x;
        this.y=y;
    }
    
    public double calcularDistaciaEntrePuntos(Punto otroPunto){
        return Math.sqrt(Math.pow(otroPunto.getX()-x,2) + Math.pow(otroPunto.getY()- y,2));
        
    }
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

}
