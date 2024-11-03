import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
var entrada = new Scanner(System.in);
        int respuesta; 

        do {
            System.out.println("por favor ingrese el peso de la sandia  en kilogramos");
            var peso = entrada.nextInt();

            if (peso % 2 == 0 ){
            System.out.println(" la sandia SI se puede dividir en numeros pares ");
            }else {
                System.out.println("la sandia NO se puede dividir en numeros pares");
            }

            System.out.println("¿Quieres salir del programa : ");
            System.out.println("1. para salir \n 2. para continuar");
            respuesta = entrada.nextInt();



        }while( respuesta != 1);

        entrada.close();
    }
}
