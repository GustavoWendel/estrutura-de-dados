package com.br.estruturadados.aula.vetor;

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        String[] estados = new String[10];

        estados[0] = "AC";
        estados[1] = "BA";
        estados[2] = "CE";
        estados[3] = "DF";
        estados[4] = "AM";
        estados[5] = "AD";
        estados[6] = "PB";
        estados[7] = "RN";
        estados[8] = "MS";
        estados[9] = "SP";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sigla para realizar uma busca: ");
        String siglaBusca = scanner.nextLine();

        boolean encontrou = false;

        for (int i =0; i < estados.length; i++) {
            String elemento = estados[i];

            if (elemento.equalsIgnoreCase(siglaBusca)) {
                encontrou = true;
                System.out.println("Achou o elemento na posição " + i + " " + ": " + elemento);
                break;
            }
        }

        if (encontrou) {
            System.out.println("Sim. Parabéns pela busca");
        } else {
            System.out.println("Não encontrou. Fim do programa.");
        }
    }
}