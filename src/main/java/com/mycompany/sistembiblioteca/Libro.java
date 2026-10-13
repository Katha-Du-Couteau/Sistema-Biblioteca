package com.mycompany.sistembiblioteca;

/**
 *
 * @author yimid
 */
public class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    boolean disponible = true;
    
    public String getTitulo(){
        return titulo;
    }
    
    public boolean getDisponible(){
        return disponible;
    }
    
    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }
    
    public Libro(String titulo, String autor, String ISBN, boolean disponible){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.disponible = disponible;
    }
}
