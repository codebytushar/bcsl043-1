import java.applet.Applet;
import java.awt.Graphics;
/*
<applet code="Exc1209" width=300 height=100>
</applet>
*/
public class Exc1209 extends Applet {
    @Override
    public void paint(Graphics g) {
        g.drawString("Hello, Applet!", 20, 30);
    }
}