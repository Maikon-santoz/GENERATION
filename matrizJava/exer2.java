package logicaJava;

import java.util.Scanner;

public class exer2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] numeros = new int [0];
		int numerosPares = 0, somaPar=0,contImpar=0,numeroImpar=0,i,n;
		for (i=0;i<6;i++) {
			System.out.println("\n digite um numero inteiro ");
			n= sc.nextInt();
				if(n%2==0) {
					numerosPares++;
					somaPar+= n;
					
				}
				else {
					System.out.println("\n numero impar"+n);
					contImpar++;
				}
		}
			System.out.println("\n numeros pares digitados: "+numerosPares);
			System.out.println("\n soma de numeros pares "+somaPar);
			System.out.println("\n quantidade de numeros impares: "+contImpar);
	}

}
