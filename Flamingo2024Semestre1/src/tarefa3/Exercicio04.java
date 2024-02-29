package tarefa3;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		System.out.println("Vamos calcular o preço de venda de um carro");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite o preço de custo do carro ");
			float vlGroos = Integer.parseInt(sc.next());
			float vlTax = (vlGroos/100)*45;
			float vlProfit = (vlGroos/100)*28;
			float vlTotal = vlGroos + vlTax + vlProfit;
			System.out.println("Valor final do veiculo para venda é: R$" + vlTotal);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}