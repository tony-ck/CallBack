import java.sql.Time;

public class Test {
    public static void main(String[] args) {
        long start =System.currentTimeMillis();
        ChildThread childThread = new ChildThread();
        new MainThread(childThread);
        long end   =System.currentTimeMillis();
        System.out.println((end-start));
    }
}
