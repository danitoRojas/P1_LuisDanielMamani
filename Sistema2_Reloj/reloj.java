import java.util.Timer;
import java.util.TimerTask;

public class reloj {

    private int hour = 0;
    private int minute = 0;

    public void start() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                updateTime();
                System.out.println(getTime());
            }
        }, 0, 60000);
    }

    private void updateTime() {
        minute++;
        if (minute == 60) {
            minute = 0;
            hour++;
            if (hour == 24) {
                hour = 0;
            }
        }
    }

    private String getTime() {
        String hourStr = String.format("%02d", hour);
        String minuteStr = String.format("%02d", minute);
        return hourStr + ":" + minuteStr;
    }

    public static void main(String[] args) {
        reloj clock = new reloj();
        clock.start();
    }
}