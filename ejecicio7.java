import java.util.Scanner;

public class ejecicio7 {
    public static void main(String[] args) {
       var entrada = new Scanner(System.in);
        int respuesta; 

        do {
            System.out.println("por favor ingrese tres numeros, que representan una longitud de una linea  ");

            System.out.println("ingresa el primer numero");
            var num1 = entrada.nextInt();

            System.out.println("ingresa el segundo numero");
            var num2 = entrada.nextInt();
            
            System.out.println("ingresa el tercer numero");
            var num3 = entrada.nextInt();

            if (num1 + num2 > num3 && num1 + num3 > num2 && num2 + num3 > num1){
                System.out.println("con estos tres numeros \"" + num1+", " + num2+ ", " +num3+ "\" se puede formar un triangulo");
            }else{
                System.out.println("con estos tres numeros \"" + num1+", " + num2+ ", " +num3+ "\" No se puede formar un triangulo");
            }

            System.out.println("¿Quieres salir del programa : ");
            System.out.println("1. para salir \n 2. para continuar");
            respuesta = entrada.nextInt();


        }while(respuesta !=0);
        entrada.close();
    }
}
