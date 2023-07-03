package Colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;	//Hijo
import java.util.Set;		//Padre

public class Colecciones {

public static void main(String[] args) {
        
        
        //Declarando mi primer arreglo de Java []
        //Primero el tipo de dato que voy a almacenar, le pongo los corchetes cuadrados, despues el nombre de mi arreglo y por ultimo instancio mi arreglo. Los datos que voy  guardar en este arreglo, van dentro de {}
        
        String[] listaCompras = new String[] {"leche", "pan", "frutas"};
        
        //Impresi[on de mi array
        System.out.println(listaCompras);

        
        //forEach para imprimir cada elemento de mi lista de compras
        
        //para nuestros datos del tipo String, que se almacenan en una variable temporal llamada ProductoTemporal, que se esta llenando de un arrelgo llamado listaCompras, vas a imprimir ese productoTemporal
        for(String productoTemporal : listaCompras) {
            System.out.println(productoTemporal);
        }
        
        
    
        //Declaro mi arreglo de habitaciones de un hotel
        String[] habitaciones = new String[10];
        
        //Inicializo o asigno valores a cada indice
        habitaciones[0] = "101";
        habitaciones[1] = "102";
        habitaciones[2] = "103";
        habitaciones[3] = "104";
        habitaciones[4] = "105";
        habitaciones[5] = "106";
        habitaciones[6] = "107";
        habitaciones[8] = "109";
        habitaciones[9] = "110";
        
        
        
        //habitaciones[10] = "111"; Si tratamos de acceder a un elemento mas alla de los elementos declarados al principio, tendremos una excepcion que solo veremos cuando se ejecute el programa/
        
        
        //Cuando imprimimos un elemento que no esta definido dentro del arreglo, veremos un null. Esto pasa porque para JAVA es preferible tener un elemento nulo a uno indefinido. 
        System.out.println(habitaciones[8]);
        
        
        //En caso de querer usar un foreach para imprimir los elementos, solo se imprimiran 7 elementos. (solo itera sobre los elementos existentes).
        
        for(String habitacionTemporal : habitaciones) {
            System.out.println(habitacionTemporal);
        }//for
        
        //ArrayList para una lista de contactos
        
        //Uso la interface List que almacena Contactos (objeto), se llama listaDeContactos e instancia un arrayLista para manejar los mismos tipos de contacto(Contacto)
        
        List<Cliente> listaDeClientes = new ArrayList<>();
        
        //Primero instancio un objeto de la clase Cliente (nombre, cuenta, saldo, nip)
        Cliente Felipe = new Cliente("Felipe", "ABCD123", 156.50f, "1234");
        
        //Agrego el cliente a mi lista de clientes con el método .add
        listaDeClientes.add(Felipe);
        
        listaDeClientes.add(new Cliente("Naruto", "XXX111", 100.00f, "0000"));
        listaDeClientes.add(Felipe);
        
        System.out.println("");
        System.out.println("Lista completa");
        //Imprimir la información de mi lista (utilizar metodos)
        System.out.println(listaDeClientes);
        
//        for(Cliente cliente : listaDeClientes) {	//Utilizar metodos pq imprime el espacio de memoria NO los datos
//        	System.out.println(cliente);
//        }
        System.out.println("");
        System.out.println("Elemento en el indice 0");
        Cliente datoDeLista = listaDeClientes.get(0);
        
        System.out.println("");
        //Imprimir el elemento de la lista con un dato especifico
        System.out.println("Impresión de un elemento de la lista");
        System.out.println(datoDeLista);
        
        System.out.println("");
        //Eliminar elementos de la lista
        listaDeClientes.remove(0);
        
        System.out.println("");
        //Imprimo la información de mi lista (utilizar metodos)
        System.out.println(listaDeClientes);
        
        
        
        //Conjunto para servicios de un hotel
        //Esta información se almacena en la memoria stack (apilado)
        Set<String> roomService = new HashSet<>();
        
        //Agregamos elementos a nuestro HashSet
        roomService.add("Chilaquiles");
        roomService.add("Agua Mineral");
        roomService.add("Wi-fi");
        
        //Hotel con promoción (si pidieron agua mineral aplicamos un descuento dle 50%)
        if(roomService.contains("Agua Mineral")) {
        	System.out.println("Obtienes un descuento del 50%");
        }
        
        //Borramos toda la lista de roomService
        System.out.println(roomService);
        roomService.clear();
        System.out.println(roomService);
        
        //HashMap para mi sistema de reservas de hotel
        Map<String, Cliente> reservaHabitacion = new HashMap<>();
        
        reservaHabitacion.put("101", new Cliente("Jesus", "135JJJ", 1890.87f, "0011"));
        reservaHabitacion.put("102", new Cliente("Bugs Bunny", "BGSB12", 1890.87f, "7777"));
        
        //Impresión de una reserva
        Cliente reservaBusgBunny = reservaHabitacion.get("102");
        
        //Que pasa si imprimo la variable reservaHabitacion
        System.out.println(reservaBusgBunny);
        
    }//main

}//colecciones


/*

Colecciones


- Arrays

Un array es una estructura de datos linea que contiene elementos del mismo tipo. La longitud de un array se establece al momento de crearlo y no puede cambiar. No cuenta con metodos adicionales para agregar o eliminar elementos. Los elementos estan almacenados de forma contigua en memoria, y se puede acceder a ellos a traves de un indice. Sus principales caracteristicas son:

    1. Tamanio fijo.
    2. Acceso rapido.
    3. Coste elevado para insertar o eliminar elementos. 


- ArraysList

Es una implementación de una colección llamada List (interface superior, y se utiliza mucho para almacenar elementos de una forma dinámica.
Las principales caractersisticas de un arrayList son:
	1. Tamaño dinámico (se puede ir modificando)
	2. Acceso rápido
	3. Coste elevado para insertar o eliminar elementos


- Set

Es una estructura de datos que almacena elementos unicos sin orden especifico. Las principales caracteristicas de un set son:
	1. No hay elementos duplicados
	2. No hay orden especifico
	3. La busqueda es mas rápida(key-value)
	
-HashMap

Es una implementación de la interface Map de Java, que permite que la información se almacene en pares clave-valor. Sus principales caracteristicas son:
 1. Almacenamiento K y V
 2. Sin orden especifico
 3. Busqueda rápida
 4. Iteración rápida (for each)
 5. No sincronizado (hilos)
*/