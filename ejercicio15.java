import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        while (true) {
            System.out.println("por favor ingrese un numero ");
            var numero = entrada.nextInt();

            if (numero > 0) {
                System.out.println("el numero ingresado es positivo");

            } else if (numero < 0) {
                System.out.println("el numero es negativo");
            } else if (numero == 0) {
                break;
            } else {
                System.out.println("el caracter ingresado no es un numero ");
            }

        }

        entrada.close();
    }
}
