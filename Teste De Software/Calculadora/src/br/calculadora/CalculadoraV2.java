package br.calculadora;

import br.calculadora.exception.CalculadoraException;

public class CalculadoraV2 {

	public void soma2parcelas(String parcelas) throws CalculadoraException {
		if (parcelas == null || parcelas.isEmpty()){
			throw new CalculadoraException("Dados inválidos");
		} else{
			String[] arrayDeParcelas = parcelas.split(",");
			if(arrayDeParcelas.length > 2){
				throw new CalculadoraException("Mais de 2 parcelas");	
			} else {
				int resultado = 0;
				for(String parcela : arrayDeParcelas){
					try{
					resultado += Integer.parseInt(parcela);
					} catch(NumberFormatException ex){
						throw new CalculadoraException("Somente numeros");
					}
				}
				System.out.println("Soma das parcelas: " + resultado);
			}
		}
		
	}

}
