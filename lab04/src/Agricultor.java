public class Agricultor implements Observer<PrevisaoTempoEvents> {
    static final int MIN_TEMP = 10;

    public Agricultor() {}

    public void update(PrevisaoTempoEvents eventType, int valueUpdated) {        
        if (eventType == PrevisaoTempoEvents.TEMPERATURA && valueUpdated < MIN_TEMP) {
            System.out.println("Aumentar temperatura da estufa em " + (MIN_TEMP - valueUpdated));
        }

        if (eventType == PrevisaoTempoEvents.UMIDADE && valueUpdated < 30) {
            System.out.println("Aumente o volume da irrigação devido a umidade");
        }

        if (eventType == PrevisaoTempoEvents.QTD_CHUVA && valueUpdated > 70) {
            System.out.println("Grande quantidade de chuva, sacas de café perdidas");
        }

        System.out.println();
    }
}
