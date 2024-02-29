package tarefa1;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		System.out.println("Vamos calcular a area de um losangulo");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite lado maior:");
			int ladoMaior = Integer.parseInt(sc.next());
			System.out.println("Digite o lado menor:");
			int ladoMenor = Integer.parseInt(sc.next());
			int area = (ladoMaior*ladoMenor)/2;
			System.out.println("A area do losangulo é : " + area);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

}
