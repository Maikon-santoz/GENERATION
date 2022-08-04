programa
{
	
	funcao inicio()
	{
	inteiro dados[4],numDado,maiorP=0,x,ocorrencia=0
	real media1=0.0,somaval=0.0
		para(x=0;x<4;x++){
			escreva("\nQual o valor de dado ")
			leia(numDado)
			se(maiorP<= numDado){
				maiorP=numDado
				ocorrencia++
			}
			somaval += numDado
			dados[x] +=numDado
			
		}
			media1 =somaval/ 4
			escreva("\n soma dos valores: ",somaval)
			escreva("\n media aritmética: ", media1)
			escreva("\n maior valor: ",maiorP)
			escreva("\n ocorrencia da maior pontuação: ",ocorrencia)
	

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 518; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */