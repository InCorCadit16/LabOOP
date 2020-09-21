package lab2.utils;

public class Box {
    double height;
    double width;
    double depth;

    public Box() {
        this.height = this.width = this.depth = 1;
    }

    public Box(double dimension) {
        this.height = this.width = this.depth = dimension;
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double area() { return 2 * (height * width + height * depth + width * depth); }

    public double volume() { return this.height * this.width * this.depth; }

    @Override
    public String toString() {
        var builder = new StringBuilder("\nBox(");
        builder.append(this.width)
                .append(", ")
                .append(this.height)
                .append(", ")
                .append(this.depth)
                .append(")\n");

        return builder.toString();
    }
}