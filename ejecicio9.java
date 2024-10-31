import java.util.Scanner;

public class ejecicio9 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int respuesta; 
        do{
            System.out.println("por favor ingregar la cantidad de camisas que desea comprar ");
            var cantidad = entrada.nextInt();

            if (cantidad > 0 && cantidad <= 50){
                System.out.println("precio por unidad a $ 50.000");

            }else if (cantidad > 50 && cantidad <= 100) {
            System.out.println("precio por unidad a $ 45.000");

            }else if (cantidad > 100 && cantidad <= 150) {
            System.out.println("precio por unidad a $ 40.000");
            
            }else if (cantidad > 150 && cantidad <= 200) {
                System.out.println("precio por unidad a $ 35.000");
                
            }else if (cantidad > 200) {
                System.out.println("precio por unidad a $ 25.000");

            }else {
                System.out.println("cantidad no validad");

            }

            System.out.println("¿Quieres salir del programa : ");
            System.out.println("1. para salir \n 2. para continuar");
            respuesta = entrada.nextInt();


        }while (respuesta != 1);
        entrada.close();

    }
}
