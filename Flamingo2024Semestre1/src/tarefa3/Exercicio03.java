package tarefa3;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		System.out.println("Vamos calcular o aumento de salário");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite o salario atual");
			float slOld = Integer.parseInt(sc.next());
			System.out.println("Digite o percentual de reajuste");
			float slperc = Float.parseFloat(sc.next());
			float readjust = (slOld/100)*slperc;
			float slNow = slOld+readjust;
	
			System.out.println("Novo salario do colaborador: " + slNow );
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}