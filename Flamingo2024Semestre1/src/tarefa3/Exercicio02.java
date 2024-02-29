package tarefa3;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		System.out.println("Vamos calcular em porcentagem as eleições");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite a quantidade de votos brancos:");
			float vtWhite = Integer.parseInt(sc.next());
			System.out.println("Digite a quantidade de votos nulos:");
			float vtNull = Integer.parseInt(sc.next());
			System.out.println("Digite a quantidade de votos validos:");
			float vtValid = Integer.parseInt(sc.next());
			float allVt = vtWhite + vtNull + vtValid;
			float percentVtWhite = (vtWhite/allVt)*100;
			float percentVtNull = (vtNull/allVt)*100;
			float percentVtValid = (vtValid/allVt)*100;
			System.out.println("Porcentagem de votos brancos: " + percentVtWhite);
			System.out.println("Porcentagem de votos Nulos: " + percentVtNull);
			System.out.println("Porcentagem de votos validos: " + percentVtValid);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}