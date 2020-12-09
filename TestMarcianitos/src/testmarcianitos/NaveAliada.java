
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.*;
//+ "image" + File.separator 
public class NaveAliada 
{
    private static final String rutaImagen = "aliada.gif";    
    public static int anchoImagen = 102;
    public static int altoImagen  = 51;
    
    private int posX, posY;
    private int velocidad = 10;
    private boolean left, right, up, down;
    
    
/**
* Constructor de la clase NaveAliada
*/
    public NaveAliada(int posX, int posY)
    {
        this.posX = posX;
        this.posY = posY;
    }
    
    
/*
* Metodo para obtener los datos relativos a la imagen de la NaveAliada.
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
/*
* Metodo para crear un objeto rectángulo con las mismas
* dimensiones y coordenadas de la NaveAliada.
* 
* @param  
* @return Un objeto de clase rectángulo.
*/     
    public Rectangle getRectangulo()
    {
        return new Rectangle(posX, posY, anchoImagen, altoImagen);
    }
    
/*
* Método para comprobar la pulsación de una determinada tecla
* en el teclado del ordenador.
* 
* @param  
* @return Verdadero al pulsar la tecla.
*/
    
    public void keyPressed(KeyEvent e)
    {
           int key = e.getKeyCode();
           
           if (key ==KeyEvent.VK_SPACE){
                RType.misilesActivos.add(new Disparos(posX+anchoImagen/2, posY));
            }
            if (key ==KeyEvent.VK_O){
                left = true;  
            }
            if (key ==KeyEvent.VK_P){
                right = true;
            }
            if (key ==KeyEvent.VK_Q){
                up = true;
            }
            if (key ==KeyEvent.VK_A){
                down = true;
            }
    }
/**
* Método para comprobar que se ha dejado de pulsar una determinada tecla
* en el teclado del ordenador.
* 
* @param  
* @return False al dejar de pulsar la tecla.
*/
    
    public void keyReleased(KeyEvent e)
    {
        int key = e.getKeyCode();
        
        if (key ==KeyEvent.VK_O){
            left = false;  
        }
        if (key ==KeyEvent.VK_P){
            right = false;
        }
        if (key ==KeyEvent.VK_Q){
            up = false;
        }
        if (key ==KeyEvent.VK_A){
            down = false;
        }
    }
 
/**
* Metodo para dibujar la NaveAliada.
* 
* @param  
* @return La imagen perteneciente a la NaveAliada en las coordenadas dadas.
*/
    public void dibujar(Graphics2D g2, BufferedImage im)
    {
        g2.drawImage(im, posX, posY, null);        
    }
    
    
/**
* Metodo para mover la NaveAliada
* 
* @param  
* @return El nuevo valor de x e y con respecto a la velocidad.
*/
    public void mover()
    {
        if (left == true && posX > 10)
            posX -= velocidad;
        if (right == true   && posX < RType.ANCHO-anchoImagen)
            posX += velocidad;
        if (up == true    && posY > 10)
            posY -= velocidad;
        if (down == true     && posY < RType.ALTO-altoImagen-30)
            posY += velocidad;
    }
    
/**
* Metodo para eliminar la NaveAliada
* 
* @param  
* @return El nuevo valor de x e y con respecto a la velocidad.
*/
    public void eliminar()
    {
        JOptionPane.showMessageDialog(null,"Lo siento, ha perdido", "Fin de partida", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}





