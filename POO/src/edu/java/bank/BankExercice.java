package edu.java.bank;

import java.util.Date;

/**
 *
 * @author Kelvin
 */
public class BankExercice {

    class CaixaEletronico {

        public Conta autentica(String numeroConta, String senha) {}
    }
    
    class Conta {
        double saldo;
        String numero;
        String senha;
        Transacao[] historico;

        public boolean efetuarSaque(double valor){}
        public boolean efetuarDeposito(double valor){}
        public boolean efetuarDeposito(String boleto, double valor){}
        public Transacao[] extrato(Date inicio, Date final){}
    }
    
    class Deposito{
        
    }
    
    class Pagamento{
        String boleto;
    }
    
    class Saque{
        
    }
    
    class Transacao{
        double valor;
        Date data;
    }
    
    class A{
        public A(String a){
            System.out.println("A");
        }
    }
}
