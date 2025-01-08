package curso_programacao;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		File file = new File("C:\\Estudos\\TXT Importantes\\CommitNoGit.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner (file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			if(sc != null) {
				sc.close();
			}
		}

	}

}
