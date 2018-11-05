/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Henry
 */
public class Ahorcado {

    //Muestra el dibujo, errores y letras 
    public static void dibujar(String vPalabras[], String vError[], int error) {
        //Dibuja por cada error cometido
        switch(error){
            case 0:
                System.out.println("     ************************     ");
                System.out.println("     ** Juego del Ahorcado **     ");
                System.out.println("     ************************     ");
                break;
            
            case 1:
                System.out.println("     ************************     ");
                System.out.println("     ** Juego del Ahorcado **     ");
                System.out.println("     ************************     ");
                System.out.println("                                  ");
                System.out.println("|_________________________________");
                break;
            
            case 2:
                System.out.println("     ************************     ");
                System.out.println("     ** Juego del Ahorcado **     ");
                System.out.println("     ************************     ");
                System.out.println("                                  ");
                System.out.println("|                                 ");
                System.out.println("|                                 ");
                System.out.println("|                                 ");
                System.out.println("|                                 ");
                System.out.println("|                                 ");
                System.out.println("|                                 ");
                System.out.println("|                                 ");
                System.out.println("|                                 ");
                System.out.println("|                                 ");
                System.out.println("|                                 ");
                System.out.println("|_________________________________");
                break;
                
            case 3:
                System.out.println("     ************************     ");
                System.out.println("     ** Juego del Ahorcado **     ");
                System.out.println("     ************************     ");
                System.out.println("                                  ");
                System.out.println(" _____________________________    ");
                System.out.println("| /                           |   ");
                System.out.println("|/                                ");
                System.out.println("|                                 ");
                System.out.println("|                                 ");
                System.out.println("|                                 ");
                System.out.println("|                                 ");
                System.out.println("|                                 ");
                System.out.println("|                                 ");
                System.out.println("|                                 ");
                System.out.println("|                                 ");
                System.out.println("|_________________________________");
                break;
                
            case 4:
                System.out.println("        ************************        ");
                System.out.println("        ** Juego del Ahorcado **        ");
                System.out.println("        ************************        ");
                System.out.println("                                        ");
                System.out.println(" _____________________________          ");
                System.out.println("| /                       ____|____     ");
                System.out.println("|/                       |         |    ");
                System.out.println("|                        |   O O   |    ");
                System.out.println("|                        |____U____|    ");
                System.out.println("|                                       ");
                System.out.println("|                                       ");
                System.out.println("|                                       ");
                System.out.println("|                                       ");
                System.out.println("|                                       ");
                System.out.println("|                                       ");
                System.out.println("|_______________________________________");
                break;   
                
            case 5:
                System.out.println("        ************************        ");
                System.out.println("        ** Juego del Ahorcado **        ");
                System.out.println("        ************************        ");
                System.out.println("                                        ");
                System.out.println(" _____________________________          ");
                System.out.println("| /                       ____|____     ");
                System.out.println("|/                       |         |    ");
                System.out.println("|                        |   O O   |    ");
                System.out.println("|                        |____U____|    ");
                System.out.println("|                            |||        ");
                System.out.println("|                          //|||\\      ");
                System.out.println("|                         // ||| \\     ");
                System.out.println("|                            |||        ");
                System.out.println("|                                       ");
                System.out.println("|                                       ");
                System.out.println("|_______________________________________");
                break; 
                
            case 6:
                System.out.println("        ************************        ");
                System.out.println("        ** Juego del Ahorcado **        ");
                System.out.println("        ************************        ");
                System.out.println("                                        ");
                System.out.println(" _____________________________          ");
                System.out.println("| /                       ____|____     ");
                System.out.println("|/                       |         |    ");
                System.out.println("|                        |   X X   |    ");
                System.out.println("|                        |____U____|    ");
                System.out.println("|                            |||        ");
                System.out.println("|                          //|||\\      ");
                System.out.println("|                         // ||| \\     ");
                System.out.println("|                            |||        ");
                System.out.println("|                           // \\       ");
                System.out.println("|                          //   \\      ");
                System.out.println("|_______________________________________");
                System.out.println("                                        ");
                System.out.println("          ===== GAME OVER =====         ");
                break; 
        }
        
        if(error <= 6){
            for (int i = 0; i < vPalabras.length; i++) {
                System.out.print(vPalabras[i]);
            }
            System.out.println(" ");
        }
        
        System.out.println("");
        System.out.println("Errores:");
        
        //Muestra todos los errores cometidos
        for(int i=0;i<vError.length;i++){
            if(vError[i] != null){
                System.out.print(vError[i] + ",");
            }
        }
    }
    
    //Seleccionamos una palabra aleatoria averiguar
    public static String inicializarPalabra(String palabraAlamacenada[]) {
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(2);
        
        String palabra = " ";
        
        palabraAlamacenada[0] = "programacion";
        palabraAlamacenada[1] = "basesdedatos";
        
        palabra = palabraAlamacenada[numero];
        
        return palabra;
    }
    
    //Inicializa el vector que contendra los aciertos
    public static void trocearvPalabras(String vPalabras[]) {
        for (int i = 0; i < vPalabras.length; i++) {
            vPalabras[i] = "_ ";
        }
    }
    
    //Trozea la palabra averiguar y lo guardamos en un vector
    public static void separarPalabra(String vLetra[], String palabra) {
        for (int i = 0; i < vLetra.length; i++) {
            vLetra[i] = palabra.substring(i,i+1);
        }
    }

    //Contiene toda la mecanica del Juego
    public static int jugar(String vPalabras[], String vLetra[], String vError[], String palabra,String letra, int error) {
        Scanner leer = new Scanner(System.in);
        boolean fallo = true;
        int devolver = error;
        boolean comprueba = false;
        
        if(error < 6){
            System.out.println("");
            System.out.println("");
            System.out.println("Introduce una Letra");
            letra = leer.nextLine().substring(0,1).toLowerCase();
            System.out.println("");
            
            comprueba = buscarErrores(vError,letra);
        }
        
        //Si la letra introducida coincide con la palabra la guarda en el vector
        for(int i=0;i<vLetra.length;i++){
            if(vLetra[i].equals(letra)){
                vPalabras[i] = letra;
                fallo = false;
            }
        }
        
        //Si la letra introducida no es correcta
        if (fallo){
            //Comprobamos si la letra introducida esta repetida o no, si no esta repetida lo guardamos
            if(comprueba == true){
                System.out.println("Palabra repetida");
                System.out.println("");
            }else{
                vError[error] = letra;
                devolver++;
            }
        }
        return devolver;
    }

    
    //Comprueba si el usuario a repetido una de las letras fallidas.
    public static boolean buscarErrores(String vError[], String palabra) {
        boolean comprobar = false;
        
        for (int i = 0; i < vError.length; i++) {
            if(vError.equals(palabra))
                comprobar = true;
                break;
        }
        return comprobar;
    }
    
    public static void main(String[] args) {
        int error = 0;
        int acierto = 0;
        String palabra = " ";
        boolean averiguada = false; 
        
        String palabraAlamacenada[] = new String[2];
        
        palabra = inicializarPalabra(palabraAlamacenada);

        String vError[] = new String[6];
        String vLetra[] = new String[palabra.length()];
        String vPalabras[] = new String[palabra.length()];
        
        trocearvPalabras(vPalabras);
        separarPalabra(vLetra, palabra);
        
        do{
            System.out.println("");
            dibujar(vPalabras, vError, error);
            
            //Si el usuario comete 6 fallos se cierra el programa.
            if(error == 6){
                System.out.println("");
                System.out.println("");
                System.out.println("NO TE QUEDAN INTENTOS");
                averiguada = true;
                
            //Sino, se realiza realiza la mecanica del juego
            }else{
                error = jugar(vPalabras, vLetra, vError, palabra, palabra, error);
                acierto=0;
                for(int i=0;i<vPalabras.length;i++){
                    if(vPalabras[i].equalsIgnoreCase(vLetra[i])){
                        acierto++;
                    }
                }
                
                if(acierto == vPalabras.length){
                    System.out.println("");
                    dibujar(vPalabras, vError, error);
                    System.out.println("");
                    System.out.println("");
                    System.out.println("!HAS GANADO¡");
                    averiguada = true; 
                }
            }
            
        }while(averiguada != true);
        
    }
}

/**
 * pintar menu
 * pintar palabra
 * leo palabra
 * compruebo si he ganado
 */