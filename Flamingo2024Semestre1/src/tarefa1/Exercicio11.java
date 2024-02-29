package tarefa1;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		System.out.println("Vamos calcular a area de um trapézio");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite a base maior:");
			int baseMaior = Integer.parseInt(sc.next());
			System.out.println("Digite a base menor:");
			int baseMenor = Integer.parseInt(sc.next());
			System.out.println("Digite a altura:");
			int altura = Integer.parseInt(sc.next());
			int area = ((baseMaior+baseMenor)*altura)/2;
			System.out.println("A area do trapézio é : " + area);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

}
