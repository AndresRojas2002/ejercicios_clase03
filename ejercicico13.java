import java.util.Scanner;

public class ejercicico13 {

    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int respuesta;

        do {
        System.out.println("por favor ingrese que hermano llego primero  a la reunion \" 1 para el mayor, 2 para el del medio, 3 para el menor \" ");
            int her1 = entrada.nextInt();

            System.out.println("por favor ingrese que hermano llego de segundo  a la reunion \" 1 para el mayor, 2 para el del medio, 3 para el menor \" ");
            int her2 = entrada.nextInt();

            var mayor = 1;
            var medio = 2;
            var menor = 3;

            if ( her1 ==  mayor && her2 == medio){
                System.out.println(" el hermano que llego tarde a la reunio es el hemano menor " + menor );
            }
            if ( her1 ==  medio && her2 == mayor){
                System.out.println(" el hermano que llego tarde a la reunio es el hemano menor "+ menor);
            }
            if ( her2 == mayor  && her1 == menor){
                System.out.println(" el hermano que llego tarde a la reunio es el hemano medio " + medio );
            }
            if ( her1 ==  menor && her2 == mayor){
                System.out.println(" el hermano que llego tarde a la reunio es el hemano medio " + medio);
            }
            if ( her1 ==  medio && her2 == menor){
                System.out.println(" el hermano que llego tarde a la reunio es el hemano mayor " + mayor);
            }
            if ( her1 ==  menor && her2 == medio){
                System.out.println(" el hermano que llego tarde a la reunio es el hemano mayor "+ mayor);
            }



            System.out.println("¿Quieres salir del programa : ");
            System.out.println("1. para salir \n 2. para continuar");
            respuesta = entrada.nextInt();

        } while (respuesta != 1);

        entrada.close();
    }
}
