
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Information_Rgr implements ActionListener {

	
	static String zap = "Студенты группы:";
	public static JLabel rgr_info5 = new JLabel(zap);
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
			
		final JFrame main_GUI = new JFrame("subversion");	// создание графического окна
		main_GUI.setTitle ("Окошко информации");
		main_GUI.setBounds(540,256,322,228);
		main_GUI.setResizable(false); // фиксированный размер окна
		
		
		JPanel main_panel = new JPanel(); // Панель - используется для организации компонентов в окне
		main_panel.setLayout(null);
		main_GUI.add(main_panel);
		
		JLabel rgr_info1 = new JLabel("Шамуратов Дамир Дабирьянович 19130016"); // Отображение текста или изображения
		rgr_info1.setBounds(20,20,777,30);
		main_panel.add(rgr_info1);
		
		JLabel rgr_info2 = new JLabel("Данилов Владимир Андреевич 19130169"); // Отображение текста или изображения
		rgr_info2.setBounds(20,40,777,30);
		main_panel.add(rgr_info2);
		
		JLabel rgr_info3 = new JLabel("Юсупова Эвелина Альфредовна 19130173"); // Отображение текста или изображения
		rgr_info3.setBounds(20,60,777,30);
		main_panel.add(rgr_info3);
		
		JLabel rgr_info4 = new JLabel("Колесова Валерия Юрьевна 19130627"); // Отображение текста или изображения
		rgr_info4.setBounds(20,80,777,30);
		main_panel.add(rgr_info4);
		
		
		rgr_info5.setBounds(20,0,777,30);
		main_panel.add(rgr_info5);
		
	
		main_GUI.setVisible(true);
			
		JButton button_exit2 = new JButton("Выход"); // добавляем кнопку
        button_exit2.setBounds(166,122,100,40);
        main_panel.add(button_exit2);
        button_exit2.addActionListener (new  ActionListener () {

            public void actionPerformed(ActionEvent arg0) {
            // TODO Auto-generated method stub

        main_GUI.dispatchEvent(new WindowEvent(main_GUI, WindowEvent.WINDOW_CLOSING));

            }

        });
		
	}


}

