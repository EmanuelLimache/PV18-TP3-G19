package Punto5;
/**
 *
 * @author Emanuel L.
 */
public class Circulos {
    
    private double radio;
    private String color;

    public Circulos() {
    }

    public Circulos(double radio) {
        this.radio = radio;
    }
      
    public Circulos(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double superficieCirculos(){
        double superf=3.14*getRadio();
        return superf;
    }
    
    
    
    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    public double calcularSup(){
        double sup = 0;
        
        //codigo para calc sup
        return sup;
    }
    
}
