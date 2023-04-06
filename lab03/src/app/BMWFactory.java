public class BMWFactory implements CarFactory {
    public Accessories buildAccessories() {
        return new AccessoriesImpl();
    };
    public Engine buildEngine() {
        return new EngineImpl();
    };
}