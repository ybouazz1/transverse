package YEAM;

import java.util.ArrayList;

public class Utilisateur {  
    private String pseudo;  
    private ArrayList<Utilisateur> listePersonneSuivis;  
    private ArrayList<ListeMedia> listesMedia;  
    private ArrayList<Media> listeMediaAVoir;  
    private ArrayList<Avis> listeAvis;

    public Utilisateur(String pseudo) {  
        this.pseudo = pseudo;  
        this.listePersonneSuivis = new ArrayList<>();  
        this.listesMedia = new ArrayList<>();  
        this.listeMediaAVoir = new ArrayList<>();  
        this.listeAvis = new ArrayList<>();  
    }

    public void suivre(Utilisateur u) {  
        if (u != null && u != this && !listePersonneSuivis.contains(u)) {  
            listePersonneSuivis.add(u);  
        }  
    }

    public ListeMedia creerListe(String nom) {  
        ListeMedia liste = new ListeMedia(nom);  
        listesMedia.add(liste);  
        return liste;  
    }

    public Avis ajouterAvis(Media m, int note, String commentaire) {  
        Avis avis = new Avis(note, commentaire);  
        listeAvis.add(avis);  
        if (m != null) {  
            m.ajouterAvis(avis);  
        }  
        return avis;  
    }

    public void ajouterMediaAVoir(Media m) {  
        if (m != null && !listeMediaAVoir.contains(m)) {  
            listeMediaAVoir.add(m);  
        }  
    }

    public String getPseudo() {  
        return pseudo;  
    }

    public void setPseudo(String pseudo) {  
        this.pseudo = pseudo;  
    }

    public ArrayList<Utilisateur> getListePersonneSuivis() {  
        return listePersonneSuivis;  
    }

    public void setListePersonneSuivis(ArrayList<Utilisateur> listePersonneSuivis) {  
        this.listePersonneSuivis = listePersonneSuivis;  
    }

    public ArrayList<ListeMedia> getListesMedia() {  
        return listesMedia;  
    }

    public void setListesMedia(ArrayList<ListeMedia> listesMedia) {  
        this.listesMedia = listesMedia;  
    }

    public ArrayList<Media> getListeMediaAVoir() {  
        return listeMediaAVoir;  
    }

    public void setListeMediaAVoir(ArrayList<Media> listeMediaAVoir) {  
        this.listeMediaAVoir = listeMediaAVoir;  
    }

    public ArrayList<Avis> getListeAvis() {  
        return listeAvis;  
    }

    public void setListeAvis(ArrayList<Avis> listeAvis) {  
        this.listeAvis = listeAvis;  
    }

    public String afficher() {  
        return "Utilisateur : " + pseudo;  
    }  
}