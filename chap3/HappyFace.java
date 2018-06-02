import javax.swing.JApplet;
import javax.swing.JApplet; 
import java.awt.Graphics; 
public class HappyFace extends JApplet {
    public void paint(Graphics canvas) {
    canvas.drawOval(100, 50, 200, 200);
    canvas.fillOval(155, 100, 10, 20);
    canvas.fillOval(230, 100, 10, 20);
    canvas.drawArc(150, 160, 100, 50, 180, 180);
    } 
    public static void main(String[] args) {
        HappyFace guiWindow =new HappyFace();
        guiWindow.setVisible(true);
    }
    //windows size
    public HappyFace(){
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
        
}