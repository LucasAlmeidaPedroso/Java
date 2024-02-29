package tarefa1;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		System.out.println("Vamos calcular a area de um circulo");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite o raio:");
			int raio = Integer.parseInt(sc.next());
			float area = (float) 3.14 * (int)Math.pow(raio,2); 
			System.out.println("A area do circulo é : " + area);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
