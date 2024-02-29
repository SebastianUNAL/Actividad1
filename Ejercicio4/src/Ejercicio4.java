import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        double x;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el numero deseado");
        x = input.nextDouble();
        System.out.println("El cuadrado del numero es igual a: " + Math.pow(x, 2) );
        System.out.println("El cubo del numero es igual a: " + Math.pow(x, 3) );
        input.close();
    }
}
