public class TripleObject {
    private int numberConsultant;
    private int level;
    private int sponsor;

    public TripleObject(){}

    public TripleObject(int numberConsultant, int level, int sponsor) {
        this.numberConsultant = numberConsultant;
        this.level = level;
        this.sponsor = sponsor;
    }

    public int getNumberConsultant() {
        return numberConsultant;
    }

    public void setNumberConsultant(int numberConsultant) {
        this.numberConsultant = numberConsultant;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getSponsor() {
        return sponsor;
    }

    public void setSponsor(int sponsor) {
        this.sponsor = sponsor;
    }
}
