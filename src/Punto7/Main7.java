package Punto7;
import java.util.Scanner;

/**
 *
 * @author Emanuel L.
 */
public class Main7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Autos arregloAuto[] =new Autos[5];
    arregloAuto[0] = new Autos("LAMBORGHINI","Terzo Millennio","A1","GRIS","gasolina");
    arregloAuto[1] = new Autos("FERRARI","458 spider","A2","ROJO","diesel");
    arregloAuto[2] = new Autos("BUGATTI","chiron","A3","NEGRO","etanol");
    arregloAuto[3] = new Autos("BMW","i8 spyder","A4","AZUL","hidrogeno");
    
    System.out.println("MARCA -- MODELO -- PATENTE -- COLOR -- COMBUSTIBLE --");
    System.out.println("1-"+arregloAuto[0].marca+" "+arregloAuto[0].modelo+" "+arregloAuto[0].patente+" "
                      +arregloAuto[0].color+" "+arregloAuto[0].combustible+" ");
    System.out.println("2-"+arregloAuto[1].marca+" "+arregloAuto[1].modelo+" "+arregloAuto[1].patente+" "
                      +arregloAuto[1].color+" "+arregloAuto[1].combustible+" ");    
    System.out.println("3-"+arregloAuto[2].marca+" "+arregloAuto[2].modelo+" "+arregloAuto[2].patente+" "
                      +arregloAuto[2].color+" "+arregloAuto[2].combustible+" ");    
    System.out.println("4-"+arregloAuto[3].marca+" "+arregloAuto[3].modelo+" "+arregloAuto[3].patente+" "
                      +arregloAuto[3].color+" "+arregloAuto[3].combustible+" ");        
    System.out.println("*********************");
    
    Scanner ent = new Scanner(System.in);
    System.out.println("Ingrese posicion del auto a modificar");
    int a=ent.nextInt();
          System.out.println(" *EDICION DE AUTO* ");
          System.out.println("Ingrese Marca ");
          String mar=ent.next();
          System.out.println("Ingrese Modelo ");
          String mod=ent.next();
          System.out.println("Ingrese Patente ");
          String pat=ent.next();
          System.out.println("Ingrese Color ");
          String col=ent.next();
          System.out.println("Ingrese Combustible ");
          String comb=ent.next();
          System.out.println("*******");
          arregloAuto[a-1] = new Autos(mar,mod,pat,col,comb);
          System.out.println(a+"-"+arregloAuto[a-1].marca+" "+arregloAuto[a-1].modelo+" "+arregloAuto[a-1].patente+" "
                      +arregloAuto[a-1].color+" "+arregloAuto[a-1].combustible+" ");
    }
    
     
       
    
    
    
    }
     
    

