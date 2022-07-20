public abstract class Mitarbeiter {

    private String personalNummer;
    private String vorname;
    private String name;
    private double grundgehalt = 2000.0;

    public void setName(String name) {
        this.name = name;
    }

    public double getGrundgehalt() {
        return this.grundgehalt;
    }

    public abstract double monatsBrutto();

}
