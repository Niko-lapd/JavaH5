import java.applet.*;
import java.awt.*;

    public class H5praktischeOpdrachtMetVerschillen extends Applet {
    public void paint(Graphics graphics){

        graphics.drawRect(200,175,250,150);
        graphics.drawRoundRect(600,175,250,150,25,25);
        graphics.drawOval(1020,175,125,125);

        graphics.drawOval(200,450,250,150);
        graphics.drawArc(20,20,150,75,25,360);
        graphics.setColor(Color.GRAY);
        graphics.fillArc(20,20,150,75,90,45);


        graphics.setColor(Color.yellow);
        graphics.drawOval(975,350,250,150);
        graphics.fillOval(975,350,251,151);

        graphics.setColor(Color.red);
        graphics.drawRect(200,450,250,150);

        graphics.fillRect(200,450,250,150);
        graphics.setColor(Color.BLACK);
        graphics.drawOval(200,450,250,150);

        graphics.drawLine(675,550,675,450);
        graphics.drawLine(675,550,775,425);
        graphics.drawLine(675,550,895,450);
        graphics.drawLine(675,550,920,475);


        graphics.drawLine(675,450,775,425);
        graphics.drawLine(775,425,895,450);
        graphics.drawLine(895,450,920,475);
    }
}
