package ASM_Final.pakage.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

public class ClockThread extends Thread {

    private final JLabel lbl;

    public ClockThread(JLabel lb1) {
        this.lbl = lb1;
    }

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm aa");
        while (true) {
            Date now = new Date();
            String st = sdf.format(now);

            try {
                lbl.setText(st);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {}
        }
    }
}
