package br.calculadora.teste;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import br.calculadora.Calculadora;

public class TestaCalculadora {
	
	static Calculadora calculadora;
	
	@BeforeClass
	public static void setUp(){
		calculadora = new Calculadora();
	}

	@Test
	public void soma2numerosRetornoValido() {
		int valor1 = 4, valor2 = 6;
		int resultado = calculadora.somar(valor1, valor2);
		assertEquals(valor1 + valor2, resultado);
	}
	
	@Test
	public void multiplica2numerosRetornoValido() {
		int valor1 = 4, valor2 = 6;
		int resultado = calculadora.multiplicar(valor1, valor2);
		assertEquals(valor1 * valor2, resultado);
	}
	
	@Test
	public void subtrai2numerosRetornoValido() {
		int valor1 = 4, valor2 = 6;
		int resultado = calculadora.subtrair(valor1, valor2);
		assertEquals(valor1 - valor2, resultado);
	}
	
	@Test
	public void divide2numerosRetornoValido() {
		int valor1 = 4, valor2 = 6;
		int resultado = calculadora.dividir(valor1, valor2);
		assertEquals(valor1 / valor2, resultado);
	}
	

}
