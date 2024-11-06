import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Test implements ActionListener {
    JLabel l1, l2;
    JTextField t1, t2;
    JButton b1, b2;
    JFrame f;

    Test() {
        f = new JFrame("Login");
        l1 = new JLabel("Username");
        l2 = new JLabel("Password");
        t1 = new JTextField(16);
        t2 = new JTextField(16);
        b1 = new JButton("Submit");
        b2 = new JButton("Clear");

        JPanel p = new JPanel();
        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        p.add(b1);
        p.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        f.add(p);
        f.setSize(300, 300);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if (s.equals("Submit")) {
            l1.setText("Username: " + t1.getText());
            l2.setText("Password: " + t2.getText());
        } else if (s.equals("Clear")) {
            t1.setText(" ");
            t2.setText(" ");
        }
    }
    public static void main(String[] args) {
        new Test();
        }
        }
