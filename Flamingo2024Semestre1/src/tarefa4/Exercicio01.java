package tarefa4;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		System.out.println("Vamos realizar calculos");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite 4 numeros inteiros separados por virgulas");
			System.out.println("Exemplo: 21,5,3" );
			String[] numbers  = sc.next().split(",");


			float[] somaNumbers = Soma(numbers,"soma");
			float[] MultNumbers = Soma(numbers,"multiplicação");

			System.out.println("Resultados operação de soma");

			for(int i = 0; i< somaNumbers.length;i++) {
				if(somaNumbers[i] == 0)break;
				System.out.println(somaNumbers[i]);	
			}
			System.out.println("Resultados operação de multiplicação");
			for(int i = 0; i< MultNumbers.length;i++) {
				if(MultNumbers[i] == 0)break;
				System.out.println(MultNumbers[i]);	
			}



		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	public static float[] Soma(String[] numbers, String operation) {
		float[] result = new float[4];

		for(int i=0; i < numbers.length ;i++) {
			for(int b=1; b < numbers.length ;b++) {
				switch (operation) {
				case "soma":
					result[i]= Integer.parseInt(numbers[i]) + Integer.parseInt(numbers[b-1]);
					break;
				case "multiplicação":
					result[i]= Integer.parseInt(numbers[i]) * Integer.parseInt(numbers[b-1]);
					break;
				}
			}
		}
		return result;
	}
}
