package br.com.calculadora.classe;

import br.com.calculadora.interfaces.ICalculadora;

public class Multiplicacao implements ICalculadora{

	@Override
	public Integer calcula(Integer n1, Integer n2) {
		if(n1 == null || n2 == null) {
			System.out.println("É preciso informar os dois numeros!!!");
			return 0;
		}
		return n1 * n2;
	}

	@Override
	public Float calcula(Float n1, Float n2) {
		if(n1 == null || n2 == null) {
			System.out.println("É preciso informar os dois numeros!!!");
			return 0f;
		}
		return n1 * n2;
	}

	@Override
	public Double calcula(Double n1, Double n2) {
		if(n1 == null || n2 == null) {
		   System.out.println("É preciso informar os dois numeros!!!");
		   return 0d;
		}
		
		return n1 * n2;
	}

	@Override
	public Integer calcula(Integer[] numeros) {
		Integer mult = 1;
		
		for (int i = 0; i < numeros.length; i++) {
			mult *= numeros[i];
		}
		return mult;
	}

	@Override
	public Float calcula(Float[] numeros) {
		Float mult = 1F;
		
		for (int i = 0; i < numeros.length; i++) {
			mult *= numeros[i];
		}
		return mult;
	}

	@Override
	public Double calcula(Double[] numeros) {
		Double mult = 1D;
		
		for (int i = 0; i < numeros.length; i++) {
			mult *= numeros[i];
		}
		return mult;
	}

}