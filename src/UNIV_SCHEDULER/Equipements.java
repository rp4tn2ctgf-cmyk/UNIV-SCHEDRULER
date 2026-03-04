package UNIV_SCHEDULER;

public class Equipements {
    public int idEquipement;
    public int idSalle;
    public String nomEquipement;
    public String description;
    public Equipements(int idEquipement, int idSalle, String nomEquipement, String description) {
        this.idEquipement = idEquipement;
        this.idSalle = idSalle;
        this.nomEquipement = nomEquipement;
        this.description = description;
    }
    public int getIdEquipement() {
        return idEquipement;
    }
    public void setIdEquipement(int idEquipement) {
        this.idEquipement = idEquipement;
    }
    public int getIdSalle() {
        return idSalle;
    }
    public void setIdSalle(int idSalle) {
        this.idSalle = idSalle;
    }
    public String getNomEquipement() {
        return nomEquipement;
    }
    public void setNomEquipement(String nomEquipement) {
        this.nomEquipement = nomEquipement;
    }
    public String getdescription() {
        return description;
    }
    public void setdescription(String description) {
        this.description = description;
    }
}
