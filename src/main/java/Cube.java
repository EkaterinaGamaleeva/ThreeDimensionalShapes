import geometry.lib.Figure;

public class Cube implements Figure, VolumetricFigure {
    private int r;

    public Cube(int r) {
        this.r = r;
    }

    public int area() {
        return (int) (4 * Math.PI * (r * r));
    }

    public int perimeter() {
        return 0;
    }

    public int volumetric() {
        return (int) Math.round(4 / 3 * Math.PI * (r * r * r));
    }
}
