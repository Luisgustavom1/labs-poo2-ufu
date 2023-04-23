import java.util.ArrayList;

public class House implements HouseBuilder {
    ArrayList<Window> windows = new ArrayList<Window>();
    Door door;

    public House() {}

    public void buildWindows(int quantity) {
        for (int c = 0; c < quantity; c++) {
            this.windows.add(new Window());
        }
    }
    public void buildDoor(Door door) {
        this.door = door;
    };
}