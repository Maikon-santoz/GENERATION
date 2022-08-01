programa
{
	
	funcao inicio()
	{
		inteiro c,n,excesso
		real salTotal,salExc
			escreva("\n escreva seu codigo: ")
			leia(c)
			escreva("\n escreva o numero de horas trabalhadas: ")
			leia(n)
				se (n>50){
               	excesso = n-50
               	salExc = excesso*20
               	salTotal = 500+salExc				
	     }
            senao{
            		excesso =0
            		salExc=0
            		salTotal= n*10	     
            }
            	escreva("\n salario total: ",salTotal)
            	escreva("\nsalario excedente: ",salExc)
      }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 188; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */