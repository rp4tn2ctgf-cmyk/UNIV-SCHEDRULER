package UNIV_SCHEDULER;
import java.util.ArrayList;
import java.util.List;

public class Classe {
    public int id;
    public String nom;
    public  int  annee;
    public String filiere;
    public List<Etudiant> etudiants;
    public Classe() {
        this.etudiants = new ArrayList<>(); 
    }
    public Classe(int id, String nom, int annee, String filiere) {
        this.id = id;
        this.nom = nom;
        this.annee = annee;
        this.filiere = filiere;
        this.etudiants = new ArrayList<>(); 
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
    public int getAnnee() {
        return annee;
    }
    public void setAnnee(int annee) {
        this.annee = annee;
    }
    public String getFiliere() {
        return filiere;
    }
    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }
    public List<Etudiant> getEtudiants() {
        return etudiants;
    }
    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }   
    public void ajouterEtudiant(Etudiant etudiant) {
        if (etudiant != null && !etudiants.contains(etudiant)) {
            etudiants.add(etudiant);
            etudiant.setClasse(this); 
        }
    }
    public int getNombreEtudiants() {
        return etudiants.size();    
    }
    public String Description() {
        return nom + " - " + filiere + " (" + annee + "ème année) - " ;
    }
    @Override
    public String toString() {
        return "Classe [id=" + id + ", nom=" + nom + ", annee=" + annee + ", filiere=" + filiere + ", etudiants="
                + etudiants + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((nom == null) ? 0 : nom.hashCode());
        result = prime * result + annee;
        result = prime * result + ((filiere == null) ? 0 : filiere.hashCode());
        result = prime * result + ((etudiants == null) ? 0 : etudiants.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Classe other = (Classe) obj;
        if (id != other.id)
            return false;
        if (nom == null) {
            if (other.nom != null)
                return false;
        } else if (!nom.equals(other.nom))
            return false;
        if (annee != other.annee)
            return false;
        if (filiere == null) {
            if (other.filiere != null)
                return false;
        } else if (!filiere.equals(other.filiere))
            return false;
        if (etudiants == null) {
            if (other.etudiants != null)
                return false;
        } else if (!etudiants.equals(other.etudiants))
            return false;
        return true;
    }
    
}
