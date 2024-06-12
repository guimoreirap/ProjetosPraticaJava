package quinto_app;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
	public String name;
	public WorkerLevel level;
	public double baseSalary;
	public Department departamento;
	public List<HourContract> listaContratos = new ArrayList<>();
	
	public Worker() {
	}

	public Worker(String name, WorkerLevel level, double baseSalary) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public WorkerLevel getLevel() {
		return level;
	}
	public void setLevel(WorkerLevel level) {
		this.level = level;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public void addContract(HourContract contract) {
		listaContratos.add(contract);
	}
	
	public void removeContract(int contract){
		listaContratos.remove(contract);
	}
	
	public Department getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Department departamento) {
		this.departamento = departamento;
	}

	public List<HourContract> getListaContratos() {
		return listaContratos;
	}

	public void setListaContratos(List<HourContract> listaContratos) {
		this.listaContratos = listaContratos;
	}
	
	public double income(int year, int month, List<HourContract> listaContratos) {
		double valorIncome = 1200;
		
		Calendar calendar1 = Calendar.getInstance();
		calendar1.set(Calendar.YEAR, year);
		calendar1.set(Calendar.MONTH, month - 1);
		
		Calendar calendar2 = Calendar.getInstance();
		
		for (HourContract hourContract : this.listaContratos) {
			calendar2.setTime(hourContract.getData());
			if( compararMesAno(calendar1, calendar2)) {
				return valorIncome += hourContract.totalValue();
			}
		}
		
		return 0;
	}

	 public static boolean compararMesAno(Calendar cal1, Calendar cal2) {
	        // Obter mês e ano dos dois objetos Calendar
	        int mes1 = cal1.get(Calendar.MONTH);
	        int ano1 = cal1.get(Calendar.YEAR);

	        int mes2 = cal2.get(Calendar.MONTH);
	        int ano2 = cal2.get(Calendar.YEAR);

	        // Comparar mês e ano
	        return (mes1 == mes2) && (ano1 == ano2);
	 }
	
	public String incomeToString(String data, int year, int month, List<HourContract> listaContratos) {
		double valorIncome = income(year, month, listaContratos);
		
		return "Name: " + this.getName()+ "| Department: " +this.getDepartamento().getName()+ "| Income for "+data+ ": " + valorIncome;
	}
	
}
