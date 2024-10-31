import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int  respuesta;

       do{
        System.out.println("por favor ingrasa tres numeros"); 

        System.out.println("ingresa el  primer numero");
        var num1 = entrada.nextInt();

        System.out.println("ingresa el  sugundo numero");
        var num2 = entrada.nextInt();

        System.out.println("ingresa el  tercer numero");
        var num3 = entrada.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("el numero " + num1+ " es mayor que " +num2+", "+num3);
            
        }else if (num2 >= num1 && num2 >= num3) {
            System.out.println("el numero " + num2+ " es mayor que " +num1+", "+num3);
            
        } else{
            System.out.println("el numero " + num3+ " es mayor que " +num1+", "+num2);
        }

        System.out.println("¿Quieres salir del programa : ");
        System.out.println("1. para salir \n 2. para continuar");
          respuesta = entrada.nextInt();

    } while (respuesta != 1);

    entrada.close();
}

}
