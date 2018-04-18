package Punto10;
import static Punto10.Producto.mostrarProductos;
import static Punto10.Producto.totalPagar;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Emanuel L.
 */
public class Main10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList <Producto> listaP = new ArrayList<Producto>();
            Producto aProducto = new Producto(1,"samsumg j2",3500);
            Producto bProducto = new Producto(2,"samsumg j7",8000);
            Producto cProducto = new Producto(3,"doodgge s6",11000);
            Producto dProducto = new Producto(4,"huawei p9",12000);
            
            listaP.add(aProducto);
            listaP.add(bProducto);
            listaP.add(cProducto);
            listaP.add(dProducto);
            mostrarProductos(listaP);
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Seleccione producto de la lista por (codigo)");
            int op = sc.nextInt();            
           
            System.out.println("Ingrese la cantidad de cuotas a pagar");
            int cant = sc.nextInt();
            totalPagar(listaP,op-1,cant);
            
            
           
            
            
        
    
        
     }    

    
    
}
