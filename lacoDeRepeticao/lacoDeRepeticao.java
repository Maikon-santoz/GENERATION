package fam57;

import java.util.Scanner;

public class lacoDeRepeticao {

	public static void main(String[] args) {
		//Informar todos os números de 1000 a 1999 que quando divididos por 11
		//obtemos resto = 5.
		
		int num;
		System.out.println("\n Digite numeros de 1000 a 1999 ");
		Scanner leia= new Scanner(System.in);
		num = leia.nextInt();
		
			for(int i=1000;i<2000;i++) {
				if(i%11==5) {
					System.out.println(i);
			}
	}

}}
