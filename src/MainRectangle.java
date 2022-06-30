public class MainRectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLargeur(2);
        r.setLongueur(12);
        float p = r.calculerPerimetre();
        System.out.println(p);
    }
}
