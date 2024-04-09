package tarefa4;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		System.out.println("Vamos calcular o quadrado do resultado da diferença entre dois numeros ");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite o primeiro numero");
			float num1 = Float.parseFloat(sc.next());
			System.out.println("Digite o segundo numero");
			float num2 = Float.parseFloat(sc.next());
			
			float dif = num1-num2;
			
			double result = Math.pow(dif, 2);
			
			
			System.out.println("O quadrado da diferença é: " + result );
			
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
