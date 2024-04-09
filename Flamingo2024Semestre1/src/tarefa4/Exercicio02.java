package tarefa4;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		System.out.println("Vamos calcular o volume de uma caixa retangular");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite o comprimento do retangulo");
			float lenght = Float.parseFloat(sc.next());
			System.out.println("Digite a altura do retangulo");
			float height = Float.parseFloat(sc.next());
			System.out.println("Digite e largura do retangulo");
			float widht = Float.parseFloat(sc.next());
			
			float vol = lenght*widht*height;
			
			System.out.println("O Volume do seu retangulo é :" + vol );
			
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
