package ma.projet.beans;

public class Personne {

    // Déclaration des attributs de la classe Personne
    public int id;
    public String nom;
    public String prenom;
    public double salaire;

    // Constructeur par défaut
    public Personne() {
    }

    // Constructeur avec tous les attributs
    public Personne(int id, String nom, String prenom, double salaire) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    // Constructeur sans id (utilisé si l'ID n'est pas disponible ou géré par une base de données)
    public Personne(String nom, String prenom, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    // Getter et setter pour l'attribut id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter et setter pour l'attribut nom
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getter et setter pour l'attribut salaire
    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    // Getter et setter pour l'attribut prenom
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // Redéfinition de la méthode toString() pour afficher les détails de la personne
    @Override
    public String toString() {
        return "Personne{" + "id=" + id + ", nom='" + nom + '\'' + ", prenom='" + prenom + '\'' + ", salaire=" + salaire + '}';
    }
}
