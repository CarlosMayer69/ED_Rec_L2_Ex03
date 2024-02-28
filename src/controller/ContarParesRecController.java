/*
* 3. 
* Construir uma fun��o recursiva que receba um vetor e 
* seu tamanho e apresente a quantidade de n�meros pares existentes no vetor. 
* Considere que a entrada deve ser, apenas de n�meros naturais 
* diferentes de zero.
* 
*/
 
package controller;
 
public class ContarParesRecController {
 
	public ContarParesRecController() {
		
		super();
	}
 
	//Fun��o recursiva para contar a quantidade de n�meros pares em um vetor
	public int contarPares(int[]vetor, int tamanho) {
 
		//Condi��o de Parada
		if (tamanho == 0) {
			return 0;
 
		//Se o �ltimo elemento do vetor for par, adicionar 1 ao resultado
		}if (vetor[tamanho -1] % 2 == 0) {
				return 1 + contarPares(vetor, tamanho - 1);
 
			} else {
 
				//Se o �ltimo elemento do vetor n�o for par, apenas continua a 
				//chamada recursiva
				return contarPares(vetor, tamanho - 1);
		}
	}
}