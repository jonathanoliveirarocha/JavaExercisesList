package EXERCICIOS;
import java.util.Scanner;

public class EXERCICIO_8_JONATHAN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("----Área de um quadrado----");
		System.out.printf("\nDigite o valor do lado do quadrado (cm): ");
		double lado = input.nextDouble();
		System.out.printf("\nA área desse quadrado é de "+(lado*lado)+"cm²");
		
	}

}
