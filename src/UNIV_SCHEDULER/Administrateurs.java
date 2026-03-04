package UNIV_SCHEDULER;
import java.time.LocalDateTime;

public class Administrateurs extends Utilisateurs{

    public Administrateurs() {
        super();
        setRole(Role.ADMIN);
    }
    public Administrateurs(String nom, String prenom, String adresse, int id, String mail, String motdepasse,
            LocalDateTime dateInscription, boolean isActive) {
        super(nom, prenom, adresse, id, mail, motdepasse, dateInscription, Role.ADMIN, isActive);
    }
    public boolean Accesstotal() {
        return isActive(); 
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
