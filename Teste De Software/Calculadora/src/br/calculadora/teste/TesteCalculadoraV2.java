package br.calculadora.teste;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import br.calculadora.CalculadoraV2;
import br.calculadora.exception.CalculadoraException;

public class TesteCalculadoraV2 {

	static CalculadoraV2 calculadora;
	
	@BeforeClass
	public static void setUp(){
		calculadora = new CalculadoraV2();
	}
	
	/*
	 * Se mais de 2 parcelas, retornar erro
	 * Cenário: Recebe String com 3 valores separados por virgula 
	 * Valores: 3, 6, 2
	 * 
	 */
	@Test(expected = CalculadoraException.class)
	public void maisDe2Parcelas() throws CalculadoraException {
		String parcela = "3,6,2";
		calculadora.soma2parcelas(parcela);
	}
	
	@Test(expected = CalculadoraException.class)
	public void parcelasNull() throws CalculadoraException{
		String parcelas = null;
		calculadora.soma2parcelas(parcelas);
	}

}
