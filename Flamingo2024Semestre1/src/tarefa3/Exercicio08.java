package tarefa3;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		System.out.println("Vamos calcular a quantidade de combustivel que seu carro irá gastar");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite o tempo gasto da viagem em horas");
			float time = Float.parseFloat(sc.next());
			System.out.println("Digite a velocidade media da viagem km/h");
			float kmM = Float.parseFloat(sc.next());
			float dist = time*kmM;
			float kmLitro = dist/12;
			System.out.println("Dados da viagem");
			System.out.println("Velocidade média: "+ kmM +"Km/h");
			System.out.println("Tempo gasto: "+ time+" horas");
			System.out.println("Distancia percorrida: " + dist +" Kilometros");
			System.out.println("Litros de gasolina utilizados " + kmLitro);
		
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}