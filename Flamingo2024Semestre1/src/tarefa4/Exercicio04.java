package tarefa4;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		System.out.println("Bem vindo a casa do cambio");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite o valor atual do Dolar em reais");
			float dolarR = Float.parseFloat(sc.next());
			System.out.println("Digite o valor a ser cambiado para Real");
			float dolarC = Float.parseFloat(sc.next());
			
			float Value = dolarC/dolarR;
			System.out.println("O Valor digitao em Reais é: R$" + Value);
			
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
