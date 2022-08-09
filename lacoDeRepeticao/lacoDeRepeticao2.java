package fam57;

import java.util.Scanner;

public class lacoDeRepeticao2 {

	public static void main(String[] args) {

		int idade,totalMenorDe21=0,totalMaiorDe50=0;
		System.out.println("\n digite a idade ");
		Scanner ler = new Scanner(System.in);
		idade= ler.nextInt();
			while(idade != -99) {
				if(idade<=21) {
				totalMenorDe21++;	     
				}	else if (idade >=50) {
				totalMaiorDe50++;
	}
				System.out.println("\n entre com sua idade:");
				idade= ler.nextInt();
			}
	
				System.out.printf("\n O total de pessoas com menor de 20 anos eh: %d",totalMenorDe21);
				System.out.printf("\n o total de pessoas maiores de 50 anos eh: %d ",totalMaiorDe50);
	}
}