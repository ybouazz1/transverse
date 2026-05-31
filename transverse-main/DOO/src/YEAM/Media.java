package YEAM;

import java.util.ArrayList;

public abstract class Media {  
    private int annee;  
    private String titre;  
    private int duree;  
    private String realisateur;  
    private String genre;  
    private double scoreMoyen;  
    private ArrayList<Avis> listeAvis;

    public Media(int annee, String titre, int duree, String realisateur, String genre) {  
        this.annee = annee;  
        this.titre = titre;  
        this.duree = duree;  
        this.realisateur = realisateur;  
        this.genre = genre;  
        this.scoreMoyen = 0.0;  
        this.listeAvis = new ArrayList<>();  
    }

    public void ajouterAvis(Avis avis) {  
        if (avis != null) {  
            listeAvis.add(avis);  
            calculerScoreMoyen();  
        }  
    }

    public double calculerScoreMoyen() {  
    if (listeAvis.isEmpty()) {  
        scoreMoyen = 0.0;  
        return scoreMoyen;  
    }

    double somme = 0;  
    for (Avis avis : listeAvis) {  
        somme += avis.getNote();  
    }

    scoreMoyen = somme / listeAvis.size();  
        return scoreMoyen;  
    }

    public int getAnnee() {  
        return annee;  
    }

    public void setAnnee(int annee) {  
        this.annee = annee;  
    }

    public String getTitre() {  
        return titre;  
    }

    public void setTitre(String titre) {  
        this.titre = titre;  
    }

    public int getDuree() {  
        return duree;  
    }

    public void setDuree(int duree) {  
        this.duree = duree;  
    }

    public String getRealisateur() {  
        return realisateur;  
    }

    public void setRealisateur(String realisateur) {  
        this.realisateur = realisateur;  
    }

    public String getGenre() {  
        return genre;  
    }

    public void setGenre(String genre) {  
        this.genre = genre;  
    }

    public double getScoreMoyen() {  
        return scoreMoyen;  
    }

    public void setScoreMoyen(double scoreMoyen) {  
        this.scoreMoyen = scoreMoyen;  
    }

    public ArrayList<Avis> getListeAvis() {  
        return listeAvis;  
    }

    public void setListeAvis(ArrayList<Avis> listeAvis) {  
        this.listeAvis = listeAvis;  
    }

    public String afficher() {
        return titre + " (" + annee + ") - score : " + scoreMoyen;  
    }  
}