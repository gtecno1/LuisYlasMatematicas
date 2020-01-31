
package TetrisLuis;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;


public class Tetris extends JFrame {
   JLabel puntuacion;
   JButton btsalir;
  
    public Tetris()
        {
         
        puntuacion = new JLabel(" 0");
        add(puntuacion, BorderLayout.SOUTH);
       
        Tablero tab = new Tablero(this);
        add(tab);
        tab.start();
        this.getContentPane().setBackground(Color.red);
        
        setSize(960, 550);
        setTitle("Tetris");
          this.setLocationRelativeTo(null);
          this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
   public JLabel obtenerPuntuacion()
        {
        return puntuacion;
        }
   
   //el main
    public static void main(String[] args)
        {
        Tetris juego = new Tetris();
        juego.setVisible(true);
       
        }   
}
