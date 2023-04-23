public class City implements ScenarioFactory {
    public City() {};

    public Background createBackground() {
        return new CityBackground();
    }
    
    public Furniture createFurniture() {
        return new CityFurniture();
    }
}