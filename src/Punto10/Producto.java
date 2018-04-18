
package Punto10;

import java.util.ArrayList;

/**
 * 
 * @author Emanuel L.
 */


public class Producto {
    private int codigo;
    private String nombre; 
    private double precio;

    public Producto (int codigo,String nombre, double precio){
        this.codigo=codigo;
        this.nombre=nombre;
        this.precio=precio;
    }

    public Producto() {
    }
    
    public static void totalPagar(ArrayList<Producto> list,int op,int cant){
        Producto a=list.get(op);
        double cuota = a.getPrecio()/cant;
        double total=0;
        
        for(int i=1;i<=cant-1;i++){
            total =total+(cuota*(1.5*i));
        }
        
        System.out.println("Producto");
        System.out.println(""+a.getCodigo()+" -- "+a.getNombre()+" -- $"+a.getPrecio());
        System.out.println("El total a pagar es: $"+total);
    }
    
    
    
    
    public static void mostrarProductos(ArrayList<Producto> list){
        //creacion de metodo para correr el objeto
        /**Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println("El objeto en la lista es: " + (String)iterator.next());
        }**/
        int cont=0;
        System.out.println("LISTADO DE LOS PRODUCTOS");
        System.out.println("Codigo--Nombre--Precio");
        
        for(Producto a :list){
            cont++;
            System.out.println("******************************************");
            System.out.println(""+a.getCodigo()+" -- "+a.getNombre()+" -- $ "+a.getPrecio());
            System.out.println("******************************************");

        }
        
        
     }    
    
    
    
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
