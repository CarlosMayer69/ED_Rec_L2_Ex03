/*
* 3. 
* Construir uma função recursiva que receba um vetor e 
* seu tamanho e apresente a quantidade de números pares existentes no vetor. 
* Considere que a entrada deve ser, apenas de números naturais 
* diferentes de zero.
* 
*/
 
package controller;
 
public class ContarParesRecController {
 
	public ContarParesRecController() {
		
		super();
	}
 
	//Função recursiva para contar a quantidade de números pares em um vetor
	public int contarPares(int[]vetor, int tamanho) {
 
		//Condição de Parada
		if (tamanho == 0) {
			return 0;
 
		//Se o último elemento do vetor for par, adicionar 1 ao resultado
		}if (vetor[tamanho -1] % 2 == 0) {
				return 1 + contarPares(vetor, tamanho - 1);
 
			} else {
 
				//Se o último elemento do vetor não for par, apenas continua a 
				//chamada recursiva
				return contarPares(vetor, tamanho - 1);
		}
	}
}