import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        while (true) {
            System.out.println(
                    "por favor ingresar un numero para hallar el cubo \" numero negativo para salir del programa\" ");
            int numero = entrada.nextInt();

            if (numero < 0) {
                break;
            }

            int cubo = numero * numero * numero;
            System.out.println("El cubo de " + numero + " es " + cubo);

        }

        entrada.close();

    }
}
