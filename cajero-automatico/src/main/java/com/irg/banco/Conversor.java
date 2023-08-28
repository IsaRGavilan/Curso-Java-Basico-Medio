import java.math.BigDecimal;
import java.util.Scanner;

/*
Programa que pida por pantalla introducir una cantidad en euros y devuelva la conversión en US dólares.
El mensaje con el resultado será: *** euros equivalen a *** US dólares.
*/
public class Conversor {
    public static void main(String[] args) {

        System.out.println("Bienvenido al conversor de moneda.");
        System.out.println("Porfavor, introduzca una cantidad en euros y el programa le devolverá la conversión en dólares:");

        Scanner scanner = new Scanner(System.in);

        double cantidadIntroducida = scanner.nextDouble();
        double dolares = 1.09 * cantidadIntroducida;

        System.out.println("La cantidad introducida son: "+cantidadIntroducida+" euros, que serían: "+dolares+" dólares.");

        String eurosString = Double.toString(cantidadIntroducida);
        BigDecimal eurosBigDecimal = new BigDecimal(eurosString);

        double tasaDeCambio = 1.09;
        String tasaDeCambioString = Double.toString(tasaDeCambio);
        BigDecimal tasaDeCambioBigDecimal = new BigDecimal(tasaDeCambioString);

        BigDecimal dolaresBigDecimal = eurosBigDecimal.multiply(tasaDeCambioBigDecimal);

        System.out.println(cantidadIntroducida+ " euros equivalen a "+dolaresBigDecimal.toString()+ " US dólares.");
    }
}