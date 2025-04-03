package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Explosion {
    Timer exp;
    private int temp = 0;
    public Explosion() {
        exp = new Timer();
        exp.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (Var.imSpiel) {
                    if (Var.kollidiert) {
                        if (temp < 23) {
                            Var.expanimation = temp;
                            temp++;
                        } else if (temp == 23) {
                            Var.expanimation = 15;
                            temp = 0;
                            Var.kollidiert = false;
                        }


                    }
                }
            }
        } ,0, 40);

    }
}
