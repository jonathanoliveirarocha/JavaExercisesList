package EXERCICIOS;
import java.util.Scanner;

public class EXERCICIO_14_JONATHAN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		
		//Tabuada
		System.out.println("----Tabuada----");
		System.out.printf("\nDigite um número inteiro: ");
		int tabuada = input.nextInt();
		
		System.out.println("");
		for(int x=0; x<11;x++) {
			System.out.println(tabuada+"×"+x+"="+(tabuada*x));
		}
		
		//Cardápio 				
		int opcao = 0;		
		boolean erro=false;
			
		while(opcao==0) {	
			
			
			System.out.println("\n----Cardápio----");
			System.out.println("\n1- X-Bacon");
			System.out.println("2- X-Tudo");
			System.out.println("3- X-Salada");
			System.out.println("4- X-Truta");
			System.out.println("5- Sair\n");
			if(erro) {
				System.out.println("Digite uma opção válida!\n");
			}
			System.out.printf("Digite a opção almejada: ");
			opcao=input.nextInt();
			
			for(int i=0;i<100;i++) {
				System.out.println("");
			}
			
			
			switch (opcao) {

			case 1:
				System.out.println("Você escolheu um X-Bacon!");
			 

			break;

			case 2:

				System.out.println("Você escolheu um X-Tudo!");

			break;

			case 3:

				System.out.println("Você escolheu um X-Salada!");

			break;
			case 4:

				System.out.println("Você escolheu um X-Truta!");

			break;
			case 5:

				System.out.println("Você saiu!");

			break;

			default:

				opcao=0;
				erro=true;

			}
		}
		
		//Fatorial
				int fatorial;
				erro = false;
				
				
				System.out.println("\n----Fatorial----");
				System.out.printf("\nDigite um número inteiro: ");
				int numeroFat = input.nextInt();
				System.out.println("");
			
				if(numeroFat<0){
					System.out.printf("\nNão há fatorial de números negativos!");
					erro=true;
				}if(numeroFat==0) {
					fatorial=1;
				}else if(numeroFat<3) {
					fatorial =numeroFat;
				}else{
					fatorial=numeroFat;
					for(int x=numeroFat-1; x>=1;x--) {
						fatorial*= x;
					}
		
				}
				if(!erro) {
					System.out.println("\nO fatorial de "+numeroFat+" é "+fatorial);
				}
				
				
				
				
		
		
		
		
		
		
		
	}

}
