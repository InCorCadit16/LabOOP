public class Cube implements GeometricBody {
    public double side;

    Cube(double side) {
        this.side = side;
    }

    @Override
    public double getSurface() {
        return side * side * 6;
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }
    
}
