import java.util.HashMap;

public class ComparerCartes {

    public static int comparerCartes(Carte carte1, Carte carte2) {
        HashMap<String, Integer> hierarchieValeurs = new HashMap<>();
        String[] valeurs = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Reine", "Roi", "As"};
        for (int i = 0; i < valeurs.length; i++) {
            hierarchieValeurs.put(valeurs[i], i);
        }

        int valeur1 = hierarchieValeurs.get(carte1.getValeur());
        int valeur2 = hierarchieValeurs.get(carte2.getValeur());

        return Integer.compare(valeur1, valeur2);
    }
}
