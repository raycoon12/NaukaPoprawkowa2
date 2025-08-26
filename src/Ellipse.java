import java.util.Locale;

public class Ellipse implements Shape {
    private Vec2 center;
    private double rx, ry;

    public Ellipse(Vec2 center, double rx, double ry) {
        this.center = center;
        this.rx = rx;
        this.ry = ry;
    }

    @Override
    public String toSvg() {
        return "<ellipse rx=\"" + rx + "\" ry=\"" + ry + "\" cx=\"" + center.x() + "\" cy=\"" + center.y() + "\" />";
    }

    public String toSvg(String param) {
        return "";
    }


}
