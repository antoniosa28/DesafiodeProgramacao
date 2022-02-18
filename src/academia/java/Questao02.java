package academia.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao02 {
    public static boolean ValidaSenha(String senha) {
        String senhaForte = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[!@#$%^&*()-+])"
                + "(?=\\S+$).{6,}$";
        
        Pattern p = Pattern.compile(senhaForte);

        if (!p.matcher (senha).find()) return false;

        Matcher m = p.matcher(senha);

        return m.matches();
    }
}
