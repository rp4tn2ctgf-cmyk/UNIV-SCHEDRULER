package UNIV_SCHEDULER;

public class Utilisateurs {
    public String nom;
    public String prenom;
    public String adresse;
    public int id;
    public String mail;
    private String motdepasse;
    public Utilisateurs(String nom, String prenom, String adresse, int id, String mail, String motdepasse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.id = id;
        this.mail = mail;
        this.motdepasse = motdepasse;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getMotdepasse() {
        return motdepasse;
    }
    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }
}
