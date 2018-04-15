package Punto3;

import java.util.Scanner;

public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese primer lado del triangulo");
        double a=sc.nextDouble();
        System.out.println("Ingrese segundo lado del triangulo");
        double b=sc.nextDouble();
        System.out.println("Ingrese tercer lado del triangulo");
        double c=sc.nextDouble();
        Triangulo objTriangulo = new Triangulo(a,b,c);
        objTriangulo.verificarLados(a, b, c);
        
    }
    
}
