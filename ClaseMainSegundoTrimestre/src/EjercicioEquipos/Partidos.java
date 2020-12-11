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
public class Partidos {
 
    Equipos local, visitante;
    String fecha;
    int golesAFavor, golesEnContra;

    public Partidos(Equipos local, Equipos visitante, String fecha, int golesAFavor, int golesEnContra) {
        this.local = local;
        this.visitante = visitante;
        this.fecha = fecha;
        this.golesAFavor = golesAFavor;
        this.golesEnContra = golesEnContra;
    }
    
    public Partidos(){
        
    }

    
       
}
