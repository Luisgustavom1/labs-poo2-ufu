public abstract class Cell {
    public String membrane;
    public String core;

    public Cell(String membrane, String core) {
        this.membrane = membrane;
        this.core = core;
    }

    public abstract Cell clone();

    public boolean equals(Cell m) {
        return m.membrane == this.membrane;
    }
}