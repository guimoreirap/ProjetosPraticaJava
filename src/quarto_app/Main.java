package quarto_app;

import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

		System.out.println(order);
	
		OrderStatus os1 = OrderStatus.SHIPPED;
		OrderStatus os2 = OrderStatus.valueOf("SHIPPED");
	
		System.out.println(os1);
		System.out.println(os2);
	}
}
