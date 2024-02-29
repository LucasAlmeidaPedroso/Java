package tarefa3;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		System.out.println("Vamos calcular o juros de uma parcela de um produto em atraso");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite o valor da parcela do produto");
			float vltime = Float.parseFloat(sc.next());
			System.out.println("Digite o valor da taxa por atraso");
			int tax = Integer.parseInt(sc.next());
			System.out.println("Digite o tempo de atraso");
			float time = Float.parseFloat(sc.next());
			float vlEnd = vltime+(vltime*tax/100)*time;
			System.out.println("Valor da parcela com juros: R$"+ vlEnd );

		
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}