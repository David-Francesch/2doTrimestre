/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioEquipos;

/**
 *
 * @author dfc20
 */
public class Equipos {
    
    String nombre;
    String entrenador;
    float sueldoEntrenador;
    Jugadores Jugadores[] = new Jugadores[5];

    Equipos(String nombre, String entrenador, float sueldoEntrenador) {
        this.nombre = nombre;
        this.entrenador = entrenador;
        this.sueldoEntrenador = sueldoEntrenador;
    }
    
   
    
    
    
}
