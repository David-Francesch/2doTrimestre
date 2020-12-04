
package EjerciciosVarios;

import java.util.Scanner;

public class EjercicioDiaCuatro {
    
    private int cuadrado;
    private int cubo;
    private int polinomio;
    
    public static void main(String[]args){
        System.out.println("Introduce un numero por pantalla");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        EjercicioDiaCuatro cuadrado;
        EjercicioDiaCuatro cubo;
        EjercicioDiaCuatro polinomio;
        
        EjercicioDiaCuatro MetodosDiaCuatro = new EjercicioDiaCuatro();
        
        MetodosDiaCuatro.mCuadrado(num);
        System.out.println("El cuadrado es: "+MetodosDiaCuatro.cuadrado); 
        
        MetodosDiaCuatro.mCubo(num);
        System.out.println("El cuadrado es: "+MetodosDiaCuatro.cubo);
        
        MetodosDiaCuatro.mPolinomio(num);
        System.out.println("El cuadrado es: "+MetodosDiaCuatro.polinomio); 
        
    }
 
    private void mCuadrado(int numCuadrado){
      this.cuadrado = numCuadrado * numCuadrado;
    }
    private void mCubo(int numCubo){
      this.cubo = numCubo*numCubo*numCubo; 
    }   
    private void mPolinomio(int numPolinomio){
      this.polinomio = 6*this.cuadrado + 4*this.cubo + numPolinomio;
    }    
}
