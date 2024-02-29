public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        double suma = 0;
        double x = 20;
        double y = 40;
        System.out.println("La sumatoria es: " + suma);
        System.out.println("'x' es igual a " + x);
        suma = suma + x;
        System.out.println("Sumando 'x' ahora la sumatoria es: " + suma);
        System.out.println("Y es igual a " + y);
        x = x + Math.pow(y, 2);
        System.out.println("'x' luego de sumarlo a la segunda potencia de 'y' es " + x);
        suma = suma + (x/y);
        System.out.println("Finalmente al sumar la sumatoria con la division de 'x' entre 'y' da " + suma);
    }
}
