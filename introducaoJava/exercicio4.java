package fam57;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		int num1;
		System.out.println("\n digite um numero positivo :");
		Scanner ler= new Scanner(System.in);
		num1=ler.nextInt();
		
			if(num1 % 2==1) {
				System.out.println("\n esse numero e impar e seu numero elevado ao quadrado e "+Math.pow(num1, 2));
			}else {
				System.out.println("\n esse numero e par e sua raiz quadrada é : "+Math.sqrt(num1));
			}
		

	}

}
