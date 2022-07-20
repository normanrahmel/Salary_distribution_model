public class Personalverwaltung {
    public static void main(String[] args) {
        Mitarbeiter ma1 = new Arbeiter();
        Mitarbeiter ma2 = new Geschäftsführer();
        Mitarbeiter ma3 = new Angestellter();

        System.out.println("Monatsbrutto Arbeiter");
        System.out.println(ma1.monatsBrutto());
        System.out.println("Monatsbrutto Geschäftsführer");
        System.out.println(ma2.monatsBrutto());
        System.out.println("Monatsbrutto Angestellter");
        System.out.println(ma3.monatsBrutto());
    }
}
