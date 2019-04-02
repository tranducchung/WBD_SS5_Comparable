public class Cricle {
     private int radius = 2;
    Cricle (){}
    Cricle (int radius){
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Cricle{" +
                "radius = " + radius +
                '}';
    }
}
