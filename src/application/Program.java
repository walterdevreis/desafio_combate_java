package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Champion c1, c2;
		int N;
		
		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int quantityOfLife = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();		
		c1 = new Champion(name, quantityOfLife, attack, armor);
		System.out.println();
		
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		sc.nextLine();
		name = sc.nextLine();
		System.out.print("Vida inicial: ");
		quantityOfLife = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();		
		c2 = new Champion(name, quantityOfLife, attack, armor);
		System.out.println();
		
		System.out.print("Quantos turnos você deseja executar? ");
		N = sc.nextInt();
		System.out.println();
		
		int i = 1;
		while (i <= N && c1.getLife() > 0 && c2.getLife() > 0) {
			System.out.println("Resultado do turno " + i + ":");
			c1.takeDamage(c2);
			System.out.println(c1.status()); 
			c2.takeDamage(c1);
			System.out.println(c2.status());
			System.out.println();
			i++;
		}
		
		System.out.println("FIM DO COMBATE");
		
		sc.close();
	}
}
