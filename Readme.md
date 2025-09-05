# Proyecto Java – Consola: Vehículo

## 1. Información General
**Instituto:** AIEP
**Asignatura:** Desarrollo de Aplicaciones Móviles  
**Estudiante:** Felipe Núñez  
**Actividad:** Desarrollo de un programa Java que solicita y muestra datos de un vehículo mediante consola, sin usar IDE.  

---

## 2. Introducción
Dentro del Desarrollo de Aplicaciones Moviles, uno de los principales objetivos es adquirir las competencias necesarias para estructurar, organizar y documentar proyectos de software. En dicho contexto, se desarrolló una pequeña aplicación en java, cuyo propósito principal fue:
*	La utilización de entrada de datos por consola
*	El manejo de distintos tipos de variables.
*	La correcta documentación del código mediante comentarios
*	La integración del proyecto con la herramienta de control de versiones GitHub.

Esto nos permite no solo reforzar la lógica de programación, si no también comprender la importancia de la documentación y la trazabilidad del proceso de desarrollo, competencias necesarias para el trabajo en proyectos de mayor envergadura en el ámbito de Desarrollo de Aplicaciones Móviles.

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

        //Ingreso y Lectura de datos por consola
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

        // Cerramos Scanner para liberar espacio en memoria
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


