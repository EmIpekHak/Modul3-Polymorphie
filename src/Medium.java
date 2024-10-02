import java.util.Date;

public abstract class Medium {
    private String titel;
    private Date erscheinungsdatum;
    private Genre genre;
    private String kommentar;

    public Medium(String titel, Date erscheinungsdatum, Genre genre, String kommentar) {
        this.titel = titel;
        this.erscheinungsdatum = erscheinungsdatum;
        this.genre = genre;
        this.kommentar = kommentar;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setErscheinungsdatum(Date erscheinungsdatum) {
        this.erscheinungsdatum = erscheinungsdatum;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setKommentar(String kommentar) {
        this.kommentar = kommentar;
    }

    public String getTitel() {
        return titel;
    }

    public Date getErscheinungsdatum() {
        return erscheinungsdatum;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getKommentar() {
        return kommentar;
    }

    public void anzeigen(){
        System.out.println("Titel: " + titel);
        System.out.println("Kommentar: " + kommentar);
        System.out.println("Erscheinungsdatum: " + erscheinungsdatum);
        System.out.println(genre.toString());
    }
}
