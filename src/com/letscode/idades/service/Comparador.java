package com.letscode.idades.service;

import com.letscode.idades.utils.Impressora;
import com.letscode.idades.utils.Leitor;

public class Comparador {

    private static final int QTD_PARTICIPANTES = 3;
    private static final String[][] PARTICIPANTES = new String[QTD_PARTICIPANTES][2];
    private static String nomeMaisVelho = "";
    private static String nomeNovato = "";
    private static float media = 0f;


    public static void listaParticipantes() {
        for (int i = 0; i < PARTICIPANTES.length; i++) {
            for (int j = 0; j < PARTICIPANTES[i].length ; j++) {
                if(j % 2 == 0) {
                    PARTICIPANTES[i][j] = Leitor.receberParticipantes();
                }
                else {
                    PARTICIPANTES[i][j] = Leitor.receberIdadeParticipantes();
                }

            }

        }
    }

    public static void identificarMaisVelho() {
        int idadeMaisVelho = 0;

        for (int i = 0; i < PARTICIPANTES.length; i++) {
            for (int j = 0; j < PARTICIPANTES[i].length ; j++) {
                if(j % 2 != 0) {
                    int idade = Integer.parseInt(PARTICIPANTES[i][j]);
                    if(i == 0) {
                        idadeMaisVelho = Integer.parseInt(PARTICIPANTES[i][j]);
                        nomeMaisVelho = PARTICIPANTES[i][j-1];
                    } else if(idade > idadeMaisVelho) {
                        idadeMaisVelho = Integer.parseInt(PARTICIPANTES[i][j]);
                        nomeMaisVelho = PARTICIPANTES[i][j-1];
                    }
                }
            }
        }
        Impressora.imprimirPessoaMaisVelha(nomeMaisVelho,idadeMaisVelho);
//        System.out.println(maisVelho);
    }

    public static void identificarMaisNovo() {
        int idadeMaisNovo = 0;

        for (int i = 0; i < PARTICIPANTES.length; i++) {
            for (int j = 0; j < PARTICIPANTES[i].length ; j++) {
                if(j % 2 != 0) {
                    int idade = Integer.parseInt(PARTICIPANTES[i][j]);
                    if(i == 0) {
                        idadeMaisNovo = Integer.parseInt(PARTICIPANTES[i][j]);
                        nomeNovato = PARTICIPANTES[i][j-1];
                    } else if(idade < idadeMaisNovo) {
                        idadeMaisNovo = Integer.parseInt(PARTICIPANTES[i][j]);
                        nomeNovato = PARTICIPANTES[i][j-1];
                    }
                }
            }
        }
        Impressora.imprimirPessoaMaisNova(nomeNovato,idadeMaisNovo);
//        System.out.println(idadeMaisNovo);
    }

    public static void mediaIdadeParticipantes() {
        for (int i = 0; i < PARTICIPANTES.length; i++) {
            for (int j = 0; j < PARTICIPANTES[i].length ; j++) {
                if(j % 2 != 0) {
                    media = media + Integer.parseInt(PARTICIPANTES[i][j]);
                }
            }
        }
        media = media / PARTICIPANTES.length;
        Impressora.imprimirMediaIdade(media);
//        System.out.println(media);
    }
}