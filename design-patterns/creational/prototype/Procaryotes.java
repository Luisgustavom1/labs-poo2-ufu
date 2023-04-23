public class Procaryotes extends Cell {
    public Procaryotes(String membrane, String core) {
        super(membrane, core);
    }

    public Procaryotes(Procaryotes target) {
        super(target.membrane, target.core);
    }

    public Cell clone() {
        return new Procaryotes(this);
    };
}