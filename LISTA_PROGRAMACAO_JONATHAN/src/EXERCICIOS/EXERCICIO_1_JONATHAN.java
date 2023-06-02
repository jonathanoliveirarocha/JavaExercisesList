package EXERCICIOS;
import java.util.Scanner;

public class EXERCICIO_1_JONATHAN {

	public static void main(String[] args) {

			Scanner input = new Scanner(System.in); 
			
			//Soma de três números inteiros 
			System.out.println("----Soma entre três números inteiros----"); 
			System.out.printf("\nDigite o primeiro número inteiro: "); 
			int int1 = input.nextInt();
			System.out.printf("Digite o segundo número inteiro: "); 
			int int2 = input.nextInt();
			System.out.printf("Digite o terceiro número inteiro: "); 
			int int3 = input.nextInt();
			
			System.out.println("\nA soma entre " + int1+ ", " + int2 + " e " + int3+ " é "+ (int1+int2+int3)); 
	
			//Subtração de dois números inteiros 
			System.out.println("\n----Subtração entre dois números inteiros----"); 
			System.out.printf("\nDigite o primeiro número inteiro: "); 
			int1 = input.nextInt();
			System.out.printf("Digite o segundo número inteiro: "); 
			int2 = input.nextInt();
			
			System.out.println("\nA subtração entre " + int1+ " e " + int2 +" é "+ (int1-int2));
			
			//Soma de dois números reais
			System.out.println("\n----Soma entre dois números reais----"); 
			System.out.printf("\nDigite o primeiro número real: "); 
			double double1 = input.nextDouble();
			System.out.printf("Digite o segundo número real: "); 
			double double2 = input.nextDouble();
			
			System.out.println("\nA soma entre " + double1+ " e " + double2 +" é "+ (double1+double2));
			
			//Some de um número real com um inteiro
			System.out.println("\n----Soma entre um número real e um inteiro---"); 
			System.out.printf("\nDigite o número inteiro: "); 
			int1 = input.nextInt();
			System.out.printf("Digite o número real: "); 
			double1 = input.nextDouble();
			
			System.out.println("\nA soma entre " + int1+ " e " + double1 +" é "+ (int1+double1));
				

	}

}
