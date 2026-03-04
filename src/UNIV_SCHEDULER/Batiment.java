package UNIV_SCHEDULER;

public class Batiment {
    public int id;
    public String nom;
    public String localisation;
    public int nbrEtages;
    public Batiment(int id, String nom, String localisation, int nbrEtages) {
        this.id = id;
        this.nom = nom;
        this.localisation = localisation;
        this.nbrEtages = nbrEtages;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getLocalisation() {
        return localisation;
    }
    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }
    public int getNbrEtages() {
        return nbrEtages;
    }
    public void setNbrEtages(int nbrEtages) {
        this.nbrEtages = nbrEtages;
    }
}
