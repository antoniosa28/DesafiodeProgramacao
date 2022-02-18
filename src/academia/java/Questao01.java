package academia.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
    /*
    Escreva um algoritmo que mostre na tela uma escada de tamanho n
    utilizando o caractere * e espaços. A base e altura da escada devem ser iguais ao valor de n.
    A última linha não deve conter nenhum espaço.
     */

        Scanner inicio = new Scanner(System.in);
        List<String> escada = new ArrayList<>();

        System.out.println("Digite o tamanho de n: ");
        int n = inicio.nextInt();

        for (int i = 0; i < n; i++) {
            escada.add(" ".repeat(n - i) + "*".repeat(i + 1));
        }
        for (String d : escada) {
            System.out.println(d);
        }
    }
}
