package UNIV_SCHEDULER;

public class Etudiant extends Utilisateurs
{
    public String niveau ;
    public String UFR;
    
    
    public Etudiant(String nom, String prenom, String adresse, int id, String mail, String motdepasse, String niveau,
            String uFR) {
        super(nom, prenom, adresse, id, mail, motdepasse);
        this.niveau = niveau;
        UFR = uFR;
    }
    public String getNiveau() 
    {
        return niveau;
    }
    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
    public String getUFR() 
    {
        return UFR;
    }
    public void setUFR(String uFR) 
    {
        UFR = uFR;
    }
}
