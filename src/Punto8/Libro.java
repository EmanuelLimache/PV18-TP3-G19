package Punto8;

/**
 * 
 * @author Emanuel L.
 */
public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private double precio;
    
    public Libro(){
    }

    public Libro(String isbn,String titulo,String autor,double precio){
        this.isbn=isbn;
        this.titulo=titulo;
        this.autor=autor;
        this.precio=precio;
    }
    private static void Libro(String bn, String titu, String aut, double pre) {
        
    }
    
    
    
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
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