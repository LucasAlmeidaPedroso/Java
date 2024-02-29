package tarefa1;
import java.util.Scanner;

public class Exercicio01_ {
	public static void main(String[] args) {
		System.out.println("Digite o numero para saber seu sucessor: ");
		try (Scanner sc = new Scanner(System.in)) {
			int numeroDigitado = Integer.parseInt(sc.next());
			int numeroSucessor = numeroDigitado +1;
			System.out.println("O sucessor é : " + numeroSucessor);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
