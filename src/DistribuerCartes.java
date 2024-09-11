import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DistribuerCartes {

    public static List<List<Carte>> distribuerCartes(List<Carte> jeu) {

        Collections.shuffle(jeu);

        List<List<Carte>> mains = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            mains.add(new ArrayList<>());
        }

        for (int i = 0; i < jeu.size(); i++) {
            mains.get(i % 4).add(jeu.get(i));
        }

        for (int i = 0; i < mains.size(); i++) {
            System.out.println("\nJoueur " + (i + 1) + " :");
            JeuDeCartes.afficherJeu(mains.get(i));
        }
        return mains;
    }

}
