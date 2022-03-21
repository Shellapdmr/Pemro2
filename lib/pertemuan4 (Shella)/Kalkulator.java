import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.text.SimpleDateFormat;

class PenjumlahanGUI extends JFrame{
    public PenjumlahanGUI(){
        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);
        JButton B1 = new JButton("Jumlahkan");
        JLabel L1 = new JLabel("Hasil");
        add(t1);
        add(t2);
        add(B1);
        add(L1);

        setLayout(new FlowLayout());
        setTitle("Penjumlahan");
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

class Pertemuan44{
    public static void main(String[] args){
        PenjumlahanGUI objPGUI = new PenjumlahanGUI();
    }
}