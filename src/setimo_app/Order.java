package setimo_app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private Date moment = new Date();
	private OrderStatus status;
	private List<OrderItem> orderItens = new ArrayList<>();	
	private Client client = new Client();
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void addItem(OrderItem orderItem) {
		this.orderItens.add(orderItem);
	}
	
	public void removeItem(OrderItem orderItem) {
		this.orderItens.remove(orderItem);
	}
	
	public double total() {
		double total = 0;
		
		for (OrderItem orderItem : orderItens) {
			total += orderItem.subTotal();
		}
		
		return total;
	}

	@Override
	public String toString() {
		double totalPrice = 0.0;
		
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment:" + this.getMoment() + "\n");
		sb.append("Order status: " + this.getStatus() + "\n");
		
		sb.append(this.getClient().toString());
		for (OrderItem item: orderItens) {
			sb.append("\nOrder items:\n " + item.getProduct().getName());
			sb.append(", " + item.getProduct().getPrice());
			sb.append(", Quantity: " + item.getQuantity());
			sb.append(", Subtotal: " + item.subTotal());
			totalPrice += item.subTotal();
		}
		
		sb.append("\nTotal price: $" + totalPrice);
		return sb.toString();
		
	}
	
	
	
}
