import javax.swing.*;

public class theGUI {
    public static void main(String[] args) {
   JFrame frame = new JFrame("calculator");
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setSize(500, 500);
   frame.setLocationRelativeTo(null);
   frame.setVisible(true);
   frame.add();

//   adding the panel to the frame .
        thePanel panel = new thePanel();

    }

}
