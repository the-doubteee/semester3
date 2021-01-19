package ankit;
import javax.swing. *;

class SwingDemo {

    SwingDemo() {

        // creating a jframe
        JFrame jfrm = new JFrame("JAVA SWING DEMO");

        // setting jframe size
        jfrm.setSize(300, 100);

        // terminate gui application when user click on close button
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create text based label
        JLabel jlab = new JLabel("Swing GUI");

        // add label to jframe
        jfrm.add(jlab);

        // DIsplay the frame
        jfrm.setVisible(true);
    }

    public static void main(String[]args) {

        // create the fram on the event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo();
            }
        });
    }

}
