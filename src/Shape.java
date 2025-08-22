public interface Shape {
    default String toSvg() {
        return toSvg("");
    }    String toSvg(String param);
}