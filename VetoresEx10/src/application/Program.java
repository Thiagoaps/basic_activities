package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão digitados: ");
		int n = sc.nextInt();
		Person [] vect = new Person[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "° aluno: ");
			sc.nextLine();
			String name = sc.nextLine();
			double grade1 = sc.nextDouble();
			double grade2 = sc.nextDouble();
			vect[i] = new Person(name, grade1, grade2);			
		}
		
		System.out.println("Alunos Aprovados: ");
		
		for (int i=0; i<vect.length; i++) {
			if(vect[i].avg() >= 6.0) {
				System.out.println(vect[i].getName());	
			}
		}
		
		sc.close();
	}

}
