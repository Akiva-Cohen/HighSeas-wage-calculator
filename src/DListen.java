import javax.swing.event.*;

public interface DListen extends DocumentListener {

    default void changedUpdate(DocumentEvent e) {
        update();
    }
    default void insertUpdate(DocumentEvent e) {
        update();
    }
    default void removeUpdate(DocumentEvent e) {
        update();
    }

    void update();
}