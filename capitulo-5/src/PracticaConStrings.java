public class PracticaConStrings {
    public static void main(String[] args) {
        String miString = "abcde";
        char caracter;
        caracter = miString.charAt(2);
        System.out.println("El caracter en la posición 2 es: "+caracter);

        String resultadoConcat = miString.concat("fghij");
        System.out.println("El resultado de la concatenación es: "+resultadoConcat);

        String concatenacionSencilla = "abcde" +"fghij";
        System.out.println("El resultado de concatenar con el operador suma es: "+concatenacionSencilla);

        System.out.println("Son los String iguales? "+concatenacionSencilla.equals(resultadoConcat));
    }
}