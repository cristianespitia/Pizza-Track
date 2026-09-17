public class GestionPedidos {

    Pila pedidos;
    Pila deshechos;

    public GestionPedidos() {
        pedidos = new Pila();
        deshechos = new Pila();
    }

    public void registrarPizza(Pizza pizza) {
        pedidos.push(pizza);

        // Si registramos una nueva pizza,
        // ya no podemos rehacer los pedidos anteriores.
        deshechos.vaciar();

        System.out.println("Pizza registrada correctamente.");
    }

    public void deshacer() {
        if (pedidos.isEmpty()) {
            System.out.println("No hay pedidos para deshacer.");
            return;
        }

        Pizza pizza = pedidos.pop();
        deshechos.push(pizza);

        System.out.println("Pedido deshecho.");
    }

    public void rehacer() {
        if (deshechos.isEmpty()) {
            System.out.println("No hay pedidos para rehacer.");
            return;
        }

        Pizza pizza = deshechos.pop();
        pedidos.push(pizza);

        System.out.println("Pedido rehecho.");
    }

    public void mostrarPedidoActual() {
        if (pedidos.isEmpty()) {
            System.out.println("No hay pedidos registrados.");
            return;
        }

        System.out.println("\nPedido actual:");

        Pizza pizza = pedidos.peek();
        pizza.mostrarPizza();
    }
}