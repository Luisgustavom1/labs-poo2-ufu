public class Forest implements ScenarioFactory {
    public Forest() {};

    public Background createBackground() {
        return new ForestBackground();
    }
    
    public Furniture createFurniture() {
        return new ForestFurniture();
    }
}