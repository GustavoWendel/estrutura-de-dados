package com.br.estruturadados.aula.lista_ligada_generics;

public class ElementoGenerico<T> {
    private T valor;
    private ElementoGenerico<T> proximo;

    public ElementoGenerico(T novoValor) {
        this.valor = novoValor;
    }

    public ElementoGenerico(T valor, ElementoGenerico<T> proximo) {
        this.valor = valor;
        this.proximo = proximo;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public ElementoGenerico<T> getProximo() {
        return proximo;
    }

    public void setProximo(ElementoGenerico<T> proximo) {
        this.proximo = proximo;
    }
}
