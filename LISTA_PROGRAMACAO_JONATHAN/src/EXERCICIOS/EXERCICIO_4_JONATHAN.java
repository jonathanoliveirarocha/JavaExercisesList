package EXERCICIOS;
import java.util.Scanner;

public class EXERCICIO_4_JONATHAN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean erro = false;
		
		System.out.println("----Média geral de um aluno----");
		
		System.out.printf("\nDigite a nota do primeiro trimestre desse aluno (valor:30): ");
		double primeiro = input.nextDouble();
		if(primeiro>30 ||  primeiro<0) {
			erro = true;
		}			
		while(erro) {
			System.out.printf("O valor deve estar entre 0 e 30, por favor digite novamente: ");
			primeiro = input.nextDouble();
			if(primeiro<=30 &&  primeiro>=0) {
				erro = false;
			}
		}
		
		System.out.printf("Digite a nota do segundo trimestre desse aluno (valor:35): ");
		double segundo = input.nextDouble();
		if(segundo>35 ||  segundo<0) {
			erro = true;
		}			
		while(erro) {
			System.out.printf("O valor deve estar entre 0 e 35, por favor digite novamente: ");
			segundo = input.nextDouble();
			if(segundo<=35 &&  segundo>=0) {
				erro = false;
			}
		}
		
		System.out.printf("Digite a nota do terceiro trimestre desse aluno (valor:35): ");
		double terceiro = input.nextDouble();
		if(terceiro>35 ||  terceiro<0) {
			erro = true;
		}			
		while(erro) {
			System.out.printf("O valor deve estar entre 0 e 35, por favor digite novamente: ");
			terceiro = input.nextDouble();
			if(terceiro<=35 &&  terceiro>=0) {
				erro = false;
			}
		}
		System.out.printf("\nA média geral desse aluno foi de "+(primeiro+segundo+terceiro)+"/100");
		
		
	}

}
