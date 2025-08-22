import java.util.Locale;

public class Polygon implements Shape {
    private Vec2[] points;

    public Polygon(Vec2[] points) {
        this.points = new Vec2[points.length];
        for (int i = 0; i < points.length; i++) {
            this.points[i] = new Vec2(points[i]);
        }
    }
    @Override
    public String toSvg(String param) {
        String pointsString = "";
        for (Vec2 point : points) {
            pointsString += point.x() + "," + point.y() + " ";
        }
        return String.format(Locale.ENGLISH,
                "<polygon points=\"%s\" %s />",
                pointsString, param);
    }
}