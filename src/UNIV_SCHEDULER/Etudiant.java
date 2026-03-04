package UNIV_SCHEDULER;
import java.time.LocalDateTime;
public class Etudiant extends Utilisateurs
{
    public String filiere ;
    private String numeroEtudiant ;
    private String niveau ;
    private Classe classe ;
    public Etudiant() {
        super();
        setRole(Role.ETUDIANT);
    }
    public Etudiant(int id, String nom, String prenom, String email) {
        super(nom, prenom, email, id, email, "", LocalDateTime.now(), Role.ETUDIANT, true);
    }

    public Etudiant(String nom, String prenom, String adresse, int id, String mail, String motdepasse,
            LocalDateTime dateInscription, boolean isActive, String filiere, String numeroEtudiant, String niveau,
            Classe classe) {
        super(nom, prenom, adresse, id, mail, motdepasse, dateInscription, Role.ETUDIANT, isActive);
        this.filiere = filiere;
        this.numeroEtudiant = numeroEtudiant;
        this.niveau = niveau;
        this.classe = classe;
    }
    public String getFiliere() {
        return filiere;
    }
    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }
    public String getNumeroEtudiant() {
        return numeroEtudiant;
    }
    public void setNumeroEtudiant(String numeroEtudiant) {
        this.numeroEtudiant = numeroEtudiant;
    }
    public String getNiveau() {
        return niveau;
    }
    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
    public Classe getClasse() {
        return classe;
    }
    public void setClasse(Classe classe) {
        this.classe = classe;
    }
    public boolean avoirclasse() {
        return this.classe != null;
    }
    @Override
    public String toString() {
        return "Etudiant [nom=" + nom + ", filiere=" + filiere + ", prenom=" + prenom + ", numeroEtudiant="
                + numeroEtudiant + ", id=" + id + ", niveau=" + niveau + ", mail=" + mail + ", classe=" + classe
                + ", role=" + role + "]";
    }
}
