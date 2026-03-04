package UNIV_SCHEDULER;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Notification {
    private int id;
    private Utilisateurs destinataire;
    private String message;
    private LocalDateTime dateEnvoi;
    private boolean lu;
    private TypeNotification type;
    private Creneau creneau;
    private Reservation reservation;
    private Salle salle;
    public enum TypeNotification {
        CONFLIT, CHANGEMENT_SALLE, DISPONIBILITE, RAPPEL;
        public String getIcone() {
        return switch (this) {
            case CONFLIT          -> "⚠";
            case CHANGEMENT_SALLE -> "📢";
            case RAPPEL           -> "⏰";
            case DISPONIBILITE    -> "✅";
        };
        }
        public String getLibelle() {
            return switch (this) {
                case CONFLIT          -> "Conflit de réservation détecté pour le créneau " ;
                case CHANGEMENT_SALLE -> "Changement de salle  " ;
                case RAPPEL           -> "Rappeel";
                case DISPONIBILITE    -> "La salle disponible" ;
            };
        }
    }

    public Notification() {
        this.dateEnvoi = LocalDateTime.now();
        this.lu = false;
    }

    public Notification(int id, Utilisateurs destinataire, String message, LocalDateTime dateEnvoi, boolean lu,
            TypeNotification type, Creneau creneau, Reservation reservation, Salle salle) {
        this.id = id;
        this.destinataire = destinataire;
        this.message = message;
        this.dateEnvoi = dateEnvoi;
        this.lu = lu;
        this.type = type;
        this.creneau = creneau;
        this.reservation = reservation;
        this.salle = salle;
    }
    public Notification(String message, TypeNotification type, Utilisateurs destinataire) {
        this.message = message;
        this.type = type;
        this.destinataire = destinataire;
        this.dateEnvoi = LocalDateTime.now();
        this.lu = false;
    }

    public Notification(String message, TypeNotification type, Utilisateurs destinataire, Creneau creneau) {
        this(message,type,destinataire);
        this.creneau = creneau; 
    }
    public Notification(String message, TypeNotification type, Utilisateurs destinataire, Reservation reservation) {
        this(message,type,destinataire);
        this.reservation = reservation; 
    }
    public Notification(String message, TypeNotification type, Utilisateurs destinataire, Salle salle) {
        this(message,type,destinataire);
        this.salle = salle; 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Utilisateurs getDestinataire() {
        return destinataire;
    }

    public void setDestinataire(Utilisateurs destinataire) {
        this.destinataire = destinataire;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getDateEnvoi() {
        return dateEnvoi;
    }

    public void setDateEnvoi(LocalDateTime dateEnvoi) {
        this.dateEnvoi = dateEnvoi;
    }

    public boolean isLu() {
        return lu;
    }

    public void setLu(boolean lu) {
        this.lu = lu;
    }

    public TypeNotification getType() {
        return type;
    }

    public void setType(TypeNotification type) {
        this.type = type;
    }

    public Creneau getCreneau() {
        return creneau;
    }

    public void setCreneau(Creneau creneau) {
        this.creneau = creneau;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }
    public void marquerCommeLu() {
        this.lu = true;
    }
    public void marquerCommeNonLu() {
        this.lu = false;
    }
    public String getIcone() {
        return type.getIcone();
    }
    public String getLibelle() {
        return type.getLibelle();
    }
    public String getDateEnvoiFormatte() {
        if (dateEnvoi == null) {
            return "";
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return dateEnvoi.format(formatter);
    }
    public String Resumer() {
        return (getIcone() + ""+(type!= null ? type.getLibelle() : "") + " - " + message
        +"|"+message + "\n "+getDateEnvoiFormatte()+(lu ? "✅ (Lu)" : "🔴 (Non lu)"));
    }

    @Override
    public String toString() {
        return "Notification [id=" + id + ", destinataire=" + destinataire + ", message=" + message + ", dateEnvoi="
                + dateEnvoi + ", lu=" + lu + ", type=" + type + ", creneau=" + creneau + ", reservation=" + reservation
                + ", salle=" + salle + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((destinataire == null) ? 0 : destinataire.hashCode());
        result = prime * result + ((message == null) ? 0 : message.hashCode());
        result = prime * result + ((dateEnvoi == null) ? 0 : dateEnvoi.hashCode());
        result = prime * result + (lu ? 1231 : 1237);
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((creneau == null) ? 0 : creneau.hashCode());
        result = prime * result + ((reservation == null) ? 0 : reservation.hashCode());
        result = prime * result + ((salle == null) ? 0 : salle.hashCode());
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
        Notification other = (Notification) obj;
        if (id != other.id)
            return false;
        if (destinataire == null) {
            if (other.destinataire != null)
                return false;
        } else if (!destinataire.equals(other.destinataire))
            return false;
        if (message == null) {
            if (other.message != null)
                return false;
        } else if (!message.equals(other.message))
            return false;
        if (dateEnvoi == null) {
            if (other.dateEnvoi != null)
                return false;
        } else if (!dateEnvoi.equals(other.dateEnvoi))
            return false;
        if (lu != other.lu)
            return false;
        if (type != other.type)
            return false;
        if (creneau == null) {
            if (other.creneau != null)
                return false;
        } else if (!creneau.equals(other.creneau))
            return false;
        if (reservation == null) {
            if (other.reservation != null)
                return false;
        } else if (!reservation.equals(other.reservation))
            return false;
        if (salle == null) {
            if (other.salle != null)
                return false;
        } else if (!salle.equals(other.salle))
            return false;
        return true;
    }


}
