import java.awt.*;
import javax.swing.*;
import java.applet.*;
public class appinput2 extends Applet {
    int x , y , w , h;
    public void init()
    {
        x = Integer.parseInt(getParameter("xValue"));
        y = Integer.parseInt(getParameter("yValue"));
        w = Integer.parseInt(getParameter("wValue"));
        h = Integer.parseInt(getParameter("hValue"));
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.RED);
        g.drawRect(x,y,w,h);
    }
}
/*
<applet code = "appinput2.java" width = "300" height = "300">
<param name = "xValue" value = 20>
<param name = "yValue" value = 40/>
<param name = "wValue" value = 100>
<param name = "hValue" value = 50>
</applet>
*/