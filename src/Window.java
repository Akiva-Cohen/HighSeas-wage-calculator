import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
public class Window extends JFrame{
    JTextField dbh;
    JTextField db;
    JTextField $$;
    public Window() {
        JPanel panel = new JPanel(new GridLayout(2,1));
        JPanel in = new JPanel(new GridLayout(2,3));
        JLabel dbhL = new JLabel("Dubloons / Hour");
        dbh = new JTextField();
        JLabel dbL = new JLabel("Price (dubloons)");
        db = new JTextField();
        JLabel $$L = new JLabel("Price (dollars)");
        $$ = new JTextField();
        in.add(dbhL);
        in.add(dbL);
        in.add($$L);
        in.add(dbh);
        in.add(db);
        in.add($$);
        panel.add(in);
        JTextField out = new JTextField();
        out.setEditable(false);
        panel.add(out);
        add(panel);
        setSize(700,200);
        dbh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                out.setText(recalculate());
            }
        });
        db.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                out.setText(recalculate());
            }
        });
        $$.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                out.setText(recalculate());
            }
        });
    }
    public String recalculate() {
        double DBH;
        double DB;
        double dollars;
        try {
            DBH = Double.parseDouble(dbh.getText());
            DB = Double.parseDouble(db.getText());
            dollars = Double.parseDouble($$.getText());
        } catch (NumberFormatException e) {
            return "";
        }
        double hours = DB/DBH;
        double rate = dollars/hours;
        DecimalFormat format = new DecimalFormat("#.##");
        return format.format(rate);
    }
}