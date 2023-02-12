import javax.swing.JFrame;
public class frame extends JFrame{

    frame() {
        this.add(new panel());
        this.setTitle("Snake");
        this.setResizable(false);
        this.setVisible(true);
        this.pack();

    }


}
