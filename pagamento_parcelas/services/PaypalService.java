package services;

import interfaces.OnlinePaymentService;

public class PaypalService implements OnlinePaymentService{
	public Double paymentFee(Double amount) {
		return amount * 1.02;
	}
	
	public Double interest(Double amount, Integer months) {
		String juros = "1.0" + months;
		
		return amount * Double.parseDouble(juros);
	}
	
	public Double totalValue(Double amount, Integer months) {
		double amountCalculado = this.interest(amount, months);
		
		return this.paymentFee(amountCalculado);
	}
}
