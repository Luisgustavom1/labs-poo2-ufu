public class Jornal implements Observer<PrevisaoTempoEvents> {
    public Jornal() {}

    public void update(PrevisaoTempoEvents eventType, int valueUpdated) {
        System.out.println("Jornal anuncia!!!!!!");
        
        switch (eventType) {
            case TEMPERATURA:
                    System.out.println("Temperatura hoje: " + valueUpdated);
                break;
            case QTD_CHUVA:
                    System.out.println("Quantidade de chuva (mm): " + valueUpdated);
                break;
        }

        System.out.println();
    }
}
