package exerciceregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controleur {
    public boolean verifNom(Enregistrement e){
        String reg = "^R[1-3][A-Z][a-z]{4}[A-Z][a-z]";

        return (e.getNomUsager().matches(reg));
    }
    public boolean verifCouriel(Enregistrement e){
        String reg = ".*@.*";

        return (e.getAdresseCouriel().matches(reg));
    }
    public boolean verifMotDePasse(Enregistrement e){
        String reg = "";
        Pattern p = Pattern.compile("\\d");
        Matcher m = p.matcher(e.getMotDePasse());
        Pattern p1 = Pattern.compile("[A-Z]");
        Matcher m1 = p.matcher(e.getMotDePasse());



        return (m.find() || m1.find());
    }


}
