import java.util.ArrayList;
import java.util.List;

public class JouerUnPli {
    public static String jouerUnPli(List<List<Carte>> mains) {
        List<Carte> pli = new ArrayList<>();
        int joueurGagnant = 0;

        for (int i = 0; i < mains.size(); i++) {
            Carte carteJouee = mains.get(i).remove(0);
            pli.add(carteJouee);
            System.out.println("\nJoueur " + (i + 1) + " joue " + carteJouee);

            if (i == 0 || ComparerCartes.comparerCartes(carteJouee, pli.get(joueurGagnant)) > 0) {
                joueurGagnant = i;
            }
        }

        List<Carte> cartesDuVainqueur = mains.get(joueurGagnant);
        cartesDuVainqueur.addAll(pli);

        for (int i = 0; i < mains.size(); i++) {
            System.out.println("\nJoueur " + (i + 1) + " :");
            JeuDeCartes.afficherJeu(mains.get(i));
        }
        return "Joueur " + (joueurGagnant + 1);
    }
}


