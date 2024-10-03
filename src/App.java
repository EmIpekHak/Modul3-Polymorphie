import java.util.Date;

public class App {
    public static void main(String[] args) {
        Medienbibliothek bibliothek = new Medienbibliothek();

        Genre action = new Genre("Action");
        Genre krimi = new Genre("Krimi");
        Urheber reggissuer = new Urheber("Stan Lee");
        Urheber autor = new Urheber("Malenia Blade of Miquella");

        Film film = new Film("Harry Potter", "Stein der Weißen", new Date(), action, reggissuer, 120, true, true);
        eBook ebook = new eBook("Elden Ring", new Date(), krimi, "Flame Ruler", autor, "123", 123, 2);

        bibliothek.mediumhinzufügen(film);
        bibliothek.mediumhinzufügen(ebook);

       System.out.println ("Alle Medien in der Bibliothek: \n");
        bibliothek.anzeigeallermedien(bibliothek.medienliste);
        System.out.println("\n");
        System.out.println("Suche nach Film 'Harry Potter'");
        bibliothek.suchemedium(bibliothek.medienliste, "Harry Potter");
    }
}
