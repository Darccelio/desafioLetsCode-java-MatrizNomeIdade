package com.letscode.idades.utils;

public class Impressora {

    private static final String MENSAGEM_NOME_PARTICIPANTES = "Senhor convidado, insira seu nome .....: ";
    private static final String MENSAGEM_IDADE_PARTICIPANTES = "Informe a sua idade .....: ";
    private static final String MENSAGEM_PESSOA_MAIS_VELHA = "%s é a pessoa mais velha e possui %d anos. %n";
    private static final String MENSAGEM_PESSOA_MAIS_NOVA = "%s é a pessoa mais nova e possui %d anos. %n";
    private static final String MENSAGEM_MEDIA_IDADE = "A média de idade dos Participantes é ...: %.2f %n";

    public static void imprimirMensagemConviteParticipantes() {
        System.out.print(MENSAGEM_NOME_PARTICIPANTES);
    }

    public static void imprimirMensagemIdadeParticipantes() {
        System.out.print(MENSAGEM_IDADE_PARTICIPANTES);
    }

    public static void imprimirPessoaMaisVelha(String nome, int idade) {
        System.out.printf(MENSAGEM_PESSOA_MAIS_VELHA, nome, idade);
    }

    public static void imprimirPessoaMaisNova(String nome, int idade) {
        System.out.printf(MENSAGEM_PESSOA_MAIS_NOVA, nome, idade);
    }

    public static void imprimirMediaIdade(float media) {
        System.out.printf(MENSAGEM_MEDIA_IDADE, media);
    }

}
