package br.com.calculadora.classe;

import br.com.calculadora.exception.MultiplicacaoException;
import br.com.calculadora.interfaces.ICalculadora;

public class Multiplicacao implements ICalculadora{

	@Override
	public Integer calcula(Integer n1, Integer n2) {
		
		Integer result = 0;
		
		try {
			if(n1 == null || n2 == null) {
				throw new MultiplicacaoException();
			}
			
			result = n1 * n2;
		} catch (MultiplicacaoException e) {
			e.getMessage("Necessario informar dois numeros!!");
		}
		
		return result;
	}

	@Override
	public Float calcula(Float n1, Float n2) {

		Float result = null;
		
		try {
			if(n1 == null || n2 == null) {
				throw new MultiplicacaoException();
			}
			
			result = n1 * n2;
		} catch (MultiplicacaoException e) {
			e.getMessage("Necessario informar dois numeros!!");
		}
		
		return result;
	}

	@Override
	public Double calcula(Double n1, Double n2) {

		Double result = null;
		
		try {
			if(n1 == null || n2 == null) {
				throw new MultiplicacaoException();
			}
			
			result = n1 * n2;
		} catch (MultiplicacaoException e) {
			e.getMessage("Necessario informar dois numeros!!");
		}
		
		return result;
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