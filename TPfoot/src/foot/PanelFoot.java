/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package foot;

import java.awt.Graphics;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author p1100859
 */
public class PanelFoot extends javax.swing.JPanel implements Runnable
{

    Thread th = null;
    java.awt.Image terrain;
    java.awt.Image ballon;
    static int XMIN = 0;
    static int XMAX = 548;
    static int YMIN = 0;
    static int YMAX = 222;
    static int XBUT = XMAX;
    static int YBUT = YMAX / 2 - 15;
    int x = XMAX / 2 - 15;
    int y = YMAX / 2 - 15;
    int deltaX;
    int deltaY;

    public PanelFoot() {
        java.awt.Toolkit kit = java.awt.Toolkit.getDefaultToolkit();
        terrain = kit.getImage("terrain.gif");
        ballon = kit.getImage("BetaShell.png");
    }
    
    public void demarrer(){
        if(th == null)
        {
            th = new Thread(this);
            th.start();
            x = XMAX / 2 - 15;
            y = YMAX / 2 - 15;
        }
    }
    
    public void haut(){
        Random rand = new Random();
        int aleaX = rand.nextInt(16 - (-16) + 1) + (-16);
        int aleaY = rand.nextInt(-3 - (-16) + 1) + (-16);
        deltaX = aleaX;
        deltaY = aleaY;
        demarrer();
    }
    
    public void bas(){
        Random rand = new Random();
        int aleaX = rand.nextInt(16 - (-16) + 1) + (-16);
        int aleaY = rand.nextInt(16 - (3) + 1) + (3);
        deltaX = aleaX;
        deltaY = aleaY;
        demarrer();
    }
    
    public void patate(){
        Random rand = new Random();
        int aleaX = rand.nextInt(64 - 20 + 1) + 20;
        deltaX = aleaX;
        deltaY = 0;
        demarrer();
    }
    
    public void recommencer(){
        th = null;
        x = XMAX / 2 - 15;
        y = YMAX / 2 - 15;
        deltaX = 0;
        deltaY = 0;
        repaint();
    }

    @Override
    public void paint(Graphics comp) {
        java.awt.Graphics2D comp2D = (java.awt.Graphics2D)comp;
        XMAX = getSize().width;
        YMAX = getSize().height;
        if(terrain != null) comp2D.drawImage(terrain, 0, 0, this);
        if(ballon != null) comp2D.drawImage(ballon, x, y, this);
    }
    
    @Override
    public void run() {
        Thread threadCourant =  Thread.currentThread();
        while(th == threadCourant)
        {
            x += deltaX;
            y += deltaY;
            repaint();
            if(y >= 222-30 || y <= 0){
                deltaY *= -1;
            }
            if(x >= 548-30 || x <= 0){
                deltaX *= -1;
            }
            if(x >= XMAX-30 && (y >= YMAX / 2 - 15 && y <= YMAX / 2 + 15))
            {
                JOptionPane.showMessageDialog(this, "GOAL !", "GOAL !", 1);
                th = null;
                x = XMAX / 2 - 15;
                y = YMAX / 2 - 15;
                deltaX = 0;
                deltaY = 0;
            }
            
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e){
                System.out.println("Y'a un problème quelque part...");
            }
        }
    }
    
}
