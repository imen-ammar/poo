public class Rectangle {

    private int longueur;
    private int largeur;

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public float calculerPerimetre(){
        return 2 * (getLongueur() + this.largeur);
    }
}
