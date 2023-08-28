import java.util.ArrayList;

public class ListaDeLaCompra {
    public static void main(String[] args) {
        ArrayList<String> miListaDeLaCompra = new ArrayList<String>();
        miListaDeLaCompra.add("Patatas");
        miListaDeLaCompra.add("Leche");
        miListaDeLaCompra.add("Manzanas");

        System.out.println("Mi lista contiene: "+miListaDeLaCompra);

        ArrayList<String> miListaDeEnero = new ArrayList<>(miListaDeLaCompra);

        miListaDeEnero.add("Harina");

        System.out.println("Mi lista de la compra contiene: "+miListaDeLaCompra);
        System.out.println("Mi lista de enero: "+miListaDeEnero);

        System.out.println("El primer elemento de mi lista de enero es: "+miListaDeEnero.get(0));

        miListaDeEnero.set(1, "Leche entera");

        miListaDeEnero.remove(0);
        System.out.println("Mi lista de enero: "+miListaDeEnero);

        miListaDeEnero.remove("Manzanas");

        System.out.println("Mi lista de enero: "+miListaDeEnero);

        System.out.println(miListaDeEnero.size());
    }
}