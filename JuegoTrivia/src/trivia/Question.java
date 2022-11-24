/*
 * /**
 * JUEGO DE TRIVIA VER 1.1 - PREGUNTAS PARA PROGRAMADORES
 * INTEGRANTES:
 * Jeremías Riquero: jereriquero045@gmail.com
 * Dante Nicolás Martínez: niko.mrt@gmail.com
 * Dario Carrizo: dariocarrizo32@gmail.com
 * Andrés Winckler: andreswinckler@gmail.com 
 * Abel Pierna: mpierna3@gmail.com
 * Franco Lara: frankolara2013@gmail.com
 * Lucas Salinas:  lsaf.serviciotecnico@gmail.com
 * Ezequiel Mariscal: ezequielramonmariscal@gmail.com

 * Clase Preguntas
 */
package trivia;

import javax.swing.JOptionPane;

/**
 *
 * @author no_code
 */
public class Question {

    //Creación de variables locales y matriz para preguntas
    public String[][] preguntas = new String[15][6];
    public String respuesta;
    public String rpta;
    public double puntaje;
    public int num_pregunta;

    public Question() {
    }

    public Question(String respuesta, String rpta, int num_pregunta, double puntaje) {
        this.respuesta = respuesta;
        this.rpta = rpta;
        this.puntaje = puntaje;
        this.num_pregunta = num_pregunta;
    }

    //Métodos get y set
    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    //Llenado manual de las preguntas a la matriz de 15x6 
    public void cargarPreguntas() {
        preguntas[0][0] = "CATEGORIA: Python: ¿Cómo le llamamos en Python a la tabulación dentro de una estructura de control if/else o también dentro de un bucle?";
        preguntas[0][1] = "[1] Identacion";
        preguntas[0][2] = "[2] Format";
        preguntas[0][3] = "[3] Interpolacion";
        preguntas[0][4] = "[4] Ninguna de las anteriores";
        preguntas[0][5] = "1";
        preguntas[1][0] = "CATEGORIA: Python: ¿Qué utilizamos para saber que es una Tupla?";
        preguntas[1][1] = "[1] Llaves";
        preguntas[1][2] = "[2] Corchetes";
        preguntas[1][3] = "[3] Parentesis";
        preguntas[1][4] = "[4] Comillas";
        preguntas[1][5] = "3";
        preguntas[2][0] = "CATEGORIA: Python: ¿Cómo le llamamos a aquellas colecciones que pueden ser modificadas, y manipuladas sin ningún tipo de restricción?";
        preguntas[2][1] = "[1] Inmutable";
        preguntas[2][2] = "[2] Mutable";
        preguntas[2][3] = "[3] Dinamicas";
        preguntas[2][4] = "[4] Estaticas";
        preguntas[2][5] = "2";
        preguntas[3][0] = "CATEGORIA: Python: ¿Qué utilizamos para saber que es un conjunto?";
        preguntas[3][1] = "[1] Llaves";
        preguntas[3][2] = "[2] Corchetes";
        preguntas[3][3] = "[3] Parentesis";
        preguntas[3][4] = "[4] Comillas";
        preguntas[3][5] = "1";
        preguntas[4][0] = "CATEGORIA: Python: ¿Qué recibe una función dentro de sus paréntesis?";
        preguntas[4][1] = "[1] Atributos";
        preguntas[4][2] = "[2] Parametros";
        preguntas[4][3] = "[3] Argumentos";
        preguntas[4][4] = "[4] Clases";
        preguntas[4][5] = "2";
        preguntas[5][0] = "CATEGORIA: Python: ¿Qué necesita una función recursiva para que su algoritmo se ejecute correctamente?";
        preguntas[5][1] = "[1] Un modificador de acceso";
        preguntas[5][2] = "[2] Un caso base y otro recursivo";
        preguntas[5][3] = "[3] Un objeto";
        preguntas[5][4] = "[4] Una clase";
        preguntas[5][5] = "2";
        preguntas[6][0] = "CATEGORIA: Python: ¿Existen en python los modificadores de acceso?";
        preguntas[6][1] = "[1] No";
        preguntas[6][2] = "[2] Si";
        preguntas[6][3] = "[3] Deberia tener un modificador";
        preguntas[6][4] = "[4] SOlo en casos especiales";
        preguntas[6][5] = "1";
        preguntas[7][0] = "CATEGORIA: Java: ¿Qué utilizamos para crear una clase main?";
        preguntas[7][1] = "[1] soutv + tab";
        preguntas[7][2] = "[2] sout + tab";
        preguntas[7][3] = "[3] psvm + tab";
        preguntas[7][4] = "[4] psvma + soutv + tab";
        preguntas[7][5] = "3";
        preguntas[8][0] = "CATEGORIA: Java: ¿Cuál es la palabra que puede romper cualquier estructura?";
        preguntas[8][1] = "[1] pause";
        preguntas[8][2] = "[2] label";
        preguntas[8][3] = "[3] continue";
        preguntas[8][4] = "[4] break";
        preguntas[8][5] = "4";
        preguntas[9][0] = "CATEGORIA: Java: ¿Qué representa una clase para un objeto?";
        preguntas[9][1] = "[1] Una plantilla";
        preguntas[9][2] = "[2] Objetos";
        preguntas[9][3] = "[3] La clase";
        preguntas[9][4] = "[4] Atributos";
        preguntas[9][5] = "1";
        preguntas[10][0] = "CATEGORIA: Java: ¿Cuál palabra se relaciona con lo que conocemos como atributo?";
        preguntas[10][1] = "[1] Dato";
        preguntas[10][2] = "[2] Caracteristicas";
        preguntas[10][3] = "[3] Acciones";
        preguntas[10][4] = "[4] Objeto";
        preguntas[10][5] = "2";
        preguntas[11][0] = "CATEGORIA: Java: ¿Con qué nombre se identifica a la palabra que se utiliza al crear una clase, método o constructor?\n"
                + "Ejemplo:                    public class...\n"
                + "                                    public int...";
        preguntas[11][1] = "[1] Dato";
        preguntas[11][2] = "[2] Modificador de acceso";
        preguntas[11][3] = "[3] Objeto";
        preguntas[11][4] = "[4] Acciones";
        preguntas[11][5] = "2";
        preguntas[12][0] = "CATEGORIA: Java: ¿Quiénes pueden acceder a un atributo cuando esta encapsulado?";
        preguntas[12][1] = "[1] Miembros de distintas clases";
        preguntas[12][2] = "[2] Variables locales";
        preguntas[12][3] = "[3] Cuerpo de la base";
        preguntas[12][4] = "[4] Miembros de la misma clase";
        preguntas[12][5] = "4";
        preguntas[13][0] = "CATEGORIA: JavaScript:  ¿Cuál de todas las opciones con el tema de similitudes entre Java y JavaScript, es correcta?";
        preguntas[13][1] = "[1] Operadores relacionales";
        preguntas[13][2] = "[2] function";
        preguntas[13][3] = "[3] symbol";
        preguntas[13][4] = "[4] method";
        preguntas[13][5] = "1";
        preguntas[14][0] = "CATEGORIA: JavaScript  ¿Nombre del archivo para ejecutar el código js en el navegador?";
        preguntas[14][1] = "[1] Archivo.js";
        preguntas[14][2] = "[2] Carpeta.txt";
        preguntas[14][3] = "[3] index.html";
        preguntas[14][4] = "[4] README.txt";
        preguntas[14][5] = "3";
    }

    /*
    *Metodo que muestra las preguntas y ademas evalua que recibamos los datos
    *necesarios para seguir la ejecucion del juego - evalua respuesta correcta
    *y opciones correctas ingresadas por el usuario por teclado.
     */
    public String mostrarPregunta() {
        //Este bucle for recorre la matriz
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 6; j++) {
                //Guardamos respuesta
                respuesta = JOptionPane.showInputDialog(preguntas[i][0] + "\n" + preguntas[i][1] + "\n" + preguntas[i][2] + "\n" + preguntas[i][3] + "\n" + preguntas[i][4]);
                rpta = preguntas[i][5];
                //Condicional que evalúa si la respuesta no esta llena o esta fuera de rango 
                if (!respuesta.equals(null) && !respuesta.equals("1") && !respuesta.equals("2") && !respuesta.equals("3") && !respuesta.equals("4")) {
                    while (!respuesta.equals(null) && !respuesta.equals("1") && !respuesta.equals("2") && !respuesta.equals("3") && !respuesta.equals("4")) {
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta vuelva a intentarlo");
                        respuesta = JOptionPane.showInputDialog(preguntas[i][0] + "\n" + preguntas[i][1] + "\n" + preguntas[i][2] + "\n" + preguntas[i][3] + "\n" + preguntas[i][4]);
                    }
                } else { //Si el campo no esta vacio se va a validar la respuesta
                    validarRespuesta(respuesta);
                }
                break;
            }
        }
        return respuesta; //Devuelve la respuesta
    }

    /*
    *Despues de mostrada las preguntas aqui se valida la respuesta y se asigna
    *el sistema de puntajes
     */
    public double validarRespuesta(String respuesta) {
        System.out.println("Respuesta escogida = " + respuesta);
        Question puntuacion = new Question();
        if (respuesta.equals(rpta)) { //Si la respuesta del usuario es correcta
            puntuacion.setPuntaje(puntaje += 10); //Suma 10 al puntaje
            //este print es para controlar su funcionamiento por consola
            System.out.println("Correcto!");
        } else { //Si la respuesta del usuario es incorrecta
            puntuacion.setPuntaje(puntaje -= 0); //resta 10 al puntaje
            //este print es para controlar su funcionamiento por consola
            System.out.println("Incorrecto!");
        }
        return puntaje;
    }

    /*
    *Este metodo es para calcular el ganador
     */
    public double calcularGanador() {
        Title perdiste = new Title();
        Title ganaste = new Title();
        Title creditos = new Title();
        //Si el puntaje final es mayor a 70, el jugador gana
        if (puntaje >= 70) {
            System.out.println("You win");
            System.out.println("Tu puntaje es: " + puntaje);
            ganaste.youWin();
            JOptionPane.showMessageDialog(null, "Tu Puntaje Final es de: " + puntaje);
            creditos.credits();
            //Si es menor, pierde    
        } else {
            System.out.println("You lose");
            System.out.println("Tu puntaje es: " + puntaje);
            perdiste.youLose();
            JOptionPane.showMessageDialog(null, "Tu Puntaje Final es de: " + puntaje);
            creditos.credits();
        }
        return puntaje;
    }
}
