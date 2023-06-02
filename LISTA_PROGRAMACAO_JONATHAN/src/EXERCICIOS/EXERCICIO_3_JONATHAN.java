package EXERCICIOS;
import java.util.Scanner;

public class EXERCICIO_3_JONATHAN {
	public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in); 
			
			System.out.println("----Média  aritimética de três números inteiros ----");
			System.out.printf("\\nDigite o primeiro número inteiro: ");
			int num1 = input.nextInt();
			System.out.printf("Digite o segundo número inteiro: ");
			int num2 = input.nextInt();
				System.out.printf("Digite o terceiro número inteiro: ");
			int num3 = input.nextInt();
			
			System.out.println("\nA média aritimética entre "+num1+", "+ num2+" e "+num3+" é "+ ((num1+num2+num3)/3));
					
			
	
		}
}
