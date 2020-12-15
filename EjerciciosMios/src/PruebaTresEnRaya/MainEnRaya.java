
package PruebaTresEnRaya;
import java.util.Scanner;


public class MainEnRaya {
        public static void main(String [] args){  
         /*for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero.length; j++){
               tablero [i][j] = 0; 
            }
         }*/
         
         String tablero[][] = new String[3][7];
         
         //Montar tablero
         for(int x = 0; x < tablero.length; x++){
             for(int y = 0; y < 7; y++){
                 if(y%2 == 0){
                     tablero[x][y] = "|";
                 }else{
                     tablero[x][y] = "_";
                 }
             }
         }
         
         //Mostrar resultado
         for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < 7; j++){
                 System.out.print(tablero[i][j]);
            }
            System.out.println();
         }
         
         
         Scanner sc = new Scanner(System.in);
        //Insertar casillas Jugador 1     
         for(int xx = 0; xx < tablero.length; xx++){
            System.out.println("Jugador 1");
            System.out.print("Introduce el numero de la fila: (0,1,2)");
            int x = sc.nextInt();
            
            System.out.print("Introduce el numero de la columna: (1,3,5)");
            int y = sc.nextInt();
            
            do{
                tablero[x][y] = "X";
                
            }while(tablero[x][y] == "_");
            
            /*if(tablero[x][y] == "X" || tablero[x][y] == "O"){
                System.out.println("Ya hay una ficha ahi.");
            }else{
                tablero[x][y] = "X";
            }*/
             
        //Mostrar resultado
            for(int i = 0; i < tablero.length; i++){
                 for(int j = 0; j < 7; j++){
                    System.out.print(tablero[i][j]);
                 }
                System.out.println();               
            }
            
        //Insertar casillas Jugador 2    
            System.out.println("Jugador 2");
            System.out.print("Introduce el numero de la fila: (0,1,2)");
            x = sc.nextInt();
            
            System.out.print("Introduce el numero de la columna: (1,3,5)");
            y = sc.nextInt();
            
            if(tablero[x][y] == "X" || tablero[x][y] == "O"){
                System.out.println("Ya hay una ficha ahi.");
            }else{
                tablero[x][y] = "O";
            }
            
        //Mostrar resultado
            for(int i = 0; i < tablero.length; i++){
                 for(int j = 0; j < 7; j++){
                    System.out.print(tablero[i][j]);
                 }
                System.out.println();               
            }
            int conthor = 0;
            for(int i = 1; i <= tablero.length; i+=2){
                if(tablero[0][i] == "X"){
                    conthor++;
                }
                if(conthor == 3){
                    System.out.println("Ha ganado el jugador 1!!");
            }
        }
        }
         
           
        
    }
}
