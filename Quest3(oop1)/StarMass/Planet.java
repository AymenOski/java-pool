import java.util.Objects;

public class Planet extends CelestialObject {
    private Star centerStar;
    
    public Planet() {
        super();
        this.centerStar = new Star();
    }

    public Planet(String name, double x, double y, double z, Star centerStar, int mass) {
        super(name, x, y, z, mass);
        this.centerStar = centerStar;
    }

    public Star getCenterStar() {
        return this.centerStar;
    }

    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }

    @Override
    public String toString() {
        return String.format("%s circles around %s at the %.3f AU", this.getName(), this.centerStar.getName(),
                getDistanceBetween(this, this.centerStar));
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Planet)) {
            return false;
        }

        boolean equal = true;
        Planet obj = (Planet) object;

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
        if (this.centerStar != obj.centerStar) {
            equal = false;
        }
        return equal;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z, name, centerStar);
    }
}
