package UNIV_SCHEDULER;

public class Equipements {
    public String nom;
    public String type;
    public int id;
    public String description;
    public int quantite;
    public Equipements() {     
        this.quantite = 1;
    }
    public Equipements(String nom, String type, int id, String description, int quantite) {
        this.nom = nom;
        this.type = type;
        this.id = id;
        this.description = description;
        this.quantite = quantite;
    }
    
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getQuantite() {
        return quantite;
    }
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    public boolean correspond(String terme){
        if (terme== null || terme.isBlank()) {
            return true;   
        }
        return nom.toLowerCase().contains(terme.toLowerCase()) || type.toLowerCase().contains(terme.toLowerCase());
    }
    @Override
    public String toString() {
        return "Equipements [nom=" + nom + ", type=" + type + ", id=" + id + ", description=" + description
                + ", quantite=" + quantite + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nom == null) ? 0 : nom.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + id;
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + quantite;
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
        Equipements other = (Equipements) obj;
        if (nom == null) {
            if (other.nom != null)
                return false;
        } else if (!nom.equals(other.nom))
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        if (id != other.id)
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (quantite != other.quantite)
            return false;
        return true;
    }
}