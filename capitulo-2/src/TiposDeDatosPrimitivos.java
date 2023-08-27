import java.io.InputStream;

public class TiposDeDatosPrimitivos {
    public static void main(String[] args) {
        //Tipo byte
        byte elMenorByte = Byte.MIN_VALUE;
        byte elMayorByte = Byte.MAX_VALUE;

        System.out.println("El tipo byte es un número entero de 8 bits con signo. Está comprendido entre "+elMenorByte+" y "+elMayorByte);

        //Tipo short
        short elMenorShort = Short.MIN_VALUE;
        short elMayorShort = Short.MAX_VALUE;

        System.out.println("El tipo short es un número entero de 16 bits con signo. Está comprendido entre "+elMenorShort+ " y "+elMayorShort);

        //Tipo int
        int elMenorInt = Integer.MIN_VALUE;
        int elMayorInt = Integer.MAX_VALUE;

        System.out.println("El tipo int es un número entero de 32 bits con signo. Está comprendido entre "+elMenorInt+ " y "+elMayorInt);

        //Tipo long
        long elMenorLong = Long.MIN_VALUE;
        long elMayorLong = Long.MAX_VALUE;

        System.out.println("El tipo long es un número entero de 64 bits con signo. Está comprendido entre "+elMenorLong+ " y "+elMayorLong);

        //Tipo float
        float elMenorFloat = Float.MIN_VALUE;
        float elMayorFloat = Float.MAX_VALUE;
        float variableFloat = 5.6f;

        System.out.println("El tipo float es un número decimal. Está comprendido entre "+elMenorFloat+ " y "+elMayorFloat);
        System.out.println("Un ejemplo de float sería: "+variableFloat);

        //Tipo double
        double elMenorDouble = Double.MIN_VALUE;
        double elMayorDouble = Double.MAX_VALUE;
        double variableDouble= 5.6;

        System.out.println("El tipo double es un número decimal. Está comprendido entre "+elMenorDouble+ " y "+elMayorDouble);
        System.out.println("Un ejemplo de float sería: "+variableDouble);

        //Tipo char
        char a = 'a';
        System.out.println("Un ejemplo de char sería: "+a);

        //Tipo boolean
        boolean trueBoolean = true;
        boolean falseBoolean = false;

        System.out.println("Un boolean puede ser: "+trueBoolean+ " o "+falseBoolean);
    }
}