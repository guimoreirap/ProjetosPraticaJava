package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class ProgramLambda {

	public static void main(String[] args) {
			List<Product> lista = new ArrayList<>();

			lista.add(new Product("TV", 1000.00));
			lista.add(new Product("Geladeira", 4000.00));
			lista.add(new Product("Ar Condicionado", 5000.00));


			lista.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

			for (Product p : lista) {
				System.out.println(p.getName() + " | " + p.getPrice());
			}

	}

}
