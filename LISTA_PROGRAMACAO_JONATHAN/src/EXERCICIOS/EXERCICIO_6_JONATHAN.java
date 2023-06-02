package EXERCICIOS;
import java.util.Scanner;

public class EXERCICIO_6_JONATHAN {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("----Calculo de salário líquido de funcionário----");
		System.out.printf("\nDigite o nome do funcionário: ");
		String nome = input.next();
		System.out.printf("Digite o salário bruto de "+nome+": ");
		double salarioBruto = input.nextDouble();
		
		System.out.printf("\nNome: "+ nome+"\nSalário Bruto: "+salarioBruto+"\nValor a Ser Descontato: "+(salarioBruto*0.1)+"\nSalário Líquido: " + (salarioBruto*0.9));
		
		
		
	}
}
