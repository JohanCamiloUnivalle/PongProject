package game;

import javax.swing.JFrame;

public class App 
{
    public static void main( String[] args )
    {   
        PanelJuego panel = new PanelJuego();
        Ventana ventana = new Ventana(panel);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
