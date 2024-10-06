import java.io.IOException;
import java.util.Vector;

public class R49_MSC04_J {
    //compliant version
    static Vector vector = new Vector();
 
    public void useVector(int count) {
        int n = 0;
        try {
            for (; n < count; n++) {
                vector.add(Integer.toString(n));
            }
            // et
        } finally {
            for (n = n - 1; n >= 0; n--) {
                vector.removeElementAt(n);
            }  
        }
    }
 
    public static void main(String[] args) throws IOException {
        Leak le = new Leak();
        int i = 1;
        while (true) {
            System.out.println("Iteration: " + i);
            le.useVector(1);
            i++;
        }
    }
}
