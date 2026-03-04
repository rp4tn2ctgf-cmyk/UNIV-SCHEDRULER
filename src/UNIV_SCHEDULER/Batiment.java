package UNIV_SCHEDULER;
import java.util.List;
import java.util.ArrayList;
public class Batiment {
    public String nom;
    public String adresse;
    public int id;
    public int capacite;
    public int nombreSalles;
    public List<Salle> salles;
    public Batiment(){
        this.salles = new ArrayList<>();
    }
    public Batiment(String nom, String adresse, int id, int capacite, int nombreSalles) {
        this.nom = nom;
        this.adresse = adresse;
        this.id = id;
        this.capacite = capacite;
        this.nombreSalles = nombreSalles;
        this.salles = new ArrayList<>();
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
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
    public int getCapacite() {
        return capacite;
    }
    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
    public int getNombreSalles() {
        return nombreSalles;
    }
    public void setNombreSalles(int nombreSalles) {
        this.nombreSalles = nombreSalles;
    }
    public List<Salle> getSalles() {
        return salles;
    }
    public void setSalles(List<Salle> salles) {
        this.salles = salles;
    }
    public void ajouterSalle(Salle salle) {
        if (salle != null && salles.contains(salle)) {
            salles.add(salle);
        }
    }public int getnombreSalles() {
        return salles.size();
    }
    public int getCapaciteTotale() {
        return salles.stream().mapToInt(Salle::getCapacite).sum();
    }
    @Override
    public String toString() {
        return "Batiment [nom=" + nom + ", adresse=" + adresse + ", id=" + id + ", capacite=" + capacite
                + ", nombreSalles=" + nombreSalles + ", salles=" + salles + "]";
    }
    public boolean equals(Batiment autre) {
        if (autre == null) {
            return false;
        }
        return this.id == autre.id;
    }
    public int hashCode() {
        return Integer.hashCode(id);
    }
}   