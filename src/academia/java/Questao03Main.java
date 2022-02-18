package academia.java;

import java.util.Scanner;

import static academia.java.Questao03.isAnagrama;

public class Questao03Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeira Palavra");
        String p1 = scanner.next();
        System.out.println("Segunda palavra");
        String p2 = scanner.next();

        System.out.println(isAnagrama(p1,p2));
        }
    }


