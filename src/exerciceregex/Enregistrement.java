package exerciceregex;

public class Enregistrement {
    private String nomUsager;
    private String motDePasse;
    private String  adresseCouriel;

    public String getAdresseCouriel() {
        return adresseCouriel;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public String getNomUsager() {
        return nomUsager;
    }

    public Enregistrement(String nomUsager, String motDePasse, String adresseCouriel){
        this.nomUsager = nomUsager;
        this.motDePasse = motDePasse;
        this.adresseCouriel = adresseCouriel;
    }
}
