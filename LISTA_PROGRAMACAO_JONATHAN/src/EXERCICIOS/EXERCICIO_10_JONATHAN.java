package EXERCICIOS;
import java.util.Scanner;

public class EXERCICIO_10_JONATHAN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("---- Quociente da divisão por 3----");
		
		System.out.printf("\nDigite algum valor inteiro: ");
		int valor = input.nextInt();
		System.out.printf("\nO quociente de "+valor+" por 3 é "+(valor/3));
		
	}

}
