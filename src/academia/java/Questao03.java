package academia.java;

import java.util.Arrays;

public class Questao03 {
    public static boolean isAnagrama(String p1, String p2) {
        /*
        Duas palavras podem ser consideradas anagramas de si mesmas
        se as letras de uma palavra podem ser realocadas para formar a outra palavra.
        Dada uma string qualquer, desenvolva um algoritmo
        que encontre o número de pares de substrings que são anagramas.
         */
        if (p1.length() != p2.length()) {
            return false;
        }
        char[] c1 = p1.toCharArray();
        char[] c2 = p2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        String novaP1 = new String(c1);
        String novaP2 = new String(c2);
        return novaP1.equals(novaP2);
    }
}
