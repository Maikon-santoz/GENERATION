package fam57;

import java.util.Scanner;

public class exer3 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in);
	 int[][] valores= new int [3][3];
	 int contNumMaior = 0,i,j;
	 
	 	for (i=0;i<3;i++) {
	 		for (j=0;j<3;j++) {
	 			System.out.println(" \n entre com um numero: ");
	 			valores [i][j]= sc.nextInt();
	 			
	 			if (valores[i][j]>10) {
	 				contNumMaior++;
	 			}
	 		}
	 		System.out.println("\n quantidade de numeros maiores que 10:"+contNumMaior);
	 	}
	}
}				