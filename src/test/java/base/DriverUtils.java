package base;

public class DriverUtils {

    public static void slowDown() {
        try {
            Thread.sleep(1500); // 1.5 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
