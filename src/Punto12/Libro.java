
package Punto12;
/**
 *
 * @author Emanuel l.
 */
public class Libro {
    private String categoria;
    private String titulo;
    private int ISBN;
    private double precio;
    private Autor autor;
    

    public Libro() {
    }

    public Libro(String categoria, String titulo, int ISBN, double precio, Autor autor) {
        this.categoria = categoria;
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.precio = precio;
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }    
}
