import java.util.Scanner; 

public class VehiculoApp {     public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 

        System.out.print("Marca: ");
        String marca = sc.nextLine(); 

        System.out.print("Modelo: ");
        String modelo = sc.nextLine(); 

        System.out.print("Cilindrada: "); 
        String cilindrada = sc.nextLine(); 

        System.out.print("Tipo de combustible: "); 
        String combustible = sc.nextLine();

        System.out.print("Capacidad en pasajeros: "); 
        int capacidad = Integer.parseInt(sc.nextLine()); 

        
        System.out.println("La marca que ha ingresado es: " + marca); 
        System.out.println("El modelo que ha ingresado es: " + modelo); 
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada); 
        System.out.println("El tipo de combustible es: " + combustible); 
        System.out.println("Tiene una capacidad de " + capacidad + " pasajeros."); 

        sc.close(); 
    }
}
