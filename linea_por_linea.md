# Documentación Línea por Línea – Vehículo.java

Este documento explica cada línea del código del proyecto **Vehículo.java**, para entender su funcionamiento y propósito.

## Código Comentado

1. `import java.util.Scanner;`  
   - Importa la clase `Scanner` para poder leer datos ingresados por el usuario desde la consola.

2. `public class Vehiculo { ... }`  
   - Define la clase principal `Vehiculo`.

3. `public static void main(String[] args) { ... }`  
   - Método main: punto de entrada del programa, es el método que la JVM busca y ejecuta para iniciar el programa

4. `Scanner input = new Scanner(System.in);`  
   - Crea un objeto `Scanner` llamado `input` para leer datos de consola.

5. Declaración de variables:  
   - `String marca;` → guarda la marca del vehículo.  
   - `String modelo;` → guarda el modelo del vehículo.  
   - `String cilindrada;` → guarda la cilindrada.  
   - `String tipoCombustible;` → guarda el tipo de combustible.  
   - `String capacidadPasajeros;` → guarda la capacidad de pasajeros.

6. Lectura de datos por consola:  
   - `marca = input.nextLine();` → captura la marca.  
   - `modelo = input.nextLine();` → captura el modelo.  
   - `cilindrada = input.nextLine();` → captura la cilindrada. 
   - `tipoCombustible = input.nextLine();` → captura el tipo de combustible. 
   - `capacidadPasajeros = input.nextLine();` → captura la capacidad de pasajeros. 

7. Mostrar datos ingresados:  
   - `System.out.println("La marca ingresada es: " + marca);`  
   - Muestra en pantalla los valores ingresados por el usuario.

8. `input.close();`  
   - Cierra el Scanner para liberar memoria.

---
