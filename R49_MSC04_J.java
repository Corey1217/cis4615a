import java.io.IOException;
import java.util.Vector;

public class R49_MSC04_J {
    //non-compliant version
    static Vector vector = new Vector();
 
    public void useVector(int count) {   
        for (int n = 0; n < count; n++) {
            vector.add(Integer.toString(n));
        }
        // ...
        for (int n = count - 1; n > 0; n--) { // Free the memory
            vector.removeElementAt(n);
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
