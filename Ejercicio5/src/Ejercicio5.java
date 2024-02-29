import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) throws Exception {
        double radio;
        double area;
        double longitud_circunferencia;
        double diametro;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        radio = input.nextDouble();
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es de: " + area);
        diametro = radio * 2;
        longitud_circunferencia = Math.PI * diametro;
        System.out.println("El diametro es de: " + diametro);
        System.out.println("La longitud de la circunferencia es de: " + longitud_circunferencia);
        input.close();        
    }
}
