
package EjercicioDiaNueve;

import java.lang.reflect.Field;

/*crear un grupo con, nombre, numero de alumnos, en que planta esta, ciclo al 
que pertenece, superior o no, el grupo tendra un maximo de 5 alumnos, cada alumnos
tiene nombre, apellido, edad, bVaron*/
public class EjercicioDeGrupo {
    public static void main(String[]args){
        
        //ejemplo: 1dam, 4, 3, dam, true
        //alumno1: jorge, garcia, 24, true
        //alumno2: carlos, gutierrez, 43, true
        //alumno3: sofia, vergara, 13, false
        //alumno4: fatima, "hola gola", 15, false
        
        Alumnos Alu1 = new Alumnos("Jorge" ,"Garcia", 18, true ); //creacion del objeto Alumnos
        Alumnos Alu2 = new Alumnos("Carlos" ,"Gutierrez", 23, true );
        Alumnos Alu3 = new Alumnos("Sofia" ,"Vergara", 11, false);
        Alumnos Alu4 = new Alumnos("Fatima" ,"Santa Maria", 15, false );
        
        Grupo GrupoAlumnos = new Grupo(); //creacion del objeto Grupo
        GrupoAlumnos.nombre= "1DAM A";
        GrupoAlumnos.ciclo = "DAM";
        GrupoAlumnos.numAlumnos = 4;    
        GrupoAlumnos.planta = 3;
        GrupoAlumnos.superior = true;

        System.out.println("El grupo actual es:");
        System.out.println("Nombre: "+GrupoAlumnos.nombre);
        System.out.println("Ciclo: "+GrupoAlumnos.ciclo);
        System.out.println("Numero maximo de alumnos: "+GrupoAlumnos.numAlumnos);
        System.out.println("Planta: "+GrupoAlumnos.planta);
        if(GrupoAlumnos.superior = true){
            System.out.println("Es grado superior");
        }else{
            System.out.println("No es grado superior");
        }
        
        System.out.println("Alumno 1:"+Alu1.toString());
        System.out.println("Alumno 2:"+Alu2.toString());
        System.out.println("Alumno 3:"+Alu3.toString());
        System.out.println("Alumno 4:"+Alu4.toString());
        
    
    }//main()
    
    

}

