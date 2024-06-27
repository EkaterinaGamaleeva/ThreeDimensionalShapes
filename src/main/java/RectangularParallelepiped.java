import geometry.lib.Figure;

public class RectangularParallelepiped implements Figure, VolumetricFigure {
    private int a;
    private int b;
    private int c;

    public RectangularParallelepiped(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int volumetric() {
        return a * b * c;
    }

    public int area() {
        return 2 * (a * c + a * b + b * c);
    }

    public int perimeter() {
        return 0;
    }
}
