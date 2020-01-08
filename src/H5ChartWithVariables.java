import java.applet.Applet;
import java.awt.*;

    public class H5ChartWithVariables extends Applet {
        int hoogteXas;
        int gewichtValerie;
        int gewichtHans;
        int gewichtJeroen;


        public void init() {
            setSize(400,400);
            hoogteXas = 350;
            gewichtValerie = 40;
            gewichtHans = 80;
            gewichtJeroen = 150;

        }

    public void paint(Graphics graphics)
    {
        graphics.drawString("40KG", 15,315);
        graphics.drawString("80KG",15,275);
        graphics.drawString("100KG",10,250);
        graphics.drawString("150KG",10,200);
        graphics.drawLine(50,50,50,hoogteXas);
        graphics.drawLine(50,350,hoogteXas,hoogteXas);
        graphics.setColor(Color.blue);
        graphics.fillRect(60, hoogteXas - gewichtValerie, 80,gewichtValerie);
        graphics.drawString("Valerie",80,370);
        graphics.setColor(Color.green);
        graphics.fillRect(165, hoogteXas - gewichtHans, 80, gewichtHans);
        graphics.drawString("Hans",185,370);
        graphics.setColor(Color.GRAY);
        graphics.fillRect(270,hoogteXas - gewichtJeroen,80,gewichtJeroen);
        graphics.drawString("Jeroen", 290,370);

    }
}


