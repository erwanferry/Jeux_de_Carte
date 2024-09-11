import java.util.ArrayList;
import java.util.List;

public class JeuDeCartes {

    public static List<Carte> initialiserJeu() {
        String[] couleurs = {"trèfle", "pique", "carreau", "cœur"};
        String[] valeurs = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Reine", "Roi", "As"};

        List<Carte> jeuDeCartes = new ArrayList<>();
        for (String couleur : couleurs) {
            for (String valeur : valeurs) {
                jeuDeCartes.add(new Carte(valeur, couleur));
            }
        }
        return jeuDeCartes;
    }

    public static void afficherJeu(List<Carte> jeu) {
        for (Carte carte : jeu) {
            System.out.println(carte);
        }
    }
}