package com.br.estruturadados.aula.lista_ligada_generics;

public class ProgramaCliente {

    public static void main(String[] args) {
        ListaLigadaGenerica<Cliente> clientes = new ListaLigadaGenerica<>();

        clientes.adicionar(new Cliente("1235", "Antonio"));
        clientes.adicionar(new Cliente("1234", "Charles"));
        clientes.adicionar(new Cliente("1236", "Larissa"));
        clientes.adicionar(new Cliente("1237", "Gustavo"));

        System.out.println("Tamanho: " + clientes.getTamanho());

        for (int i = 0; i < clientes.getTamanho(); i++) {
            System.out.println(clientes.get(i).getValor());
        }

    }
}
