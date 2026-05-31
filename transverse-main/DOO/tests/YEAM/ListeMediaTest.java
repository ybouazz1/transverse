package YEAM;

public class ListeMediaTest {

    public static void runTests() {
        ajouterMedia_MediaNonPresent_TailleEgaleA1();
        ajouterMedia_MediaDejaPresent_PasDeDoublon();
        supprimerMedia_MediaPresent_ListeVide();
        System.out.println("Tous les tests de ListeMedia sont passes avec succes !");
    }

    private static void ajouterMedia_MediaNonPresent_TailleEgaleA1() {
        ListeMedia liste = new ListeMedia("Mes Favoris");
        Film film = new Film(2014, "Interstellar", 169, "Christopher Nolan", "Science-fiction");

        liste.ajouterMedia(film);

        assert (liste.getListeMedias().size() == 1) : "Erreur : La liste devrait contenir 1 media.";
    }

    private static void ajouterMedia_MediaDejaPresent_PasDeDoublon() {
        ListeMedia liste = new ListeMedia("Mes Favoris");
        Film film = new Film(2014, "Interstellar", 169, "Christopher Nolan", "Science-fiction");

        liste.ajouterMedia(film);
        liste.ajouterMedia(film); // doublon

        assert (liste.getListeMedias().size() == 1) : "Erreur : Le media a ete ajoute en double !";
    }

    private static void supprimerMedia_MediaPresent_ListeVide() {
        ListeMedia liste = new ListeMedia("Mes Favoris");
        Film film = new Film(2014, "Interstellar", 169, "Christopher Nolan", "Science-fiction");

        liste.ajouterMedia(film);
        liste.supprimerMedia(film);

        assert (liste.getListeMedias().isEmpty()) : "Erreur : La liste devrait etre vide apres suppression.";
    }

    public static void main(String[] args) {
        runTests();
    }
}