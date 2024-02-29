package tarefa1;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		System.out.println("Digite o numero para saber seu antecessor: ");
		try (Scanner sc = new Scanner(System.in)) {
			int numeroDigitado = Integer.parseInt(sc.next());
			int numeroAntecessor = numeroDigitado -1;
			System.out.println("O Antecessor do "+ numeroDigitado + " é : " + numeroAntecessor);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
