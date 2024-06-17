package setimo_app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		Client client = new Client();
		Order order = new Order();
		OrderItem orderItem = new OrderItem();
		Product product = new Product();
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		order.getClient().setName(sc.nextLine());
		
		System.out.print("Email: ");
		order.getClient().setEmail(sc.next());
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		order.getClient().setBirthDate(sdf.parse(sc.next()));
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		order.setStatus(OrderStatus.valueOf(sc.next()));
		
		System.out.print("How many items to this order? ");			
		int quantidadeItens = sc.nextInt();
		
		for (int i = 0; i < quantidadeItens; i++) {
			System.out.println("Enter #" + (i + 1)+ " item data:");
			System.out.print("Product name: ");
			orderItem.getProduct().setName(sc.next());
			
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			orderItem.getProduct().setPrice(price);
			orderItem.setPrice(price);
			
			System.out.print("Quantity: ");
			orderItem.setQuantity(sc.nextInt());
			
			order.addItem(orderItem);
		}
		
		System.out.println(" ");
		System.out.println("ORDER SUMMARY:");
		System.out.println(" ");
		System.out.println(order.toString());
		sc.close();
		
	}

}
