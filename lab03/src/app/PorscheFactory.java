public class PorscheFactory implements CarFactory {
    public Accessories buildAccessories() {
        return new AccessoriesImpl();
    };
    public Engine buildEngine() {
        return new EngineImpl();
    };
}