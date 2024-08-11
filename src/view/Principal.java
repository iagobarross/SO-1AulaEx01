package view;

import controller.ControllerVetor;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 ControllerVetor contVet = new ControllerVetor();
		 Scanner sc = new Scanner(System.in);
		 
		 int numero = sc.nextInt();
		 contVet.calculaTempo(numero);
	}

}
