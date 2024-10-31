import java.util.Scanner;

public class ejecicio5 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int respuesta;

        do {
            System.out.println("por favor ingrese una letra ");
            var letra = entrada.next().charAt(0);

            if (Character.isLetter(letra)) {
                switch (letra) {
                    case 'a', 'e', 'i', 'o', 'u' -> {
                        System.out.println("la letra ingresada " + letra + " es una vocal");
                    }
                    default -> {
                        System.out.println("la letra ingresada " + letra + " es una consonante");
                    }

                }

            } else {
                System.out.println("error: caracter no valido");
            }
            System.out.println("¿Quieres salir del programa : ");
            System.out.println("1. para salir \n 2. para continuar");
            respuesta = entrada.nextInt();

        } while (respuesta != 1);
        entrada.close();

    }
}