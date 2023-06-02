package EXERCICIOS;

import java.util.Scanner;

public class EXERCICIO_11_JONATHAN {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("---- Resto da divisão por 3----");
		
		System.out.printf("\nDigite algum valor inteiro: ");
		int valor = input.nextInt();
		System.out.printf("\nO resto de "+valor+" por 3 é "+(valor%3));
		
	}
}
