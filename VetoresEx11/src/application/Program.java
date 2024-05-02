package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitas? ");
		int n = sc.nextInt();
		Person[] vect = new Person[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Altura da " + (1+i) + "a pessoa: ");
			double height = sc.nextDouble();
			System.out.print("Genero da " + (1+i) + "a pessoa: ");
			char gender = sc.next().charAt(0);
			vect[i] = new Person(height, gender);			
		}
		
		Person shortest = vect[0], highest = vect[0];
		int countMen = 0, countWomen = 0;
		double avgHeight = 0.0;
				
		for (int i=0; i<vect.length; i++) {
			if(shortest.getHeight() > vect[i].getHeight()) {
				shortest = vect[i];
			}
		}
		
		for (int i=0; i<vect.length; i++) {
			if(highest.getHeight() < vect[i].getHeight()) {
				highest = vect[i];
			}
		}
		
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getGender() == 'M') {
				countMen++;
			}
		}
		
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getGender() == 'F') {
				avgHeight += vect[i].getHeight();	
				countWomen ++;
			}
		}
		
		double avg = avgHeight / countWomen;
		
		System.out.printf("Menor altura = %.2f%n", shortest.getHeight());
		System.out.printf("Maior altura = %.2f%n", highest.getHeight());
		System.out.printf("Media das alturas das mulheres %.2f%n", avg);		
		System.out.println("Numero de homens " + countMen);
				
		sc.close();
	}

}
