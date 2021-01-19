package ankit;

import java.awt. *;
import java.awt.event. *;
import javax.swing. *;

public class EventDemo {
    JLabel jlab;

    EventDemo() {
        // create new jFrame container
        JFrame jfrm = new JFrame("Event Handling Demo");

        //set jframe size
        jfrm.setSize(400, 200);

        // specify flowlayout for layout manager
        jfrm.setLayout(new FlowLayout());

        // build buttons
        JButton alpha = new JButton("ALPHA");
        JButton beta = new JButton("BETA");
        JButton reset = new JButton("Reset");

        // event listeners for alpha button
        alpha.addActionListener((ae) -> jlab.setText("Alpha was clicked"));
        beta.addActionListener((ae) -> jlab.setText("Beta was clicked"));
        reset.addActionListener((ae) -> jlab.setText("Reset was clicked"));

        // add button to JFrame
        jfrm.add(alpha);
        jfrm.add(beta);
        jfrm.add(reset);

        // create text based label and add to jframe
        jlab = new JLabel("Press a button");
        jfrm.add(jlab);

        // terminate programe on closing window
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // display the frame
        jfrm.setVisible(true);

    }

    public static void main(String[]args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new EventDemo();
            }
        });
    }
}