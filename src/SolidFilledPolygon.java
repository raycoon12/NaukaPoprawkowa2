public class SolidFilledPolygon extends Polygon{
    private String color;
    public SolidFilledPolygon(Vec2[] points, String color) {
        super(points);
        this.color = color;
    }
    @Override
    public String toSvg() {
        String svg = super.toSvg();
        if (svg.contains("style=\"")) {
            svg = svg.replace("\" />", ";fill:" + color + "\" />");
        } else {
            svg = svg.replace("/>", " style=\"fill:" + color + "\" />");
        }
        return svg;
    }
}