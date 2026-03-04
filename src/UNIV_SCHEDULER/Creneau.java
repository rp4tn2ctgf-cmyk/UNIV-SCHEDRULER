package UNIV_SCHEDULER;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Creneau {
public int id;
public Salle salle;
public Cours cours;
public Jour jour;
public LocalTime heureDebut;
public int duree;
public LocalDate dateDebut;
public LocalDate dateFin;
public enum Jour {
    LUNDI, MARDI, MERCREDI, JEUDI, VENDREDI, SAMEDI, DIMANCHE   
}
public Creneau() {  }
public Creneau(int id, Salle salle, Cours cours, Jour jour, LocalTime heureDebut, int duree, LocalDate dateDebut, LocalDate dateFin) {
    this.id = id;
    this.salle = salle;
    this.cours = cours;
    this.jour = jour;
    this.heureDebut = heureDebut;
    this.duree = duree;
    this.dateDebut = dateDebut;
    this.dateFin = dateFin;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public Salle getSalle() {
    return salle;
}
public void setSalle(Salle salle) {
    this.salle = salle;
}
public Cours getCours() {
    return cours;
}
public void setCours(Cours cours) {
    this.cours = cours;
}
public Jour getJour() {
    return jour;
}
public void setJour(Jour jour) {
    this.jour = jour;
}
public LocalTime getHeureDebut() {
    return heureDebut;
}
public void setHeureDebut(LocalTime heureDebut) {
    this.heureDebut = heureDebut;
}
public int getDuree() {
    return duree;
}
public void setDuree(int duree) {
    this.duree = duree;
}
public LocalDate getDateDebut() {
    return dateDebut;
}
public void setDateDebut(LocalDate dateDebut) {
    this.dateDebut = dateDebut;
}
public LocalDate getDateFin() {
    return dateFin;
}
public void setDateFin(LocalDate dateFin) {
    this.dateFin = dateFin;
}
public LocalTime getHeureFin() {
    return heureDebut.plusMinutes(duree);
}
public boolean chevauchement(Creneau autre) {
    if(this.salle.getId() != autre.salle.getId()) {
        return false; 
    }
    if(this.jour != autre.jour) {
        return false; 
    }  
    if(this.jour!= autre.jour) {
        return false; 
    }
    LocalTime thisFin = this.getHeureFin();
    LocalTime autreFin = autre.getHeureFin();
    return (this.heureDebut.isBefore(autreFin) && thisFin.isAfter(autre.heureDebut)) || (autre.heureDebut.isBefore(thisFin) && autreFin.isAfter(this.heureDebut));
}
public boolean enseignantChevauchement(Creneau autre) {
    if(this.cours.getProfesseur().getId() != autre.cours.getProfesseur().getId()) {
        return false; 
    }
    if(this.jour != autre.jour) {
        return false; 
    }  
    LocalTime thisFin = this.getHeureFin();
    LocalTime autreFin = autre.getHeureFin();
    return (this.heureDebut.isBefore(autreFin) && thisFin.isAfter(autre.heureDebut)) || (autre.heureDebut.isBefore(thisFin) && autreFin.isAfter(this.heureDebut));
}
public String getDureeFomatter() {
    int heures = duree / 60;
    int minutes = duree % 60;
    return String.format("%02d:%02d", heures, minutes);
}
public String gethoraireformatter() {
    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
    return String.format("%s %s - %s", jour, heureDebut.format(timeFormatter), getHeureFin().format(timeFormatter));
    }
@Override
public String toString() {
    return "Creneau [id=" + id + ", salle=" + salle + ", cours=" + cours + ", jour=" + jour + ", heureDebut="
            + heureDebut + ", duree=" + duree + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + "]";
}
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    result = prime * result + ((salle == null) ? 0 : salle.hashCode());
    result = prime * result + ((cours == null) ? 0 : cours.hashCode());
    result = prime * result + ((jour == null) ? 0 : jour.hashCode());
    result = prime * result + ((heureDebut == null) ? 0 : heureDebut.hashCode());
    result = prime * result + duree;
    result = prime * result + ((dateDebut == null) ? 0 : dateDebut.hashCode());
    result = prime * result + ((dateFin == null) ? 0 : dateFin.hashCode());
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
    Creneau other = (Creneau) obj;
    if (id != other.id)
        return false;
    if (salle == null) {
        if (other.salle != null)
            return false;
    } else if (!salle.equals(other.salle))
        return false;
    if (cours == null) {
        if (other.cours != null)
            return false;
    } else if (!cours.equals(other.cours))
        return false;
    if (jour != other.jour)
        return false;
    if (heureDebut == null) {
        if (other.heureDebut != null)
            return false;
    } else if (!heureDebut.equals(other.heureDebut))
        return false;
    if (duree != other.duree)
        return false;
    if (dateDebut == null) {
        if (other.dateDebut != null)
            return false;
    } else if (!dateDebut.equals(other.dateDebut))
        return false;
    if (dateFin == null) {
        if (other.dateFin != null)
            return false;
    } else if (!dateFin.equals(other.dateFin))
        return false;
    return true;
} 
}
    

