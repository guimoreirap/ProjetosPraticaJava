package services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import interfaces.OnlinePaymentService;
import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	public List<Installment> processContract(Contract contract, Integer months) {	
		try {
			List<Installment> parcelas = new ArrayList();
			
			double totalValue = contract.getTotalValue();
			double valorParcelasSemJuros = totalValue / months;
			Date dataOriginal = contract.getData();
			
			Calendar calendario = Calendar.getInstance();
			calendario.setTime(dataOriginal);
			
			OnlinePaymentService payment = new PaypalService();
	
			for (int i = 1; i <= months; i++) {
				calendario.add(Calendar.MONTH, 1);
				double amount = payment.totalValue(valorParcelasSemJuros, i);
				Installment installment = new Installment(calendario.getTime(), amount);
				
				parcelas.add(installment);
			}
			return parcelas;	
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
}
