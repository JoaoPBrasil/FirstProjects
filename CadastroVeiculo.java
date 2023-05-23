import java.util.Random;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			System.out.print("Informe o número de categorias para o stop: ");
			
			Scanner scanner = new Scanner(System.in);
			int numcat = scanner.nextInt();
			
			int i = 0;
			scanner.nextLine();

			String[] categorias = new String[numcat]; 
			
			for (i = 0; i < numcat; i++)
			{	
				System.out.print("Insira o nome da categoria: ");
				String nomeCategoria = scanner.nextLine();
				
				categorias[i] = nomeCategoria;
			}
			
			String letra = null;
			
			Random random = new Random();
			
			int numero= random.nextInt(26);

				switch (numero)
				{
					case 1: 
						letra = "A";
						break;
						
					case 2: 
						letra = "B";
						break;
						
					case 3: 
						letra = "C";
						break;
						
					case 4: 
						letra = "D";
						break;
						
					case 5: 
						letra = "E";
						break;
						
					case 6:
						letra = "F";
						break;
					
					case 7: 
						letra = "G";
						break;
					
					case 8:
						letra = "H";
						break;
					
					case 9:
						letra = "I";
						break;
						
					case 10: 
						letra = "J";
						break;
					
					case 11: 
						letra = "K";
						break;
					
					case 12: 
						letra = "L";
						break;
					
					case 13:
						letra = "M";
						break;
						
					case 14: 
						letra = "N";
						break;
						
					case 15: 
						letra = "O";
						break;
						
					case 16: 
						letra = "P";
						break;
						
					case 17: 
						letra = "Q";
						break;
						
					case 18: 
						letra = "R";
						break;
						
					case 19: 
						letra = "S";
						break;
					
					case 20: 
						letra = "T";
						break;
						
					case 21: 
						letra = "U";
						break;
					
					case 22: 
						letra = "V";
						break;
					
					case 23: 
						letra = "W";
						break;
					
					case 24:
						letra = "X";
						break;
					
					case 25: 
						letra = "Y";
						break;
					
					case 26: 
						letra = "Z";
						break;
				}
				
				String let = letra;
				
				System.out.print("O stop é: "+ let);
				
				scanner.nextLine();

			String[] respostas = new String[numcat];
			
			int j = 0;
			
			for (j = 0; j < numcat; j++)
			{
				System.out.print(categorias[j] + ": ");
				String resposta = scanner.nextLine();
				
				respostas[j] = resposta;
				
			}
			
			System.out.print("Preencheu todas as categorias e quer dar stop? 1- Sim\n 2- Não\n");
			
			Scanner scanner1 = new Scanner(System.in);
			int x = scanner.nextInt();
			
			if (x == 1)
			{
				System.out.print("Stop!");
			}
			else
			{
				System.out.print("Perdeu!");
			}

	}

}
