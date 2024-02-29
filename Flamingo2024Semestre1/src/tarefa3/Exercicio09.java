package tarefa3;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		System.out.println("Vamos realizar as trocas dos valores");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite o valor de A");
			var a = sc.next();
			System.out.println("Digite o valor de B");
			var b = sc.next();
			var c = a;
			a = b;
			b = c;
			System.out.println("Valor A:" + a );
			System.out.println("Valor B:" + b );

		
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}