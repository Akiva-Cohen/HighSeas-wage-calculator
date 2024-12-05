import javax.swing.*;
import java.awt.*;
public class Window extends JFrame{
    public Window() {
        JPanel panel = new JPanel(new GridLayout(2,1));
        JPanel in = new JPanel(new GridLayout(2,3));
        JLabel dbhL = new JLabel("Dubloons / Hour");
        JTextField dbh = new JTextField();
        JLabel dbL = new JLabel("Price (dubloons)");
        JTextField db = new JTextField();
        JLabel $$L = new JLabel("Price (dollars)");
        JTextField $$ = new JTextField();
        in.add(dbhL);
        in.add(dbL);
        in.add($$L);
        in.add(dbh);
        in.add(db);
        in.add($$);
    }    
}
