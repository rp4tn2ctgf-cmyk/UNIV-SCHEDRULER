package UNIV_SCHEDULER;
import java.time.LocalDateTime;

public class Utilisateurs {
    public String nom;
    public String prenom;
    private String adresse;
    public int id;
    public String mail;
    private String motdepasse;
    private LocalDateTime dateInscription;
    public Role role;
    private boolean isActive;
    public enum Role {
        ETUDIANT,
        PROFESSEUR,
        ADMIN,
        GESTIONNAIRE
    }
    public Utilisateurs() {
        this.isActive = true;
        this.dateInscription = LocalDateTime.now();
    }
    public Utilisateurs(String nom, String prenom, String adresse, int id, String mail, String motdepasse,
            LocalDateTime dateInscription, Role role, boolean isActive) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.id = id;
        this.mail = mail;
        this.motdepasse = motdepasse;
        this.dateInscription = dateInscription;
        this.role = role;
        this.isActive = isActive;
    }
    public LocalDateTime getDateInscription() {
        return dateInscription;
    }
    public void setDateInscription(LocalDateTime dateInscription) {
        this.dateInscription = dateInscription;
    }
    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }
    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
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
    public boolean verifierMotdepasse(String motdepasse) {
        return this.motdepasse != null && this.motdepasse.equals(motdepasse);
    }
    public void desactiver() {
        this.isActive = false;
    }
    public void activer() {
        this.isActive = true;
    }

    public String toString() {
        return "Utilisateurs [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", id=" + id + ", mail="
                + mail + ", motdepasse=" + motdepasse + ", dateInscription=" + dateInscription + ", role=" + role
                + ", isActive=" + isActive + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
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
        Utilisateurs other = (Utilisateurs) obj;
        if (id != other.id)
            return false;
        return true;
    }

}
