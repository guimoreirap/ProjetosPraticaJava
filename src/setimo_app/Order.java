package setimo_app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private Date moment;
	private OrderStatus status;
	private List<OrderItem> orderItens = new ArrayList<>();	
	
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
	
}
