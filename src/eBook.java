import java.util.Date;

public class eBook extends Medium {
    private Urheber autor;
    private String isbn;
    private int seitenanzahl;
    private int auflage;

    public eBook(String titel, Date erscheinungsdatum, Genre genre, String kommentar, Urheber autor, String isbn, Integer seitenanzahl, Integer auflage) {
        super(titel, erscheinungsdatum, genre, kommentar);
        this.autor = autor;
        this.isbn = isbn;
        this.seitenanzahl = seitenanzahl;
        this.auflage = auflage;
    }

    @Override
    public void anzeigen() {
        super.anzeigen();
        System.out.println("Autor: " + this.autor);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Seitenanzahl: " + this.seitenanzahl);
        System.out.println("Auflage: " + this.auflage);
    }
}
