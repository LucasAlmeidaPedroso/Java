package tarefa1;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		System.out.println("Vamos somar dois numeros");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite o primeiro numero:");
			int numDigi11 = Integer.parseInt(sc.next());
			System.out.println("Digite o segundo numero:");
			int numDigi12 = Integer.parseInt(sc.next());
			int soma = numDigi11+numDigi12;
			System.out.println("A soma dos numeros é : " + soma);

		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
