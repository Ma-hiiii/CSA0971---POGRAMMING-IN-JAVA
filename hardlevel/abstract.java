abstract class Shape {
    abstract double area();
    abstract double volume();
}
class Sphere extends Shape {
    private double radius;
    public Sphere(double radius) {
        this.radius = radius;
    }
    double area() {
        return 4 * Math.PI * radius * radius;
    }
    double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}
class Cone extends Shape {
    private double radius;
    private double height;
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    double area() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }
    double volume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }
}
class Cylinder extends Shape {
    private double radius;
    private double height;
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    double area() {
        return 2 * Math.PI * radius * (radius + height);
    }
    double volume() {
        return Math.PI * radius * radius * height;
    }
}
class Main {
    public static void main(String[] args) {
        Shape sphere = new Sphere(5); 
        Shape cone = new Cone(3, 7);  
        Shape cylinder = new Cylinder(4, 6); 
        System.out.println("Sphere Area: " + sphere.area());
        System.out.println("Sphere Volume: " + sphere.volume());
        System.out.println("Cone Area: " + cone.area());
        System.out.println("Cone Volume: " + cone.volume());
        System.out.println("Cylinder Area: " + cylinder.area());
        System.out.println("Cylinder Volume: " + cylinder.volume());
    }
}