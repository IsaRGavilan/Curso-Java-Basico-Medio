public class Main {
    public static void main(String[] args) {
        System.out.println("La variable estática apellido de la clase Hermano es: "+Hermano.apellido);

        Hermano hermanoPequeno = new Hermano();
        hermanoPequeno.nombre = "Juan";
        Hermano hermanoMayor = new Hermano();
        hermanoMayor.nombre = "Pedro";

        System.out.println("El hermano pequeño se llama "+hermanoPequeno.nombre + " "+hermanoPequeno.apellido);
        System.out.println("El hermano mayor se llama "+hermanoMayor.nombre + " "+hermanoMayor.apellido);

        hermanoPequeno.nombre = "Luis";
        System.out.println("El hermano pequeño se llama "+hermanoPequeno.nombre + " "+hermanoPequeno.apellido);
        System.out.println("El hermano mayor se llama "+hermanoMayor.nombre + " "+hermanoMayor.apellido);

        hermanoPequeno.apellido = "Díaz";
        System.out.println("El hermano pequeño se llama "+hermanoPequeno.nombre + " "+hermanoPequeno.apellido);
        System.out.println("El hermano mayor se llama "+hermanoMayor.nombre + " "+hermanoMayor.apellido);

        //Creamos juego nuevo para 4 jugadores
        Juego juego = new Juego(4);
        Juego.Contador contadorJuego = juego.new Contador();

        System.out.println("La puntuación de juego al inicio es: "+juego.obtenerPuntuacion());
        contadorJuego.incrementarPuntuacion(500);
        System.out.println("La puntuación de juego después de incrementarla es: "+juego.obtenerPuntuacion());
    }
}