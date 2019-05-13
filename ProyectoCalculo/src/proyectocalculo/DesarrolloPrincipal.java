package proyectocalculo;
import java.util.Scanner;

/**
 *
 * @author grupal
 */
public class DesarrolloPrincipal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /***
         *  PROYECTO CALCULO
         * Integrantes: Diana Serrano
         *              Nohelia Ludeña
         *              Roberto Narvaez
         *              Juan Yanza
         *              David Morales
         */
        Scanner entrada = new Scanner(System.in);
        // variables
        int menu, elegir;
        double inicio, fin, x, y;
        String respuesta = "Respuesta: \n   X | Y   \n";
        respuesta = String.format("%s¯¯¯¯¯¯¯¯¯¯¯¯\n", respuesta);
        do{
        System.out.println("     _______________________");
        System.out.println("    "+"|       FUNCIONES       |");
        System.out.println("     ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        System.out.println("Ejila una de las siguientes f1unciones\n");
        
        System.out.println("|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|"); // menu donde se muestras las 10 funciones
        System.out.println("| 1.)  f(x) = 2x^3 - 6x^2 +20x-1    |"); // y el usuario puede escojer una de ellas para calcular
        System.out.println("| 2.)  f(x) = 6x^2 - 3 / 25         |");
        System.out.println("| 3.)  f(x) = x^4 -8 / 3x^2+5       |");
        System.out.println("| 4.)  f(x) = x^3 +25x+8            |");
        System.out.println("| 5.)  f(x) = 3x^2 + 5x+3/2x        |");
        System.out.println("| 6.)  f(x) = 3x^3 +5x^2 +60        |");
        System.out.println("| 7.)  f(x) = x^3 +3x^2 +2x+1       |");
        System.out.println("| 8.)  f(x) = 4x*(2x^3 +20)         |");
        System.out.println("| 9.)  f(x) = (10x+3x^3 ) -2        |");
        System.out.println("| 10.) f(x) = 3x^4 +5x-35           |");
        System.out.println("|___________________________________|");
        menu = entrada.nextInt();
         inicio = 0;
         fin = 0;
         respuesta = "";
        while(menu < 1 || menu >10){ // condicion si el usuario diijta un numero que no esta en menu
        System.out.println("Seleccione una opción correcta (Del 1 al 10)\n");
        menu = entrada.nextInt();
        }
        
     
        System.out.println("Ingrese el inicio de x:\n"); // entrada de datos por el usuario del inicio de X
        inicio = entrada.nextDouble();
        System.out.println("Ingrese el fin para x:\n"); // entrada de datos por el usuario del fin de X
        fin = entrada.nextDouble();
        
          
            switch(menu){
            case 1:
                for (x = inicio; x <= fin; x++){ // desarrollo de la primera funcion
                    y = 2*Math.pow(x,3) - 6*Math.pow(x,2) +20*x-1;
                    respuesta = String.format("%s%.2f | %.2f   \n", respuesta, x, y);
                }
                System.out.printf("%s", respuesta);                   
                
                break;
                
            case 2:
                for (x = inicio; x <= fin; x++){ // desarrollo de la segunda funcion
                    y = 6*Math.pow(x,2) - 3/25;
                    respuesta = String.format("%s%.2f | %.2f   \n", respuesta, x, y);
                }
               
                System.out.printf("%s", respuesta);
                break;
            case 3:
                for (x = inicio; x <= fin; x++){ // desarrollo de la tercera funcion
                    y = (Math.pow(x,4)-8) / (3*Math.pow(x,2) +5);
                    respuesta = String.format("%s%.2f | %.2f   \n", respuesta, x, y);
                }
                System.out.printf("%s", respuesta);
                break;
            case 4:
                for (x = inicio ; x <= fin; x++){ // desarrollo de la cuarta funcion
                    y = (Math.pow(x,3)+25*x+8);
                    respuesta = String.format("%s%.2f | %.2f   \n", respuesta, x, y);
                }
                System.out.printf("%s", respuesta);
                break;
            case 5:
                for (x = inicio; x <= fin; x++){ // desarrollo de la quinta funcion
                    y= 3*Math.pow(x,2)+(5*x+3)/(2*x);
                    respuesta = String.format("%s%.2f | %.2f    \n",respuesta, x, y);
                }
                break;
            case 6:
                for (x = inicio;  x<= fin; x++) { // desarrollo de la sexta funcion
                    y = 3*Math.pow(x,3) + 5*Math.pow(x,2) + 60;
                    respuesta = String.format("%s%.2f | %.2f   \n", respuesta, x, y);
                }
                System.out.printf("%s", respuesta);
                break;
            case 7:
                for (x = inicio;  x<= fin; x++) { // desarrollo de la septima funcion
                    y = Math.pow(x,3) + 3*Math.pow(x,2) + 2*x + 1;
                    respuesta = String.format("%s%.2f | %.2f   \n", respuesta, x, y);
                }
                System.out.printf("%s", respuesta);
                break;
            case 8:
                for (x = inicio;  x<= fin; x++) { // desarrollo de la octava funcion
                    y = 4*x * (2*Math.pow(x,3) + 20);
                    respuesta = String.format("%s%.2f | %.2f   \n", respuesta, x, y);
                }
                System.out.printf("%s", respuesta);
          
                break;
            case 9:
                for (x = inicio;  x<= fin; x++) { // desarrollo de la novena funcion
                    y = (10*x + 3*Math.pow(x,3)) -2;
                    respuesta = String.format("%s%.2f | %.2f   \n", respuesta, x, y);
                }
                System.out.printf("%s", respuesta);
                
                break;
            case 10:
                 for (x = inicio; x <= fin; x++){ // desarrollo de la decima funcion
                    y = (3*Math.pow(x,4) + 5*x - 35);
                    respuesta = String.format("%s%.2f | %.2f   \n", respuesta, x, y);
                }
                System.out.printf("%s", respuesta);
                break;  
       
           }
            
            
        
        System.out.println("¿Desea continuar?\n1.- Si\n2.- No"); // si la repuesta del usuario es si, el menu aparecera de nuevo
        elegir = entrada.nextInt();
      
        while (elegir < 1 || elegir > 2){
           System.out.println("Ingrese una respuesta correcta"); // condicion si el usuario dijita alguna opcion que no esta en el menu
           elegir = entrada.nextInt();
       } 
       
        } while (elegir == 1);
        
    }
}

  
