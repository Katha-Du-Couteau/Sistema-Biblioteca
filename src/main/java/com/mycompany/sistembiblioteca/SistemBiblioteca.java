package com.mycompany.sistembiblioteca;
import java.util.Scanner;
import java.time.LocalDate;
/**
 *
 * @author yimid
 */
public class SistemBiblioteca {


    public static void main(String[] args){
        
        Usuario usuario1 = new Usuario("Katha", 1);
        
        
        
        Libro libro1 = new Libro("Cien anous de soledad", "Gabriel García Márquez", "978-0-000-00001-1", true);
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "978-0-000-00002-2", true);
        Libro libro3 = new Libro("El principito", "Antoine de Saint-Exupéry", "978-0-000-00003-3", true);
        Libro libro4 = new Libro("La sombra del viento", "Carlos Ruiz Zafón", "978-0-000-00004-4", true);
        Libro libro5 = new Libro("Rayuela", "Julio Cortázar", "978-0-000-00005-5", false);
        
        
    //consultar libro
    System.out.println("libro1");
    usuario1.consultarDisponibilidad(libro1);

    System.out.println("libro5");
    usuario1.consultarDisponibilidad(libro5);

    
    //prestar libro
    System.out.println("prestar libro1");
    System.out.println(usuario1.prestarLibro(libro1));

    System.out.println("consultar libro1");
    usuario1.consultarDisponibilidad(libro1);

    System.out.println("prestar libro1 otra vez");
    System.out.println(usuario1.prestarLibro(libro1));

    System.out.println("prestar libro5");
    System.out.println(usuario1.prestarLibro(libro5));

    System.out.println("prestamo");
    Prestamo p = new Prestamo(usuario1, libro1, LocalDate.now());
    p.registrarFecha();

    System.out.println("devolver libro1");
    System.out.println(usuario1.devolverLibro(libro1));

    System.out.println("consultar libro1");
    usuario1.consultarDisponibilidad(libro1);

    System.out.println("devolver libro1 otra vez");
    System.out.println(usuario1.devolverLibro(libro1));
    }
}
