package tarefa3;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		System.out.println("Vamos converter uma temperatura de Graus Celsius em Fahrenheit");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite a temperatura em Graus Celsius ");
			float grC = Integer.parseInt(sc.next());
			float grF = (grC*9/5)+32;
			System.out.println("Valor digitado em Fahrenheit: " + grF);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}