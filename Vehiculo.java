
//importación de la clase scanner para leer datos por teclado.
import java.util.Scanner;

//definición de la clase vehiculo
public class Vehiculo {

    // Método main: punto de entrada del programa, es el método que la JVM busca y
    // ejecuta para iniciar el programa
public static void main(String[] args) {

//creamos el objeto scanner para leer los datos por teclado
Scanner input = new Scanner(System.in);

//declaración de variables
String  marca;
String modelo;
String cilindrada;
String tipoCombustible; 
int capacidadPasajeros;

//Solicitamos los datos por teclado
//utilizamos do -while para validar que el usuario ingrese información.
do {
System.out.println("Ingrese la marca del vehiculo: ");
marca = input.nextLine().trim(); // leemos los datos
if (marca.isEmpty()) {
System.out.println("Error: Debe ingresar marca");
}
    
} while(marca.isEmpty());

//ingreso y validación de datos modelo del vehículo. Si no se ingresan datos, el sistema solicitará una y otra vez
do{
System.out.println("Ingrese el modelo del vehículo");
modelo = input.nextLine().trim();
if (modelo.isEmpty()){
System.out.println("Error : Debe ingresar modelo"); 
}

} while (modelo.isEmpty()); 
    
//Ingreso y validaci´´on de cilindrada. el sistema validará el correcto formao de ingreso de cilindrada segun el ejemplo
do{
System.out.println("Ingrese la cilindrada, ejemplo 2000cc");
cilindrada = input.nextLine().trim();
if (!cilindrada.matches("\\d+cc")) {
System.out.println("Error: debe ingresar cilindrada en formato ejemplo 2000cc ");  
}

}while (!cilindrada.matches("\\d+cc")); 
    
//ingreso de tipo de combustible, el sistema validará qe se ingrese una de las alternativas del ejemplo
do{
System.out.println("Ingrese el tipo de combustible: Gasolina - Diesel - Eléctrico - Híbrido");
tipoCombustible = input.nextLine().trim().toLowerCase();
if (!(tipoCombustible.equals("gasolina") ||
      tipoCombustible.equals("diesel") ||
      tipoCombustible.equals("electrico") ||
      tipoCombustible.equals("hibrido")))
   {
    System.out.println("Debe ingresar Gasolina - Diesel - Eléctrico - Híbrido");    
   }

}while(!(tipoCombustible.equals("gasolina") ||
      tipoCombustible.equals("diesel") ||
      tipoCombustible.equals("electrico") ||
      tipoCombustible.equals("hibrido")));     



//ingreso y validación de cantidad de pasajeros. El sistema validará que se ingrese un valor numerico y que este sea mayor a 0
do{
System.out.println("Ingrese la capacidad de pasajeros");
while (!input.hasNextInt()) 
{
 System.out.println("Debe ingresar un numero valido");   
 input.nextInt();
}
capacidadPasajeros = input.nextInt();
if (capacidadPasajeros <= 0) 

System.out.println("La cantidad de pasajeros debe ser mayor a 0");    
}while (capacidadPasajeros <= 0);

System.out.println("");

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




