import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Act implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		int i = MathRgr.reklama.getSelectedIndex();
		
		
		switch(i) {
		case 0: {
		if (MathRgr.text1.getText().isEmpty() || MathRgr.text7.getText().isEmpty() ||  MathRgr.lokolo.getSelectedIndex() <= -1 || MathRgr.reklama1.getSelectedIndex() <= -1 || MathRgr.reklama5.getSelectedIndex() <= -1 || MathRgr.reklama6.getSelectedIndex() == -1){
			String g = "Заполните обязательные поля!";
			JOptionPane.showMessageDialog (null, g, "Внимание", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			
			double gg =  Mathematics.Math();
			MathRgr.text6.setText(gg + " руб.");
			System.out.println(gg);
		}
		break;
		}
		case 1: {
			if (MathRgr.text.getText().isEmpty() || MathRgr.text2.getText().isEmpty() || MathRgr.reklama2.getSelectedIndex() <= -1 || MathRgr.reklama4.getSelectedIndex() <= -1 || MathRgr.bx.isSelected() == false && MathRgr.bx1.isSelected() == false && MathRgr.bx2.isSelected() == false && MathRgr.bx3.isSelected() == false)    {
				String g = "Заполните обязательные поля!";
				JOptionPane.showMessageDialog (null, g, "Внимание", JOptionPane.INFORMATION_MESSAGE);
		}
			else {
				
				double gg =  Mathematics.Math();
				MathRgr.text6.setText(gg + " руб.");
				System.out.println(gg);
			}
}
		break;
		case 2: {
			if (MathRgr.text3.getText().isEmpty() || MathRgr.text4.getText().isEmpty() || MathRgr.reklama3.getSelectedIndex() <= -1 ||  MathRgr.bx4.isSelected() == false && MathRgr.bx5.isSelected() == false && MathRgr.bx6.isSelected() == false)  {
				String g = "Заполните обязательные поля!";
				JOptionPane.showMessageDialog (null, g, "Внимание", JOptionPane.INFORMATION_MESSAGE);
		}
			else {
				
				double gg =  Mathematics.Math();
				MathRgr.text6.setText(gg + " руб.");
				System.out.println(gg);
			}
}
		break;
		
}}}
