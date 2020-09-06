import java.util.Scanner;

public class SueldoMasIVA {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        double valorIva = 0.00;
        //System.out.println("Hola!!");
        System.out.println("Ingrese el sueldo: ");
        float d = input.nextFloat();

        double sueldoMasIva = (d + calcularIva(d));
        System.out.println("El sueldo mas el IVA es: " + sueldoMasIva);
    }

    public static double calcularIva(double sueldo) {

        double iva = sueldo * 0.22;
        return iva;
    }
}