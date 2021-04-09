import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
public class MathRgr {
	protected static JPanel main_panel;//Объявление переменных
	protected static JFrame main_GUI;
	protected JLabel label;
	protected static JButton button;
	protected static JButton button1;
	protected static JComboBox reklama,reklama1,reklama2,reklama3,reklama4,reklama5,reklama6;
	protected static JComboBox lokolo;
	protected static JTextField text,text1,text2,text3,text4,text5,text6,text7;
	protected static JLabel lb,lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10,lb11,lb12,lb13,lb14,lb15,lb16;
	protected static JCheckBox box,box1;
	protected static double h, w = 1, k  , n = 1, f = 1, j = 1, c = 1, a = 1, p;
	protected static double T;
	protected static JRadioButton bx,bx1,bx2,bx3,bx4,bx5,bx6;
	public MathRgr() {
		main_GUI = new JFrame("subversion");	// создание графического окна
		main_GUI.setTitle ("Калькулятор расчёта стоимости наружной рекламы");
		main_GUI.setBounds(500,200,420,550);
		main_GUI.setResizable(false); // фиксированный размер окна
		
		main_panel = new JPanel(); // Панель - используется для организации компонентов в окне
		main_panel.setLayout(null);
		main_GUI.add(main_panel);
		main_GUI.setVisible(true);
		
		JMenu menu = new JMenu("Главная");
		JMenuBar menuBar = new JMenuBar();
		JMenuItem menu1 = new JMenuItem("Информация о группе разработчиков");
		JMenuItem menu2 = new JMenuItem("Выход");
		ActionListener men1 = new Information_Rgr();
		menu1.addActionListener(men1);
		ActionListener men2 = new ProgrammClose();
		menu2.addActionListener(men2);
		
//////////////////////Labels//////////////////////////////////////////////////////////////////////////
		
		label = new JLabel("Тип рекламы: "); //Установка параметров JLabel
		label.setBounds(15, 20,100,20);
		label.setVisible(true);
		main_panel.add(label); //Добавление JLabel на панель
		lb = new JLabel("Размеры");
		lb.setBounds(15,70,70,20);
		lb.setVisible(false);
		lb1 = new JLabel("Слово");
		lb1.setBounds(15,70,70,20);
		lb1.setVisible(false);
		main_panel.add(lb1);
		lb2 = new JLabel("Шрифт");
		lb2.setBounds(15,120,70,20);
		lb2.setVisible(false);
		main_panel.add(lb2);
		lb3 = new JLabel("Вид букв");
		lb3.setBounds(15,170,70,20);
		lb3.setVisible(false);
		main_panel.add(lb3);
		lb4 = new JLabel("Вид лайтбокса");
		lb4.setBounds(15,120,70,20);
		lb4.setVisible(false);
		main_panel.add(lb4);
		lb5 = new JLabel("Вид вывески");
		lb5.setBounds(15,120,90,20);
		lb5.setVisible(false);
		main_panel.add(lb5);
		lb6 = new JLabel("Промокод");
		lb6.setBounds(15,320,90,20);
		lb6.setVisible(true);
		main_panel.add(lb6);
		lb7 = new JLabel("Итог");
		lb7.setBounds(15,370,90,20);
		lb7.setVisible(true);
		main_panel.add(lb7);
		lb8 = new JLabel("Высота");
		lb8.setBounds(220,70,90,20);
		lb8.setVisible(false);
		main_panel.add(lb8);
		lb9 = new JLabel("Мощность ламп");
		lb9.setBounds(15,220,90,40);
		lb9.setVisible(false);
		main_panel.add(lb9);
		lb10 = new JLabel("Мощность диодов");
		lb10.setBounds(15,220,90,40);
		lb10.setVisible(false);
		main_panel.add(lb10);
		lb11 = new JLabel("Тип освещения");
		lb11.setBounds(15,170,80,40);
		lb11.setVisible(false);
		main_panel.add(lb11);
		lb12 = new JLabel("Толщина");
		lb12.setBounds(15,170,80,40);
		lb12.setVisible(false);
		main_panel.add(lb12);
		lb13 = new JLabel("Освещение");
		lb13.setBounds(15,215,80,40);
		lb13.setVisible(false);
		main_panel.add(lb13);
		lb14 = new JLabel("Мощность диодов");
		lb14.setBounds(15,265,80,40);
		lb14.setVisible(false);
		main_panel.add(lb14);
		lb15 = new JLabel("Толщина полотна");
		lb15.setBounds(15,165,80,40);
		lb15.setVisible(false);
		main_panel.add(lb15);
		lb16 = new JLabel("Доп услуги");
		lb16.setBounds(15,215,80,40);
		lb16.setVisible(false);
		main_panel.add(lb16);
		main_panel.add(lb);
//////////////////////////////////////TextFields////////////////////////////////////////////////////////
		text = new JTextField();
		text.setBounds(100, 70, 100, 30);
		text.setEnabled(false);
		text.setVisible(false);
		text.setDocument(new PlainDocument(){            
            String chars = "0123456789";
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                if(chars.indexOf(str)!=-1){
                    super.insertString( offs, str, a);
                }
            }            
        });
		text.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
	   		        if (text.getText().length() >= 1) {
		        	String dada = text.getText();
			        		        		        
					if (Integer.parseInt(dada) > 19) {
					String g = "Максимальная высота - 2 метра!";
					JOptionPane.showMessageDialog (null, g, "Внимание", JOptionPane.INFORMATION_MESSAGE);
					text.setText(null);
					
					e.consume();
					}
					
		        }        				
			}
		});
		main_panel.add(text);
		text1 = new JTextField();
		text1.setBounds(100,70,100,30);
		text1.setEnabled(false);
		text1.setVisible(false);
		text1.setDocument(new PlainDocument(){            
            String chars = "QqWwEeRrTtYyUuIiOoPpAaSsDdFfGgHhJjKkLlZzXxCcVvBbNnMmЙйЦцУуКкЕеНнГгШшЩщЗзХхЪъФфЫыВвАаПпРрОоЛлДдЖжЭэЯяЧчСсМмИиТтЬьБбЮю";
            
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                if(chars.indexOf(str)!=-1){
                	
                		super.insertString( offs, str, a);
                	
                	
                }
            }            
        });
		text1.addKeyListener(new KeyListener() {
			public void keyReleased(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_SPACE ) {
			String g = "Запрещён ввод нескольких слов";
			JOptionPane.showMessageDialog (null, g, "Внимание", JOptionPane.INFORMATION_MESSAGE);
			
			}
			
			
			}

			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
				if (text1.getText().length() >= 10 ) {
					String g = "Слишком длинное слово!";
					JOptionPane.showMessageDialog (null, g, "Внимание", JOptionPane.INFORMATION_MESSAGE);
				text1.setText(null);
				e.consume();
				}
				
			}

			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			}
			);
		
		main_panel.add(text1);
		text2 = new JTextField("1");
		text2.setBounds(220, 70, 100, 30);
		text2.setEnabled(false);
		text2.setVisible(false);
		text2.setDocument(new PlainDocument(){            
            String chars = "0123456789";
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                if(chars.indexOf(str)!=-1){
                    super.insertString( offs, str, a);
                }
            }            
        });
		text2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
	   		        if (text2.getText().length() >= 1) {
		        	String dada = text2.getText();
			        		        		        
					if (Integer.parseInt(dada) > 19) {
						String g = "Максимальная Ширина - 2 метра!";
						JOptionPane.showMessageDialog (null, g, "Внимание", JOptionPane.INFORMATION_MESSAGE);
					text2.setText(null);
					
					e.consume();
					}
					
		        }        				
			}
		});
		main_panel.add(text2);
		text3 = new JTextField();
		text3.setBounds(100,70,100,30);
		text3.setEnabled(false);
		text3.setVisible(false);
		text3.setDocument(new PlainDocument(){            
            String chars = "0123456789";
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                if(chars.indexOf(str)!=-1){
                    super.insertString( offs, str, a);
                }
            }            
        });
		text3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
	   		        if (text3.getText().length() >= 1) {
		        	String dada = text3.getText();
			        		        		        
					if (Integer.parseInt(dada) > 19) {
						String g = "Максимальная высота - 2 метра!";
						JOptionPane.showMessageDialog (null, g, "Внимание", JOptionPane.INFORMATION_MESSAGE);
					text3.setText(null);
					
					e.consume();
					}
					
		        }        				
			}
		});
		
		main_panel.add(text3);
		text4 = new JTextField("Ширина вывески");
		text4.setBounds(220,70,100,30);
		text4.setEnabled(false);
		text4.setVisible(false);
		text4.setDocument(new PlainDocument(){            
            String chars = "0123456789";
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                if(chars.indexOf(str)!=-1){
                    super.insertString( offs, str, a);
                }
            }            
        });
		text4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
	   		        if (text4.getText().length() >= 1) {
		        	String dada = text4.getText();
			        		        		        
					if (Integer.parseInt(dada) > 19) {
						String g = "Максимальная ширина - 2 метра!";
						JOptionPane.showMessageDialog (null, g, "Внимание", JOptionPane.INFORMATION_MESSAGE);
					text4.setText(null);
					
					e.consume();
					}
					
		        }        				
			}
		});
		main_panel.add(text4);
		text5 = new JTextField(null);
		text5.setBounds(100,320,100,30);
		text5.setEnabled(true);
		text5.setVisible(true);
		main_panel.add(text5);
		
		text6 = new JTextField("Итоговая сумма");
		text6.setBounds(100,370,100,30);
		text6.setEnabled(false);
		text6.setVisible(true);
		main_panel.add(text6);
		text7 = new JTextField();
		text7.setBounds(270,70,100,30);
		text7.setEnabled(false);
		text7.setVisible(false);
		text7.setDocument(new PlainDocument(){            
            String chars = "0123456789";
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                if(chars.indexOf(str)!=-1){
                    super.insertString( offs, str, a);
                }
            }            
        });
		text7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
	   		        if (text7.getText().length() >= 1) {
		        	String dada = text7.getText();
			        		        		        
					if (Integer.parseInt(dada) > 19) {
						String g = "Максимальная высота - 2 метра!";
						JOptionPane.showMessageDialog (null, g, "Внимание", JOptionPane.INFORMATION_MESSAGE);
					text7.setText(null);
					
					e.consume();
					}
					
		        }        				
			}
		});
		main_panel.add(text7);
		
/////////////////////////////////////////ComboBoxes///////////////////////////////////////////////////////
		
		String[] transfer = {"Объёмные Буквы", "Лайтбоксы", "Вывески"};
		reklama = new JComboBox(transfer);
		reklama.setBounds(100,20,150,30);
		

		reklama.setSelectedIndex(-1);
		reklama.setVisible(true);
		ActionListener logo_hh = new ChangeComboBoxListener();
		reklama.addActionListener( logo_hh);
		main_panel.add(reklama);
		String[] transfer1 = {"С засечками", "Без засечек", "Прописной"};
		lokolo = new JComboBox(transfer1);
		lokolo.setBounds(100,120,150,30);
		lokolo.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int i1 = lokolo.getSelectedIndex();
				switch (i1) { 
				case 0:{
					f = 1.1;
					break;
				}
				case 1:{
					f = 1;
								
					break;
				}
				case 2:{
					f = 1.2;
									
					break;
				}
				}
			}
			
		});
		lokolo.setVisible(false);
		main_panel.add(lokolo);
		
		String[] transfer2 = {"Световые","не световые"};
		reklama1 = new JComboBox(transfer2);
		reklama1.setBounds(100,170,150,30);
		reklama1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = reklama1.getSelectedIndex();// Получение значения changeBox
				switch(i) {
				case 0: {
					k = 2.5;
					reklama5.setSelectedIndex(-1);
					reklama6.setSelectedIndex(-1);
					reklama5.setVisible(true);
					reklama5.setEnabled(true);
					reklama6.setVisible(true);
					reklama6.setEnabled(true);
					lb13.setVisible(true);
					lb14.setVisible(true);
					break;
				}
				case 1:{
					k = 1;
					reklama5.setSelectedIndex(0);
					reklama6.setSelectedIndex(0);
					reklama5.setVisible(false);
					reklama5.setEnabled(false);
					reklama6.setVisible(false);
					reklama6.setEnabled(false);
					lb13.setVisible(false);
					lb14.setVisible(false);
					
					break;
				}
			}
			}});
		reklama1.setVisible(false);
		main_panel.add(reklama1);
		
		String[] transfer3 = {"Алюминиевый профиль + поликарбонат", "ПВХ профиль + акрил", "Цельноклеенный", "Подвесной двусторонний лайтбокс", "Лайтбокс для сменной информации", "Сложной формы"};
		reklama2 = new JComboBox(transfer3);
		reklama2.setBounds(100,120,150,30);
		reklama2.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int i1 = reklama2.getSelectedIndex();
				switch (i1) { 
				case 0:{
					k = 1;
					
					break;
				}
				case 1:{
					k = 1.1;
					
					break;
				}
				case 2:{
					k = 1.2;
					
					break;
				}
				case 3:{
					k = 1.3;
					
					break;
				}
				case 4:{
					k = 1.4;
					
					break;
				}
				case 5:{
					k = 1.5;
					
					break;
				}
				}
			}
			
		});
		reklama2.setVisible(false);
		main_panel.add(reklama2);
		
		String[] transfer4 = {"3 мм", "4 мм", "5 мм", "6 мм"};
		reklama3 = new JComboBox(transfer4);
		reklama3.setBounds(100,175,150,30);
		reklama3.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int i = reklama3.getSelectedIndex();// Получение значения changeBox
				switch(i) {
				case 0: {
					j = 1;
					break;
				}
				case 1: {
					j = 1.33;
					break;
				}
				case 2: {
					j = 1.67;
					break;
				}
				case 3: {
					j = 2;
					break;
				}
			}
			
		}});
		reklama3.setVisible(false);
		main_panel.add(reklama3);		
		String[] transfer5 = {"Лампы","Диоды"};
		reklama4 = new JComboBox(transfer5);
		reklama4.setBounds(100,175,150,30);
		reklama4.setEnabled(false);
		reklama4.setVisible(false);
		reklama4.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				int i = reklama4.getSelectedIndex();// Получение значения changeBox
				switch(i) {
				case 0: {
					j = 1;
					lb10.setVisible(false);
					bx2.setVisible(false);
					bx2.setEnabled(false);
					bx3.setVisible(false);
					bx3.setEnabled(false);
					lb9.setVisible(true);
					bx.setVisible(true);
					bx.setEnabled(true);
					bx1.setVisible(true);
					bx1.setEnabled(true);
					break;
				}
				case 1: {
					j = 1.5;
					lb9.setVisible(false);
					bx.setVisible(false);
					bx.setEnabled(false);
					bx1.setVisible(false);
					bx1.setEnabled(false);
					lb10.setVisible(true);
					bx2.setVisible(true);
					bx2.setEnabled(true);
					bx3.setVisible(true);
					bx3.setEnabled(true);
					break;
				}
			}}
		});	
		main_panel.add(reklama4);		
		String[] transfer6 = {"Контражурная подсветка", "Открытый диод"};
		reklama5 = new JComboBox(transfer6);
		reklama5.setBounds(100,220,150,30);
		reklama5.setVisible(false);
		reklama5.setEnabled(false);
		reklama5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int i3 = reklama5.getSelectedIndex();
				switch (i3) {
				case 0:{
					j = 1;
					break;
				}
				case 1:{
					j = 1.2;
					break;
				}
				}
			}	
		});
		main_panel.add(reklama5);	
		String[] transfer7 = {"3 Вт", "5 Вт", "10 Вт"};
		reklama6 = new JComboBox(transfer7);
		reklama6.setBounds(100,270,150,30);
		reklama6.setVisible(false);
		reklama6.setEnabled(false);
		reklama6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int i3 = reklama6.getSelectedIndex();
				switch (i3) {
				case 0:{
					c = 1;
					break;
				}
				case 1:{
				    c = 1.04;
				    break;
				}
				case 2:{
					c = 1.1;
					break;
				}
				}
			}
			
		});
		main_panel.add(reklama6);
		
///////////////////////////////////////////RadioButtons///////////////////////////////////////////////////
		
		ButtonGroup group = new ButtonGroup();
		bx = new JRadioButton ("15-16 Вт");
		bx.setBounds(100,220,90,40);
		bx.setEnabled(false);
		bx.setVisible(false);
		group.add(bx);
		bx.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (bx.isSelected()  != false){
					c = 1;
					
				}
			}
			
		});
		main_panel.add(bx);
		bx1 = new JRadioButton ("18-20 Вт");
		bx1.setBounds(215,220,90,40);
		bx1.setVisible(false);
		bx1.setEnabled(false);
		group.add(bx1);
		bx1.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (bx1.isSelected()){
					c = 1.1;
				}
			}
			
		});
		main_panel.add(bx1);
		ButtonGroup group2 = new ButtonGroup();
		bx4 = new JRadioButton ("ПВХ");
		bx4.setBounds(100,115,90,40);
		bx4.setEnabled(false);
		bx4.setVisible(false);
		bx4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (bx4.isSelected()){
					k = 1;				
				}
			}			
		});
		group2.add(bx4);
		main_panel.add(bx4);
		bx5 = new JRadioButton ("Композит");
		bx5.setBounds(200,115,90,40);
		bx5.setVisible(false);
		bx5.setEnabled(false);
		bx5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (bx5.isSelected()){
					k = 1.1;			
				}
			}
		});
		group2.add(bx5);
		main_panel.add(bx5);
		bx6 = new JRadioButton ("Акрил");
		bx6.setBounds(315,115,90,40);
		bx6.setVisible(false);
		bx6.setEnabled(false);
		bx6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (bx6.isSelected()){
					k = 1.2;			
				}
			}
			
		});
		group2.add(bx6);
		main_panel.add(bx6);
		ButtonGroup group1 = new ButtonGroup();
		bx2 = new JRadioButton ("8-10 Вт");
		bx2.setBounds(100,220,90,40);
		bx2.setVisible(false);
		bx2.setEnabled(false);
		bx2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (bx2.isSelected()){
					c = 1;	
				}
			}
		});
		group1.add(bx2);
		main_panel.add(bx2);
		bx3 = new JRadioButton ("10-12 Вт");
		bx3.setBounds(215,220,90,40);
		bx3.setVisible(false);
		bx3.setEnabled(false);
		bx3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (bx.isSelected()){
					c = 1.1;
				}
			}
		});
		group1.add(bx3);
		main_panel.add(bx3);
		
////////////////////////////////////CheckBoxes///////////////////////////////////////////////////////////
		
		box = new JCheckBox("Заламинировать");
		box.setBounds(97, 215, 260, 40);
		box.setVisible(false);
		box.setEnabled(false);
		box.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (box.isSelected()){
					a = a * 1.1;
				}
				else {
					a = a/1.1;	
				}
			}
			
		});
		main_panel.add(box);
		box1 = new JCheckBox("Светоотражающая плёнка");
		box1.setBounds(97, 265, 260, 40);
		box1.setVisible(false);
		box1.setEnabled(false);
		box1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (box1.isSelected()){
					a = a * 1.05;			
				}
				else {
					a = a/1.05;			
				}
			}
		});
		reklama1.setSelectedIndex(-1);
		reklama2.setSelectedIndex(-1);
		reklama3.setSelectedIndex(-1);
		reklama4.setSelectedIndex(-1);
		lokolo.setSelectedIndex(-1);
		main_panel.add(box1);
		
/////////////////////////////////////JButtons///////////////////////////////////////////////////////////
		button = new JButton("Расcчитать сумму"); // добавляем кнопку
		button.setBounds(15,420,150,40);
		button.setVisible(true);
		ActionListener actionListener1 = (ActionListener) new Act();
		button.addActionListener(actionListener1);
		
		main_panel.add(button);
		button1 = new JButton("Выход"); // добавляем кнопку
		button1.setBounds(200,420,150,40);
		button1.setVisible(true);
		ActionListener actionListener = new ProgrammClose();
		button1.addActionListener(actionListener);
		main_panel.add(button1);
		
		menu.add(menu1);
		menu.add(menu2);
		menuBar.add(menu);
		main_GUI.setJMenuBar(menuBar);
		main_GUI.setVisible(true);
		main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие окна JFrame и процесса Java
		}
	
		public static void main(String[] args) { 
			MathRgr student= new MathRgr();			
		}
	}

	

	