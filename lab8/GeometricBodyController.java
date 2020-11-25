import java.util.stream.Stream;

public class GeometricBodyController {

    static GeometricBody maxVolume(GeometricBody[] bodies) {
        return Stream.of(bodies).max((body1, body2) -> body1.getVolume() - body2.getVolume() > 0 ? 1 : -1).get();
    }

    static GeometricBody maxSurface(GeometricBody[] bodies) {
        return Stream.of(bodies).max((body1, body2) -> body1.getSurface() - body2.getSurface() > 0 ? 1 : -1).get();
    }

    public static void main(String[] args) {
        GeometricBody[] bodies = new GeometricBody[] {
            new Cube(7),
            new Parallelepiped(6, 7, 8),
            new Sphere(4.5)
        };

        System.out.println("Max volume figure: " + maxVolume(bodies).getClass().getSimpleName());
        System.out.println("Max surface figure: " + maxSurface(bodies).getClass().getSimpleName());
    }
    
}
