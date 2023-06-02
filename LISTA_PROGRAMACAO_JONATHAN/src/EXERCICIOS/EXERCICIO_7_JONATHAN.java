package EXERCICIOS;
import java.util.Scanner;

public class EXERCICIO_7_JONATHAN {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("----Área do triângulo----");
		System.out.printf("\nDigite o valor da base do triângulo (cm): ");
		double base = input.nextDouble();
		System.out.printf("\nDigite o valor da altura do triângulo (cm): ");
		double altura = input.nextDouble();
		System.out.printf("\nA área desse triângulo é de "+(base*altura/2)+"cm²");
		
	}
	
}
