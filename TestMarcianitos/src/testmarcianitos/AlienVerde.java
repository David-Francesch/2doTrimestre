
import java.util.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

/**
 * Esta clase describe una nave alienígena con movimiento
 * aleatorio.
 * 
 * @Luis Miguel Francesch Diaz
 * @version (1/4/13)
 */
public class AlienVerde 
{
    private static final String rutaImagen[] = { RType.miRuta() + "image" + File.separator + "alien2.gif"};    
    public static int anchoImagen = 60;
    public static int altoImagen  = 26;
    
    private int numFotograma;
    private int contFotograma;
    
    private int posX, posY;
    private int  velocidad = 5;
    private String direccion;
    
    
/**
* Constructor de la clase AlienVerde
*/
    
    public AlienVerde(int posX, int posY)
    {
        this.posX = posX;
        this.posY = posY;
        numFotograma = 0;
        this.setDireccion();
    }
/**
* Metodo para obtener la imagen del AlienVerde.
* 
* @param  
* @return
*/ 
    
    public BufferedImage getImagen()
    {
        try{
           return ImageIO.read(new File(rutaImagen[numFotograma])) ;
        } catch(Exception e) { return null; }
    }
/**
* Metodo para crear un objeto rectángulo con las mismas
* dimensiones y coordenadas del AlienVerde.
* 
* @param  
* @return Un objeto de clase rectángulo.
*/ 
    public Rectangle getRectangulo()
    {
        return new Rectangle(posX, posY, anchoImagen, altoImagen);
    }
       
    
/**
* Metodo para dibujar el AlienVerde y actualizar el fotograma.
* 
* @param  
* @return 
*/ 
    
    public void dibujar(Graphics2D g2, BufferedImage im)
    {
        g2.drawImage(im, posX, posY, null);
        
        if (++contFotograma % 6 == 0)
        {
            numFotograma = (numFotograma+1) % rutaImagen.length;
            contFotograma = 0;
        }
    }
    
    
/**
* Método para mover la nave AlienVerde
* 
* @param  
* @return El nuevo valor de x e y con respecto a la velocidad.     
*/
    
    public void mover(int index)
    {
        if (posX<=0-anchoImagen){
            posX=RType.ANCHO;
        }
        if (direccion.equals("leftUp")==true)
            if (posX>=0-anchoImagen && posY>10) {
                posX -= velocidad + RType.suma;
                posY -= velocidad;
            }
            else this.setDireccion();
        if (direccion.equals("leftDown")==true)
            if (posX>=0-anchoImagen && posY<RType.ALTO-altoImagen-24) {
                posX -= velocidad + RType.suma;
                posY += velocidad;
            }
            else this.setDireccion();
        
    }
    
/**
* Método para elegir aleatoriamente la
* dirección del AlienVerde.
* 
* @param  
* @return Devuelve arriba o abajo de manera aleatoria    
*/    
    
    public void setDireccion()
    {
        Random rdm = new Random();
        switch((int)(rdm.nextDouble()*2))
        {
            case 0:
                direccion = "leftDown";
                break;
            case 1:
                direccion = "leftUp";
                break;
         }
    }
    
/**
* Metodo para eliminar el AlienVerde.
* 
* @param  
* @return
*/ 
    public void eliminar(int index)
    {
        RType.tropaVerde.remove(index);
    }
    
    
}