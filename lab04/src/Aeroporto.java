public class Aeroporto implements Observer<PrevisaoTempoEvents> {
    public Aeroporto() {}

    public void update(PrevisaoTempoEvents eventType, int valueUpdated) {
        if (eventType == PrevisaoTempoEvents.VELOCIDADE && valueUpdated > 100) {
            System.out.println("Voos cancelado devido a alta velocidade do vento, ventos a " + valueUpdated + "km/h");
        }

        if (eventType == PrevisaoTempoEvents.QTD_CHUVA && valueUpdated > 90) {
            System.out.println("Voos adiados devido a grande quantidade de chuva: " + valueUpdated);
        }

        System.out.println();
    }
}
