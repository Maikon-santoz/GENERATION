programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real n1,n2,n3,Media
		real arredonda
	escreva("entre com a nota 1 ")
	leia(n1)
	escreva("entre com a nota 2 ")
	leia(n2)
	escreva("entre com a nota 3 ")
	leia(n3)
	Media=(n1+n2+n3)/3
	limpa()
	arredonda = mat.arredondar(Media,2)
	escreva(" media " +arredonda)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 320; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */