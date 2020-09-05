import java.util.Scanner;

public class Practico_Metodos {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

         // Multiplica dos enteros
        /*int producto=0;


        System.out.println ("Ingrese el primer numero:");

        int n1 = input.nextInt();

        System.out.println ("Ingrese el segundo numero:");
        int n2 = input.nextInt();

        producto= multipEnteros(n1,n2);
        System.out.println ("El producto de ambos numeros es: "+ producto);


    }*/
        //Calcula el sueldo + el IVA

        double valorIva = 0.00;
        System.out.println("Ingrese el sueldo: ");
        float d = input.nextFloat();

        double sueldoMasIva=(d+calcularIva(d));
        System.out.println("El sueldo mas el IVA es: " + sueldoMasIva);
    }

        //3.	Método que reciba dos enteros y retorne la multiplicación de la misma.

        public static int multipEnteros ( int num1, int num2){
            int mult = (num1 * num2);
            return mult;
        }

        //12.	Método calcularIva: Calcula el IVA (22%) dado un número float llamado sueldo, recibido por parámetro.
        // Sugerencia: utilizar variables estáticas.

        public static double calcularIva ( double sueldo){

            double iva = sueldo * 0.22;
            return iva;

        }

    }
