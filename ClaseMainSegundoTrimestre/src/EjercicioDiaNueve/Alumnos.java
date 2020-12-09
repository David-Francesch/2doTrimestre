
package EjercicioDiaNueve;


public class Alumnos {
    String nombre;
    String apellidos;
    int edad;
    Boolean varon;
    
    Alumnos(String nombre, String apellidos, int edad, Boolean varon){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.varon = varon;
    }//Alumnos() Esto es un constructor 

    @Override
    public String toString() {
        return "\n Nombre: " + nombre + "\n Apellidos: " + apellidos + "\n Edad: " + edad + "\n Es varon: " + varon;
    }

}
