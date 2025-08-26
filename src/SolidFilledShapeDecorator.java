public class SolidFilledShapeDecorator extends ShapeDecorator {
    private String color;

    public SolidFilledShapeDecorator(Shape decoratedShape, String color) {
        super(decoratedShape);
        this.color = color;
    }



    @Override
    public String toSvg() {
        String svg = decoratedShape.toSvg();
        return svg.replace("/>", " style=\"fill:" + color + "\" />");
    }

    public String toSvg(String param) {
        return "";
    }
}