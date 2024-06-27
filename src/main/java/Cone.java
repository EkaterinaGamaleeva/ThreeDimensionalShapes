import geometry.lib.Figure;

public class Cone implements Figure, VolumetricFigure {
    private int r;
    private int h;
    private int l;

    public Cone(int r, int h, int l) {
        this.r = r;
        this.h = h;
        this.l = l;
    }

    public int volumetric() {
        return (int) Math.round(1 / 3 * Math.PI * r * r * h);
    }

    public int area() {
        return (int) (Math.PI * r * l);
    }

    public int perimeter() {
        return 0;
    }
}
