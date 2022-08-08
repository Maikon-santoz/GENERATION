package fam57;

import java.util.Scanner;

public class PrimeiroContato {

	public static void main(String[] args) {
		int num1,num2,num3,local;
		Scanner ler= new Scanner(System.in);
		System.out.println("\n digite o piremiro numero : ");
		num1=ler.nextInt();
		System.out.println("\n digite o segundo numero : ");
		num2=ler.nextInt();
		System.out.println("\n digite o terceiro numero: ");
		num3=ler.nextInt();
			if(num1>num2) {
				local=num1;
			}else {
				local=num2;
			}
			if(local>num3) {
				System.out.printf("\n o numero maior e :%d",local);
			}else {
				System.out.printf("\n o numero maior e:%d ",num3);
			}
	}

}
