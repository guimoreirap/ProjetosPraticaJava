package segundo_app;

import java.util.Scanner;

public class ContaBancaria {

	public static void main(String[] args) {
		
		double valorDepositoInicial = 0;
		String titular = "";
		String isTrue = "";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("----- Cadastro -----");
		System.out.println("Enter account holder: ");
		titular = scanner.next();
		System.out.println("Deseja fazer um depósito inicial? y/n ");
		isTrue = scanner.next();
		
		if (isTrue.equalsIgnoreCase("y")) {
			System.out.println("Valor para deposito inicial: ");
			valorDepositoInicial = scanner.nextDouble();
		}
		
		Cliente cliente = new Cliente(titular, valorDepositoInicial);
		
		System.out.println("Account data:");
		System.out.println(cliente.toString());
		
		
		
		System.out.println("Enter a deposit value:");
		cliente.depositar(scanner.nextDouble());
		System.out.println(cliente.toString());
		
		System.out.println("Enter a withdraw value:");
		cliente.sacar(scanner.nextDouble());
		System.out.println(cliente.toString());
	}

}
