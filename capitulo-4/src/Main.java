public class Main {
    public static void main(String[] args) {
        Informador informador = new Informador();
        informador.mostrarPorPantalla(3);

        byte unByte = 2;
        informador.mostrarPorPantalla(unByte);

        informador.mostrarPorPantalla(5.3);

        informador.mostrarPorPantalla("hola", Informador.COLOR_ROJO);
        informador.mostrarPorPantalla("hola");
    }
}