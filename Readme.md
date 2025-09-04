# Proyecto Java – Consola: Vehículo

## 1. Información General
**Instituto:** AIEP – Educación Online  
**Asignatura:** Desarrollo de Aplicaciones Móviles  
**Estudiante:** Felipe Núñez  
**Actividad:** Desarrollo de un programa Java que solicita y muestra datos de un vehículo mediante consola, sin usar IDE.  

---

## 2. Introducción
Este proyecto tiene como objetivo demostrar la **creación, compilación y ejecución de un programa Java desde consola**, sin utilizar herramientas IDE.  
El programa permite al usuario ingresar información de un vehículo y muestra todos los datos ingresados, cumpliendo con los requerimientos del caso de estudio de una distribuidora de alimentos.

---

## 3. Código Fuente con comentarios

```java
// Importamos Scanner para leer datos desde consola
import java.util.Scanner;

// Clase principal Vehiculo
public class Vehiculo {

    // Método main: punto de entrada del programa, es el método que la JVM busca y ejecuta para iniciar el programa
    public static void main(String[] args) {

        // Creamos Scanner para capturar datos del usuario
        Scanner input = new Scanner(System.in);

        // Variables para almacenar los datos ingresados
        String marca;              // Marca del vehículo
        String modelo;             // Modelo del vehículo
        String cilindrada;         // Cilindrada como texto
        String tipoCombustible;    // Tipo de combustible
        String capacidadPasajeros; // Capacidad de pasajeros como texto

        // Lectura de datos por consola
        System.out.println("Ingrese la marca del vehiculo: ");
        marca = input.nextLine();

        System.out.println("Ingrese el modelo del vehículo");
        modelo = input.nextLine();

        System.out.println("Ingrese la cilindrada");
        cilindrada = input.nextLine();

        System.out.println("Ingrese el tipo de combustible");
        tipoCombustible = input.nextLine();

        System.out.println("Ingrese la capacidad de pasajeros");
        capacidadPasajeros = input.nextLine();

        // Mostramos los datos ingresados
        System.out.println("\nLa marca ingresada es: " + marca);
        System.out.println("El modelo del vehiculo es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + tipoCombustible);
        System.out.println("Tiene una capacidad de " + capacidadPasajeros + " pasajeros.");

        // Cerramos Scanner
        input.close();
    }
}


##4. Compilación y ejecución
Código / comandos de consola CMD o Powershell

# Navegar a la carpeta del proyecto
cd C:\Users\felip\Desktop\Sumativa1

# Compilar el código Java
javac Vehiculo.java

Al compilar, se genera el archivo .class

# Ejecutar el programa
java Vehiculo


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


