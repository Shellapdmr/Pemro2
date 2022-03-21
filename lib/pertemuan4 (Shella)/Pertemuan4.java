import javax.swing.JFrame; //library utama GUI, Frame adalah bingkai/kanvasnya
import javax.swing.JLabel; //libraby untuk membuat label
import java.awt.FlowLayout; //library untuk Flow Layout
import java.awt.GridLayout; //library untuk Grid Layout

class CobaGUI{
    public CobaGUI(){
        JFrame objFrame = new JFrame();
        objFrame.setVisible(true); //setting visibilitas, artinya kalo false maka frame akan hidden
        objFrame.setSize(400, 400); //ukuran frame, jika tdk diset maka hanya terlihat app kecil

        JLabel objLabel = new JLabel("Hello World"); //isi label
        JLabel objLabel2 = new JLabel("nama mhs");
        JLabel objLabel3 = new JLabel("NIM");
        objFrame.add(objLabel); //menambahkan objek label yang berisi helloworld ke frame
        objFrame.add(objLabel2);
        objFrame.add(objLabel3);
    }
}

class Pertemuan4{
    public static void main(String[] args){
        CobaGUI objGui = new CobaGUI();
    }
}
