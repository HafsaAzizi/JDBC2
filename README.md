# JDBC2
## Système de Messagerie

Ce projet met en place une plateforme de communication interne entre les employés d'une société. Les utilisateurs peuvent s'envoyer des messages entre eux, ces échanges étant enregistrés dans une base de données MySQL.

### Fonctionnalités

- Échanges de messages entre employés.
- Possibilité pour chaque employé d’envoyer un message à un ou plusieurs collègues.
- Consultation des messages reçus par un employé spécifique.
- Stockage des données dans une base MySQL.

### Structure du Projet

Le projet inclut les éléments suivants 
- **Classe Employer** 
- **Classe Message**
- **Interface IDao**
- **Classes EmployerService et MessageService** 
### Prérequis

- *JDK 11+*
- *NetBeans 12+*
- *Base de données MySQL*

### Installation

1. Configurer la base de données MySQL 'messagerie' avec les scripts SQL suivants :

#### Création de la table `employe` :
```sql
CREATE TABLE IF NOT EXISTS `employe` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=5;
```
#### Création de la table message :
```sql
CREATE TABLE IF NOT EXISTS `message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `objet` varchar(50) NOT NULL,
  `sujet` varchar(500) NOT NULL,
  `date` date NOT NULL,
  `idE` int(11) NOT NULL,
  `idR` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idE` (`idE`, `idR`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=18;
```

## Gestion d'une Entreprise 

Ce projet gère les employés d'une entreprise avec une hiérarchie comprenant un directeur général, un manager, et des développeurs.

## Fonctionnalités

- Gestion d'une hiérarchie d'employés.
- Affichage des noms et salaires des employés dans l'ordre hiérarchique.
- Gestion centralisée à l'aide de services dédiés.

## Structure du Projet

Le projet inclut les éléments suivants :

- **Classe Personne** : représente un employé de manière générale.
- **Classe Directeur** : représente le directeur général.
- **Classe Manager** : supervise les développeurs.
- **Classe Developpeur** : représente les développeurs de l'entreprise.
- **Interface IDao** : définit les méthodes de gestion (create, update, delete, getById, getAll).
- **Services** : DirecteurService, DeveloppeurService, et ManagerService pour gérer les opérations.
- **Classe Connexion** : établit la connexion avec la base de données.

## Prérequis

- JDK 11+
- NetBeans 12+
- Base de données MySQL

## Installation

1. Importez le projet dans NetBeans.
2. Démarrez XAMPP.

## Base de Données

### Création de la base de données

Créez la base **gestion_employe** :

```sql
CREATE DATABASE IF NOT EXISTS gestion_employe;

## Tables SQL pour la Gestion des Employés
``````

-Pour la table developpeurs :
```sql
CREATE TABLE IF NOT EXISTS developpeurs (
    id int(11) NOT NULL AUTO_INCREMENT,
    nom varchar(50) NOT NULL,
    prenom varchar(50) NOT NULL,
    salair double NOT NULL,
    PRIMARY KEY (id)                                  
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1;
```
-Pour la table manager :
``sql
CREATE TABLE IF NOT EXISTS manager (
    id int(11) NOT NULL AUTO_INCREMENT,
    nom varchar(50) NOT NULL,
    prenom varchar(50) NOT NULL,
    salair double NOT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=5;

```
-Pour la table `directeur` :
```sql
CREATE TABLE IF NOT EXISTS directeur (
    id int(11) NOT NULL AUTO_INCREMENT,
    nom varchar(50) NOT NULL,
    prenom varchar(50) NOT NULL,
    salair double NOT NULL,
    idD int(11) NOT NULL,
    idm int(11) NOT NULL,
    PRIMARY KEY (id),
    KEY idD (idD),
    KEY idm (idm),
    CONSTRAINT fk_directeur_developpeur_id FOREIGN KEY (idD) REFERENCES developpeurs (id) 
        ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT fk_directeur_manager_id FOREIGN KEY (idm) REFERENCES manager (id) 
        ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1;
```

-Pour la table `manager-developpeur` :
```sql
CREATE TABLE IF NOT EXISTS manager_developpeur (
    manager_id INT NOT NULL,
    developpeur_id INT NOT NULL,
    FOREIGN KEY (manager_id) REFERENCES manager(id),
    FOREIGN KEY (developpeur_id) REFERENCES developpeurs(id),
    PRIMARY KEY (manager_id, developpeur_id)
);
```
