public class PrevisaoTempo extends Observable<PrevisaoTempoEvents> {

    public PrevisaoTempo() {
        super(new PrevisaoTempoEvents[]{
            PrevisaoTempoEvents.TEMPERATURA,
            PrevisaoTempoEvents.UMIDADE,
            PrevisaoTempoEvents.QTD_CHUVA,
            PrevisaoTempoEvents.VELOCIDADE
        });
    }

    private int temperatura;
    private int umidade;
    private int qtdChuva;
    private int velocidade;

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
        this.notify(PrevisaoTempoEvents.TEMPERATURA, temperatura);
    }

    public int getUmidade() {
        return umidade;
    }

    public void setUmidade(int umidade) {
        this.umidade = umidade;
        this.notify(PrevisaoTempoEvents.UMIDADE, umidade);
    }

    public int getQtdChuva() {
        return qtdChuva;
    }

    public void setQtdChuva(int qtdChuva) {
        this.qtdChuva = qtdChuva;
        this.notify(PrevisaoTempoEvents.QTD_CHUVA, qtdChuva);
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
        this.notify(PrevisaoTempoEvents.VELOCIDADE, velocidade);
    }
}
