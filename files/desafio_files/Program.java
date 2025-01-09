package desafio_files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Produto> list = new ArrayList();
		
		String path = "C:\\Estudos\\Cursos\\Curso de Java\\Desafio files\\produtosOrigem.txt";
		
		File sourceFile = new File(path);
		String sourceFolderStr = sourceFile.getParent();
		
		boolean success = new File(sourceFolderStr + "\\out").mkdir();
		
		String targetFileStr = sourceFolderStr + "\\outsummary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String itemCsv = br.readLine();
			while(itemCsv != null) {
				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				list.add(new Produto(name, price, quantity));
				itemCsv = br.readLine();
			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
				for (Produto produto: list) {
					bw.write(produto.getNome()+ "," + String.format("%.2f", produto.total()));
					bw.newLine();
				}
				System.out.println(targetFileStr + " created!");
				
			} catch(IOException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		catch(IOException e) {
			e.getMessage();
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
}
