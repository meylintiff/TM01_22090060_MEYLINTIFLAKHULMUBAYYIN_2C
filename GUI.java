import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JButton submitButton;
    private JButton cancelButton;
    private JTextField TextMessage;
    private JTextField TextStatus;
    private JTextField TextComment;

    public GUI() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Message;
                String Status;
                String Comment;
                Message = GUI.this.TextMessage.getText();
                Status = GUI.this.TextStatus.getText();
                Comment = GUI.this.TextComment.getText();
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextMessage.setText("");
                TextStatus.setText("");
                TextComment.setText("");

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI");
        frame.setContentPane(new JFrame());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
