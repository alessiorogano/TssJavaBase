package Esercitazioni;

import java.util.Scanner;

public class Esercitazione01 {

    public static void main(String[] args) {

        int numero;
        int resto;

        System.out.println("INSERISCI NUMERO");

        Scanner s = new Scanner(System.in);

        numero = s.nextInt();

        resto = numero % 2;

        if (resto != 0) {
            System.out.println("il numero" + numero + "e' dispari");
        } else {
            System.out.println("il numero" + numero + "e' pari");
        }

    }

}
