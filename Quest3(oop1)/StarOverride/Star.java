import java.util.Objects;

public class Star extends CelestialObject{
    private double magnitude;

    public Star() {
        super();
        this.magnitude = 0.0;
    }

    public Star(String name, double x, double y, double z, double magnitude) {
        super(name, x, y, z);
        this.magnitude = magnitude;
    }

    public double getMagnitude() {
        return this.magnitude;
    }

    public void setMagnitude(double magnitude){
        this.magnitude = magnitude;
    }

    @Override
    public String toString(){
        return String.format("%s shines at the %.3f magnitude", this.name, this.magnitude);
    }
    @Override
    public boolean equals(Object object) {
        if (object == null) {
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
