package EXERCICIOS;
import java.util.Scanner;

public class EXERCICIO_2_JONATHAN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		System.out.println("\n----Operação ((1º valor * 2º valor) / (1º valor)*2)----"); 
		System.out.printf("\nDigite o primeiro número real: "); 
		double double1 = input.nextDouble();
		System.out.printf("Digite o segundo número real: "); 
		double double2 = input.nextDouble();
		
		System.out.println("\nO resultado de (("+double1+"*"+double2+") / ("+double1+")*2) é " + ((double1*double2)/(double1)*2));
		
		

	}

}
