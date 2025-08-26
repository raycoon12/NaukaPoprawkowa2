public class StrokeShapeDecorator extends ShapeDecorator {
    private String color;
    private double width;

    public StrokeShapeDecorator(Shape decoratedShape, String color, double width) {
        super(decoratedShape);
        this.color = color;
        this.width = width;
    }

    public String toSvg() {
        String svg = decoratedShape.toSvg();
        if (svg.contains("style=\"")) {
            svg = svg.replace("\" />", ";stroke:" + color + ";stroke-width:" + width + "\" />");
        } else {
            svg = svg.replace("/>", " style=\"stroke:" + color + ";stroke-width:" + width + "\" />");
        }
        return svg;
    }

    public String toSvg(String param) {
        return "";
    }
}