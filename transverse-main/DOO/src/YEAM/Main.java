package YEAM;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Utilisateur> utilisateurs = FactoryMedia.creerDonnees();

        for (Utilisateur u : utilisateurs) {
            System.out.println(u.afficher());

            System.out.println("Medias a voir :");
            for (Media m : u.getListeMediaAVoir()) {
                System.out.println("- " + m.afficher());
            }

            System.out.println("Listes :");
            for (ListeMedia liste : u.getListesMedia()) {
                System.out.println(liste.afficher());
            }

            System.out.println("Suivis :");
            for (Utilisateur suivi : u.getListePersonneSuivis()) {
                System.out.println("- " + suivi.getPseudo());
            }

            System.out.println("---------------------");
        }
    }
}