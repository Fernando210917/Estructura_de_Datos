public class Main {
    public static void main(String[] args){
        ListaCircularDoblementeEnlazada ListaCircularDoblementeEnlazada = new ListaCircularDoblementeEnlazada();
        System.out.println(ListaCircularDoblementeEnlazada.estaVacio());
        for (int i = 0; i <= 6; i++) {
            ListaCircularDoblementeEnlazada.insertarFinal(i);
        }
        ListaCircularDoblementeEnlazada.mostrar();

        ListaCircularDoblementeEnlazada.eliminarFinal();
        ListaCircularDoblementeEnlazada.eliminarFinal();
        ListaCircularDoblementeEnlazada.eliminarFinal();
        ListaCircularDoblementeEnlazada.eliminarFinal();
        ListaCircularDoblementeEnlazada.eliminarFinal();
        ListaCircularDoblementeEnlazada.mostrar();

        ListaCircularDoblementeEnlazada.mostrarAdelante(6);
        ListaCircularDoblementeEnlazada.mostrarAtras(6);
    }
}
