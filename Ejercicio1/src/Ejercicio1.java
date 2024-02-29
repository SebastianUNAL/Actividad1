import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        int edjuan;
        int edalberto;
        int edana;
        int edmama;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la edad de Juan: ");
        edjuan = input.nextInt();
        edalberto = (edjuan*2/3);
        edana = (edjuan*4/3);
        edmama = (edjuan + edalberto + edana);
        System.out.println("La edad de Juan es = " + edjuan);
        System.out.println("La edad de Alberto es = " + edalberto);
        System.out.println("La edad de Ana es = " + edana);
        System.out.println("La edad de la Mama es = " + edmama);
        input.close(); 
    }
}
