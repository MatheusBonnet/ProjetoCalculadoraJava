package classes;

import interfaces.ICalculadora;

public class Multiplicacao implements ICalculadora{

	@Override
	public Integer calcula(Integer n1, Integer n2) {
		if(n1 == null || n2 == null) {
			System.out.println("É preciso informar os dois numeros inteiro!!!");
		}
		return n1 * n2;
	}

	@Override
	public Float calcula(Float n1, Float n2) {
		if(n1 == null || n2 == null) {
			System.out.println("É preciso informar os dois numeros com ponto!!!");
		}
		return n1 * n2;
	}

	@Override
	public Double calcula(Double n1, Double n2) {
		if(n1 == null || n2 == null) {
			System.out.println("É preciso informar os dois numeros com ponto!!!");
		}
		return n1 * n2;
	}

	@Override
	public Integer calcula(Integer[] numeros) {
		Integer divisao = 0;
		for (Integer n : numeros) {
			divisao *= n.intValue();
		}
		return divisao;
	}

	@Override
	public Float calcula(Float[] numeros) {
		Float divisao = 0F;
		for (Float n : numeros) {
			divisao *= n.intValue();
		}
		return divisao;
	}

	@Override
	public Double calcula(Double[] numeros) {
		Double divisao = 0D;
		for (Double n : numeros) {
			divisao /= n.intValue();
		}
		return divisao;
	}

}
