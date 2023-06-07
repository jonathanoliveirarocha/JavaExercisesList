package EXERCICIOS;
import java.util.Scanner;

public class EXERCICIO_17_JONATHAN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[][] nomeEaprov = new String[2][10];
		double[][] notas = new double[5][10];
	
		//Notas Alunos
				double media=0;
				double maior=0;
				boolean erro=false;
				String nomeMaior="";
				
				System.out.println("----Notas Alunos----");
				System.out.println("");
				
				for(int x=0;x<10;x++) {
					System.out.printf("Digite o nome do "+ (x+1)+ "º aluno: ");
					nomeEaprov[0][x]=input.next();
					for(int y=0;y<4;y++) {
						System.out.printf("Digite a nota do "+ (y+1)+ "º bimestre de "+nomeEaprov[0][x]+ ": ");
						notas[y][x]=input.nextDouble();
						if(notas[y][x]<0 || notas[y][x]>25) {
							erro=true;
						}
						
						while(erro) {
							System.out.printf("A nota deve estar entre 0 e 25! Digite a nota novamente: ");
							notas[y][x]=input.nextDouble();
							if(notas[y][x]>=0 && notas[y][x]<=25) {
								erro=false;
							}
						}
						media+= notas[y][x];
						
					}
					notas[4][x]=media;
					if(media>=60) {
						nomeEaprov[1][x]="Aprovado";
					}else {
						nomeEaprov[1][x]="Reprovado";
					}
					media=0;
					System.out.println("");
				}
				
				System.out.println("----Resultado Final----");
				System.out.println("");
				
				for(int x=0;x<10;x++) {
					System.out.println("Nome do "+ (x+1)+ "º aluno: "+ nomeEaprov[0][x]);
					for(int y=0;y<4;y++) {
						System.out.println("Nota do "+ y+ "º bimestre: "+ notas[y][x]);
					}
					System.out.println("Nota total: "+ notas[4][x]);
					System.out.println("Status: "+ nomeEaprov[1][x]);
					System.out.println("");
				}
				for(int x=0;x<10;x++) {
					if(maior<notas[4][x]) {
						maior=notas[4][x];
						nomeMaior=nomeEaprov[0][x];
					}
				}
				System.out.println("O ALUNO COM A MAIOR NOTA FOI: "+ nomeMaior);
				
				
	
	}

}
