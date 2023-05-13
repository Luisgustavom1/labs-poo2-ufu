public class Main {
    public static void main(String[] args) {
        PrevisaoTempo pt = new PrevisaoTempo();

        Jornal jornal = new Jornal();
        Aeroporto aeroporto = new Aeroporto();
        Agricultor agricultor = new Agricultor();

        pt.subscribe(PrevisaoTempoEvents.TEMPERATURA, jornal);
        pt.subscribe(PrevisaoTempoEvents.QTD_CHUVA, jornal);

        pt.subscribe(PrevisaoTempoEvents.QTD_CHUVA, aeroporto);
        pt.subscribe(PrevisaoTempoEvents.VELOCIDADE, aeroporto);

        pt.subscribe(PrevisaoTempoEvents.TEMPERATURA, agricultor);
        pt.subscribe(PrevisaoTempoEvents.UMIDADE, agricultor);
        pt.subscribe(PrevisaoTempoEvents.QTD_CHUVA, agricultor);

        pt.setQtdChuva(72);
        pt.setUmidade(12);
        pt.setVelocidade(130);
    }
}