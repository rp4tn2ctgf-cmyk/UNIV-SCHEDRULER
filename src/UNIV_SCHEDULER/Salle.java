package UNIV_SCHEDULER;
import java.util.ArrayList;
import java.util.List;

public class Salle {
    public int id;
    public int numero;
    public Batiment batiment;
    public int capacite;
    public String typeSalle;
    public Boolean disponibilite;
    private List<Equipements> equipements;
    public enum typeSalle {
        AMPHI, TD, TP
    }
    public Salle() {
        this.equipements = new ArrayList<>();   
        this.disponibilite = true;
    }
    public Salle(int id, int numero, Batiment batiment, int capacite, String typeSalle, Boolean disponibilite,
            List<Equipements> equipements) {
        this.id = id;
        this.numero = numero;
        this.batiment = batiment;
        this.capacite = capacite;
        this.typeSalle = typeSalle;
        this.disponibilite = disponibilite;
        this.equipements = equipements;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Batiment getBatiment() {
        return batiment;
    }
    public void setBatiment(Batiment batiment) {
        this.batiment = batiment;
    }
    public int getCapacite() {
        return capacite;
    }
    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
    public String getTypeSalle() {
        return typeSalle;
    }
    public void setTypeSalle(String typeSalle) {
        this.typeSalle = typeSalle;
    }
    public Boolean getDisponibilite() {
        return disponibilite;
    }
    public void setDisponibilite(Boolean disponibilite) {
        this.disponibilite = disponibilite;
    }
    public List<Equipements> getEquipements() {
        return equipements;
    }
    public void setEquipements(List<Equipements> equipements) {
        this.equipements = equipements;
    }
    public void ajouterEquipement(Equipements equipement) {
        if (equipement != null && !equipements.contains(equipement)) {
            equipements.add(equipement);
        }
    }
    public boolean possedeEquipement(String nomEquipement) {
        return equipements.stream().anyMatch(e -> e.getNom().equalsIgnoreCase(nomEquipement));
    }
    public boolean peutAccueillir(int nombreEtudiants) {
        return capacite >= nombreEtudiants;
    }
    public String AdresseSalle() {
        return "Batiment " + batiment.getAdresse() + ", Salle  " + numero + ", " + batiment.getNom();
    }
    @Override
    public String toString() {
        return "Salle [id=" + id + ", numero=" + numero + ", batiment=" + batiment + ", capacite=" + capacite
                + ", typeSalle=" + typeSalle + ", disponibilite=" + disponibilite + ", equipements=" + equipements
                + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + numero;
        result = prime * result + ((batiment == null) ? 0 : batiment.hashCode());
        result = prime * result + capacite;
        result = prime * result + ((typeSalle == null) ? 0 : typeSalle.hashCode());
        result = prime * result + ((disponibilite == null) ? 0 : disponibilite.hashCode());
        result = prime * result + ((equipements == null) ? 0 : equipements.hashCode());
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
        Salle other = (Salle) obj;
        if (id != other.id)
            return false;
        if (numero != other.numero)
            return false;
        if (batiment == null) {
            if (other.batiment != null)
                return false;
        } else if (!batiment.equals(other.batiment))
            return false;
        if (capacite != other.capacite)
            return false;
        if (typeSalle == null) {
            if (other.typeSalle != null)
                return false;
        } else if (!typeSalle.equals(other.typeSalle))
            return false;
        if (disponibilite == null) {
            if (other.disponibilite != null)
                return false;
        } else if (!disponibilite.equals(other.disponibilite))
            return false;
        if (equipements == null) {
            if (other.equipements != null)
                return false;
        } else if (!equipements.equals(other.equipements))
            return false;
        return true;
    }

    
    

    

}
