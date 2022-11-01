abstract class Tester {
    public static void main(String[] args) {
        Circle circle = new Circle(4.5);
        Rectangle rectangle = new Rectangle(3.8, 8.9);
        Square square = new Square(5.8);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getType());
        System.out.println(circle.toString());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getType());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.toString());
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        System.out.println(square.getType());
        System.out.println(square.toString());
    }
}