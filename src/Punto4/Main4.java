/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto4;

import java.util.Scanner;

/**
 *
 * @author Emanuel L.
 */
public class Main4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //creacion de un objeto de clase arreglo
        ArregloNumero arreglo =new ArregloNumero();
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
       
        while (contador <10){
            System.out.println("Ingrese un numero: ");
            arreglo.getNumeros()[contador] = entrada.nextInt();
            contador = contador +1;
        }
        // llamado al metodo para mostrar los elementos del arreglo
        arreglo.mostrarElementosDelArreglo();
        //llamado al metodo mostra menor elemento
        arreglo.mostrarMenorElementoArreglo();
        arreglo.mostrarMayorElementoArreglo();
        arreglo.mostrarPromedio();
    }
    
}
