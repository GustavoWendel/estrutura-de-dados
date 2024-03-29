package com.br.estruturadados.aula.lista_ligada;

public class Elemento {
    private String valor;
    private Elemento proximo;

    public Elemento(String novoValor) {
        this.valor = novoValor;
    }

    public Elemento(String valor, Elemento proximo) {
        this.valor = valor;
        this.proximo = proximo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Elemento getProximo() {
        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }
}
