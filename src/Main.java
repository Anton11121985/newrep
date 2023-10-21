import static java.lang.Math.PI;

public class Main {

    public static void main(String[] args) {

        Shape shape = new Shape();
        Circle circle = new Circle(10);
        Rect rect = new Rect(10, 29);
        Square square = new Square(5);

        rect.setColor("Зеленый");

        print(shape);
        print(circle);
        print(rect);
        print(square);
    }

    public static void print(Shape shape) {
        System.out.println(shape.getName() + " - площадь: " + shape.area() + " - стоимость: " + shape.cost(100) + " Цвет: " + shape.getColor());
    }

}

class Shape {//форма
    protected String color ="Красный";

    protected String name = "Форма";

    public double area() {
        //площадь
        return 0;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double cost(double price) {
        return this.area()*price;
    }
}

class Circle extends Shape {//Круг

    private double radius;//радиус

    public Circle(double radius) {
        this.name = "Круг";
        this.radius = radius;
    }

    public double area() {
        return PI * radius * radius;
    }
}

class Rect extends Shape {//прямоугольник

    private double length;//длинный
    private double width;//ширина

    public Rect(double length, double width) {
        this.name = "Прямоугольник";
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

}

class Square extends Shape {//квадрат

    private double length;

    public Square(double length) {
        this.name = "Квадрат";
        this.length = length;
    }

    public double area() {
        return length * length;
    }

    public double cost(double price) {
        return this.area()*price*1.5;
    }

}
