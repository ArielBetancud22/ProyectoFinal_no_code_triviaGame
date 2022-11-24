/*
 * /**
 * JUEGO DE TRIVIA VER 1.1 - PREGUNTAS PARA PROGRAMADORES
 * INTEGRANTES:
 * Jeremias Riquero: jereriquero045@gmail.com
 * Dante Nicolás Martinez: niko.mrt@gmail.com
 * Dario Carrizo: dariocarrizo32@gmail.com
 * Andres Winckler: andreswinckler@gmail.com 
 * Abel Pierna: mpierna3@gmail.com
 * Franco Lara: frankolara2013@gmail.com
 * Lucas Salinas:  lsaf.serviciotecnico@gmail.com
 * Ezequiel Mariscal: ezequielramonmariscal@gmail.com

 * En esta clase estan todas las presentaciones que utilizaremos en el Juego   
 */
package trivia;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author no_code
 */
public class Title {
    
    
    public Title() {
    }

    public void comienzoPresentacion(){
        
        var portada= new ImageIcon("TriviaGame.png");
        JLabel icon= new JLabel(portada);
        JLabel texto= new JLabel("Bienvenidos al Juego");
        JLabel texto1= new JLabel("Continue..");
        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(icon,BorderLayout.CENTER);
        panel.add(texto,BorderLayout.NORTH);
        panel.add(texto1,BorderLayout.SOUTH);
        
        JOptionPane.showMessageDialog(null, panel, "Display image",JOptionPane.PLAIN_MESSAGE);
    }
    public void Rambo(){
        
        var portada= new ImageIcon("dontPlay.png");
        JLabel icon= new JLabel(portada);
        JLabel texto= new JLabel("NO JUEGUES CONMIGO");
        JLabel texto1= new JLabel("Try Again...");
        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(icon,BorderLayout.CENTER);
        panel.add(texto,BorderLayout.NORTH);
        panel.add(texto1,BorderLayout.SOUTH);
        
        JOptionPane.showMessageDialog(null, panel, "Display image",JOptionPane.PLAIN_MESSAGE);
    }
    public void Menu(){
        var portada= new ImageIcon("menu.png");
        JLabel icon= new JLabel(portada);
        JLabel texto= new JLabel("OPCIONES DEL JUEGO");
        JLabel texto1= new JLabel("A Jugar..... OK para continuar");
        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(icon,BorderLayout.CENTER);
        panel.add(texto,BorderLayout.NORTH);
        panel.add(texto1,BorderLayout.SOUTH);
        
        JOptionPane.showMessageDialog(null, panel, "Display image",JOptionPane.PLAIN_MESSAGE);
    }
    public void youWin(){
        var portada= new ImageIcon("youWin.png");
        JLabel icon= new JLabel(portada);
        JLabel texto= new JLabel("CONGRATULATIONS");
        JLabel texto1= new JLabel("");
        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(icon,BorderLayout.CENTER);
        panel.add(texto,BorderLayout.NORTH);
        panel.add(texto1,BorderLayout.SOUTH);
        
        JOptionPane.showMessageDialog(null, panel, "Display image",JOptionPane.PLAIN_MESSAGE);
    }
    public void youLose(){
        var portada= new ImageIcon("youLose.png");
        JLabel icon= new JLabel(portada);
        JLabel texto= new JLabel("OH NOO YOU LOSE");
        JLabel texto1= new JLabel("");
        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(icon,BorderLayout.CENTER);
        panel.add(texto,BorderLayout.NORTH);
        panel.add(texto1,BorderLayout.SOUTH);
        
        JOptionPane.showMessageDialog(null, panel, "Display image",JOptionPane.PLAIN_MESSAGE);
    }
     
    public void credits(){
        var portada= new ImageIcon("credits.png");
        JLabel icon= new JLabel(portada);
        JLabel texto= new JLabel("CREDITS");
        JLabel texto1= new JLabel("THE END");
        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(icon,BorderLayout.CENTER);
        panel.add(texto,BorderLayout.NORTH);
        panel.add(texto1,BorderLayout.SOUTH);
        
        JOptionPane.showMessageDialog(null, panel, "Display image",JOptionPane.PLAIN_MESSAGE);
    }
}
