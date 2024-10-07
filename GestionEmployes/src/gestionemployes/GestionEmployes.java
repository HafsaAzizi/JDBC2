package gestionemployes;
import java.util.ArrayList;
import java.util.List;
import ma.projet.beans.*;
import ma.projet.connexion.Connexion;
import ma.projet.services.*;
import ma.projet.services.DeveloppeurService;
import ma.projet.services.DirecteurService;
public class GestionEmployes {
    public static void main(String[] args) {

        DeveloppeurService devService = new DeveloppeurService();
        ManagerService managerService = new ManagerService();
        DirecteurService directeurService = new DirecteurService();
           
       // Création de trois développeurs
       Developpeur dev1 = new Developpeur("FATIMA", "ELOUARDANI", 12547);
       Developpeur dev2 = new Developpeur("MOUNIR", "BENISS", 13560);
       Developpeur dev3 = new Developpeur("FOUAD", "BENNAYA", 10000);
     //  devService.create(dev1);
     //  devService.create(dev2);
      // devService.create(dev3);
        
        /*                           Création du Manager                                */
        // Création de développeurs
          dev1.setId(5); 
          dev2.setId(6); 
        // Création de la liste de développeurs
             List<Developpeur> developpeurs = new ArrayList<>();
              developpeurs.add(dev1);
              developpeurs.add(dev2);
         // Création d'un manager
          Manager manager = new Manager("MANAL", "AZIZI", 25000);
          // Associer les développeurs au manager
          manager.setDevelop(developpeurs); 
           ManagerService managerService1 = new ManagerService();
         //  boolean success = managerService1.create(manager);
          // System.out.println("Création du manager réussie : " + success);

        /*                          Fin creation manager                                         */
        
        
        
        
        
        
        
                              /*      Création directeur          */
          dev3.setId(7);
          manager.setId(1);  
        // Création d'un directeur
          Directeur directeur = new Directeur("BENNANI", "ALI", 70000, manager, dev3);
        //  directeurService.create(directeur);
        /*                      Fin Création directeur                                       */

                                          /* Affichage des informations    */
        System.out.println("===== Hiérarchie des employés =====");

        // Affichage du manager et des développeurs gérés par le manager
        System.out.println("Manager: " + manager.getNom() + " " 
            + manager.getPrenom() + ", Salaire: " + manager.getSalaire());
        System.out.println("  Développeurs gérés:");
        for (Developpeur dev : developpeurs) {
            System.out.println("    Développeur: " + dev.getNom() + " " 
               + dev.getPrenom() + ", Salaire: " + dev.getSalaire());
        }

        // Affichage du directeur
        System.out.println("Directeur: " + directeur.getNom() + " " 
            + directeur.getPrenom() + ", Salaire: " + directeur.getSalaire());
        System.out.println(" les Employés gérés par directeur:");
        
        System.out.println("  les Développeur gérés par le Directeur: " + dev3.getNom() + " " 
            + dev3.getPrenom() + ", Salaire: " + dev3.getSalaire());
        System.out.println(" les Manager gérés par Directeur): " + manager.getNom() + " " 
            + manager.getPrenom() + ", Salaire: " + manager.getSalaire());
   
        
        
        
        
        
    }
    
}
