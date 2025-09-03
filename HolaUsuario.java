import java.util.Scanner; // Permite leer desde teclado

public class HolaUsuario { // Clase pública
    public static void main(String[] args) { // Método principal
        Scanner sc = new Scanner(System.in); // Scanner para entrada estándar

        System.out.print("Ingresa tu nombre: "); // Solicita nombre
        String nombre = sc.nextLine(); // Lee nombre

        System.out.print("Ingresa tu edad: "); // Solicita edad
        int edad = Integer.parseInt(sc.nextLine()); // Convierte a entero

        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años."); // Muestra el resultado

        sc.close(); // Cierra Scanner
    }
}
