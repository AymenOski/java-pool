import java.util.Objects;

public class Star extends CelestialObject{
    private double magnitude;
    private int mass;

    public Star() {
        super();
        this.magnitude = 0.0;
        this.mass = 0;
    }

    public Star(String name, double x, double y, double z, double magnitude) {
        super(name, x, y, z, 0);
        this.magnitude = magnitude;
    }

    public Star(String name, double x, double y, double z, double magnitude, int mass) {
        super(name, x, y, z, mass);
        this.magnitude = magnitude;
        this.mass = mass;
    }

    public double getMagnitude() {
        return this.magnitude;
    }

    public void setMagnitude(double magnitude){
        this.magnitude = magnitude;
    }

    public int getMass() {
        return this.mass;
    }
    public void setMass(int mass) {
        this.mass = mass;
    }

    @Override
    public String toString(){
        return String.format("%s shines at the %.3f magnitude", this.name, this.magnitude);
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Star)) {
            return false;
        }

        boolean equal = true;
        Star obj = (Star) object;

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
        if (this.magnitude != obj.magnitude) {
            equal = false;
        }
        return equal;
    }
    @Override
    public int hashCode() {
        return Objects.hash(x, y, z, name, magnitude);
    }
}
