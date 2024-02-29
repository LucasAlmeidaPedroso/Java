package tarefa1;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		System.out.println("Vamos calcular a area de um triangulo");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite a altura:");
			int altura = Integer.parseInt(sc.next());
			System.out.println("Digite o base:");
			int base = Integer.parseInt(sc.next());
			int area = (base * altura)/2;
			System.out.println("A area do triangulo é : " + area);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
