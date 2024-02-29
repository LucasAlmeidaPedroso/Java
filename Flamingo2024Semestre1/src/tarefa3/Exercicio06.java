package tarefa3;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		System.out.println("Vamos converter uma temperatura de Fahrenheit em Graus Celsius");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite a temperatura em Fahrenheit ");
			float grF = Integer.parseInt(sc.next());
			float grC = (grF-32)*5/9;
			System.out.println("Valor digitado em Graus Celsius: " + grC);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}