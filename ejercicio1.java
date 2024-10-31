import java.util.Scanner;

/**
 * ejercicio1
 */
public class ejercicio1 {

    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int respuesta;


      do{  System.out.println("por favor ingrasa un numero");
        var numero = entrada.nextInt();
        

        if (numero > 0) {
            System.out.println("el numero ingresado " + numero + "  es positivo");
            
        }else if( numero < 0) {
            System.out.println("el nuemero ingresado " + numero + " es negativo");
           
        } else {
            System.out.println("el numero ingresado " + numero + " es cero");
        
        }
        System.out.println("¿Quieres salir del programa : ");
        System.out.println("1. para salir \n 2. para continuar");
          respuesta = entrada.nextInt();
    } while (respuesta != 1);

        entrada.close();

    }
}
