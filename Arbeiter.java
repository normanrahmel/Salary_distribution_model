public class Arbeiter extends Mitarbeiter {

    private double akkordzuschlag = 1000;

    public double monatsBrutto() {

        double ergebniss = 0;
        ergebniss = akkordzuschlag + this.getGrundgehalt();
        return ergebniss;
    }
}
