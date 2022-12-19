package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean contiuarPartida = true;

        Scanner teclado = new Scanner(System.in);
        Cenario mapa = new Cenario();
        String entrada;


        while (contiuarPartida) {
            System.out.println("Entre com as posições x e y no formato x,y");
            entrada = teclado.nextLine();
            String[] numeros = entrada.split(",");
            int x = Integer.parseInt(numeros[0]);
            int y = Integer.parseInt(numeros[1]);
            System.out.println("Posição x: " + x + " Posição y: " + y);
            if (entrada.equals("FIM")) break;
            contiuarPartida = mapa.disparo(x, y);
            mapa.desenhaCenario();

        }

    }
}
