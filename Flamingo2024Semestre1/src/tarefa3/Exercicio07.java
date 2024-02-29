package tarefa3;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		System.out.println("Vamos calcular o volume de uma lata de oleo");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite o raio da lata de oleo");
			float ray = Integer.parseInt(sc.next());
			System.out.println("Digite a altura raio da lata de oleo");
			float hgt = Integer.parseInt(sc.next());
			float vl = (float) 3.14*(float) Math.pow(ray,2)*hgt;
			System.out.println("Volume da lata : " + vl);
			
			 //Volume = π*Raio2*Altura
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}