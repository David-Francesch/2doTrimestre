
package EjerciciosVarios;

import java.util.Scanner;

public class EjercicioCuadradoObjetos {
    public static void main(String[]args){
        System.out.println("Introduce un numero por teclado");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        Cuadrado(num);
    }//main
    
    static int Cuadrado(int numnum){
        int cuadrado = numnum * numnum;
        System.out.println("El cuadrado del numero introducido es: "+cuadrado);
        
        return cuadrado;
        
    }//Cuadrado
}
