public class BMWFactory extends CarImpl implements CarFactory {
    public Accessories buildAccessories() {
        return new AccessoriesImpl();
    };
    public Engine buildEngine() {
        return new EngineImpl();
    };
}