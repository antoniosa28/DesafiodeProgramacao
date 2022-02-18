package academia.java;

import java.util.Scanner;

import static academia.java.Questao02.ValidaSenha;

public class Questao02Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome da pessoa: ");
        String nome = scanner.next();
        System.out.println("Senha: ");
        String senha = scanner.next();



        System.out.println(ValidaSenha(senha));
    }
}

