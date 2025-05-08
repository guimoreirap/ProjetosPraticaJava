package interfaces;

public interface OnlinePaymentService {
	public Double paymentFee(Double amount);
	
	public Double interest(Double amount, Integer months);
	
	public Double totalValue(Double amount, Integer months);
}
