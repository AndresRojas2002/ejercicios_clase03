import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int respuesta;
        
        do{ 
            System.out.println("por favor ingrese 3 numeros entero");
            System.out.println("ingrese el primer numero");
            var num1 = entrada.nextInt();

            System.out.println("ingrese el segundo numero");
            var num2 = entrada.nextInt();

            System.out.println("ingrese el tercer numero");
            var num3 = entrada.nextInt();

            if (num1 > num2){
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            if (num1 > num3){
                int temp = num1;
                num1 = num3;
                num3 = temp;

            }
            if (num2 > num3){
                int temp = num2;
                num2 = num3;
                num3 = temp;
            }

            System.out.println(" los numeros ordenados de menor a mayor " + num1 + ", " + num2 + ", " + num3);

            System.out.println("¿Quieres salir del programa : ");
            System.out.println("1. para salir \n 2. para continuar");
            respuesta = entrada.nextInt();







        } while ( respuesta !=1 );

        entrada.close();

    
    }
}
