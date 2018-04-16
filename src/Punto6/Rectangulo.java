package Punto6;
import Punto1.Punto;

/**
 * 
 * @author Emanuel L.
 */
public class Rectangulo {

    private Punto unPunto;
    private double base;
    private double altura;
    private double superficie;
    private double perimetro;
    

    public Rectangulo (){
    }
    public Rectangulo(double base, double altura, Punto unPunto, double superficie,double perimetro){
        this.base = base;
        this.altura = altura;
        this.unPunto = unPunto;
        this.superficie = superficie;
        this.perimetro = perimetro;
    }
    
    public double perimetroRectangulo(){
        double perimR = getBase()* 2 + getAltura() * 2;//calculo del perimetro del rectangulo
        return perimR;//se retorna el perimetro del rectangulo
    }    
    public double superficieRectangulo(){
        double superfR = getBase() * getAltura();////calculo del area del rectangulo
        return superfR;
    }
    
    
    public Punto getUnPunto() {
        return unPunto;
    }

    public void setUnPunto(Punto unPunto) {
        this.unPunto = unPunto;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the superficie
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * @param superficie the superficie to set
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * @return the perimetro
     */
    public double getPerimetro() {
        return perimetro;
    }

    /**
     * @param perimetro the perimetro to set
     */
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

  
    
    
}
