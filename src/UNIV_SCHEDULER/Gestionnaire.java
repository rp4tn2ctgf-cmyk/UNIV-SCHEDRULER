package UNIV_SCHEDULER;
import java.time.LocalDateTime;

public class Gestionnaire extends Utilisateurs
{
    public Gestionnaire() {
        super();
        setRole(Role.GESTIONNAIRE);
    }
    public Gestionnaire(String nom, String prenom, String adresse, int id, String mail, String motdepasse,
            LocalDateTime dateInscription, boolean isActive) {
        super(nom, prenom, adresse, id, mail, motdepasse, dateInscription, Role.GESTIONNAIRE, isActive);
    }
    public boolean modifierEmploiDuTemps() {
        return isActive(); 
    }
    @Override
    public String toString() {
        return super.toString();
    }

}
