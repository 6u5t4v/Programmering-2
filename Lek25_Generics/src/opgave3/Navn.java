package opgave3;

public class Navn implements Comparable<Navn> {
    private String forNavn;
    private String efterNavn;

    public Navn(String forNavn, String efterNavn) {
        this.forNavn = forNavn;
        this.efterNavn = efterNavn;
    }

    public String getForNavn() {
        return forNavn;
    }

    public String getEfterNavn() {
        return efterNavn;
    }

    @Override
    public int compareTo(Navn o) {
        int compare = this.efterNavn.compareTo(o.efterNavn);
        if (compare == 0) {
            return this.forNavn.compareTo(o.forNavn);
        }
        return compare;
    }

    @Override
    public String toString() {
        return forNavn + " " + efterNavn;
    }
}
