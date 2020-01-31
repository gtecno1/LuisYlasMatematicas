
package TetrisLuis;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.Timer;
import TetrisLuis.Figura.Piezas;


public class Tablero extends JPanel implements ActionListener{
     int ANCHO= 15;
     int ALTO  = 30;
    Timer timer;
    boolean terminaCaer = false;
    boolean starp = false;
    boolean pausa = false;
    int Lineas = 0;
    int posX = 0;
    int posY = 0;
    JLabel puntuacion;
    Figura posPieza;
    Piezas[] tablero;
    //el timer lo uso para agregar un retraso entre cada actualizacion del tablero
    public Tablero(Tetris parent)
        {
        setFocusable(true);
        posPieza = new Figura();
        timer = new javax.swing.Timer(600, this);
        timer.start();
        puntuacion =  parent.obtenerPuntuacion();
        tablero = new Piezas[ANCHO * ALTO];
        setBackground(Color.BLACK);
        addKeyListener(new control());
        limpiaTablero();
        }
    //este metodo checa si la pieza ya termino de caer para crear otra pieza sino la pieza q vay callendo baja una linea
    public void actionPerformed(ActionEvent e)
        {
        if (terminaCaer)
            {
            terminaCaer = false;
            piezaNueva();
            }
        else
            {
            bajaUna();
            }
        }
    int anchoCelda()
        {
        return (int) getSize().getWidth() / ANCHO;
        }
    int altoCelda()
        {
        return (int) getSize().getHeight() / ALTO;
        }
    Piezas formaEn(int x, int y)
        {
        return tablero[(y * ANCHO) + x];
        }
    // toda la logica del juego :P
    //terminacaer  sirve para saber si la pieza ha llegado hasta abajo y se ocupa crear una nueva
    //lineas es un contador para saber cuantas lineas ha elimiando el jugador (la puntuacion)
    public void start()
        {
        if (pausa)
            return;
        starp = true;
        terminaCaer = false;
        Lineas = 0;
        limpiaTablero();
        piezaNueva();
        timer.start();
        }
    //por si t dan ganas de ir a ba�o mientras juegas o suena el tel xD
    private void pausa()
        {
        if (!starp)
            return;
        pausa = !pausa;
        if (pausa)
            {
            timer.stop();
            puntuacion.setText("pausa");
            
            }
        else
            {
            timer.start();
            puntuacion.setText(String.valueOf(Lineas));
            }
        repaint();
        }
    //todos los cuadros de las figuras q hay llegado al fondo se guardan en el arreglo tablero
    public void paint(Graphics g)
        {
        super.paint(g);
        Dimension tamaño = getSize();
        int topeTableroA = (int) tamaño.getHeight() - ALTO * altoCelda();
        for (int i = 0; i < ALTO; ++i)
            {
            for (int j = 0; j < ANCHO; ++j)
                {
                Piezas forma = formaEn(j, ALTO - i - 1);
                if (forma != Piezas.nada)
                    dibuja(g, 0 + j * anchoCelda(),
                               topeTableroA + i * altoCelda(), forma);
                }
            }
        //y aqui se pinta la pieza q va cayendo
        if (posPieza.obtenerFigura() != Piezas.nada)
            {
            for (int i = 0; i < 4; ++i)
                {
                int x = posX + posPieza.x(i);
                int y = posY - posPieza.y(i);
                dibuja(g, 0 + x * anchoCelda(),
                           topeTableroA + (ALTO - y - 1) * altoCelda(),
                           posPieza.obtenerFigura());
                }
            }
        }
    // metodo para bajar la pieza de un jalon
    private void bajar()
        {
        int nuevoY = posY;
        while (nuevoY > 0)
            {
            if (!mueve(posPieza, posX, nuevoY - 1))
                break;
            --nuevoY;
            }
        bajaPieza();
        }
    private void bajaUna()
        {
        if (!mueve(posPieza, posX, posY - 1))
            bajaPieza();
        }
    //esta llena el tablero con piezas vacias
    private void limpiaTablero()
        {
        for (int i = 0; i < ALTO * ANCHO; ++i)
            tablero[i] = Piezas.nada;
        }
    //pone la pieza q va cayendo en el arreglo tablero, como mencionaba antes
    //ese arreglo contiene los cuadros de las piezas q han terminado de caer y las que estan
    //cortadas por q se han removido lineas
    //cuando la pieza termina de caer es necesario checar si se pueden quitar lineas del tablero
    private void bajaPieza()
        {
        for (int i = 0; i < 4; ++i)
            {
            int x = posX + posPieza.x(i);
            int y = posY - posPieza.y(i);
            tablero[(y * ANCHO) + x] = posPieza.obtenerFigura();
            }
        quitaLinea();
        if (!terminaCaer)
            piezaNueva();
        }
    //crea una pieza nueva por medio de un random para q salgan piezas al azar
    //tambien checa si la pieza se puede mover al principio si no se puede se termina el juego
    private void piezaNueva()
        {
        posPieza.ponerFiguraRnd();
        posX = ANCHO / 2 + 1;
        posY = ALTO - 1 + posPieza.minY();
        if (!mueve(posPieza, posX, posY))
            {
            posPieza.ponerFigura(Piezas.nada);
            timer.stop();
            starp = false;
            puntuacion.setText("Perdiste");
            }
        }
    //con esta se mueven las piezas regresa falso si la pieza ha llegado a los limites
    //del tablero o si esta junto a otra pieza q ya este en el tablero
    private boolean mueve(Figura piezaNueva, int nuevaX, int nuevaY)
        {
        for (int i = 0; i < 4; ++i)
            {
            int x = nuevaX + piezaNueva.x(i);
            int y = nuevaY - piezaNueva.y(i);
            if (x < 0 || x >= ANCHO || y < 0 || y >= ALTO)
                return false;
            if (formaEn(x, y) != Piezas.nada)
                return false;
            }
        posPieza = piezaNueva;
        posX = nuevaX;
        posY = nuevaY;
        repaint();
        return true;
        }
    //elimina las lineas completas  y las suma a la puntuacion
    private void quitaLinea()
        {
        int numFilasLlenas = 0;
        for (int i = ALTO - 1; i >= 0; --i)
            {
            boolean lineaLLena = true;
            for (int j = 0; j < ANCHO; ++j)
                {
                if (formaEn(j, i) == Piezas.nada)
                    {
                    lineaLLena = false;
                    break;
                    }
                }
            if (lineaLLena)
                {
                ++numFilasLlenas;
                for (int k = i; k < ALTO - 1; ++k)
                    {
                    for (int j = 0; j < ANCHO; ++j)
                         tablero[(k * ANCHO) + j] = formaEn(j, k + 1);
                    }
                }
            }
        if (numFilasLlenas > 0)
            {
        Lineas += numFilasLlenas;
        puntuacion.setText(String.valueOf(Lineas));
        terminaCaer = true;
        posPieza.ponerFigura(Piezas.nada);
        repaint();
        }
    }
//todas las piezas tienen 4 celdas y son de diferentes colores
private void dibuja(Graphics g, int x, int y, Piezas figura)
    {
    Color colores[] = { new Color(5, 5, 5), new Color(204, 102, 102),
    new Color(102, 204, 102), new Color(23, 102, 204),
    new Color(204, 204, 42), new Color(204, 102, 204),
    new Color(102, 204, 204), new Color(218, 170, 0)
                     };
    Color color = colores[figura.ordinal()];
        g.setColor(color);
        g.fillRect(x + 1, y + 1, anchoCelda() - 2, altoCelda() - 2);
        //los bordes estan mas claros y mas oscuros para darle aspeco 3d a las figuras
        g.setColor(color.brighter());
        g.drawLine(x, y + altoCelda() - 1, x, y);
        g.drawLine(x, y, x + anchoCelda() - 1, y);
        g.setColor(color.darker());
        g.drawLine(x + 1, y + altoCelda() - 1,x + anchoCelda() - 1, y + altoCelda() - 1);
        g.drawLine(x + anchoCelda() - 1, y + altoCelda() - 1,x + anchoCelda() - 1, y + 1);
        }

   
    // se definen los controles del teclado p para poner pausa, flecha izquierda mueve pieza a la izquierda
    //flecha derecha mueve pieza a la derecha y flecha abajo baja la pieza instantaneamente hasta abajo o hasta q tope con otra figura
    class control extends KeyAdapter
        {
        public void keyPressed(KeyEvent e)
            {
            if (!starp || posPieza.obtenerFigura() == Piezas.nada)
                {
                return;
                }
            int keycode = e.getKeyCode();
            if (keycode == 'p' || keycode == 'P')
                {
                pausa();
                return;
                }
            if (pausa)
                return;
            switch (keycode)
                {
                case KeyEvent.VK_LEFT:
                    mueve(posPieza, posX - 1, posY);
                    break;
                case KeyEvent.VK_RIGHT:
                    mueve(posPieza, posX + 1, posY);
                    break;
                case KeyEvent.VK_DOWN:
                    bajar();
                    break;
                case KeyEvent.VK_UP:
                    mueve(posPieza.rotar(), posX, posY);
                    break;
                }
            }
        }
}
