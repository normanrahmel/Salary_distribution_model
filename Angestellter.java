public class Angestellter extends Mitarbeiter {

    private double Ortszuschlag = 750;

    public double monatsBrutto() {

        double ergebniss = 0;
        ergebniss = 2 * Ortszuschlag + this.getGrundgehalt();
        return ergebniss;
    }
}
