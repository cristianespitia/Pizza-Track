# Pizza-Track

## Descripción

Pizza-Track es una aplicación desarrollada en Java que simula el registro de pedidos de una pizzería mediante el uso de pilas implementadas con listas enlazadas.

El programa permite registrar pizzas, deshacer pedidos y rehacer pedidos utilizando dos pilas: una para los pedidos actuales y otra para los pedidos deshechos.

## Objetivo

El objetivo del proyecto es aplicar los conceptos de:

* Arreglos en Java.
* Listas enlazadas.
* Nodos.
* Pilas.
* Principio LIFO.
* Operaciones `push`, `pop`, `peek` e `isEmpty`.
* Implementación de las funciones Deshacer y Rehacer.

## Estructura del proyecto

El proyecto está compuesto por las siguientes clases:

### `Pizza.java`

Representa una pizza y contiene:

* El nombre de la pizza.
* Un arreglo fijo de tres ingredientes.

### `Nodo.java`

Representa un nodo de la lista enlazada. Cada nodo almacena:

* Una pizza.
* Una referencia al siguiente nodo.

### `Pila.java`

Implementa la estructura de datos Pila utilizando nodos enlazados.

Contiene las operaciones:

* `push()` → agrega una pizza a la cima.
* `pop()` → retira la pizza de la cima.
* `peek()` → consulta la pizza de la cima sin retirarla.
* `isEmpty()` → verifica si la pila está vacía.

### `GestionPedidos.java`

Controla las dos pilas utilizadas por el programa:

* `pedidos` → almacena los pedidos actuales.
* `deshechos` → almacena los pedidos que fueron deshechos.

También contiene las operaciones de:

* Registrar pizza.
* Deshacer.
* Rehacer.
* Mostrar el pedido actual.

### `Main.java`

Contiene el método principal del programa y muestra el menú de opciones al usuario.

## Funcionamiento

El programa presenta el siguiente menú:

```text
===== PIZZA-TRACK =====
1. Registrar Pizza
2. Deshacer
3. Rehacer
4. Mostrar Pedido Actual
0. Salir
```

### Registrar Pizza

El usuario ingresa:

1. Nombre de la pizza.
2. Ingrediente 1.
3. Ingrediente 2.
4. Ingrediente 3.

La pizza se almacena en la pila de pedidos.

### Deshacer

Al seleccionar esta opción, se utiliza `pop()` sobre la pila de pedidos y la pizza retirada se almacena en la pila de deshechos mediante `push()`.

### Rehacer

Al seleccionar esta opción, se utiliza `pop()` sobre la pila de deshechos y la pizza vuelve a la pila de pedidos mediante `push()`.

## Principio LIFO

La pila utiliza el principio **LIFO**, que significa:

**Last In, First Out**

En español:

**Último en entrar, primero en salir.**

Por ejemplo, si se registran tres pizzas:

```text
Hawaiana
Pepperoni
Carnes
```

La pizza Carnes queda en la cima y será la primera en salir cuando se realice un Deshacer.

## Cómo ejecutar el proyecto

1. Descargar o clonar este repositorio.
2. Abrir el proyecto en un entorno de desarrollo compatible con Java, como Visual Studio Code.
3. Verificar que los archivos `.java` estén dentro del mismo proyecto.
4. Ejecutar el archivo `Main.java`.
5. Utilizar las opciones del menú para registrar, deshacer y rehacer pedidos.

## Evidencias

### Registro de pizzas

Aquí se muestra el registro de una pizza con sus tres ingredientes.

![Registro de pizzas](capturas/registro.png)

### Deshacer

Aquí se muestra el funcionamiento de la opción Deshacer.

![Deshacer](capturas/deshacer.png)

### Rehacer

Aquí se muestra el funcionamiento de la opción Rehacer.

![Rehacer](capturas/rehacer.png)

## Video de sustentación

Video de sustentación del proyecto:

[Ver video de sustentación](AGREGAR_AQUI_EL_ENLACE)

## Autor

**Nombre:** Cristian Alexis Espitia Anaya

**Curso:** Estructura de Datos

**Actividad:** S35 - Manipulación de Arreglos y Listas en Java
