package quinto_app;

import java.util.Date;

public class HourContract {
	public Date data;
	public double valuePerHour;
	public int hours;
	
	public double totalValue() {
		return this.hours * this.valuePerHour;
	}

	public HourContract() {
	}
	
	public HourContract(Date data, double valuePerHour, int hours) {
		this.data = data;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	
	
}
