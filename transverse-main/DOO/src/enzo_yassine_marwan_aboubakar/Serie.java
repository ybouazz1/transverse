package enzo_yassine_marwan_aboubakar;

import java.util.ArrayList;

public class Serie extends Media {  
    private int nbEpisode;  
    private ArrayList<Episode> listeEpisode;

    public Serie(int annee, String titre, int duree, String realisateur, String genre) {  
        super(annee, titre, duree, realisateur, genre);  /* pas vu en cours mais permet l'acces a la classe parent qui est Media pour les attributs */
        this.nbEpisode = 0;  
        this.listeEpisode = new ArrayList<>();  
    }

    public void ajouterEpisode(Episode e) {  
        if (e != null) {  
            listeEpisode.add(e);  
            nbEpisode = listeEpisode.size();  
        }  
    }

    public int getNbEpisode() {  
        return nbEpisode;  
    }

    public void setNbEpisode(int nbEpisode) {  
        this.nbEpisode = nbEpisode;  
    }

    public ArrayList<Episode> getListeEpisode() {  
        return listeEpisode;  
    }

    public void setListeEpisode(ArrayList<Episode> listeEpisode) {  
        this.listeEpisode = listeEpisode;  
    }  
}