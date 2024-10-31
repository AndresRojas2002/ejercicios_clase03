import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
         var entrada = new Scanner(System.in);
        int respuesta;

        do {
            System.out.println("por favor ingrese su edad ");
            var edad = entrada.nextInt();

            if (edad >= 0 && edad <= 5) {
                System.out.println("Primera infancia"); 
            } else if (edad >= 6 && edad <= 11) {
               System.out.println("Infancia"); 
            } else if (edad >= 12 && edad <= 18) {
                System.out.println("Adolescencia"); 
            } else if (edad >= 19 && edad <= 26) {
                System.out.println("Juventud"); 
            } else if (edad >= 27 && edad <= 59) {
              System.out.println("Adultez"); 
            } else if (edad > 59) {
              System.out.println("Persona mayor");   
            }else {
                System.out.println("edad no valida");
            }

            System.out.println("¿Quieres salir del programa : ");
            System.out.println("1. para salir \n 2. para continuar");
            respuesta = entrada.nextInt();


        }while (respuesta != 1);

        entrada.close();
    }
}
