package UNIV_SCHEDULER;

public class Salle {
    public int id;
    public int numero;
    public int batiment;
    public int capacite;
    public String typeSalle;
    public Boolean disponibilite;
    public Salle(int id, int numero, int batiment, int capacite, String typeSalle, Boolean disponibilite) {
        this.id = id;
        this.numero = numero;
        this.batiment = batiment;
        this.capacite = capacite;
        this.typeSalle = typeSalle;
        this.disponibilite = disponibilite;
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
    public int getBatiment() {
        return batiment;
    }
    public void setBatiment(int batiment) {
        this.batiment = batiment;
    }
    public int getCapacite() {
        return capacite;
    }
    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
    public Boolean getDisponibilite() {
        return disponibilite;
    }
    public void setDisponibilite(Boolean disponibilite) {
        this.disponibilite = disponibilite;
    }


    public String getTypeSalle() {
        return typeSalle;
    }


    public void setTypeSalle(String typeSalle) {
        this.typeSalle = typeSalle;
    }

    

}
