package package_lab6;

public class Main {
    public static void main(String[] args) {
        OddThread th1 = new OddThread();
        EvenThread th2 = new EvenThread();
        
        th1.start();
        try {
            th1.join();
        } catch (InterruptedException ex) {}
        
        th2.start();
        System.out.println("\nKet thuc!");
    }
}
