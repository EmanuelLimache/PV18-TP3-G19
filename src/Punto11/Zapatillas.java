/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Punto11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Emanuel L.
 */
public class Zapatillas {
  
    private String marca;
    private String tipo;

    public Zapatillas(){
        
    }
    
    public Zapatillas(String marca,String tipo){
  
        this.marca=marca;
        this.tipo=tipo;
    }
    
    public static void agregarZapatillas(){
        ArrayList <Zapatillas> listaLi = new ArrayList<Zapatillas>();
       
        boolean band=true;
        while (band == true) { 
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Ingrese MARCA de la zapatilla a agregar: ");
            String mar =sc.nextLine();
            System.out.println("Ingrese TIPO de la zapatilla a agregar(original o copia): ");
            String tip =sc.nextLine();
            Zapatillas aZapa = new Zapatillas(mar,tip);
            listaLi.add(aZapa);
            
            System.out.println("la zapatilla se ha agregado");
            Scanner scc = new Scanner(System.in);
            System.out.println("Desea continuar agregando Zapatillas? y/n");
            String  op=scc.nextLine();
            
           
            if (op.equalsIgnoreCase("n")){
              
                band = false;
            }
            
        }
                     
        mostrarZapatillas(listaLi);   

    }
    
    public static void mostrarZapatillas (ArrayList<Zapatillas> list){
        System.out.println("Listado de zapatillas");
        System.out.println("Numero -- Marca -- Tipo");
        int cont=1;
        for(Zapatillas tZapa :list){
            System.out.println("*****************************************************");
            System.out.println("* "+cont+" -- "+tZapa.getMarca()+" -- "+tZapa.getTipo());
            System.out.println("******************************************************");
            cont++;
        }
    
    }
    

    /**
     * @return the codigo
     *
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     *
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }**/

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
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
    
}
