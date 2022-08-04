programa
{
	
	funcao inicio()
	{
		inteiro matriz[3][3],somaM=0,somaDip=0,l,c

			para(l=0;l<3;l++){
				para(c=0;c<3;c++){
					escreva("\ndigite os valores da matriz 3x3: ")
					leia(matriz[l][c])
						somaM += matriz[l][c]

						se(l ==c){

								somaDip += matriz[l][c]
								
						}
				}
			}
			escreva("\n soma dos valores da matriz 3x3 é: ",somaM)
			escreva("\n soma da diagonal principal é: ",somaDip)
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 429; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */