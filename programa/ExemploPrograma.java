package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.Multiplicacao;
import interfaces.ICalculadora;

public class ExemploPrograma {	
	
	public static void main(String args[]) {
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Digite a operação que deseja ? [1 - Teste]");
//		int opc = scan.nextInt(); // le a entrada do terminal
//		
////		Exemplo das chamadas que deverão ser feitas
////		ICalculadora calculadora = new Soma();
////		ICalculadora calculadora = new Subtracao();
////		ICalculadora calculadora = new Divisao();
////		ICalculadora calculadora = new Multiplicacao();
////		
////		calculadora.calcular(null);
//		
//		scan.close();
		
	
//	
		
		ICalculadora divisao = new Multiplicacao();
		
		Integer numeros[] = {10,5};
		
		System.out.println(divisao.calcula(numeros));
		
	}
}
