package enzo_yassine_marwan_aboubakar;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Utilisateur> utilisateurs = FactoryMedia.creerDonnees();

        for (Utilisateur u : utilisateurs) {
            System.out.println(u.afficher());

            System.out.println("Medias a voir :");
            for (Media m : u.getMediasAVoir()) {
                System.out.println("- " + m.afficher());
            }

            System.out.println("Listes :");
            for (ListeMedia liste : u.getListesMedia()) {
                System.out.println(liste.afficher());
            }

            System.out.println("Suivis :");
            for (Utilisateur suivi : u.getSuivis()) {
                System.out.println("- " + suivi.getPseudo());
            }

            System.out.println("---------------------");
        }
    }
}