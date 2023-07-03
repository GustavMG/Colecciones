package Colecciones;

public class Cliente {
	
	//1. Atributos
	
	public String nombre;
	private String cuentaBancaria;
	private float saldo;
	private String nip;
	
	//2. Constructor
	public Cliente(String nombre, String cuentaBancaria, float saldo, String nip) {
		this.nombre = nombre;
		this.cuentaBancaria = cuentaBancaria;
		this.setSaldo(saldo);
		this.nip = nip;
	}
	
	//3. Metodos
	public void mostrarInfoCliente() {
		System.out.println("El nombres es: " + nombre);
		System.out.println("La cuenta bancaria es: " + cuentaBancaria);
		System.out.println("El saldo actual es: $" + getSaldo());
		System.out.println("El nip es: " + nip);
		System.out.println();
	}
	
	//Getter y Setters
	public String getCuentaBancaria() {
		return cuentaBancaria;
	}

	public void setCuentaBancaria(String cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	
}
/**
 * Encapsulamiento (1 de los 4 pilares de la POO)
 * 
 * Tiene que ver con la forma en como ocultamos algunos detalles de nuestra clase (atributos y metodos). La gran ventaja de hacer esto es que podemos proteger los datos y el comportamiento de una clase. Cuando utilizamos los modificadores de acceso, podemos controlar la forma en como se accede a los datos y como interactuamos con ellos. 
 * 
 * Modificadores de acceso
 * 
 * 	- public
 * 	- private
 * 	- protected
 * 	- default (sin modificador de acceso)
 * 
 * Con esto buscamos evitar:
 * 
 * 	- Reasignación de valores
 * 		float cuenta = 157,478.75f
 * 		cuenta = 0.00f;
 * 
 * 
 * Cuando declaramos nuestros atributos como privados, se impide el acceso a esta información (no podremos imprimirla en consola, ni mucho menos modificarla).
 * 
 * jesus.nombre = si puedo acceder pq la información esta pública
 * jesus.saldo = NO se muestra pq la información esta privada
 * 
 * Para solventar esto, usamos los getters y setters. El getter nos permite acceder al dato por medio de un método público llamado get, y tambien podemos modificar la información por medio del set(método público).
 * 
 * jesus.getCuentaBancaria = SI puedo acceder a la información
 * jesus.setCuentaBancaria = SI puedo modificar a la información
 * 
 * 
 * Ventajas del encapsulamiento
 * 
 * 	- Protección de datos: Cuando dejamos los datos enprivado se evita que se sobreescriban, que se accedan directamente a ellos y se modifiquen de manera incontrolada.
 * 
 * 	- Control de acceso: Podemos usar validaciones o valores booleanos para tener acceso o no a la información (que un administrador pueda usar un setter para modificar algún dato en especifico).
 * 
 * 	- Flexibilidad y mantenimiento: Podemos cambiar la implementacion interna de nuestras clases (modificar el acceso, etc), sin modificar el codigo externo que la utiliza (herencia, etc.).
 * 
 * 	- Abstraccion: El encapusulamiento nos permite ocultar los detalles internos de una clase, y nos proporciona un enfoque "mas limpio" sobre lo que hace una clase, mas no como lo hace. 
 * */
