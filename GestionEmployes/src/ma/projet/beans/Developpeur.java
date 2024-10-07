package ma.projet.beans;
public class Developpeur extends Personne{

    public Developpeur( String nom, String prenom, double salaire) {
        super( nom, prenom, salaire);
    }
     public Developpeur(int id, String nom, String prenom, double salaire) {
        super(id, nom, prenom, salaire);
    }
    public Developpeur() {
    }

    public String SetNom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}