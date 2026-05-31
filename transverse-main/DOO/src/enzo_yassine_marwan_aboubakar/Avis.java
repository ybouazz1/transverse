package enzo_yassine_marwan_aboubakar;

public class Avis {
    private int note;
    private String commentaire;

    // Constructeur de la classe Avis
    public Avis(int note, String commentaire) {
        this.note = note;
        this.commentaire = commentaire;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String afficher() {
        return "Note : " + note + ", commentaire : " + commentaire;
    }
}