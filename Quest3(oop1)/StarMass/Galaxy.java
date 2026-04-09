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
    public HashMap<String, Integer> computeMassRepartition() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Star", 0);
        map.put("Planet", 0);
        map.put("Other", 0);
        for (CelestialObject obj: this.celestialObjects){
            if (obj instanceof Star){
                map.put("Star", map.get("Star") + obj.getMass());
            } else if (obj instanceof Planet){
                map.put("Planet", map.get("Planet") + obj.getMass());
            } else {
                map.put("Other", map.get("Other") + obj.getMass());
            }
        }
        return map;
    }
}
