/*1. Fazer uma aplicação Java em Eclipse que tenha uma operação que receba um vetor de 1000
posições inteiras (Preencher todas as posições com valor 0) e gere o tempo gasto, em
Segundos, para percorrer o vetor. Repetir para 10000 e 100000 posições. A aplicação deve
ter uma classe de controle com métodos para operações e uma classe de visão que instancie
a classe de controle para a comunicação. A resposta da tarefa deve ser o print do console
com cada tempo. 
*/
package controller;

public class ControllerVetor {
	
	public ControllerVetor() {
		super();
	}
	
	public void calculaTempo (int numero) {
		double tempoInicial = System.nanoTime();
		int[] vet = new int[numero];
		for (int i = 0; i < numero; i++) {
			vet[i] = 0;
		}
		
		double tempoFinal = System.nanoTime();
		double tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
		
		System.out.println("Tempo gasto = " + tempoTotal + " seg.");
	}
}
