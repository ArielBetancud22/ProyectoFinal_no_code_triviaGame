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
 */
package trivia;

/**
 *
 * @author no_code
 */
public class Run {
        Title inicio = new Title();
        Player nombre=new Player();
        Question pregunta=new Question();
        
        public void ejecutarJuego(){
            inicio.comienzoPresentacion();
            nombre.guardarNombre();
            pregunta.cargarPreguntas();
            pregunta.mostrarPregunta();
            pregunta.calcularGanador();
        }
        
}
