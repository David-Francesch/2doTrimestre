
package PruebaTresEnRaya;
import java.util.Scanner;


public class MainEnRaya {
    public static void main(String [] args){ 
            
        Scanner sc  = new Scanner(System.in); 
        Tablero tablero = new Tablero();
        Jugadores jugadores = new Jugadores();
         
        //Crear tablero
        for(int x = 0; x < tablero.tablero.length; x++){
            for(int y = 0; y < 7; y++){
                if(y%2 == 0){
                    tablero.tablero[x][y] = "|";
                }else{
                    tablero.tablero[x][y] = "_";
                }
             }
         }
        
        //Mostrar tablero
        for(int x = 0; x < tablero.tablero.length; x++){
            for(int y = 0; y < 7; y++){
                 System.out.print(tablero.tablero[x][y]);
            }
            System.out.println();
         }
        
        //Meter fichas jugador 1
        for(int o = 0; o < 10;o++){
            System.out.println("Jugador 1");
            System.out.print("Introduce el numero de la fila: (0,1,2)");
            int x = sc.nextInt();
            System.out.print("Introduce el numero de la columna: (1,3,5)");
            int y = sc.nextInt();
            

            if(tablero.tablero[0][1] == "X" && tablero.tablero[0][3] == "X" && tablero.tablero[0][5] == "X"){
                     System.out.println("Ha ganado el Jugador 1!!");
            }
            if(tablero.tablero[1][1] == "X" && tablero.tablero[1][3] == "X" && tablero.tablero[1][5] == "X"){
                     System.out.println("Ha ganado el Jugador 1!!");
            }
            if(tablero.tablero[2][1] == "X" && tablero.tablero[2][3] == "X" && tablero.tablero[2][5] == "X"){
                     System.out.println("Ha ganado el Jugador 1!!");
            }
            if(tablero.tablero[0][1] == "X" && tablero.tablero[1][3] == "X" && tablero.tablero[2][5] == "X"){
                     System.out.println("Ha ganado el Jugador 1!!");
            }
            if(tablero.tablero[2][1] == "X" && tablero.tablero[1][3] == "X" && tablero.tablero[0][5] == "X"){
                     System.out.println("Ha ganado el Jugador 1!!");
            }
            if(tablero.tablero[0][1] == "X" && tablero.tablero[1][1] == "X" && tablero.tablero[2][1] == "X"){
                     System.out.println("Ha ganado el Jugador 1!!");
            }
            if(tablero.tablero[0][3] == "X" && tablero.tablero[1][3] == "X" && tablero.tablero[2][3] == "X"){
                     System.out.println("Ha ganado el Jugador 1!!");
            }
            if(tablero.tablero[0][5] == "X" && tablero.tablero[1][5] == "X" && tablero.tablero[2][5] == "X"){
                     System.out.println("Ha ganado el Jugador 1!!");
            }
            
            //Mostrar tablero
            for(x = 0; x < tablero.tablero.length; x++){
                for(y = 0; y < 7; y++){
                    System.out.print(tablero.tablero[x][y]);
                }
                System.out.println();
            }

            System.out.println("Jugador 2");
            System.out.print("Introduce el numero de la fila: (0,1,2)");
            x = sc.nextInt();  
            System.out.print("Introduce el numero de la columna: (1,3,5)");
            y = sc.nextInt();  

            if( tablero.tablero[0][1] == "O" && tablero.tablero[0][3] == "O" && tablero.tablero[0][5] == "O"){
                System.out.println("Ha ganado el Jugador 2!!");
            }
            if( tablero.tablero[1][1] == "O" && tablero.tablero[1][3] == "O" && tablero.tablero[1][5] == "O"){
                System.out.println("Ha ganado el Jugador 2!!");
            }
            if( tablero.tablero[2][1] == "O" && tablero.tablero[2][3] == "O" && tablero.tablero[2][5] == "O"){
                System.out.println("Ha ganado el Jugador 2!!");
            }
            if( tablero.tablero[0][1] == "O" && tablero.tablero[1][3] == "O" && tablero.tablero[2][5] == "O"){
                System.out.println("Ha ganado el Jugador 2!!");
            }
            if( tablero.tablero[2][1] == "O" && tablero.tablero[1][3] == "O" && tablero.tablero[0][5] == "O"){
                System.out.println("Ha ganado el Jugador 2!!");
            } 
            if( tablero.tablero[0][1] == "O" && tablero.tablero[1][1] == "O" && tablero.tablero[2][1] == "O"){
                System.out.println("Ha ganado el Jugador 2!!");
            }
            if( tablero.tablero[0][3] == "O" && tablero.tablero[1][3] == "O" && tablero.tablero[2][3] == "O"){
                System.out.println("Ha ganado el Jugador 2!!");
            }
            if( tablero.tablero[0][5] == "O" && tablero.tablero[1][5] == "O" && tablero.tablero[2][5] == "O"){
                System.out.println("Ha ganado el Jugador 2!!");
            }
        }
           
        //Mostrar tablero
        for(int i = 0; i < tablero.tablero.length; i++){
            for(int j = 0; j < 7; j++){
                 System.out.print(tablero.tablero[i][j]);
            }
            System.out.println();
         }         
           
    }
}
