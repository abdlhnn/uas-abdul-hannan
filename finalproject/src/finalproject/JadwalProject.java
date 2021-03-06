package finalproject;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JadwalProject extends JFrame implements ActionListener {
	String[] jadwalStrings= { "Jadwal","Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};
	JComboBox jadwalList = new JComboBox(jadwalStrings);
	JLabel lblText = new JLabel();
	

	public static void main(String[] args) {
		JadwalProject fr =new JadwalProject();
		fr.setVisible(true);
	}
	
	
	public JadwalProject() {
		setLayout(new FlowLayout());
		setSize(400,300);
		setTitle("Jadwal Project");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jadwalList.setSelectedIndex(0);
		jadwalList.addActionListener(this);
		add(jadwalList);
		add(lblText);
		
		
	}
    public void  actionPerformed(ActionEvent e) {
    if(e.getSource()== jadwalList) {
    	JComboBox cb = (JComboBox)e.getSource();
    	String jdl = (String)cb.getSelectedItem();
    	switch (jdl) {
    	
    	case "Jadwal" : lblText.setText(" ");
    	break;
    	case "Senin" : lblText.setText("kalkulus lanjut");
    	break;
    	case "Selasa" : lblText.setText("basis data ,analisa algoritma ");
    	break;
    	case "Rabu" : lblText.setText("fisika , bahasa inggris");
    	break;
    	case "Kamis" : lblText.setText("aljabar linier, analisa logaritma");
    	break;
    	case "Jumat" : lblText.setText("agama");
    	break;
    	case "Sabtu" : lblText.setText("nugas :)");
    	break;
    	case "Minggu" : lblText.setText("besok senin :)");
    	break;
    	default : lblText.setText("sepertinya terdapat kesalahan");
    	break;
    	  }
       }
    }
}
    