package com.br.estruturadados.aula.lista_ligada_generics;

public class ListaLigadaGenerica<T> {
    private ElementoGenerico<T> primeiro;
    private ElementoGenerico<T> ultimo;
    private int tamanho;

    public ListaLigadaGenerica() {
        this.tamanho = 0;
    }

    public ElementoGenerico<T> getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(ElementoGenerico<T> primeiro) {
        this.primeiro = primeiro;
    }

    public ElementoGenerico<T> getUltimo() {
        return ultimo;
    }

    public void setUltimo(ElementoGenerico<T> ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void adicionar(T novoValor) {
        ElementoGenerico<T> novoElementoGenerico = new ElementoGenerico<>(novoValor);

        if (this.primeiro == null && this.ultimo == null) {
            this.primeiro= novoElementoGenerico;
        } else {
            this.ultimo.setProximo(novoElementoGenerico);
        }
        this.ultimo = novoElementoGenerico;
        this.tamanho++;
    }

    public void remover(T valorProcurado) {
        ElementoGenerico<T> anterior = null;
        ElementoGenerico<T> atual = this.primeiro;

        for (int i = 0; i < this.getTamanho(); i++) {

            if (atual.getValor().equals(valorProcurado)) {
                if (this.tamanho == 1) {
                    this.primeiro = null;
                    this.ultimo = null;
                } else if (atual == primeiro) {
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);
                } else if (atual == ultimo) {
                    this.ultimo = anterior;
                    anterior.setProximo(null);
                } else {
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }

    public ElementoGenerico<T> get(int posicao) {
        ElementoGenerico<T> atual = this.primeiro;

        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }

        return atual;
    }
}
