package calculadora;
// Importacion de Java Utils
import java.util.Scanner;
// Declaracion de la Clase SumaNumeros
public class SumaNumeros {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Declaracion de la Clase Scanner

		System.out.print("Ingresa el primer número: ");
		int numero1 = scanner.nextInt(); // Input del primer numero
		
		System.out.print("Ingresa el segundo número: ");
		int numero2 = scanner.nextInt(); // Input del segundo numero
		
		int suma = numero1 + numero2; // Suma de numeros
		
		System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma); // Resultado
		//Cambio realizado desde feature-suma
		//Comentario despues de fusionar las ramas
	}
}
