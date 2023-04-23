public class Eukaryotes extends Cell {
    public Eukaryotes(String membrane) {
        super(membrane, null);
    }

    public Eukaryotes(Eukaryotes target) {
        super(target.membrane, target.core);
    }

    public Cell clone() {
        return new Eukaryotes(this);
    };
}