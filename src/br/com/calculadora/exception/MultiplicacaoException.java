package br.com.calculadora.exception;

public class MultiplicacaoException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public MultiplicacaoException(final String message) {
		super(message);
	}

	public MultiplicacaoException() {
	}

	public void getMessage(String string) {
		System.out.println(string);
	}

}
