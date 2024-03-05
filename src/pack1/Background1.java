package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Background1 {
        Timer back;

        public Background1() {
            back = new Timer();
            back.scheduleAtFixedRate(new TimerTask() {


                @Override
                public void run() {
                    if (Var.imSpiel) {

                        if (Var.backgroundY1 < 596) {
                            Var.backgroundY1 += 2;

                        } else {
                            Var.backgroundY1 = -600;
                        }

                        if (Var.backgroundY2 < 596) {
                            Var.backgroundY2 += 2;

                        } else {
                            Var.backgroundY2 = -600;

                        }
                    }



                }
            }, 0, Var.backgroundspeed);

        }
    }

