package ma.projet.beans;
import java.util.Date;
public class Message {
    private int id;
    private String objet;
    private String sujet;
    private Date date;
    private Employe empEmetteur;
    private Employe empRecepteur;
    public Message(int id, String objet, String sujet, Date date, Employe empEmetteur, Employe empRecepteur) {
        this.id = id;
        this.objet = objet;
        this.sujet = sujet;
        this.date = date;
        this.empEmetteur = empEmetteur;
        this.empRecepteur = empRecepteur;
    }
    public Message(String objet, String sujet, Date date, Employe empEmetteur, Employe empRecepteur) {
        this.objet = objet;
        this.sujet = sujet;
        this.date = date;
        this.empEmetteur = empEmetteur;
        this.empRecepteur = empRecepteur;
    }
    // Getters and setters
    public int getId() {
        return id;
    }
    public String getObject() {
        return objet;
    }
    public String getSujet() {
        return sujet;
    }
    public Date getDate() {
        return date;
    }
    public Employe getEmpEmetteur() {
        return empEmetteur;
    }
    public Employe getEmpRecepteur() {
        return empRecepteur;
    }
}
