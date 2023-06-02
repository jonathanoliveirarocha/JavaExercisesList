package EXERCICIOS;
import java.util.Scanner;

public class EXERCICIO_13_JONATHAN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("----Cadastro----\n");
		System.out.printf("Digite seu nome: ");
		String nome = input.next();
		System.out.printf("Digite sua idade: ");
		int idade = input.nextInt();
		System.out.printf("Digite seu endereço: ");
		String endereco = input.next();
		System.out.printf("Digite seu E-mail: ");
		String email = input.next();
		System.out.printf("Digite seu login: ");
		String login = input.next();
		System.out.printf("Digite sua senha: ");
		String senha = input.next();
		
		for(int i=0;i<100;i++) {
			System.out.println("");
		}
		
		System.out.println("----Login----\n");
		
		System.out.printf("Digite seu login:");
		String loginTest = input.next();
		System.out.printf("Digite sua senha:");
		String senhaTest = input.next();
		
		
		
		
		
		boolean erro = false;
		
		if(loginTest.equals(senhaTest) && senhaTest.equals(senha)) {
			erro = false;
		}else{
			erro = true;
		}
		
		while(erro) {
			System.out.println("\nSenha incorreta!\n");
			System.out.printf("Digite novamente seu login:");
			loginTest = input.next();
			System.out.printf("Digite novamente sua senha:");
			senhaTest = input.next();
			if(loginTest.equals(senhaTest) && senhaTest.equals(senha)) {
				erro = false;
			}
		}
		if(!erro) {
			System.out.println("\nLogin realizado com sucesso!");
			System.out.printf("\nNome: "+nome+"\nIdade: "+idade+" anos"+"\nEndereço: "+endereco+"\nE-mail: "+email+"\nLogin: "+login+"\nSenha: "+senha);
		}
		
	}

}
