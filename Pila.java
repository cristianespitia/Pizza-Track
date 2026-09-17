public class Pila {

    Nodo cima;

    public Pila() {
        cima = null;
    }

    public void push(Pizza pizza) {
        Nodo nuevo = new Nodo(pizza);

        nuevo.siguiente = cima;
        cima = nuevo;
    }

    public Pizza pop() {
        if (isEmpty()) {
            return null;
        }

        Pizza pizza = cima.pizza;
        cima = cima.siguiente;

        return pizza;
    }

    public Pizza peek() {
        if (isEmpty()) {
            return null;
        }

        return cima.pizza;
    }

    public boolean isEmpty() {
        return cima == null;
    }

    public void vaciar() {
        cima = null;
    }
}