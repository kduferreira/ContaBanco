package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
	
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		
		System.out.print("Digite seu numero: ");
		 numero = scanner.nextInt();
		 scanner.nextLine();
		 System.out.print("Digite sua Agencia: ");
		 agencia = scanner.nextLine();
		 System.out.print("Digite o Seu nome porfavor: ");
		 nomeCliente = scanner.nextLine();
		 System.out.print("Digite o seu saldo: ");
		 saldo = scanner.nextDouble();
		 
		 
		 System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " e seu saldo é " + saldo + " ja esta disponivel para o saque.");
		
		
	}

}
