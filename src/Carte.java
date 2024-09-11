class Carte {
    private String valeur;
    private String couleur;

    public Carte(String valeur, String couleur) {
        this.valeur = valeur;
        this.couleur = couleur;
    }

    public String getValeur() {
        return valeur;
    }

    public String getCouleur() {
        return couleur;
    }

    @Override
    public String toString() {
        return valeur + " de " + couleur;
    }
}
