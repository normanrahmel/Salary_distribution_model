public class Geschäftsführer extends Mitarbeiter {

    private double Prov = 5000;

    public double monatsBrutto() {

        double ergebniss = 0;
        ergebniss = this.Prov + this.getGrundgehalt();
        return ergebniss;
    }
}
