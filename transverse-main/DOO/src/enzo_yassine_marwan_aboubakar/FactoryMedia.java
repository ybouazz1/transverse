package enzo_yassine_marwan_aboubakar;

import java.util.ArrayList;

public class FactoryMedia {

    public static ArrayList<Utilisateur> creerDonnees(){  
        ArrayList<Utilisateur> utilisateurs = new ArrayList<>();

        Film film1 = new Film(2014, "Interstellar", 169, "Christopher Nolan", "Science-fiction");  
        Film film2 = new Film(2010, "Inception", 148, "Christopher Nolan", "Science-fiction");

        Serie serie1 = new Serie(2022, "Mercredi", 50, "Tim Burton", "Fantastique");  
        Episode e1 = new Episode(2022, "Episode 1", 50, "Tim Burton", "Fantastique", 1, 1);  
        Episode e2 = new Episode(2022, "Episode 2", 48, "Tim Burton", "Fantastique", 1, 2);

        serie1.ajouterEpisode(e1);  
        serie1.ajouterEpisode(e2);

        Utilisateur u1 = new Utilisateur("Yassine");  
        Utilisateur u2 = new Utilisateur("Adam");

        u1.suivre(u2);

        u1.ajouterMediaAVoir(film2);  
        u1.ajouterMediaAVoir(serie1);

        ListeMedia favoris = u1.creerListe("Favoris");  
        favoris.ajouterMedia(film1);  
        favoris.ajouterMedia(serie1);

        u1.ajouterAvis(film1, 5, "Excellent");  
        u2.ajouterAvis(film1, 4, "Très bien");

        utilisateurs.add(u1);  
        utilisateurs.add(u2);

        return utilisateurs;  
    }  
}
