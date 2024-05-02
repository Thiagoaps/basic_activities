package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Main {
	
	 // Por convenção em java classes estáticas são escritas por letras maiscúlas.
	
	public static void main(String[] args) {
		 /*Entende-se por membros estáticos aqueles atributos ou 
		 * métodos que não precisam ser instanciados a partir de 
		 * um objeto, uma classe que possui somente membros 
		 * estáticos pode ser uma classe estática, que por sua vez, 
		 * também não pode ser instanciada. Exemplo 02
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Calculator calc = new Calculator();
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = calc.circumference(radius);
		
		double v = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);
			
		sc.close();
	}



}
