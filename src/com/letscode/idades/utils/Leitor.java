package com.letscode.idades.utils;

import java.util.Scanner;

public class Leitor {

    private static Scanner sc = new Scanner(System.in);

    public static String receberParticipantes() {
        Impressora.imprimirMensagemConviteParticipantes();
        return sc.next();
    }

    public static String receberIdadeParticipantes() {
        Impressora.imprimirMensagemIdadeParticipantes();
        return sc.next();
    }




}
