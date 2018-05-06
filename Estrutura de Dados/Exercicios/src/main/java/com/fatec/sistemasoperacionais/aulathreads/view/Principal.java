/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fatec.sistemasoperacionais.aulathreads.view;

import com.fatec.sistemasoperacionais.aulathreads.controller.ThreadCalc;

/**
 *
 * @author Kelvin Costa
 */
public class Principal {

    public static void main(String[] args) {

        int a = 10;
        int b = 2;
//        int op = 2;

        for (int op = 0; op <= 3; op++) {
            ThreadCalc tCalc = new ThreadCalc(a, b, op);
            tCalc.start();
        }

    }

}
