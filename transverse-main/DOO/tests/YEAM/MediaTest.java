package YEAM;

public class MediaTest {

    public static void runTests() {
        calculerScoreMoyen_SansAvis_RetourneZero();
        ajouterAvis_DeuxAvisValides_ScoreMoyenCorrect();
        ajouterAvis_AvisNull_ListeInchangee();
        System.out.println("Tous les tests de Media sont passes avec succes !");
    }

    private static void calculerScoreMoyen_SansAvis_RetourneZero() {
        Media media = new Film(2010, "Inception", 148, "Christopher Nolan", "Science-fiction");

        double resultat = media.calculerScoreMoyen();

        assert (resultat == 0.0) : "Erreur : Score sans avis doit etre 0.0. Obtenu : " + resultat;
    }

    private static void ajouterAvis_DeuxAvisValides_ScoreMoyenCorrect() {
        Media media = new Film(2010, "Inception", 148, "Christopher Nolan", "Science-fiction");
        Avis avis1 = new Avis(4, "Tres bien");
        Avis avis2 = new Avis(5, "Chef d'oeuvre");

        media.ajouterAvis(avis1);
        media.ajouterAvis(avis2);

        assert (media.getListeAvis().size() == 2) : "Erreur : La liste devrait contenir 2 avis.";
        assert (media.calculerScoreMoyen() == 4.5) : "Erreur : La moyenne calculee est fausse.";
        assert (media.getScoreMoyen() == 4.5) : "Erreur : L'attribut scoreMoyen n'a pas ete mis a jour.";
    }

    private static void ajouterAvis_AvisNull_ListeInchangee() {
        Media media = new Film(2010, "Inception", 148, "Christopher Nolan", "Science-fiction");

        media.ajouterAvis(null);

        assert (media.getListeAvis().isEmpty()) : "Erreur : Un avis null ne devrait pas etre ajoute.";
    }

    public static void main(String[] args) {
        runTests();
    }
}