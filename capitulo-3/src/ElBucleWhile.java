import java.util.Scanner;

public class ElBucleWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduzca el número del que quiera realizar la raíz cuadrada: ");
        double numero = scanner.nextDouble();
        double candidatoARaizCuadrada = 0.0;

        while (candidatoARaizCuadrada * candidatoARaizCuadrada <= numero){
            candidatoARaizCuadrada += 0.01;
            System.out.println("¿Será el número "+candidatoARaizCuadrada+"? Su cuadrado es: "+candidatoARaizCuadrada+" por "+candidatoARaizCuadrada);
        }
        candidatoARaizCuadrada-=0.01;
        System.out.println("La raíz cuadrada que hemos calculado es : "+candidatoARaizCuadrada);
        System.out.println("La raíz cuadrada real es: "+Math.sqrt(numero));
    }
}