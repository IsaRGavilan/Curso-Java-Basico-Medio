public class Caja<T> {
    T elemento;
    //Constructor genérico
    Caja(T elemento){
        this.elemento = elemento;
    }

    //Método para obtener objeto
    T obtenerObjeto(){
        return elemento;
    }

    <V> boolean perteneceElContenidoALaMismaClase(V otroObjeto){
        return elemento.getClass() == otroObjeto.getClass();
    }
}