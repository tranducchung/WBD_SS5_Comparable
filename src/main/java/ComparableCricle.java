public class ComparableCricle extends Cricle implements Comparable<ComparableCricle>{
    public ComparableCricle(){}
    public ComparableCricle(int radius){
        super(radius);
    }
   @Override
    public int compareTo(ComparableCricle c1) {
        if(getRadius() > c1.getRadius()){
            return 1;
        }else if(getRadius() < c1.getRadius()){
            return -1;
        }else return 0;
    }

}
