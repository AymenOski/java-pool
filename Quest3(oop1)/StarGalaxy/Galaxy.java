import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Galaxy extends CelestialObject {
    private List<CelestialObject> celestialObjects;
    public Galaxy() {
        super();
        this.celestialObjects = new ArrayList<>();
    }
    public List<CelestialObject>getCelestialObjects() {
        return this.celestialObjects;
    }
    public void addCelestialObject(CelestialObject celestialObject) {
        this.celestialObjects.add(celestialObject);
    }
}
