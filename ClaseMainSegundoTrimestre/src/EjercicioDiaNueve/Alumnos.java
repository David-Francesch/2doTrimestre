
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

    public Alumnos(String nombre) {
        this.nombre = nombre;
    }

    public Alumnos(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public Boolean getVaron() {
        return varon;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setVaron(Boolean varon) {
        this.varon = varon;
    }
    
    
    
}
