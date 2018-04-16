/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Punto7;

/**
 * 
 * @author Emanuel L.
 */
public class Autos {
    public String marca;
    public String modelo;
    public String patente;
    public String color;
    public String combustible;
    
    
    
    public Autos (String marca,String modelo,String patente,String color,String combustible){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setPatente(patente);
        this.setColor(color);
        this.setCombustible(combustible);
    }
    
   /**
    public void mostrarAutosDelArreglo(){
        for (int i=0; i <= 3; i++ ){
            System.out.println(arregloAuto[i].Marca+" "
                    +arregloAuto[i].modelo+" "
                    +arregloAuto[i].patente+" "
                    +arregloAuto[i].color+" "
                    +arregloAuto[i].combustible+" ");
        }
   
     } **/
    
    
    
    
       
    
    
    
    
    //Metodos de llamado
    /**
     * @return the patente
     */
    public String getPatente() {
        return patente;
    }

    /**
     * @param patente the patente to set
     */
    public void setPatente(String patente) {
        this.patente = patente;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
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

    /**
     * @return the combustible
     */
    public String getCombustible() {
        return combustible;
    }

    /**
     * @param combustible the combustible to set
     */
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
   
    
    
}
