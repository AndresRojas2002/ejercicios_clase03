import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int respuesta;

        do {
            System.out.println("por favor ingrsa una letra mayuscula o minuscula");
            var letra = entrada.next().charAt(0);

            if (Character.isUpperCase(letra)){
                System.out.println("la letra ingresada " + letra + " es mayuscula");
            } else if (Character.isLowerCase(letra)) {
                System.out.println("la letra ingresada " + letra + " es minuscula");
            }else {
                System.out.println("Error caracter no valido");
            }


            System.out.println("¿Quieres salir del programa : ");
            System.out.println("1. para salir \n 2. para continuar");
            respuesta = entrada.nextInt();

        }while (respuesta !=1);

        entrada.close();
    }
}
