public class OperadoresRelacionales {
    public static void main(String[] args) {
        boolean esUnoMayorQueDos = 1 > 2;
        System.out.println("¿Es cierto que 1 es mayor que 2? " +esUnoMayorQueDos);

        boolean esUnoComaCincoMenorQueSieteComaDos = 1.5 < 7.2;

        boolean esOchoMayorOIgualQueOcho = 8 >= 8;

        System.out.println("¿Es 8 mayor o igual que 8? "+esOchoMayorOIgualQueOcho);

        boolean esTresComaUnoIgualQueTresComaDos = 3.1 == 3.2;

        System.out.println("¿Es 3.1 igual que 3.2? "+esTresComaUnoIgualQueTresComaDos);

        boolean esCuatroDiferenteDeCuatro = 4 != 4;

        System.out.println("¿Es 4 diferente de 4? "+esCuatroDiferenteDeCuatro);

        String perro = "perro";
        String gato = "gato";

        System.out.println("¿Es cierto que el String perro es igual al String gato? "+perro == gato);
    }
}