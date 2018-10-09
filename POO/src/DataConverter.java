/*
Nosso calendário atual é Gregoriano.
Faça uma função que receba como argumento o dia, mês e ano do nosso calendário 
gregoriano, e retorne o número do dia correspondente no calendário Juliana

Fórmula :
data_juliana = 
( 1461 * ( ano + 4800 + ( mes - 14)/12 )  ) / 4 + ( 367 * ( mes - 2- 12 * (  ( mes - 14)/12 )  ) ) /12 - 3 * ( ( ano + 4900 + ( mes - 14 ) / 12 ) / 100 )  ) / 4 + dia - 32075

Para testar informe para a função a data de inicio das olimpíadas do Brasil 05 de Agosto de 2016. O resultado deverá ser : 16218

IMPORTANTE: Professor, 16218 não corresponde ao dia informado, mas sim a 25/5/4669 A.C.
Informação verificada no site http://ghiorzi.org/diasjuli.htm 
A formula que você informa retorna e no site retornam o mesmo resultado para 5/8/2016 d.c.: 2457606
*/
/**
 *
 * @author Kelvin
 */
public class DataConverter {

    private static int conversor(int dia, int mes, int ano){
        int data_juliana = ( 1461 * ( ano + 4800 + ( mes - 14)/12 )  ) / 4 + ( 367 * ( mes - 2- 12 * (  ( mes - 14)/12 )  ) ) /12 - ( 3 * ( ( ano + 4900 + ( mes - 14 ) / 12 ) / 100 )  ) / 4 + dia - 32075;
        return data_juliana;
    }
    
    public static void main(String[] args){
        int dia = 5;
        int mes = 8;
        int ano = 2016;        
        System.out.println(conversor(dia, mes, ano));
    }
    
}
