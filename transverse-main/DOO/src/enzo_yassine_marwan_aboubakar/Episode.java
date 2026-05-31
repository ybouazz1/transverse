package enzo_yassine_marwan_aboubakar;

public class Episode extends Media {
    private int numSaison;
    private int numEpisode;

    public Episode(int annee, String titre, int duree, String realisateur, String genre, int numSaison, int numEpisode) {
        super(annee, titre, duree, realisateur, genre);
        this.numSaison = numSaison;
        this.numEpisode = numEpisode;
    }

    public int getNumSaison() {
        return numSaison;
    }

    public void setNumSaison(int numSaison) {
        this.numSaison = numSaison;
    }

    public int getNumEpisode() {
        return numEpisode;
    }

    public void setNumEpisode(int numEpisode) {
        this.numEpisode = numEpisode;
    }

    public String afficher() {
        return super.afficher() + ", saison : " + numSaison + ", episode : " + numEpisode;
    }
}