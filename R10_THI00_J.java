
public class R10_THI00_J {
    //non-compliant version
    public final class Foo implements Runnable {
        @Override public void run() {
          // thread to be completed
        }
       
        public static void main(String[] args) {
          Foo foo = new Foo();
          new Thread(foo).run();
        }
      }
}
