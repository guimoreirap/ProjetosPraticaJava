package terceiro_app;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Cliente[] clientes = new Cliente[10];
		String nome;
		String email;
		int quarto;
		
		int quantidadeQuartosAlugados = 0;
		
		
		System.out.println("Quantos quartos serão alugados?");
		quantidadeQuartosAlugados = scanner.nextInt();
		
		
		for (int i = 0; i < quantidadeQuartosAlugados; i++) {
			System.out.println("Preencha os dados do cliente.");
			System.out.println("Nome: ");
			nome = scanner.next();
			System.out.println("Email: ");
			email = scanner.next();
			System.out.println("Quarto desejado: ");
			quarto = scanner.nextInt();
			
			Cliente cliente = new Cliente(nome, email, quarto);
			clientes[quarto] = cliente;
			
		}
		
		System.out.println("Busy rooms:");
		for (Cliente cliente : clientes) {
			if(cliente != null) {
				System.out.println(cliente.toString());
				
			}
		}
		
		
		
	}

}
