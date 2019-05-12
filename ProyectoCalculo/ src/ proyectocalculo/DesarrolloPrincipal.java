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
        
        int menu, elegir;
        double inicio, fin, x, y;
        String respuesta = "Respuesta: \n   X | Y   \n";
        respuesta = String.format("%s¯¯¯¯¯¯¯¯¯¯¯¯\n", respuesta);
        do{
        System.out.println("     _______________________");
        System.out.println("    "+"|       FUNCIONES       |");
        System.out.println("     ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        System.out.println("Ejila una de las siguientes f1unciones\n");
        
        System.out.println("|¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|");
        System.out.println("| 1.) f(x) = 2x^3 - 6x^2 +20x-1     |");
        System.out.println("| 2.) f(x) = 6x^2 - 3 / 25          |");
        System.out.println("| 3.) f(x) = x^4 -8 / 3x^2+5        |");
        System.out.println("| 4.) f(x) = x^3 +25x+8             |");
        System.out.println("| 5.) f(x) = 3x^2 + 5x+3/2x         |");
        System.out.println("| 6.) f(x) = 3x^3 +5x^2 +60         |");
        System.out.println("| 7.) f(x) = x^3 +3x^2 +2x+1        |");
        System.out.println("| 8.) f(x) = 2x*(x^3 +23)           |");
        System.out.println("| 9.) f(x) = (10x+3x^3 ) -2         |");
        System.out.println("| 10.) f(x) = 3^3x+2 +5x-35         |");
        System.out.println("|___________________________________|");
        menu = entrada.nextInt();
        
        while(menu < 1 || menu >10){
        System.out.println("Seleccione una opción correcta\n");
        menu = entrada.nextInt();
        }
        
     
        System.out.println("Ingrese el inicio de x:\n");
        inicio = entrada.nextDouble();
        System.out.println("Ingrese el fin para x:\n");
        fin = entrada.nextDouble();
        
          
            switch(menu){
            case 1:
                for (x = inicio; x <= fin; x++){
                    y = 2*Math.pow(x,3) - 6*Math.pow(x,2) +20*x-1;
                    respuesta = String.format("%s%.2f | %.2f   \n", respuesta, x, y);
                }
                System.out.printf("%s", respuesta);                   
                
                break;
            case 2:
                for (x = inicio; x <= fin; x++){
                    y = 6*Math.pow(x,2) - 3/25;
                    respuesta = String.format("%s%.2f | %.2f   \n", respuesta, x, y);
                }
                System.out.printf("%s", respuesta);
                break;
            case 3:
                for (x = inicio; x <= fin; x++){
                    y = (Math.pow(x,4)-8) / (3*Math.pow(x,2) +5);
                    respuesta = String.format("%s%.2f | %.2f   \n", respuesta, x, y);
                }
                System.out.printf("%s", respuesta);
                break;
            case 4:
                for (x = inicio ; x <= fin; x++){
                    y = (Math.pow(x,3)+25*x+8);
                    respuesta = String.format("%s%.2f | %.2f   \n", respuesta, x, y);
                }
                System.out.printf("%s", respuesta);
                break;
            case 5:
                for (x = inicio; x <= fin; x++){
                    y= 3*Math.pow(x,2)+(5*x+3)/(2*x);
                    respuesta = String.format("%s%.2f | %.2f    \n",respuesta, x, y);
                }
                break;
            case 6:
                for (x = inicio;  x<= fin; x++) {
                    y = 3*Math.pow(x,3) + 5*Math.pow(x,2) + 60;
                    respuesta = String.format("%s%.2f | %.2f   \n", respuesta, x, y);
                }
                System.out.printf("%s", respuesta);
                break;
            case 7:
                for (x = inicio;  x<= fin; x++) {
                    y = Math.pow(x,3) + 3*Math.pow(x,2) + 2*x + 1;
                    respuesta = String.format("%s%.2f | %.2f   \n", respuesta, x, y);
                }
                System.out.printf("%s", respuesta);
                break;
            case 8:
          
                break;
            case 9:
                
                break;
            case 10:
                
                break;  
        
           }
            
            
        
        System.out.println("¿Desea continuar?\n1.- Si\n2.- No");
        elegir = entrada.nextInt();
      
        while (elegir < 1 || elegir > 2){
           System.out.println("Ingrese una respuesta correcta");
           elegir = entrada.nextInt();
       } 
       
        } while (elegir == 1);
        
    }
}

  
