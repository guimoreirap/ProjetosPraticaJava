package quinto_app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Worker worker = new Worker();
		Department departamento = new Department();
		
		int contratos = 0;

		String formatoData = "dd/MM/yyyy";
		SimpleDateFormat formatter = new SimpleDateFormat(formatoData);

		System.out.print("Enter department's name: ");
		departamento.setName(scanner.next());
		worker.setDepartamento(departamento);

		System.out.println("Enter worker data: ");
		System.out.print("Name:");
		worker.setName(scanner.next());
		System.out.println("Level:");
		worker.setLevel(WorkerLevel.valueOf(scanner.next()));
		System.out.println("Base salary:");
		worker.setBaseSalary(scanner.nextDouble());
		System.out.println("How many contracts to this worker?");
		contratos += scanner.nextInt();
		
		String data;

		for (int i = 0; i < contratos; i++) {
			HourContract contrato = new HourContract();
			System.out.println("Enter contract #" + (i + 1) + " data:");
			System.out.println("Date (DD/MM/YYYY): ");
			data = null;
			data = scanner.next();

			try {
				contrato.setData(formatter.parse(data));
			} catch (ParseException e) {
				System.out.println("Erro ao converter a string para data: " + e.getMessage());
			}

			System.out.println("Value per hour: ");
			contrato.setValuePerHour(scanner.nextDouble());

			System.out.println("Duration: ");
			contrato.setHours(scanner.nextInt());
			
			worker.addContract(contrato);

		}

		System.out.println("Enter month and year to calculate income (MM/YYYY): ");
		String dataIncome = scanner.next();

		// Usar o método split para separar o mês e o ano
		String[] partes = dataIncome.split("/");

		// Atribuir as partes a variáveis separadas
		int mes = Integer.parseInt(partes[0]);
		int ano = Integer.parseInt(partes[1]);

		// Exibir os valores separados
		System.out.println(worker.incomeToString(dataIncome, ano, mes, worker.getListaContratos()));
		

	}

}
