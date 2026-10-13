package com.mycompany.sistembiblioteca;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author yimid
 */
public class Usuario {
    private String nombre;
    private int idUsuario;
    private ArrayList<Libro> librosPrestados = new ArrayList<>();
        public String getNombre(){
            return nombre;
        }
        public int getId(){
            return idUsuario;
        }
        public boolean prestarLibro(Libro L){
            if(!L.getDisponible()){
                System.out.println("libro no disponible");
                return false;
            }
            librosPrestados.add(L);
            L.setDisponible(false);
            return true;
        }
        public boolean devolverLibro(Libro L){
            for (int i = 0; i < librosPrestados.size(); i++){
                if(librosPrestados.get(i).equals(L)){
                    librosPrestados.remove(i);
                    L.setDisponible(true);
                    return true;
                }    
            }
            return false;
        }
            public void consultarDisponibilidad(Libro L){
                if(L.getDisponible()){
                    System.out.println("libro disponible");
                }else{
                    System.out.println("libro no disponible");
                }
            }
    public Usuario(String nombre, int idUsuario){
        this.nombre = nombre;
        this.idUsuario = idUsuario;
    }
}
