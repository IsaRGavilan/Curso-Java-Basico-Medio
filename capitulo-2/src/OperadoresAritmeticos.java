public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int numeroDos = 2;
        int numeroTres = 3;

        int resultadoSuma = numeroDos + numeroTres;

        System.out.println("El resultado de sumar "+numeroDos+ " + "+numeroTres+" es: "+resultadoSuma);

        System.out.println("Esto es un String "+ " y lo concateno con este otro.");

        int resultadoResta = numeroTres - numeroDos;

        System.out.println("El resultado de restar "+numeroTres+ " - "+numeroDos+" es: "+resultadoResta);

        int numeroDosConCambioDeSigno = -numeroDos;

        System.out.println("Si aplicamos el operador resta a numeroDos obtenemos: "+numeroDosConCambioDeSigno);

        double resultadoMultiplicacion = numeroTres * 3.5;

        System.out.println("El resultado de multiplicar "+numeroTres+ " * 3.5 es: "+resultadoMultiplicacion);

        double resultadoDivision = (double)numeroDos/numeroTres;

        System.out.println("El resultado de dividir "+numeroDos+ " / "+numeroTres+" es: "+resultadoDivision);

        int resultadoModulo = numeroTres % numeroDos;

        System.out.println("El resto de dividir 3 entre 2 es: "+resultadoModulo);

    }
}