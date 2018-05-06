/**
 *
 * Lista de exercicios
 * Materia: Estrutura de dados
 * Data: 5 de Março de 2018
 */
package com.fatec.estruturadados;

/**
 * version 0.01
 *
 * @author Kelvin Costa
 */
public class ListaDeInteiros {

    private int[] dados;
    private int tamanho;
    private final int ERRORCODE = -1;

    /**
     * ListaDeInteiros constructor
     */
    public ListaDeInteiros() {
    }

    public boolean vazia() {
        return this.dados.length == 0;
    }

    public boolean cheia() {
        return this.dados.length == this.tamanho;
    }

    public void adicionaInicio(int valor) {
        if (!cheia()) {
            for (int idx = this.dados.length - 1; idx > 0; idx++) {
                this.dados[idx + 1] = this.dados[idx];
            }
            this.dados[0] = valor;
        } else{
            System.out.println(ERRORCODE);
        }
    }

    public void adicionaFinal(int valor) {
        if (!cheia()) {
            this.dados[tamanho] = valor;
        } else{
            System.out.println(ERRORCODE);
        }
    }

    public void adiciona(int valor, int posicao) {
        if (!cheia()) {
            for (int idx = this.dados.length - 1; idx > posicao; idx++) {
                this.dados[idx + 1] = this.dados[idx];
            }
            this.dados[posicao] = valor;
        } else{
            System.out.println(ERRORCODE);
        }
    }

    public int removeInicio() {
        int response = 0;
        if (!vazia()) {
            response = this.dados[0];
            //if (this.dados.length - 1 > 1) {
                for (int idx = 0; idx < tamanho - 1; idx++) {
                    this.dados[idx] = this.dados[idx + 1];
                }
            //} else {
             //   response = this.dados[0];
             //   this.dados[0] = 0;
            //}
        } else {
            response = ERRORCODE;
        }
        return response;
    }

    public int removeFinal() {
        int response = 0;
        if (!vazia()) {
            response = this.dados[this.dados.length - 1];
            tamanho--;
            //this.dados[this.dados.length - 1] = 0;
        } else {
            response = ERRORCODE;
        }
        return response;
    }

    public int remove(int posicao) {
        int removido = dados[posicao];
        return removido;
    }

    public int obtemPrimeiro() {
        if (!vazia()) {
            return this.dados[0];
        } else {
            return ERRORCODE;
        }
    }

    public int obtemUltimo() {
        if (!vazia()) {
            return this.dados[this.dados.length - 1];
        } else {
            return ERRORCODE;
        }
    }

}
