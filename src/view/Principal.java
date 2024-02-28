package view;
 
import controller.ContarParesRecController;
 
public class Principal {
 
	public static void main(String[] args) {
 
				//int[] vetor = {1,2,3,4,5,6};
				int[] vetor = {11,133,59,71,100,44};
				int tamanho = vetor.length;
 
				ContarParesRecController cpr = new ContarParesRecController();
 
				int contarPares = cpr.contarPares(vetor, tamanho);
 
				System.out.println(contarPares);
 
	}
 
}
