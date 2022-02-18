package academia.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao02 {
    public static boolean ValidaSenha(String senha) {
        String senhaForte = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[!@#$%^&*()-+])"
                + "(?=\\S+$).{6,}$";
        /*
         * Nesse momento obteremos uma instância de Pattern, através do * método
         * static compile(String regex), o qual recebe uma String que é a
         * expressção regular
         */
        Pattern p = Pattern.compile(senhaForte);

        //O método find() da Classe Matcher tenta encontrar a próxima subsequência da sequência de entrada que encontra o padrão. Ele retorna um valor booleano mostrando o mesmo.
        if (!p.matcher (senha).find()) return false;

        /*
         * Aqui, atravÃ©s da instancia de Pattern, chamando o método * matcher() e passando a fonte de busca
         */
        Matcher m = p.matcher(senha);

        return m.matches();
    }
}
