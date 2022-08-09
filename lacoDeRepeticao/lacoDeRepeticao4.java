package fam57;

import java.util.Scanner;

public class lacoDeRepeticao4 {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int numero,num=0,soma=0;
		float media;
		
		System.out.printf("\n digite numeros inteiros :");
		numero = leia.nextInt();
		do {
			if(numero %3 ==0) {
				num++;
				soma+= numero;
			}
			System.out.printf("digite numeros Inteiros :");
			numero= leia.nextInt();
		}while(numero>0);
			if (numero != 0) {
				System.out.println("\n desligando sistema");
			}
				media=soma/num;
				System.out.printf("\n A media dos numeros multiplos de 3 é %f",media);
	}

}
