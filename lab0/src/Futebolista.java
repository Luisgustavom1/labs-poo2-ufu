public class Futebolista extends Atleta {    
    public Futebolista (
        String nome,
        double peso,
        double altura
    ) {
        super(
            nome,
            "futebol",
            peso,
            altura
        );
    };

    public void jogar() {
        System.out.println("Jogando " + this.getEsporte());
    };
}