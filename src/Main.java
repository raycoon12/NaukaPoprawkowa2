import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Ellipse ellipse = new Ellipse(new Vec2(50, 100), 50, 50);
        Shape shape = new StrokeShapeDecorator(
                new SolidFilledShapeDecorator(ellipse, "blue"),
                "red", 4);
        System.out.println(shape.toSvg());

        Vec2[] vec2s = { new Vec2(0,0), new Vec2(100,0), new Vec2(50,100) };
        Polygon polygon = new Polygon(vec2s);
        Shape shape2 = new StrokeShapeDecorator(
                new SolidFilledShapeDecorator(polygon, "yellow"),
                "black", 4);
        System.out.println(shape2.toSvg());

    }
}