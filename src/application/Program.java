package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
//		Caminho do arquivo de entrada
		String path = "C:\\Windows\\Temp\\in.txt";

//		Lista para armazenar as linhas do arquivo
		List<String> list = new ArrayList<>();
		
//		Leitura do arquivo e armazenamento das linhas na lista
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
//			Lendo as linhas do arquivo
			String name = br.readLine();
			while(name != null) {
				list.add(name); // Adiciona a linha na lista
				name = br.readLine(); // Lê a próxima linha
			}
//			Ordenação das linhas em ordem alfabética
			Collections.sort(list);
			
//			Exibição das linhas ordenadas
			for(String s : list) {
				System.out.println(s);
			}
		}
//		Tratamento de erros
		catch(IOException e) {
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
		}
	}
}