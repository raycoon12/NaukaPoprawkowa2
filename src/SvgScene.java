import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class SvgScene {
    private double width, height;
    private int index = 0;
    private Shape[] shapes = new Shape[30];
    public void addShape(Shape shape) {
        shapes[(index++) % shapes.length] = shape;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String toSvg(){
        String beggining = "<svg height=\"" + height +
                "\" width=\"" + width +
                "\" xmlns=\"http://www.w3.org/2000/svg\">\n";
        String middle = "";
        for (Shape s : shapes){
            middle += "\t" + s.toSvg("") +"\n";
        }


        String ending = "</svg>";
        return beggining + middle + ending;
    }

    public void save(String path) throws IOException {
        FileWriter writer = new FileWriter(path);
        writer.write(toSvg());
        writer.close();
    }
}
