package pack1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    static int tempKeyhandler = 0;


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_UP){
            Var.moveup = true;
        }
        if (e.getKeyCode()==KeyEvent.VK_DOWN){
            Var.movedown = true;
        }
        if (e.getKeyCode()==KeyEvent.VK_LEFT){
            Var.moveleft = true;
        }
        if (e.getKeyCode()==KeyEvent.VK_RIGHT){
            Var.moveright = true;
        }

        if(e.getKeyCode() == KeyEvent.VK_SPACE){

            if (Var.bolschuss == false&&Var.ammo>0){
                Var.bolschuss = true;
                Var.schussx = Var.x + 15;
                Var.schussy = Var.y - 45;
                Var.ammo--;
            }
        }

        if (tempKeyhandler == 0){
            //Menü
            if (e.getKeyCode()==KeyEvent.VK_ESCAPE){
            Var.imSpiel = false;
            Var.imMenü = true;
            Var.imSchop = false;
            Var.imOptionen = false;
            Var.btnresume.setVisible(true);
            Var.btnschop.setVisible(true);
            Var.btnoptionen.setVisible(true);
            Var.btnexit.setVisible(true);
            tempKeyhandler ++;

            }
        } else if (tempKeyhandler == 1) {
            if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                Var.imSpiel = true;
                Var.imMenü = false;
                Var.imSchop = false;
                Var.imOptionen = false;
                Var.btnresume.setVisible(false);
                Var.btnschop.setVisible(false);
                Var.btnoptionen.setVisible(false);
                Var.btnexit.setVisible(false);

                Var.btnupgrade1.setVisible(false);
                Var.btnupgrade2.setVisible(false);
                Var.btnupgrade3.setVisible(false);
                Var.btnleben.setVisible(false);

                tempKeyhandler--;
                Aktualisierung.tempAktualisierung = 0;

            }
        }


    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_UP){
            Var.moveup = false;
        }
        if (e.getKeyCode()==KeyEvent.VK_DOWN){
            Var.movedown = false;
        }
        if (e.getKeyCode()==KeyEvent.VK_LEFT){
            Var.moveleft = false;
        }
        if (e.getKeyCode()==KeyEvent.VK_RIGHT){
            Var.moveright = false;
        }
    }
  }
