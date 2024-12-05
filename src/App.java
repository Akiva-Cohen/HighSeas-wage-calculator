import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Window win = new Window();
        win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        win.setVisible(true);
    }
}
