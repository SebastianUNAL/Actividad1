public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        double horas = 48;
        double valorhora = 5000;
        double retencion;
        double salario_bruto;
        double salario_neto;
        salario_bruto = horas * valorhora;
        retencion = salario_bruto * (12.5 / 100);
        salario_neto = salario_bruto - retencion;
        System.out.println("Se trabajaron "+horas+" horas");
        System.out.println("La hora trabajada tiene un valor de " + valorhora);
        System.out.println("El salario bruto es de " + salario_bruto);
        System.out.println("La cantidad total retenida en la fuente es de " + retencion);
        System.out.println("Finalmente, el salario neto del trabajador es de " + salario_neto);
    }
}
