
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class Disparos 
{
    private static final String rutaImagen = RType.miRuta() + "image" + File.separator + "bullet.gif";    
    public static int anchoImagen = 10;
    public static int altoImagen  = 5;
    
    private int posX, posY;
    private int velocidad = 30;
        
    
/**
* Constructor de la clase Disparos
*/
    public Disparos(int posX, int posY)
    {
        this.posX = posX;
        this.posY = posY;
    }
    
    
/**
* Metodo para obtener los datos relativos a la imagen de los proyectiles.
* 
* @param
* @return
*/
    public BufferedImage getImagen()
    {
        try{
           return ImageIO.read(new File(rutaImagen)) ;
        } catch(Exception e) { return null; }
    }
/**
* Metodo para crear un objeto rectángulo con las mismas
* dimensiones y coordenadas de los proyectiles.
* 
* @param  
* @return Un objeto de clase rectángulo.
*/    
    public Rectangle getRectangulo()
    {
        return new Rectangle(posX, posY, anchoImagen, altoImagen);
    }
       
    
/**
* Metodo para dibujar los proyectiles.
* 
* @param  
* @return La imagen perteneciente a los proyectiles en las coordenadas dadas.
*/
    public void dibujar(Graphics2D g2, BufferedImage im)
    {
        g2.drawImage(im, posX+15, posY+20, null);        
    }
    
    
/**
* Metodo para mover en la ventana el proyectil.
* 
* @param
* @return
*/
    public void mover(int index)
    {
        if (posX < 1300)
            posX += velocidad;
        else
            this.eliminar(index);
    }
    
/**
* Metodo para eliminar el proyectil.
* 
* @param
* @return
*/
    public void eliminar(int index)
    {
        RType.misilesActivos.remove(index);
    }
    
}


