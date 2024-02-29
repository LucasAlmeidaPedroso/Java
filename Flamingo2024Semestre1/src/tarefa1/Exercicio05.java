package tarefa1;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		System.out.println("Vamos multiplicar dois numeros");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite o primeiro numero:");
			int numDigi11 = Integer.parseInt(sc.next());
			System.out.println("Digite o segundo numero:");
			int numDigi12 = Integer.parseInt(sc.next());
			int multi = numDigi11*numDigi12;
			System.out.println("A multiplicação dos numeros é : " + multi);

		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
