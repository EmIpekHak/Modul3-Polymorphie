import java.util.ArrayList;

public class Medienbibliothek {
ArrayList<Medium> medienliste;

public void mediumhinzufügen(Medium medium) {
    medienliste.add(medium);
}

public void anzeigeallermedien(ArrayList<Medium> medienlist){
    for (Medium medium : medienlist) {
        medium.anzeigen();
    }
}

public void suchemedium(ArrayList<Medium> medienlist, String titel){
    for (Medium medium : medienlist) {
     if(medium.getTitel().equalsIgnoreCase(titel)) {
         medium.anzeigen();
         return;
     }
    }
}
}
