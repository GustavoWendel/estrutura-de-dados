package com.br.estruturadados.aula.lista_ligada_generics;

public class ProgramaInteiros {
    public static void main(String[] args) {
        ListaLigadaGenerica<Integer> numeros = new ListaLigadaGenerica<>();

        numeros.adicionar(1);
        numeros.adicionar(2);
        numeros.adicionar(3);
        numeros.adicionar(4);
        numeros.adicionar(5);
        numeros.adicionar(6);

        System.out.println("Tamanho: " + numeros.getTamanho());
        System.out.println("Primeiro: " + numeros.getPrimeiro().getValor());
        System.out.println("Último: " + numeros.getUltimo().getValor());

        for (int i = 0; i < numeros.getTamanho(); i++) {
            System.out.println(numeros.get(i).getValor());
        }

    }
}
