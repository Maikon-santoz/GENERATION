package fam57;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
	int idade;
		System.out.println("\n digite sua idade: ");
		Scanner ler= new Scanner(System.in);
		idade=ler.nextInt();
		if(idade>=0 && idade <14){
			System.out.println("\n infantil");
			
		}else if(idade>=15 && idade<17) {
			System.out.println("\n juvenil");
		}
		else if(idade>=18) {
			System.out.println("\n adulto ");
			
			
		}else {
			System.out.println("\n idade invalida");
		}

	}

}
