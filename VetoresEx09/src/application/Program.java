package application;

import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		Person [] vect = new Person[n];
					
		for (int i=0; i<vect.length; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			vect[i] = new Person(name, age);
		}
		
		Person oldest = vect[0];
					
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getAge() > oldest.getAge()) {
				oldest = vect[i];			
			}
		}

		System.out.println("PESSOA MAIS VELHA: " + oldest.getName());
		
		sc.close();
	}

}
