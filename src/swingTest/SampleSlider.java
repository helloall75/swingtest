package swingTest;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class SampleSlider extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleSlider f = new SampleSlider();
		f.setTitle("SampleSlider");
		f.setBounds(550, 350, 300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	SampleSlider() {
		JSlider s = new JSlider();
		s.setOrientation(JSlider.HORIZONTAL);
		
		JProgressBar b = new JProgressBar();
		b.setStringPainted(true);
		b.setValue(50);
		
		JLabel l = new JLabel();
		l.setText("Raspberry PI");
		
		JTextField t = new JTextField();
		t.setColumns(25);
		t.setText("Raspberry PI");
		
		JButton btn = new JButton();
		btn.setText("Raspberry PI");
		
		JPanel p = new JPanel();
		p.add(s);
		p.add(b);
		p.add(l);
		p.add(t);
		p.add(btn);
		Container c = getContentPane();
		c.add(p, BorderLayout.CENTER);
		
		
	}
}
