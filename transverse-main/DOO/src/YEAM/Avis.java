package YEAM;

public class Avis {
    private int note;
    private String commentaire;

    // Constructeur de la classe Avis
  public Avis(int note, String commentaire) {
    if (note >= 1 && note <= 5) {
        this.note = note;
    } else {
        this.note = 1;
    }
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