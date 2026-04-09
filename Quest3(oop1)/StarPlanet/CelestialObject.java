import java.lang.Math;
import java.util.Objects;

public class CelestialObject {
    public double x;
    public double y;
    public double z;
    public String name;
    final static double KM_IN_ONE_AU = 150000000.0;

    public CelestialObject() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
        this.name = "Soleil";
    }
    public CelestialObject(String name, double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return this.z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static double getDistanceBetween(CelestialObject obj1, CelestialObject obj2) {
        double x1 = Math.pow((obj2.x - obj1.x),2);
        double x2 = Math.pow((obj2.y - obj1.y),2);
        double x3 = Math.pow((obj2.z - obj1.z),2);
        return Math.sqrt(x1 + x2 + x3);
    }

    public static double getDistanceBetweenInKm(CelestialObject obj1, CelestialObject obj2) {
        return getDistanceBetween(obj1, obj2) * KM_IN_ONE_AU;
    }

    public String toString(){
        return String.format("%s is positioned at (%.3f, %.3f, %.3f)", this.name, this.x, this.y, this.z);
    }
    
    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        boolean equal = true;
        CelestialObject obj = (CelestialObject) object;

        if (this.x != obj.x) {
            equal = false;
        }
        if (this.y != obj.y) {
            equal = false;
        }
        if (this.z != obj.z) {
            equal = false;
        }
        if (this.name != obj.name) {
            equal = false;
        }
        return equal;
    }

    public int hashCode() {
        return Objects.hash(x, y, z, name);
    }    

}
