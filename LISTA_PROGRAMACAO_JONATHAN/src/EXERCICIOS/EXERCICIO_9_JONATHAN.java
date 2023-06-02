package EXERCICIOS;
import java.util.Scanner;

public class EXERCICIO_9_JONATHAN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("----Área de um círculo----");
		System.out.printf("\nDigite o valor do raio do círculo (cm): ");
		double raio = input.nextDouble();
		System.out.printf("\nA área desse círculo é de "+(Math.PI*(Math.pow(raio, 2)))+"cm²");
		

	}

}
