public class R09_LCK01_J {
    //compliant version
    private int count = 0;
    // it seems Integer() is deprecated so I am unsure of the usefulness of this compliance solution.
    private final Integer Lock = new Integer(count);
 
    public void doSomething() {
        synchronized (Lock) {
        count++;
        // do thing
        }
    }
}
