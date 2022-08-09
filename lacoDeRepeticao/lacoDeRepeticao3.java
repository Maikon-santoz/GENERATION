package fam57;

import java.util.Scanner;

public class lacoDeRepeticao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero,somaNum=0;
		Scanner leia=new Scanner(System.in);
		
		do {
			System.out.println("\n Digite um numero : ");
			numero=leia.nextInt();
			if(numero >0) {
				somaNum+=numero;
			}
		}while (numero !=0);
			if (numero ==0) {
				System.out.printf("\n fechando sistema ...");
			}
			System.out.printf("\n a soma dos numeros digitados eh : %d",somaNum);
	}

}
