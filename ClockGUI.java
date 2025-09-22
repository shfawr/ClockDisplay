import javax.swing.*;
import java.awt.*;

public class ClockGUI extends JFrame {
    private ClockDisplay clock = new ClockDisplay();
    private JLabel label = new JLabel("", SwingConstants.CENTER);

    public ClockGUI() {
        setTitle("Simple Digital Clock");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        label.setFont(new Font("Consolas", Font.BOLD, 48));
        add(label, BorderLayout.CENTER);

        Timer timer = new Timer(1000, e -> {
            clock.setTimeToNow();
            label.setText(clock.getTime());
        });
        timer.start();

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ClockGUI::new);
    }
}
