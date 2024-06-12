package segundo_app;

import java.util.Random;

public class Cliente {
	private String titularConta;
	private String numeroConta;
	private double valorAtual = 0;
	
	
	
	public Cliente(String titularConta, double valorDepositoInicial) {
		this.titularConta = titularConta;
		depositar(valorDepositoInicial);
		
		Random random = new Random();
	    this.numeroConta = String.valueOf(random.nextInt(9000) + 1000);
	}
	
	public String getTitularConta() {
		return titularConta;
	}
	
	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}
	
	public String getNumeroConta() {
		return numeroConta;
	}

	public double getValorDepositoInicial() {
		return valorAtual;
	}
	
	public void setValorDepositoInicial(double valorDepositoInicial) {
		this.valorAtual = valorDepositoInicial;
	}
	
	public void depositar(double valor) {
		this.valorAtual += valor;
	}
	
	public void sacar(double valor) {
		this.valorAtual -= (valor + 5.0);
	}
	
	@Override
	public String toString() {
		return "Account " + this.numeroConta+ ", Holder: " + this.titularConta + ", Balance: " + this.valorAtual;
	}
	
	
}
