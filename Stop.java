package Stop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Informe o número de categorias para o stop: ");
		
		Scanner scanner = new Scanner(System.in);
		int numcat = scanner.nextInt();
		
		int i = 0;
				
		String[] categorias = new String[i]; 
		
		for (i = 0; i <= numcat; i++)
		{	
			System.out.print("Insira o nome da categoria: ");
			String nomeCategoria = scanner.nextLine();
			
			categorias[i] = nomeCategoria;
		}
		
		System.out.print("O stop é: "+ );
		
		int j = 0;
		String[] respostas = new String[j];
		
		for (j = 0; j <= i; j++);
		{
			System.out.print(categorias[j]);
			String resposta = scanner.nextLine();
			
			respostas[j] = resposta;
			
		}

	}

}
