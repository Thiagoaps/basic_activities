package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static final double PI = 3.14159; // Por convenção em java classes estáticas são escritas por letras maiscúlas.
	
	public static void main(String[] args) {
		 /*Entende-se por membros estáticos aqueles atributos ou 
		 * métodos que não precisam ser instanciados a partir de 
		 * um objeto, uma classe que possui somente membros 
		 * estáticos pode ser uma classe estática, que por sua vez, 
		 * também não pode ser instanciada. Exemplo 01
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = circumference(radius);
		
		double v = volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);
			
		sc.close();
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

}
