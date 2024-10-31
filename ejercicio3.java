import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int respuesta;

        do {
            System.out.println("por favor ingrese un numero ");
            var numero = entrada.nextInt();

            if (numero % 2 == 0) {
                System.out.println("el numero ingresado " + numero + " es par");
            } else {
                System.err.println("el numero ingresado " + numero + " es impar");
            }
            System.out.println("¿Quieres salir del programa : ");
            System.out.println("1. para salir \n 2. para continuar");
            respuesta = entrada.nextInt();

        } while (respuesta != 1);

        entrada.close();
    }
}
