import java.util.List;

public static void main(String[] args) {
    List<Carte> jeuDeCartes = JeuDeCartes.initialiserJeu();
    JeuDeCartes.afficherJeu(jeuDeCartes);

    List<List<Carte>> mains = DistribuerCartes.distribuerCartes(jeuDeCartes);

    String gagnant = JouerUnPli.jouerUnPli(mains);
    System.out.println("\nLe pli est gagné par " + gagnant);

}