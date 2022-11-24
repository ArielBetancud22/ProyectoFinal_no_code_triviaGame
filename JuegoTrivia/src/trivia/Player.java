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

 * Clase Jugador
 */
package trivia;

import javax.swing.JOptionPane;

/**
 *
 * @author no_code
 */
public class Player {
    public String nombreJugador;
    public String puntoJugador;
    public int contador;
    
    public Player() {
    }

    public Player(String nombreJugador, String puntoJugador) {
        this.nombreJugador = nombreJugador;
        this.puntoJugador = puntoJugador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getPuntoJugador() {
        return puntoJugador;
    }

    public void setPuntoJugador(String puntoJugador) {
        this.puntoJugador = puntoJugador;
    }

    @Override
    public String toString() {
        return "Jugador {" + "Nombre del jugador = " + nombreJugador + ", puntos del Jugador = " + puntoJugador + '}';
    }
    
    public void guardarNombre(){
        Title rambo = new Title();
        Title menu= new Title();
        Player jugador1 = new Player();
        jugador1.setNombreJugador(JOptionPane.showInputDialog(null, "POR FAVOR INGRESE EL NOMBRE DEL JUGADOR: "));
        //Aqui evalua que el campo nombre del jugador no este vacio
        if (jugador1.nombreJugador.isEmpty()) {
            System.out.println("Su nombre esta vacio intente nuevamente");
            contador += 1;
            if (contador >= 1) { //Aqui si no pones nada te amenaza rambo
                rambo.Rambo();
                guardarNombre();
            } else { //Si no te guarda el nombre
                guardarNombre(); 
            }
        } else { //Si haces todo correcto te asigna el puntaje a 0 y de modo de prueba mostramos nombre
            // y puntos del jugador imprimiendo el objeto jugador1
            menu.Menu();
            jugador1.setPuntoJugador("0");
            System.out.println("jugador1 = " + jugador1);
        }
    }
}
