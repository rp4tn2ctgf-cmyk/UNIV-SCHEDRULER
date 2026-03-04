package UNIV_SCHEDULER;
import java.util.ArrayList;
import java.util.List;


public class Cours {
    public int id;
    public String matiere;
    public Enseignant professeur;
    public Classe classe;
    public List<Creneau> creneaux;
    public Cours() {
        this.creneaux = new ArrayList<>();
    }
    public Cours(int id, String matiere, Enseignant professeur, Classe classe) {
        this.id = id;
        this.matiere = matiere;
        this.professeur = professeur;
        this.classe = classe;
        this.creneaux = new ArrayList<>();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMatiere() {
        return matiere;
    }
    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }
    public Enseignant getProfesseur() {
        return professeur;
    }
    public void setProfesseur(Enseignant professeur) {
        this.professeur = professeur;
    }
    public Classe getClasse() {
        return classe;
    }
    public void setClasse(Classe classe) {
        this.classe = classe;
    }
    public List<Creneau> getCreneaux() {
        return creneaux;
    }
    public void setCreneaux(List<Creneau> creneaux) {
        this.creneaux = creneaux;
    }
    public void ajouterCreneau(Creneau creneau) {
        if (creneau != null && !creneaux.contains(creneau)) {
            creneaux.add(creneau);
        }
    }
    public int getNombreCreneaux() {
        return creneaux.size();
    }
    public int getdureetotal(){
        return creneaux.stream().mapToInt(c -> c.getDuree()).sum(); 
    }
    public String InfoCours() {
        StringBuilder info = new StringBuilder(matiere);
        if(classe != null) {
            info.append("Classe: ").append(classe.getNom()).append("\n");
        }if(professeur != null) {
            info.append("Professeur: ").append(professeur.getNom()).append(" ").append(professeur.getPrenom()).append("\n");
        }
        return info.toString();
    }
    @Override
    public String toString() {
        return "Cours [id=" + id + ", matiere=" + matiere + ", professeur=" + professeur + ", classe=" + classe
                + ", creneaux=" + creneaux + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((matiere == null) ? 0 : matiere.hashCode());
        result = prime * result + ((professeur == null) ? 0 : professeur.hashCode());
        result = prime * result + ((classe == null) ? 0 : classe.hashCode());
        result = prime * result + ((creneaux == null) ? 0 : creneaux.hashCode());
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
        Cours other = (Cours) obj;
        if (id != other.id)
            return false;
        if (matiere == null) {
            if (other.matiere != null)
                return false;
        } else if (!matiere.equals(other.matiere))
            return false;
        if (professeur == null) {
            if (other.professeur != null)
                return false;
        } else if (!professeur.equals(other.professeur))
            return false;
        if (classe == null) {
            if (other.classe != null)
                return false;
        } else if (!classe.equals(other.classe))
            return false;
        if (creneaux == null) {
            if (other.creneaux != null)
                return false;
        } else if (!creneaux.equals(other.creneaux))
            return false;
        return true;
    }

}