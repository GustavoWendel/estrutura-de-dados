package com.br.estruturadados.aula.lista_ligada_generics;

public class Programa {
    public static void main(String[] args) {

        ListaLigadaGenerica<String> listaLigadaGenerica = new ListaLigadaGenerica<>();

        listaLigadaGenerica.adicionar("AC");
        listaLigadaGenerica.adicionar("BA");
        listaLigadaGenerica.adicionar("CE");
        listaLigadaGenerica.adicionar("DF");

        System.out.println("Tamanho: " + listaLigadaGenerica.getTamanho());
        System.out.println("Primeiro: " + listaLigadaGenerica.getPrimeiro().getValor());
        System.out.println("Último: " + listaLigadaGenerica.getUltimo().getValor());

        for (int i = 0; i < listaLigadaGenerica.getTamanho(); i++) {
            System.out.println(listaLigadaGenerica.get(i).getValor());
        }

        listaLigadaGenerica.remover("CE");
        System.out.println("Removeu estado CE");

        for (int i = 0; i < listaLigadaGenerica.getTamanho(); i++) {
            System.out.println(listaLigadaGenerica.get(i).getValor());
        }

        // remover estado DF
        listaLigadaGenerica.remover("DF");
        System.out.println("Removeu estado DF");
        listaLigadaGenerica.adicionar("SP");
        System.out.println("Adicionou estado SP");

        for (int i = 0; i < listaLigadaGenerica.getTamanho(); i++) {
            System.out.println(listaLigadaGenerica.get(i).getValor());
        }
    }
}
