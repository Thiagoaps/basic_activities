package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		Person[] vect = new Person[n];
		
		for(int i=0; i<vect.length; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			vect[i] = new Person(name, age, height);			
		}
		int minorAge = 0;
		double sum = 0.0;
		
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getHeight();
		}
		
		double avg = sum / n;
		System.out.println();
		System.out.printf("Altura média: %.2f%n", avg);
		
		for(int i=0; i<vect.length; i++) {
			if(vect[i].getAge()<16) {
				minorAge++;
			}
		}
		
		double minorPercentage = minorAge * 100.0 / n;
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", minorPercentage);
		
		for (int i=0; i<vect.length; i++) {
			if(vect[i].getAge()<16) {
				System.out.println(vect[i].getName());
			}
		}
		
		sc.close();
	}

}
