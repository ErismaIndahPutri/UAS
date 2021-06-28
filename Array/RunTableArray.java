
package Array;

        import javax.swing.*;

public class RunTableArray {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ignored) {
        }
        /**
         * Set image icon
         */
        ImageIcon imageIcon = new ImageIcon("res/images.jpg");
        JFrame jframe = new JFrame("DATA SORTING ARRAY");
        jframe.setIconImage(imageIcon.getImage());
        jframe.setContentPane(new TableArray().getRootPanel());
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(500,400);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
    }
}
