package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Champion championOne, championTwos;
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
		championOne = new Champion(name, quantityOfLife, attack, armor);
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
		championTwos = new Champion(name, quantityOfLife, attack, armor);
		System.out.println();
		
		System.out.print("Quantos turnos você deseja executar? ");
		N = sc.nextInt();
		System.out.println();
		
		int i = 1;
		while (i <= N && championOne.getLife() > 0 && championTwos.getLife() > 0) {
			System.out.println("Resultado do turno " + i + ":");
			championOne.takeDamage(championTwos);
			System.out.println(championOne.status()); 
			championTwos.takeDamage(championOne);
			System.out.println(championTwos.status());
			System.out.println();
			i++;
		}
		
		System.out.println("FIM DO COMBATE");
		
		sc.close();
	}
}
