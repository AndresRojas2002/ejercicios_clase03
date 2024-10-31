import java.util.Scanner;

public class ejecicio10 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int respuesta = 0;

        do { 
            System.out.println("por favor ingrese un numero entero del 1 al 12, lo que corresponde con un mes del año ");
            var mes = entrada.nextInt(); 
            int dia;
          switch (mes) {
            case 1,3,5,7,8,10,12 -> dia = 31;
            case 4,6,9,11 -> dia = 30;
            case 2 -> dia = 28;
            default -> {
                System.out.println("Mes inválido: " + mes);
                continue; 
            }
           };
           System.out.println("el numero de dias del mes " + mes + " es " + dia);

           System.out.println("¿Quieres salir del programa : ");
           System.out.println("1. para salir \n 2. para continuar");
           respuesta = entrada.nextInt();
           


        }while (respuesta != 1);

        entrada.close();
    }

    }

