package primeira_app;
import java.util.Locale;
import java.util.Scanner;

public class CalculadoraDeDolar {

	public static double valorDolar = 3.10;
	public static double percentualImpostoIOF = 0.06;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double valorDesejadoReais = 0;
		double valorPago = 0;
		double valorComImposto = 0;
		
		
		System.out.println("Whats the dollar price? " + valorDolar );
		System.out.println("How many dollars will be bought?");
		valorDesejadoReais = scanner.nextDouble();
		valorPago = CurrencyConverter(valorDesejadoReais);
		valorComImposto = valorPago;
		valorComImposto += calcularImposto(valorPago);
		System.out.println("Amount to be paid to convert: " + valorComImposto);
		
			}
	
	public static double CurrencyConverter(double valorReais) {
		
		return valorReais * valorDolar;
	}
	
	public static double calcularImposto(double valorSemImposto) {
		return valorSemImposto * percentualImpostoIOF;
	}

}
