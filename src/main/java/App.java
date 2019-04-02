import java.util.Arrays;

public class App {
    public static void main(String[] args) {
       ComparableCricle[] comparableCricles = new ComparableCricle[3];
       comparableCricles[0] = new ComparableCricle();
       comparableCricles[1] = new ComparableCricle(7);
       comparableCricles[2] = new ComparableCricle(4);
       for(ComparableCricle comparableCricle : comparableCricles ){
           System.out.println("Before : " + comparableCricle.toString());
       }
       Arrays.sort(comparableCricles);
       for (ComparableCricle x : comparableCricles ){
           System.out.println("After : " + x);
       }
    }
}
