package EXERCICIOS;
import java.util.Scanner;

public class EXERCICIO_12_JONATHAN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("----Custo de Viagem----");
		
		System.out.printf("\nDigite a distância a ser percorrida (km): ");
		double distancia = input.nextDouble();
		System.out.printf("Digite o nome do combustível (exemplo: etanol/disel/gasolina): ");
		String combustivel = input.next();
		System.out.printf("Digite o valor atual do(a) "+combustivel+" (R$): ");
		double valor = input.nextDouble();
		System.out.printf("Digite o consumo médio do carro (km/L): ");
		double consumo = input.nextDouble();
		double valorGasto = distancia/consumo*valor;
		
		System.out.printf("\nVocê irá gastar R$"+valorGasto+" de "+combustivel+" para realizar essa viagem!");
		

	}

}
