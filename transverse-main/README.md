Projet SAE 1256

Présentation
Ce projet consiste en la conception et le développement d’un site web de découverte et de gestion de films, inspiré de plateformes comme Letterboxd.
Les utilisateurs peuvent consulter des informations sur des films, exprimer leur avis et organiser leurs contenus selon leurs préférences.
Ce projet est réalisé dans le cadre du S2 du BUT Informatique de Paris-Saclay et vise à mettre en application les compétences acquises.

Fonctionnalités

* Recherche et consultation de films
* Système de notation
* Ajout de commentaires et d’avis
* Création et gestion de listes de films
* Gestion des utilisateurs (inscription et connexion)

Équipe
Projet réalisé par :

* Arrouk Marwan @marrouk
* Bouazza Yassine @ybouazz1
* Giarrizzo Enzo @egiarri
* Fofana Aboubacar @afofan14

BUT Informatique Paris-Saclay – Iut d'Orsay
Année universitaire 2025–2026



Partie Qualité

\## Installation et Exécution



\### Importation du projet

1\. Clonez le dépôt Git : `git clone https://git.iut-orsay.fr/ybouazz1/transverse.git`

2\. Ouvrez \*\*Eclipse IDE\*\*.

3\. Allez dans `File` > `Import...` > `General` > `Existing Projects into Workspace`.

4\. Sélectionnez le dossier racine du projet et cliquez sur `Finish`.



\### Lancement de l'application

Localisez la classe `Main.java` dans le package `src/YEAM`, faites un clic droit > `Run As` > `Java Application`.



\---



\## Tests Unitaires 



Nous utilisons les \*\*assertions natives de Java\*\* (`assert`) pour valider la logique métier.



\### Configuration d'Eclipse pour les tests

Pour que les tests fonctionnent, vous devez impérativement :

1\. \*\*Ajouter le dossier de tests au Build Path\*\* : 

&#x20;  \* Clic droit sur le projet > `Properties` > `Java Build Path`.

&#x20;  \* Onglet `Source` > `Add Folder` > cochez le répertoire `tests/`.

2\. \*\*Activer les assertions\*\* :

&#x20;  \* Allez dans `Run` > `Run Configurations...`.

&#x20;  \* Dans l'onglet `Arguments`, ajoutez \*\*`-ea`\*\* dans la case \*\*VM arguments\*\*.



\### Exécution

Chaque classe de test (ex: `MediaTest.java`) possède sa propre méthode `main`. Faites `Run As` > `Java Application` sur le fichier de test souhaité.



\---



\## Répartition des tests 



Conformément aux consignes de M. Hoang La, nous avons mis en place des tests croisés : le développeur d'une fonctionnalité n'est pas celui qui a écrit son test.



| Classe Testée | Méthodes Testées | Testeur (Auteur du test) | Développeur du code source |

| :--- | :--- | :--- | :--- |

| Media | `calculerScoreMoyen`, `ajouterAvis` | Yassine | Enzo |

| Utilisateur | `suivre`, `ajouterAvis` | Marwan | Yassine |

| ListeMedia | `ajouterMedia`, `supprimerMedia` | Enzo | Marwan |



