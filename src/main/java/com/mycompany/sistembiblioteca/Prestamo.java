package com.mycompany.sistembiblioteca;
import java.time.LocalDate;
/**
 *
 * @author yimid
 */
public class Prestamo {
    
    
    private Usuario usuario;
    private Libro libro;
    private LocalDate fecha = LocalDate.now();
    
    
    public Prestamo(Usuario usuario, Libro libro, LocalDate fecha){
        this.usuario = usuario;
        this.libro = libro;
        this.fecha = fecha;
    }
    
    public void registrarFecha(){
        
        System.out.println(this.fecha + " " + this.usuario.getNombre() + " " + this.libro.getTitulo());
    }
}
