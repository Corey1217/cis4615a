public class R09_LCK01_J {
    //non-compliant version
    private int count = 0;
    private final Integer Lock = count;
 
    public void doSomething() {
        synchronized (Lock) {
        count++;
        // do thing
        }
    }
}
