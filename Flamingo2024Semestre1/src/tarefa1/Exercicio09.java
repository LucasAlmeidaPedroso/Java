package tarefa1;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		System.out.println("Vamos calcular a area de um quadrado");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite o tamanho do lado:");
			int lado = Integer.parseInt(sc.next());
			int area = (int) Math.pow(lado,2);
			System.out.println("A area do quadrado é : " + area);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

}
