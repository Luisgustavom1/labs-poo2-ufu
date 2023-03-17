public abstract class Atleta {
    private String nome;
    private String esporte;
    private double peso;
    private double altura;

    public Atleta (
        String nome,
        String esporte,
        double peso,
        double altura
    ) {
        this.nome = nome;
        this.esporte = esporte;
        this.peso = peso;
        this.altura = altura;
    };

    public void aquecer(int minutos) {
        System.out.println("Você deve aquecer por " + minutos + " minutos!");
    }

    public abstract void jogar();

    public String toString() {
        return "Nome: " + this.nome + ";\n" +
            "Peso: " + this.peso + ";\n" + 
            "Altura: " + this.altura + ";\n" +
            "Esporte: " + this.esporte + ";\n";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

    public String getEsporte() {
        return this.esporte;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }
}