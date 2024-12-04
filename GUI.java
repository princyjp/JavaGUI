import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    JFrame frame;
    JPanel panel;
    JButton button;
    JLabel label;
    int count = 0;

    GUI(){
        frame = new JFrame();
        panel = new JPanel();
        label = new JLabel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,5,10));
        panel.setLayout(new GridLayout(0,1));
        frame.add(panel,BorderLayout.CENTER);
        button = new JButton("Click me");
        button.addActionListener(this);
        frame.setTitle("Java GUI");
        frame.setVisible(true);
        frame.pack();
        panel.add(button);
        label.setText("Number of clicks = 0");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(label);

    }
    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        count++;
        label.setText("Number of clicks = "+ count);
    }
}
