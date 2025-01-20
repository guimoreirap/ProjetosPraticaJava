package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import services.ContractService;

public class ProgramMain {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
        String dataString = "25/06/2018"; // Data no formato dd/MM/yyyy
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        try {
            // Converter a String para Date
            Date data = formato.parse(dataString);
            Contract obj = new Contract(123, data, 600.00);
    		ContractService service = new ContractService();
    		List<Installment> lista = service.processContract(obj, 3);

    		for (Installment installment : lista) {
    			String dataFormatada = formato.format(installment.getDueDate());
    			System.out.println(installment.getAmount() + " | " + dataFormatada);
    		}		
        } catch(Exception e) {
        	e.printStackTrace();
        }
	}
}