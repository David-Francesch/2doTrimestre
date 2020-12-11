
package EjercicioEquipos;

public class Jugadores {
    
    String nombre;
    int edad;
    String posicion;
    Boolean varon;
    
    Jugadores(String nombre, int edad, String posicion, Boolean varon){
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
        this.varon = varon;
    }
    
     Jugadores(String nombre, String posicion, Boolean varon){
        this.nombre = nombre;
        this.posicion = posicion;
        this.varon = varon;
    }

    Jugadores() {
    }  
}
