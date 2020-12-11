
package EjercicioEquipos;

import java.util.Scanner;

/*
hacer 4 equipos de futbol con 5 jugadores cada uno, el equipo tiene nombre, nombre del entrenador y sueldo del mismo. 
Cada jugador tiene nombre, edad, posicion y si es varon o no en boolean. luego una clase que se llame partido en la que 
se encuentren 2 de los equipos y tenga un resultado, goles a favor y goles en contra.
 */
public class MainEquipos {
    public static void main(String[]Args){
        
        Scanner sc = new Scanner(System.in);
        
        Jugadores totalJugadores[] = new Jugadores[8];
        for(int i=0; i<totalJugadores.length; i++){
            System.out.println("Dame los datos del jugador "+i+":");
            System.out.print("Nombre: ");
            String nombreJugador = sc.nextLine();
            System.out.print("Posicion: ");
            String posicion = sc.nextLine();
            System.out.print("Es varon? ");
            Boolean varon = sc.nextInt()== 1 ? true:false;
            totalJugadores[i] = new Jugadores(nombreJugador, posicion, varon);
        }
        
        Equipos [] totalEquipos = new Equipos[4];
        for(int i=0; i<totalEquipos.length; i++){
            System.out.println("Dime los datos del equipo"+i+": ");
            System.out.print("Nombre: ");
            String nombreEquipo = sc.nextLine();
            System.out.print("Entrenador: ");
            String entrenador = sc.nextLine();
            System.out.print("Sueldo del entrenador: ");
            float sueldoEntrenador = sc.nextFloat();
            totalEquipos[i] = new Equipos(nombreEquipo, entrenador, sueldoEntrenador);
        }
        
        totalEquipos[0].Jugadores[0] = totalJugadores[0];
        totalEquipos[0].Jugadores[1] = totalJugadores[0];
        totalEquipos[0].Jugadores[2] = totalJugadores[0];
        totalEquipos[0].Jugadores[3] = totalJugadores[0];
        
        totalEquipos[0].Jugadores[0] = totalJugadores[0];
        totalEquipos[0].Jugadores[0] = totalJugadores[0];
        totalEquipos[0].Jugadores[0] = totalJugadores[0];
        totalEquipos[0].Jugadores[0] = totalJugadores[0];
        
        totalEquipos[0].Jugadores[0] = totalJugadores[0];
        
        
        Partidos Partido1 = new Partidos(totalEquipos[0] , totalEquipos[1], "12/02/2020", 5, 3);
        Partidos Partido2 = new Partidos(totalEquipos[2], totalEquipos[3], "25/10/2015", 0, 1);
        
        System.out.println(Partido1.local.nombre);
        
    }
    
}
