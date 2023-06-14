package package_lab6;

public class OddThread extends Thread{
    public void run() {
        for (int i = 1; i < 20; i+= 2) {
            System.out.print(" "+i);
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
        }
    }
}
