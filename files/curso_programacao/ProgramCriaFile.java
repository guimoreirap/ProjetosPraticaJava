package curso_programacao;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class ProgramCriaFile {
	public static void main(String[] args) {
		String[] lines = new String[] {"Runescape", "Black Desert", "Guild Wars 2"}; 
		String path = "C:\\Estudos\\games.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
