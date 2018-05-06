/*
 * Aula sobre Threads: 13/03/2018
 */
package com.fatec.sistemasoperacionais.aulathreads.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 670543
 */
public class ThreadCalc extends Thread {

    private final int a;
    private final int b;
    private final int op;

    @Override
    public void run() {
        calcula();
    }

    public ThreadCalc(int a, int b, int op) {
        this.a = a;
        this.b = b;
        this.op = op;
    }

    private void calcula() {
        int tempo = op * 1000;
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadCalc.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int res = 0;
        String operacao = "";
        switch (op) {
            case 0:
                res = a + b;
                operacao = "+";
                break;
            case 1:
                res = a - b;
                operacao = "-";
                break;
            case 2:
                res = a * b;
                operacao = "*";
                break;
            case 3:
                res = a / b;
                operacao = "/";
                break;
        }
        System.out.println(a + " " + operacao + " " + b + " = " + res);
    }
}
