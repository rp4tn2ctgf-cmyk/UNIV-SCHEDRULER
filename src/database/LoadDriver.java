package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class LoadDriver {
    public static void main(String[] args) {
        try {
            System.out.println("Connexion en cours...");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Ecole",
                "root",
                "mado2009"
            );

            System.out.println("Connexion réussie !");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Etudiant");

            System.out.println("Liste des étudiants :");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("NEtudiant") + " | " +
                    rs.getString("nom") + " | " +
                    rs.getString("prenom")
                );
            }

            con.close();

        } catch (Exception ex) {
            System.out.println("Erreur : " + ex.getMessage());
        }
    }
}