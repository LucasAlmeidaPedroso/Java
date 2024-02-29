package tarefa3;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		System.out.println("Vamos calcular a idade em dias");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite sua idade, Anos, meses e dias separadas por virgulas:");
			System.out.println("Exemplo: 21,5,3 (21 anos, 5 meses e 3 dias)" );
			String[] date = sc.next().split(",");
			int dateInYears = Integer.parseInt(date[0]);
			int dateInMonth = Integer.parseInt(date[1]);
			int dateInDays = Integer.parseInt(date[2]);
			int ageInDays = (dateInYears*365)+(dateInMonth*30)+dateInDays;
			System.out.println("Sua idade em dias: " + ageInDays );
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
