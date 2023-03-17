public class Corredor extends Atleta {    
    public Corredor (
        String nome,
        double peso,
        double altura
    ) {
        super(
            nome,
            "corredor",
            peso,
            altura
        );
    };

    public void jogar() {
        System.out.println("Jogando " + this.getEsporte());
    };
}