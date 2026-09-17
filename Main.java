import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        GestionPedidos gestion = new GestionPedidos();

        int opcion;

        do {

            System.out.println("\n===== PIZZA-TRACK =====");
            System.out.println("1. Registrar Pizza");
            System.out.println("2. Deshacer");
            System.out.println("3. Rehacer");
            System.out.println("4. Mostrar Pedido Actual");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Ingrese el nombre de la pizza: ");
                    String nombre = teclado.nextLine();

                    System.out.print("Ingrese el ingrediente 1: ");
                    String ingrediente1 = teclado.nextLine();

                    System.out.print("Ingrese el ingrediente 2: ");
                    String ingrediente2 = teclado.nextLine();

                    System.out.print("Ingrese el ingrediente 3: ");
                    String ingrediente3 = teclado.nextLine();

                    Pizza pizza = new Pizza(
                            nombre,
                            ingrediente1,
                            ingrediente2,
                            ingrediente3
                    );

                    gestion.registrarPizza(pizza);

                    break;

                case 2:

                    gestion.deshacer();

                    break;

                case 3:

                    gestion.rehacer();

                    break;

                case 4:

                    gestion.mostrarPedidoActual();

                    break;

                case 0:

                    System.out.println("Programa finalizado.");

                    break;

                default:

                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 0);

        teclado.close();
    }
}