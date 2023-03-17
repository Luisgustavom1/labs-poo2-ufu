public class Tenista extends Atleta {    
    public Tenista (
        String nome,
        double peso,
        double altura
    ) {
        super(
            nome,
            "tenista",
            peso,
            altura
        );
    };

    public void jogar() {
        System.out.println("Jogando " + this.getEsporte());
    };
}