public class Pizza {

    String nombre;
    String[] ingredientes;

    public Pizza(String nombre, String ingrediente1, String ingrediente2, String ingrediente3) {
        this.nombre = nombre;

        ingredientes = new String[3];

        ingredientes[0] = ingrediente1;
        ingredientes[1] = ingrediente2;
        ingredientes[2] = ingrediente3;
    }

    public void mostrarPizza() {
        System.out.println("Pizza: " + nombre);
        System.out.println("Ingredientes:");

        for (int i = 0; i < ingredientes.length; i++) {
            System.out.println("- " + ingredientes[i]);
        }
    }
}