package fam57;

import java.util.Scanner;

public class JavaPortugol1 {

	public static void main(String[] args) {
		int idade,mes,ano,cal;
		System.out.println("\n digite sua idade :");
		Scanner ler= new Scanner(System.in);
		ano=ler.nextInt();
		System.out.println("\n digite o numero do mes que nasceu: ");
		mes=ler.nextInt();
		System.out.println("\n digite o dia do mes: ");
		idade=ler.nextInt();
		
			 cal=(ano*365)+(mes*30)+idade;
			 System.out.println("\n Sua idade em dias e: " +cal);
		
	}

}
