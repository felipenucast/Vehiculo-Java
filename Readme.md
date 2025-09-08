# Proyecto Java – Consola: Vehículo

## 1. Información General
**Instituto:** AIEP
**Asignatura:** Desarrollo de Aplicaciones Móviles  
**Estudiante:** Felipe Núñez  
**Actividad:** Desarrollo de un programa Java que solicita y muestra datos de un vehículo mediante consola, sin usar IDE.  

---

## 2. Introducción
Dentro del Desarrollo de Aplicaciones Moviles, uno de los principales objetivos es adquirir las competencias necesarias para estructurar, organizar y documentar proyectos de software. En dicho contexto, se desarrolló una pequeña aplicación en java, cuyo propósito principal fue simular el registro y la visualización de los datos de un vehículo mediante consola. Durante el desarrollo, se consideró el análisis de caso de uso; se identificaron las necesidades de entrada de datos, los tipos de variables requeridos y la manera más clara de mostrar la información al usuario, asegurando que el programa cumpliera con su propósito funcional.

*	La utilización de entrada de datos por consola
*	El manejo de distintos tipos de variables.
*	La correcta documentación del código mediante comentarios
*	La integración del proyecto con la herramienta de control de versiones GitHub.

Esto nos permite no solo reforzar la lógica de programación, si no también comprender la importancia de la documentación y la trazabilidad del proceso de desarrollo, y en análisis previo del caso, competencias necesarias para el trabajo en proyectos de mayor envergadura en el ámbito de Desarrollo de Aplicaciones Móviles.


## 3. Código Fuente con comentarios

```java

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



##4. Compilación y ejecución


*	Ejecutamos CMD o powershell.
*	Nos ubicamos en la carpeta del proyecto
*	Para compilar el programa ejecutamos “javac Vehículo.java”
*	Se crea el Vehiculo.class, - Archivo bytecode resultante de la compilación.
*	El bytecode – es el código, intermediario que la JVM puede ejecutar.
*	Ejecutamos Vehiculo.java para desplegar el programa. 

##Ejemplo ejecución

Ingrese la marca del vehiculo:
Toyota
Ingrese el modelo del vehículo
Corolla
Ingrese la cilindrada
2.0
Ingrese el tipo de combustible
Gasolina
Ingrese la capacidad de pasajeros
5

La marca ingresada es: Toyota
El modelo del vehiculo es: Corolla
La cilindrada que ha ingresado es: 2.0
El tipo de combustible es: Gasolina
Tiene una capacidad de 5 pasajeros.


##6. Requerimientos

Funcionales:

*Leer datos del vehículo: marca, modelo, cilindrada, tipo de combustible, capacidad de pasajeros.
*Mostrar todos los datos ingresados por consola.

No funcionales:

*Entrada y salida por consola (no IDE).
*Comentarios claros en cada línea del cdigo.
*Código ejecutable desde línea de comando (javac y java).


