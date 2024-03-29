package com.br.estruturadados.aula.lista_ligada;
public class Programa {
    public static void main(String[] args) {

        ListaLigada listaLigada = new ListaLigada();

        listaLigada.adicionar("AC");
        listaLigada.adicionar("BA");
        listaLigada.adicionar("CE");
        listaLigada.adicionar("DF");

        System.out.println("Tamanho: " + listaLigada.getTamanho());
        System.out.println("Primeiro: " + listaLigada.getPrimeiro().getValor());
        System.out.println("Último: " + listaLigada.getUltimo().getValor());

        for (int i = 0; i < listaLigada.getTamanho(); i++) {
            System.out.println(listaLigada.get(i).getValor());
        }

        listaLigada.remover("CE");
        System.out.println("Removeu estado CE");

        for (int i = 0; i < listaLigada.getTamanho(); i++) {
            System.out.println(listaLigada.get(i).getValor());
        }

        // remover estado DF
        listaLigada.remover("DF");
        System.out.println("Removeu estado DF");
        listaLigada.adicionar("SP");
        System.out.println("Adicionou estado SP");

        for (int i = 0; i < listaLigada.getTamanho(); i++) {
            System.out.println(listaLigada.get(i).getValor());
        }
    }
}
