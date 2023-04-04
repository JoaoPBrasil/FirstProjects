package pizzaria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Olá, seja bem vindo a pizzaria! Informe seu pedido!\n Tulipa de chope = R$2,80\n Pizza mista = R$20,00\n Cada cobertura = R$1,50");
		System.out.println();
		System.out.print("Número de chopes: ");
		
		Scanner scanner = new Scanner(System.in);
		float ch = scanner.nextInt();
		
		System.out.print("Número de pizzas mistas: ");
		
		Scanner scanner2 = new Scanner(System.in);
		float pz = scanner2.nextInt();
		
		System.out.print("Deseja adicionar cobertura?\n 1- Cobertura\n 2- Sem cobertura\n Cobertura: ");
		
		Scanner scanner3 = new Scanner(System.in);
		float cob = scanner3.nextInt();
		
		if (cob == 1)
		{
			System.out.println("Coberturas disponíveis: \n 1- Queijo\n 2- Presunto\n 3- Banana\n 4- Outras");
			System.out.println("Informe o número de coberturas: ");
			
			Scanner scanner4 = new Scanner(System.in);
			int ncob = scanner4.nextInt();
			
			System.out.print("Informe os sabores da cobertura: ");
			
			scanner.nextLine();
			String sab = scanner.nextLine();
		}
		else
		{
			System.out.print("Sem cobertura então!");
		}
		
		float coberturanum = cob;
		
		double qtdchope = ch * 2.80;
		float qtdpizza = pz * 20;
		double cobertura = coberturanum * 1.50;
		double total = qtdchope + qtdpizza + cobertura;
		
		
		System.out.print("Seu pedido foi: "+ ch +" chopes, "+ pz +" pizzas, "+ coberturanum +" Coberturas adicionais, dando um total de: "+ total +" reais");
	}

}