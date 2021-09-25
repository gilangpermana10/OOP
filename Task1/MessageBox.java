package Task1;
import javax.swing.*;

public class MessageBox {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Anda Sedang Belajar apa","Input",1);
        JOptionPane.showMessageDialog(null,"Belajar "+ input +" sangat Mudah","Message",1);
    }
    
}
