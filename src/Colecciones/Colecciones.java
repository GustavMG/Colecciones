package Colecciones;

import java.util.HashSet;	//Hijo
import java.util.Set;		//Padre

public class Colecciones {

	public static void main(String[] args) {
		
		//Declarando mi primer arreglo en JAVA []
		//Primero el tipo de dato que voy a almacenar, despues el nombre de mi arreglo y por ultimo la instancia
		String[] myArray = new String[] {};
		String[] listaCompras = new String[] {"leche", "pan", "frutas"};
		
		//Impresión de mi array
		System.out.println(listaCompras);
		
		//For each para imprimir cada elemento de mi lista de compras
		//Para nuestros datos del tipo String, que se almacenan en una variable temporal llamada productoTemporal, que se esta llenando de un arreglo llamado "lista de compras", vas a imprimir ese producto
		for(String productoTemporal: listaCompras) {
			System.out.print("El producto de la lista es: ");
			System.out.println(productoTemporal);
		}
		
		//Declaro mi arreglo de habitaciones de un hotel
		String [] habitaciones = new String[10];
		
		//Inicializo o asigno valores a cada indice
		habitaciones[0]= "101";
		habitaciones[1]= "102";
		habitaciones[2]= "103";
		habitaciones[3]= "104";
		habitaciones[4]= "105";
		habitaciones[5]= "106";
		habitaciones[6]= "107";
//		habitaciones[7]= "108";
//		habitaciones[8]= "109";
//		habitaciones[9]= "110";
		/**
		 * Si tratamos de acceder a un elemento que NO exista en el array declarado como habitaciones[11],
		 * tendremos una excepción que SOLO veremos cuando se ejecute el programa
		 */
		
		/**
		 * Cuando imprimimo un elemento que NO est definido dentro del arreglo, veremos un NULL, esto pasa pq para JAVA es PREFERIBLE tener un
		 * elemento NULL a uno UNDEFINED
		 */
		System.out.println(habitaciones[8]);
				

	}

}

/**
 * Colecciones
 * 
 * -Arrays
 * 
 * Un array es una estructura de datos linea que contiene elementos del mismo tipo. La longitud de un array se establece al momento de crearlo y no puede cambiar. No cuenta con metodos adicionales para agregar o eliminar elementos. Los elementos estan almacenados de forma contigua en memoria, y se puede acceder a ellos a traves de un indice. Sus principales caracteristicas son:
 * 	
 * 	1. Tamaño fijo
 * 	2. Acceso rápido
 * 	3. Coste elevado para insertar o eliminar elementos.
 */