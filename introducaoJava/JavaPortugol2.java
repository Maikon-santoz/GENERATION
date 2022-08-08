package fam57;

import java.util.Scanner;

public class JavaPortugol2 {

	public static void main(String[] args) {
		int nota1,nota2,nota3;
		float media;
		Scanner ler =new Scanner(System.in);
		System.out.println("\n Digite a primeira nota");
		nota1=ler.nextInt();
		System.out.println("\n Digite a segunda nota");
		nota2=ler.nextInt();
		System.out.println("\n Digite a terceiira nota");
		nota3=ler.nextInt();
			
		media=((nota1*2)+(nota2*3)+(nota3*5))/10;
			System.out.println("\n A nota ponderada é "+media);
			media=ler.nextFloat();

	}

}
