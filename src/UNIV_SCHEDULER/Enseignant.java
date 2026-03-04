package UNIV_SCHEDULER;
import java.time.LocalDateTime;

public class Enseignant extends Utilisateurs {
    public String specialite;
    public String grade;
    public String departement;
    public Enseignant() {
        super();
        setRole(Role.PROFESSEUR);
    }
    public Enseignant(String nom, String prenom, String adresse, int id, String mail, String motdepasse,LocalDateTime dateInscription, boolean isActive, String specialite, String grade, String departement) {
        super(nom, prenom, adresse, id, mail, motdepasse, dateInscription, Role.PROFESSEUR, isActive);
        this.specialite = specialite;
        this.grade = grade;
        this.departement = departement;  
        }
    public String getSpecialite() {
        return specialite;
    }
    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getDepartement() {
        return departement;
    }
    public void setDepartement(String departement) {
        this.departement = departement;
    }
    @Override
    public String toString() {
        return "Enseignant [nom=" + nom + ", specialite=" + specialite + ", prenom=" + prenom + ", grade=" + grade
                + ", departement=" + departement + ", id=" + id + ", mail=" + mail + ", role=" + role + "]";
    }
}
