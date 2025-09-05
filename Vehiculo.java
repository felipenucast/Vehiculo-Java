//importación de la clase scanner para leer datos por teclado.
import java.util.Scanner;


//definición de la clase vehiculo
public class Vehiculo {

// Método main: punto de entrada del programa, es el método que la JVM busca y ejecuta para iniciar el programa
public static void main(String[] args) {

//creamos el objeto scanner para leer los datos por teclado
Scanner input = new Scanner(System.in);

//declaración de variables
String  marca;
String modelo;
String cilindrada;
String tipoCombustible; 
String capacidadPasajeros;

//Solicitamos los datos por teclado
System.out.println("Ingrese la marca del vehiculo: ");
marca = input.nextLine(); // leemos los datos
System.out.println("Ingrese el modelo del vehículo");
modelo = input.nextLine();
System.out.println("Ingrese la cilindrada");
cilindrada = input.nextLine();
System.out.println("Ingrese el tipo de combustible");
tipoCombustible = input.nextLine();
System.out.println("Ingrese la capacidad de pasajeros");
capacidadPasajeros = input.nextLine();



//mostramos los datos
System.out.println("\nLa marca ingresada es: " + marca);
System.out.println("\nEl modelo del vehiculo es; " +modelo);
System.out.println("\nLa cilindrada que ha ingresado es: " + cilindrada);
System.out.println("\nEl tipo de combustible es: " + tipoCombustible);
System.out.println("\nTiene una capacidad de " + capacidadPasajeros + " pasajeros.");


//Cerramos el scanner y liberamos el espacio en memoria
input.close();




}



}