import java.util.Scanner;

/**
 * ejecicio6
 */
public class ejecicio6 {

    public static void main(String[] args) {
         var entrada = new Scanner(System.in);
        int respuesta;

        do {
            System.out.println("por favor ingrese un numero ");
            var numero = entrada.nextInt();
            if (numero % 2 == 0  && numero % 7 == 0){
                System.out.println("el numero ingresado " + numero + " es divisible entre 2 y 7");

             } else if(numero % 2 == 0 ){
                System.out.println("el numero ingrasado " + numero + " es divicible entre 2 pero no entre 7");

             }else if (numero % 7 == 0 ){
                System.out.println("el numero ingrasado " + numero + " es divicible entre 7 pero no entre 2");

             }else {
                System.out.println("el numero ingresado " + numero + " no es divisible entre 2 ni tamnpoco entre 7");
             }
        
             System.out.println("¿Quieres salir del programa : ");
             System.out.println("1. para salir \n 2. para continuar");
             respuesta = entrada.nextInt();
    
    }while (respuesta != 1);
     entrada.close();
}
}
