package UNIV_SCHEDULER;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reservation {
    public int id;
    public Creneau creneau;
    public Salle salle;
    public Utilisateurs utilisateur;
    public LocalDateTime dateReservation;
    public String motif;
    public Statut statut;
    public int duree;
    public LocalTime heureDebut;
    public LocalTime heureFin;
    public LocalDateTime dateCreation;;
    public enum Statut {
        EN_ATTENTE, CONFIRMEE, ANNULEE
    }
    public Reservation() {  
        this.statut = Statut.EN_ATTENTE;
        this.dateCreation = LocalDateTime.now();
    }
    
    public Reservation(int id, Creneau creneau, Salle salle, Utilisateurs utilisateur, LocalDateTime dateReservation,
            String motif, Statut statut, int duree, LocalTime heureDebut, LocalTime heureFin,
            LocalDateTime dateCreation) {
        this.id = id;
        this.creneau = creneau;
        this.salle = salle;
        this.utilisateur = utilisateur;
        this.dateReservation = dateReservation;
        this.motif = motif;
        this.statut = statut;
        this.duree = duree;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.dateCreation = dateCreation;
    }

    public Salle getSalle() {
        return salle;
    }

    public int getId() {
        return id;
    }
    public Creneau getCreneau() {
        return creneau;
    }
    public Utilisateurs getUtilisateur() {
        return utilisateur;
    }
    public LocalDateTime getDateReservation() {
        return dateReservation;
    }
    public String getMotif() {
        return motif;
    }
    public Statut getStatut() {
        return statut;
    }
    public int getDuree() {
        return duree;
    }
    public LocalTime getHeureDebut() {
        return heureDebut;
    }
    public LocalTime getHeureFin() {
        return heureFin;
    }
    public LocalDateTime getDateCreation() {
        return dateCreation;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setCreneau(Creneau creneau) {
        this.creneau = creneau;
    }
    public void setUtilisateur(Utilisateurs utilisateur) {
        this.utilisateur = utilisateur;
    }
    public void setDateReservation(LocalDateTime dateReservation) {
        this.dateReservation = dateReservation;
    }
    public void setMotif(String motif) {
        this.motif = motif;
    }
    public void setStatut(Statut statut) {
        this.statut = statut;
    }
    public void setDuree(int duree) {
        this.duree = duree;
    }
    public void setHeureDebut(LocalTime heureDebut) {
        this.heureDebut = heureDebut;
    }
    public void setHeureFin(LocalTime heureFin) {
        this.heureFin = heureFin;
    }
    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }
    public LocalTime heureFin(){
        return heureDebut.plusMinutes(duree);
    }
    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public void confirmer() {
        this.statut = Statut.CONFIRMEE;
    }
    public void annuler() {
        this.statut = Statut.ANNULEE;   
    }
    public boolean isActive() {
        return statut != Statut.ANNULEE;
    }
    public boolean chevauchement(Reservation autre) {
        if (autre == null || this.salle == null || autre.salle == null) {
            return false; 
        }
        if (!this.salle.equals(autre.salle)) {
            return false; 
        }
        LocalTime thisFin = this.heureFin();
        LocalTime autreFin = autre.heureFin();
        return (this.heureDebut.isBefore(autreFin) && thisFin.isAfter(autre.heureDebut));
    }
    public String getResume() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return  " Salle: " + salle.AdresseSalle() +  
                ", Date: " + dateReservation.format(formatter) + ", Motif: " + motif + ", Statut: " + statut;
    }
    @Override
    public String toString() {
        return "Reservation [id=" + id + ", creneau=" + creneau + ", salle=" + salle + ", utilisateur=" + utilisateur + ", dateReservation=" + dateReservation + ", motif=" + motif + ", statut=" + statut + ", duree=" + duree
                + ", heureDebut=" + heureDebut + ", heureFin=" + heureFin + ", dateCreation=" + dateCreation + "]"; 
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((creneau == null) ? 0 : creneau.hashCode());
        result = prime * result + ((salle == null) ? 0 : salle.hashCode());
        result = prime * result + ((utilisateur == null) ? 0 : utilisateur.hashCode());
        result = prime * result + ((dateReservation == null) ? 0 : dateReservation.hashCode());
        result = prime * result + ((motif == null) ? 0 : motif.hashCode());
        result = prime * result + ((statut == null) ? 0 : statut.hashCode());
        result = prime * result + duree;
        result = prime * result + ((heureDebut == null) ? 0 : heureDebut.hashCode());
        result = prime * result + ((heureFin == null) ? 0 : heureFin.hashCode());
        result = prime * result + ((dateCreation == null) ? 0 : dateCreation.hashCode());
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
        Reservation other = (Reservation) obj;
        if (id != other.id)
            return false;
        if (creneau == null) {
            if (other.creneau != null)
                return false;
        } else if (!creneau.equals(other.creneau))
            return false;
        if (salle == null) {
            if (other.salle != null)
                return false;
        } else if (!salle.equals(other.salle))
            return false;
        if (utilisateur == null) {
            if (other.utilisateur != null)
                return false;
        } else if (!utilisateur.equals(other.utilisateur))
            return false;
        if (dateReservation == null) {
            if (other.dateReservation != null)
                return false;
        } else if (!dateReservation.equals(other.dateReservation))
            return false;
        if (motif == null) {
            if (other.motif != null)
                return false;
        } else if (!motif.equals(other.motif))
            return false;
        if (statut != other.statut)
            return false;
        if (duree != other.duree)
            return false;
        if (heureDebut == null) {
            if (other.heureDebut != null)
                return false;
        } else if (!heureDebut.equals(other.heureDebut))
            return false;
        if (heureFin == null) {
            if (other.heureFin != null)
                return false;
        } else if (!heureFin.equals(other.heureFin))
            return false;
        if (dateCreation == null) {
            if (other.dateCreation != null)
                return false;
        } else if (!dateCreation.equals(other.dateCreation))
            return false;
        return true;
    }
    
    
}
