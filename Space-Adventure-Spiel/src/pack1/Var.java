package pack1;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Var {
    static JFrame jf1;
    static int screenwidth = 800, screenheight = 600;
    static int backgroundY1 = 0, backgroundY2 = -600, backgroundspeed = 9;
    static int x = 400, y = 400;
    static int speedup = 3, speeddown = 2, speedleft = 2, speedright = 2;
    static int flammeanimation;
    static int schrott = 0, leben = 2, maxleben = 3;
    static int up1anzahl = 0, up2anzahl = 0, up3anzahl = 0;
    static int up1preis = 50,up2preis = 10,up3preis =10, uplebenpreis = 25;
    static int schildanzahl = 0, schildarraymax = 3;
    static int ammo = 10, maxammo = 10;

    static JButton btnresume, btnschop, btnoptionen, btnexit;
    static JButton btnmute;
    static JButton btnupgrade1, btnupgrade2, btnupgrade3, btnleben;

    static int gegnerx[] = new int[5], gegnery[] = new int[5];
    static int gegnerspeed[] = new int[5];
    static int schrottx1[] = new int [5], schrotty1[] = new int [5];
    static int schrottx2[] = new int [2], schrotty2[] = new int [2];
    static int schrottx3, schrotty3;
    static int schrottspeed1[] = new int[5], schrottspeed2[] = new int[2], schrottspeed3;
    static int expanimation;
    static int schussx, schussy;
    static int posgegnerx, posgegnery;

    static boolean moveup=false, movedown=false, moveleft=false, moveright=false;
    static boolean kollidiert = false, verloren = false;
    static boolean imSpiel = true,imMenü = false, imOptionen = false, imSchop = false;
    static Label lbl1;
    static boolean bolschuss = false;
    static boolean schusskollision = false;

    static BufferedImage ib1, ib2;
    static BufferedImage irakete, iflamme1, iflamme2;
    static BufferedImage igegner1;
    static BufferedImage ischrott1, ischrott2, ischrott3;
    static BufferedImage ileben;
    static BufferedImage ischild[] = new BufferedImage[4];
    static BufferedImage iexplosion[] = new BufferedImage[16];
    static BufferedImage iammo;
    static BufferedImage gifgegner;
    static Image gifexplosion;
    static Image gifschuss;


    public Var(){

        try{
            //Background
            ib1 = ImageIO.read(new File("rsc/b1.jpg"));
            ib2 = ImageIO.read(new File("rsc/b1.jpg"));
            //Rakete
            irakete = ImageIO.read(new File("rsc/rakete.png"));
            //Flamme
            iflamme1 = ImageIO.read(new File("rsc/Flamme1.1.png"));
            iflamme2 = ImageIO.read(new File("rsc/Flamme1.2.png"));
            //Gegner
            igegner1 = ImageIO.read(new File("rsc/Gegner1.png"));
            gifgegner = ImageIO.read(new File("rsc/gegner.png"));
            //Leben
            ileben = ImageIO.read(new File("rsc/Leben.png"));
            //Schrott
            ischrott1 = ImageIO.read(new File("rsc/schrott1.png"));
            ischrott2 = ImageIO.read(new File("rsc/schrott2.png"));
            ischrott3 = ImageIO.read(new File("rsc/schrott3.png"));
            //Explosion
            for (int i = 0;i<=15;i++){
                iexplosion[i] = ImageIO.read(new File("rsc/exp"+(i+1)+".png"));
            }
            //Schild
            for (int i= 0; i<ischild.length; i++){
                ischild[i] = ImageIO.read(new File("rsc/plasmaschild"+(i+1)+".png") );

            }
            //Schuss
            gifschuss = Toolkit.getDefaultToolkit().createImage("rsc/Schuss.gif");
            //Munition
            iammo = ImageIO.read(new File("rsc/ammo.png"));



        }catch (IOException e) {

            e.printStackTrace();
            System.out.println("Bilder konnten nicht geladen werden");
        }

        gegnerspeed[0] = 3;
        gegnerspeed[1] = 4;
        gegnerspeed[2] = 3;
        gegnerspeed[3] = 4;
        gegnerspeed[4] = 3;


        schrottspeed1[0] = 2;
        schrottspeed1[1] = 3;
        schrottspeed1[2] = 2;
        schrottspeed1[3] = 4;
        schrottspeed1[4] = 3;

        schrottspeed2[0] = 4;
        schrottspeed2[1] = 5;

        schrottspeed3 = 6;

        Musik.musik("audio1/audio1.wav");




    }
}
