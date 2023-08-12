public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();

        Geometric_shape shape_Circle=shapeFactory.shapeObject("CIRCLE");

        shape_Circle.draw_shape();

        Geometric_shape shape_Rectangle=shapeFactory.shapeObject("RECTANGLE");
        shape_Rectangle.draw_shape();

        Geometric_shape shape_Square=shapeFactory.shapeObject("SQUARE");
            shape_Square.draw_shape();
    }
}