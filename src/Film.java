import java.util.Date;

public class Film extends Medium {
    private Urheber regisseur;
    private int spielzeit;
    boolean uhd;
    boolean hd;

    public Film(String titel, String kommentar, Date erscheinungsdatum, Genre genre, Urheber regisseur, int spielzeit, boolean uhd, boolean hd){
       super(titel, erscheinungsdatum, genre, kommentar);
       this.regisseur = regisseur;
       this.spielzeit = spielzeit;
       this.uhd = uhd;
       this.hd = hd;
    }

    @Override
    public void anzeigen() {
        super.anzeigen();
        System.out.println("Spielzeit: " + spielzeit);
        System.out.println("Regisseur: " + regisseur);
        System.out.println("UHD: " +(uhd ? "ja":"nein"));
        System.out.println("HD: " + (hd ? "ja":"nein"));
    }
}
