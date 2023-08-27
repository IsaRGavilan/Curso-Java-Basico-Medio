public class Literales {
    public static void main(String[] args) {
        int enteroDecimal = 100;
        int enteroOctal = 0100;
        int enteroHexadecimal = 0x100;

        System.out.println("enteroHexadecimal es: "+enteroHexadecimal+ " en decimal.");

        long numeroLong = 100L;
        double numeroDouble = 2.5;
        float numeroFloat = 2.5f;
        int numeroConGuiones = 25_258_236;

        System.out.println("El número numeroConGuiones es: "+numeroConGuiones);

        char miChar = 'b';
        char miOtroChar = '\u0062';

        System.out.println("El carácter miOtroChar es: "+miOtroChar);

        char comillaSimpole = '\'';

        String stringLiteral = "Esto es un literal.";

        boolean booleanVeradero = true;

        String stringNulo = null;

    }
}