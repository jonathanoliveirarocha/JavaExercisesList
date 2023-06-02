package EXERCICIOS;
import java.util.Scanner;
import java.util.Random;

public class EXERCICIO_16_JONATHAN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random aleatorioGer = new Random();
		
		//Média aritmética
		System.out.println("----Média aritmética----");
		System.out.println("");
		double[] media = new double[4];
		for(int x=0;x<media.length;x++) {
			System.out.printf("Digite o "+(x+1)+"º número: ");
			media[x]=input.nextDouble();
		}
		
		double mediaVal=0;
		for(int x=0;x<4;x++) {
			mediaVal+=media[x];
		}
		mediaVal/=4;
		
		System.out.println("\nA média entre "+media[0]+","+media[1]+","+media[2]+" e "+media[3]+" é: "+mediaVal);
		
		//Soma vetor
				System.out.println("\n----Soma de Vetor----");
				System.out.println("");
				int[] vet1 = new int[5];
				int[] vet2 = new int[5];
				int[] soma = new int[5];
				
				for(int x=0;x<5;x++) {
					System.out.printf("Digite o "+(x+1)+"º número do primeiro vetor: ");
					vet1[x]=input.nextInt();
				}
				System.out.println("");
				for(int x=0;x<5;x++) {
					System.out.printf("Digite o "+(x+1)+"º número do segundo vetor: ");
					vet2[x]=input.nextInt();
				}
				for(int x=0;x<5;x++) {
					soma[x]=vet1[x]+vet2[x];
				}
				System.out.println("");
				for(int x=0;x<5;x++) {
					System.out.println("soma["+x+"]="+ soma[x]);
				}
				
				System.out.print("Digite qualquer tecla e aperte 'Enter' para prosseguir!");
				String prosseguir=input.next();
			
				//Vetor aleatório
				System.out.println("\n----Vetor com 100 números aleatórios----");
				System.out.println("");
				
				int[] aleatorio = new int[100];
				
				for(int x=0;x<100;x++) {
					aleatorio[x]=aleatorioGer.nextInt(100);
					System.out.println("aleatorio["+x+"]= "+aleatorio[x]);
				}
				
				//Ordenando vetor
				System.out.println("\n----Ordenando Vetor----");
				System.out.println("");
				double[] ordenado = new double[10];
				for(int x=0;x<10;x++){
					System.out.printf("Digite o "+(x+1)+"º número do vetor: ");
					ordenado[x]= input.nextDouble();
				}
				System.out.println("");
				double aux;
				
				for(int x=0; x<10;x++){
					for(int y=0; y<9;y++){
						if(ordenado[y]>ordenado[y+1]){
							aux=ordenado[y];
							ordenado[y]=ordenado[y+1];
							ordenado[y+1]=aux;
						}
					}
				}
				for(int x=0;x<10;x++) {
					System.out.println("ordenado["+x+"]="+ ordenado[x]);
				}
				
				
	}

}
