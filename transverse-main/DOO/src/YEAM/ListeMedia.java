package YEAM;

import java.util.ArrayList;

public class ListeMedia {
    private String nom;
    private ArrayList<Media> listeMedias;

    public ListeMedia(String nom) {
        this.nom = nom;
        this.listeMedias = new ArrayList<>();
    }

    public void ajouterMedia(Media m) {
        if (m != null && !listeMedias.contains(m)) {
            listeMedias.add(m);
        }
    }

    public void supprimerMedia(Media m) {
        listeMedias.remove(m);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Media> getListeMedias() {
        return listeMedias;
    }

    public void setListeMedias(ArrayList<Media> listeMedias) {
        this.listeMedias = listeMedias;
    }

    public String afficher() {
        String texte = "Liste : " + nom + "\n";
        for (Media m : listeMedias) {
            texte += "- " + m.afficher() + "\n";
        }
        return texte;
    }
}