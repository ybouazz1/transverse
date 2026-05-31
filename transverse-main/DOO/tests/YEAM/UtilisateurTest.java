package YEAM;

public class UtilisateurTest {

    public static void runTests() {
        suivre_AutreUtilisateur_AjouteDansListe();
        suivre_SoiMeme_ListeInchangee();
        ajouterMediaAVoir_MediaValide_AjouteDansListe();
        System.out.println("Tous les tests de Utilisateur sont passes avec succes !");
    }

    private static void suivre_AutreUtilisateur_AjouteDansListe() {
        Utilisateur u1 = new Utilisateur("Yassine");
        Utilisateur u2 = new Utilisateur("Adam");

        u1.suivre(u2);

        assert (u1.getListePersonneSuivis().size() == 1) : "Erreur : u1 devrait suivre 1 personne.";
    }

    private static void suivre_SoiMeme_ListeInchangee() {
        Utilisateur u1 = new Utilisateur("Yassine");

        u1.suivre(u1);

        assert (u1.getListePersonneSuivis().isEmpty()) : "Erreur : Un utilisateur ne peut pas se suivre lui-meme.";
    }

    private static void ajouterMediaAVoir_MediaValide_AjouteDansListe() {
        Utilisateur u1 = new Utilisateur("Yassine");
        Film film = new Film(2010, "Inception", 148, "Nolan", "Sci-Fi");

        u1.ajouterMediaAVoir(film);

        assert (u1.getListeMediaAVoir().size() == 1) : "Erreur : La liste des medias a voir n'a pas ete mise a jour.";
    }

    public static void main(String[] args) {
        runTests();
    }
}