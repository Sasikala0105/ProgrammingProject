package Yoga;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.border.TitledBorder;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.EtchedBorder;


public class YogaGui {

	private JFrame frame;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;
	private JTextField textField_2;
	private JTextField txtHeight;
	private JTextField txtWeight;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YogaGui window = new YogaGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public YogaGui() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 899, 615);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel.setBounds(0, 0, 883, 576);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO OUR YOGA CENTRE");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setFont(new Font("Lemon", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 0, 863, 32);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setForeground(Color.BLACK);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Registration System", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel_1.setBounds(10, 32, 863, 533);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbl1 = new JLabel("First Name :");
		lbl1.setBackground(Color.PINK);
		lbl1.setBounds(10, 34, 81, 14);
		lbl1.setForeground(Color.BLACK);
		lbl1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbl1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lbl1);
		
		txt1 = new JTextField();
		txt1.setBounds(90, 32, 153, 20);
		panel_1.add(txt1);
		txt1.setColumns(10);
		
		JLabel lbl2 = new JLabel("Last Name :");
		lbl2.setBounds(10, 70, 81, 14);
		lbl2.setForeground(Color.BLACK);
		lbl2.setHorizontalAlignment(SwingConstants.LEFT);
		lbl2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panel_1.add(lbl2);
		
		txt2 = new JTextField();
		txt2.setBounds(90, 67, 153, 20);
		panel_1.add(txt2);
		txt2.setColumns(10);
		
		JLabel lbl3 = new JLabel("Phone Num:");
		lbl3.setBounds(10, 107, 81, 14);
		lbl3.setForeground(Color.BLACK);
		lbl3.setHorizontalAlignment(SwingConstants.LEFT);
		lbl3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panel_1.add(lbl3);
		
		txt3 = new JTextField();
		txt3.setBounds(90, 104, 153, 20);
		panel_1.add(txt3);
		txt3.setColumns(10);
		
		JLabel lbl4 = new JLabel("Gender :");
		lbl4.setBounds(10, 141, 72, 14);
		lbl4.setForeground(Color.BLACK);
		lbl4.setHorizontalAlignment(SwingConstants.LEFT);
		lbl4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panel_1.add(lbl4);
		
		JRadioButton btn1 = new JRadioButton("Male");
		btn1.setFont(new Font("Arial", Font.BOLD, 12));
		btn1.setForeground(Color.BLACK);
		btn1.setBounds(90, 137, 72, 23);
		panel_1.add(btn1);
		
		JRadioButton btn2 = new JRadioButton("Female");
		btn2.setFont(new Font("Arial", Font.BOLD, 12));
		btn2.setForeground(Color.BLACK);
		btn2.setBounds(162, 137, 81, 23);
		panel_1.add(btn2);
		
		JLabel lbl5 = new JLabel("Nationality :");
		lbl5.setBounds(10, 182, 81, 14);
		lbl5.setForeground(Color.BLACK);
		lbl5.setHorizontalAlignment(SwingConstants.LEFT);
		lbl5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panel_1.add(lbl5);
		
		txt4 = new JTextField();
		txt4.setBounds(90, 180, 153, 17);
		panel_1.add(txt4);
		txt4.setColumns(10);
		
		JLabel lbl6 = new JLabel("Yoga experience before :");
		lbl6.setBounds(10, 226, 136, 14);
		lbl6.setForeground(Color.BLACK);
		lbl6.setFont(new Font("Times New Roman", Font.BOLD, 13));
		panel_1.add(lbl6);
		
		JComboBox cmb1 = new JComboBox();
		cmb1.setFont(new Font("Arial", Font.BOLD, 12));
		cmb1.setForeground(Color.BLACK);
		cmb1.setBounds(143, 222, 100, 22);
		cmb1.setModel(new DefaultComboBoxModel(new String[] {"Select one", "Yes", "No"}));
		panel_1.add(cmb1);
		
		JLabel lbl7 = new JLabel("Package offered days :");
		lbl7.setForeground(new Color(0, 0, 0));
		lbl7.setBounds(10, 274, 136, 14);
		lbl7.setFont(new Font("Times New Roman", Font.BOLD, 13));
		panel_1.add(lbl7);
		
		JComboBox cmb2 = new JComboBox();
		cmb2.setFont(new Font("Arial", Font.BOLD, 12));
		cmb2.setForeground(Color.BLACK);
		cmb2.setBounds(143, 270, 100, 22);
		cmb2.setModel(new DefaultComboBoxModel(new String[] {"Select one", "5 days", "Sat&Sun", "Twice in week", "Twice in month"}));
		panel_1.add(cmb2);	
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(266, 293, 275, 158);
		panel_1.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textArea.setBackground(Color.WHITE);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(321, 65, 532, 168);
		panel_1.add(scrollPane_1);
		
		
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
		
		JLabel lbResult = new JLabel("");
		lbResult.setForeground(Color.BLACK);
		lbResult.setBounds(627, 410, 226, 14);
		panel_1.add(lbResult);
		
		JLabel Height = new JLabel("Enter height(m)");
		Height.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		Height.setForeground(Color.BLACK);
		Height.setBounds(637, 323, 100, 24);
		panel_1.add(Height);
		
		
		JLabel Weight = new JLabel("Enter weight(kg)");
		Weight.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		Weight.setForeground(Color.BLACK);
		Weight.setBounds(637, 379, 110, 20);
		panel_1.add(Weight);
		
		JButton btnNewButton = new JButton("Click here for info");
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "This is only for Obesity package !"
						+"\n"
						+" Calculate your BMI here\n"
						+" Send your current BMI to the respective trainers whatsapp number once you have registered.");
			}
		});
		btnNewButton.setBounds(656, 270, 136, 23);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Choose A Package");
		lblNewLabel_1.setBackground(new Color(255, 69, 0));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1.setBounds(54, 313, 136, 34);
		panel_1.add(lblNewLabel_1);
		
		txtHeight = new JTextField();
		txtHeight.setText("");
		txtHeight.setBounds(747, 327, 86, 20);
		panel_1.add(txtHeight);
		txtHeight.setColumns(10);
		
		txtWeight = new JTextField();
		txtWeight.setBounds(747, 381, 86, 20);
		panel_1.add(txtWeight);
		txtWeight.setColumns(10);
		
		JButton btn = new JButton("Calculate BMI");
		btn.setBackground(new Color(100, 149, 237));
		btn.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		btn.setForeground(Color.BLACK);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double weight=Double.parseDouble(txtWeight.getText());
				double height=Double.parseDouble(txtHeight.getText());
				
				double bmi = weight / (height * height);
				if (bmi < 18.5) {
					lbResult.setText(" Underweight - BMI : "+ bmi);
				}else if (bmi<25) {
					lbResult.setText("Normal - BMI : "+ bmi);
				}else if (bmi<30) {
					lbResult.setText(" Overweight - BMI : "+ bmi);
				}else {
					lbResult.setText(" Obese - BMI : "+ bmi);
					JOptionPane.showMessageDialog(btn, "Enter correctly!");					
				}
			}
		});
		btn.setBounds(674, 435, 112, 23);
		panel_1.add(btn);
		btn.setVisible(true);

		
		
		JRadioButton btn3 = new JRadioButton("Stress Relief");
		btn3.setBackground(new Color(238, 130, 238));
		btn3.setFont(new Font("Arial", Font.BOLD, 12));
		btn3.setForeground(Color.BLACK);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(" Package : Stress Relief\n"
						+ " Poses & Benefits : \n"
						+"\n"
						+ " 1.Sukhasana(Easy Pose)\n"
						+ " Helps to calm down and eliminate anxiety.\n "
						+ " Reduces mental and physical exhaustion.\n"
						+ "\n"
						+ " 2.Balasana(Child's pose)\n"
						+ " Beneficial for your lymphatic system and nervous system.\n "
						+ " Calms your mind and release stress.\n"
						+"\n"
						+ " 3.Ananda Balasana (Happy baby pose)\n"
						+ " Calms you and get rid of fatigue and stress.\n "
						+ " It will gently stretch your spine and groin.\n"
						+"\n"
						+" 4.Uttanasana (Standing forward bend) \n"
						+ " Relieves mild depression and stress. \n"
						+ " It will calm your brain and stimulate your kidneys and liver.\n"
						+"\n"
						+" The steps on how to do it will be send through your whatsapp once you've registered, \n"
						+ " So that you can practice yourself at your home too.\n"
						+"\n"
						+" Tips and tricks about stress relief will be shared during each classes you attend.\n"
						+"\n"
						+" Each customers will receive a special gift once finish attending all te classes.\n"
						+"\n"
						+" Trainer : 011-33905170\n"
						+"\n");
			}
		});
		btn3.setBounds(10, 346, 109, 23);
		panel_1.add(btn3);
		
		
		
		
		JRadioButton btn4 = new JRadioButton("Blood Pressure");
		btn4.setBackground(new Color(238, 130, 238));
		btn4.setFont(new Font("Arial", Font.BOLD, 12));
		btn4.setForeground(Color.BLACK);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText( "Package : Blood Pressure\n"
						+" Poses & Benefits : \n"
						+"\n"
						+ " 1.Shavasana\n "
						+ " The easiest pose which you can try to control your blood pressure numbers.\n "
						+"\n"
						+ " 2.Bhujangasana\n"
						+ " Helpful in circulating blood and oxygen. \n"
						+ " This pose promotes heart health.\n"
						+"\n"
						+" The steps on how to do it will be send through your whatsapp once you've registered, \n"
						+ " So that you can practice yourself at your home too.\n"
						+"\n"
						+" Tips and tricks on controlling blood pressure will be shared during each classes you attend.\n"
						+"\n"
						+" Each customers will receive a special gift once finish attending all te classes.\n"
						+ "\n"
						+" Trainer : 011-33905180\n"
						+"\n");
				
			}
		});
		btn4.setBounds(134, 346, 126, 23);
		panel_1.add(btn4);
		
		JRadioButton btn5 = new JRadioButton("Obesity");
		btn5.setBackground(new Color(255, 127, 80));
		btn5.setFont(new Font("Arial", Font.BOLD, 12));
		btn5.setForeground(Color.BLACK);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText( "Package : Obesity\n"
						+ " Poses & Benefits : \n"
						+"\n"
						+ " 1.Dandasana\n"
						+ " This pose is an excellent abdomen toner.\n "
						+ " It is good for the upper body as it strengthens the wrists and arms.\n"
						+"\n"
						+ " 2.Kapal Bhati Pranayama\n"
						+ " This breathing technique increases the rate of metabolism and thus helps in reducing weight. \n"
						+ " It also improves digestive tract functioning, absorption and assimilation of nutrients.\n"
						+"\n"
						+" The steps on how to do it will be send through your whatsapp once you've registered, \n"
						+ " So that you can practice yourself at your home too.\n"
						+"\n"
						+ " Tips and tricks on reducing and maintaining your weight will be shared during each classes you attend.\n"
						+"\n"
						+ " Each customers will receive a special gift once finish attending all te classes.\n"
						+ "\n"
						+" Trainer : 011-33905190\n"
						+"\n");
			}
		});
		btn5.setBounds(10, 380, 109, 23);
		panel_1.add(btn5);
		
		JRadioButton btn6 = new JRadioButton("Insomnia");
		btn6.setBackground(new Color(255, 127, 80));
		btn6.setFont(new Font("Arial", Font.BOLD, 12));
		btn6.setForeground(Color.BLACK);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Package : Insomnia\n"
						+" Poses & Benefits : \n"
						+"\n"
						+" 1.Padangusthasana(Big Toe Pose)\n" 
						+" This pose stimulates the liver and kidneys in the back body, activating the parasympathetic nervous system,\n "
						+ "Which is responsible for releasing tension and putting the body to sleep.\n"
						+"\n"
						+" 2.Agnistambhasana(Fire Log Pose)\n"
						+" This pose actively focus on releasing tension in your hips,\n "
						+ " Your body will respond by releasing tension in other muscle groups, \n"
						+ " Which is preparing you for a relaxing night�s sleep.\n"
						+"\n"
						+" The steps on how to do it will be send through your whatsapp once you've registered,\n "
						+ " So that you can practice yourself at your home too.\n"
						+"\n"
						+" Tips and tricks on having a relaxing night sleep everyday will be shared during each classes you attend.\n"
						+"\n"
						+" Each customers will receive a special gift once finish attending all te classes.\n"
						+ "\n"
						+" Trainer : 011-33905110\n"
						+"\n");
			}
		});
		btn6.setBounds(134, 380, 109, 23);
		panel_1.add(btn6);
		
		JRadioButton btn7 = new JRadioButton("Back Pain");
		btn7.setBackground(new Color(218, 165, 32));
		btn7.setFont(new Font("Arial", Font.BOLD, 12));
		btn7.setForeground(Color.BLACK);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(" Package : Back Pain\n"
						+ " Poses & Benefits : \n"
						+"\n"
						+" 1. Cat-Cow \n"
						+" 2. Downward-Facing-Dog \n"
						+" 3. Extended Triangle \n"
						+" 4. Sphinx Pose \n"
						+" 5. Locust Pose\n"
						+"\n"
						+" All of the appropriate poses can relax and strengthen your body.\n"
						+" This will be useful in treating back pain."
						+"\n"
						+" The steps on how to do it will be send through your whatsapp once you've registered, \n"
						+ " So that you can practice yourself at your home too.\n"
						+"\n"
						+" Tips and tricks to overcome from back pain will be shared during each classes you attend.\n"
						+"\n"
						+" Each customers will receive a special gift once finish attending all te classes.\n"
						+"\n"
						+" Trainer : 011-33905120\n"
						+"\n");
			}
		});
		btn7.setBounds(75, 423, 109, 23);
		panel_1.add(btn7);
		
		JButton Receipt = new JButton("Generate Receipt");
		Receipt.setBackground(new Color(135, 206, 235));
		Receipt.setFont(new Font("Arial Black", Font.BOLD, 12));
		Receipt.setForeground(Color.BLACK);
		Receipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_1.setText("--------------------------------"
	                    + "-----------CONFIRMATION RECEIPT----"
	                    + "--------------------------"
	                    + "--------------------------"
	                    + "-------------------\n"); 
	  
	                textArea_1.setText(textArea_1.getText() 
	                              + " First Name: "
	                              + txt1.getText() 
	                              + "\n"); 
	                textArea_1.setText(textArea_1.getText() 
	                              + " Last Name: "
	                              + txt2.getText() 
	                              + "\n"); 
	                textArea_1.setText(textArea_1.getText() 
	                              + " Phone Number: "
	                              + txt3.getText() 
	                              + "\n"); 
	                textArea_1.setText(textArea_1.getText() 
	                              + " Nationality: "
	                              + txt4.getText()
	                              + "\n"); 
	                textArea_1.setText(textArea_1.getText() 
                            + " Yoga experience before : "
                            + cmb1.getSelectedItem() 
                                  .toString() 
                            + "\n"); 
	                textArea_1.setText(textArea_1.getText() 
                            + " Package offered days selected: "
                            + cmb2.getSelectedItem() 
                                  .toString() 
                            + "\n"); 
	                
	             if (btn3.isSelected()) { 
	                    textArea_1.setText(textArea_1.getText() 
	                                  + " Wants to Join : "
	                                  + " Stress Relief \r\n"
	                                  + " Total Amount To Be Paid : RM 399\n"
	                                  + " Trainer : 011-33905170 "
	                                  +"\n"); 
	             }
	             
	                    if (btn4.isSelected()) { 
	                    textArea_1.setText(textArea_1.getText() 
	                                  + " Wants to Join : "
	                                  + " Blood Pressure \r\n"
	                                  + " Total Amount To Be Paid : RM 499\n"
	                                  + " Trainer : 011-33905180 "
	                                  + "\n"); 
	                    }
	                    if (btn5.isSelected()) {
	                    	textArea_1.setText(textArea_1.getText()
	                    			  + " Wants to Join : "
	                    			  + " Obesity \r\n"
	                    			  + " Total Amount To Be Paid : RM 599\n"
	                    			  + " Trainer : 011-33905190 "
	                    			  +"\n");
	                    }
	                    if (btn6.isSelected()) {
	                    	textArea_1.setText(textArea_1.getText()
	                    			  + " Wants to Join : "
	                    			  + " Insomnia \r\n"
	                    			  + " Total Amount To Be Paid : RM 399\n"
	                    			  + " Trainer : 011-33905110 "
	                    			  +"\n");
	                    }
	                    if (btn7.isSelected()) {
	                    	textArea_1.setText(textArea_1.getText()
	                    			  + " Wants to Join : "
	                    			  + " Back Pain \r\n"
	                    			  + " Total Amount To Be Paid : RM 399\n"
	                    			  + " Trainer : 011-33905120 "
	                    			  +"\n");
	                
	                } 
	                    if (e.getSource() == Receipt) { 
	                        try { 
	                            FileWriter fw 
	                                = new FileWriter( 
	                                    "yoga.txt", true); 
	                            fw.write(textArea_1.getText()); 
	                            fw.close(); 
	                        } 
	                        catch (Exception ae) { 
	                            System.out.println(ae); 
	                        } 
	                    } 
	                JOptionPane.showMessageDialog(textArea_1, "DATA SAVED SUCESSFULLY"); 
				
	                }
		
		});
		Receipt.setBounds(353, 26, 161, 30);
		panel_1.add(Receipt);
		
		JButton b2 = new JButton("Reset");
		b2.setBackground(new Color(135, 206, 235));
		b2.setFont(new Font("Arial Black", Font.BOLD, 12));
		b2.setForeground(Color.BLACK);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 b2.addActionListener( 
				            new ActionListener() { 
				                public void actionPerformed( 
				                    ActionEvent e) 
				                { 
				                    textArea.setText(""); 
				                    textArea_1.setText("");
				                    txt1.setText(""); 
				                    txt2.setText("");
				                    txt3.setText("");
				                    txt4.setText("");
				                    
				                    
				                } 
				            }); 
				  
			}
		});
		b2.setBounds(576, 26, 112, 30);
		panel_1.add(b2);
		
		JButton Print = new JButton("Print");
		Print.setBackground(new Color(135, 206, 250));
		Print.setFont(new Font("Arial Black", Font.BOLD, 12));
		Print.setForeground(Color.BLACK);
		Print.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{ 
                    try { 
                        textArea_1.print(); 
                    } 
                    catch (java.awt.print 
                               .PrinterException a) { 
                        System.err.format( 
                            "NoPrinter Found", 
                            a.getMessage()); 
                    } 
			}
			}
		});
		Print.setBounds(747, 26, 106, 30);
		panel_1.add(Print);
		
		JButton btnNewButton_1 = new JButton("BOOKING");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(btnNewButton_1, " You are directed to package booking system " 
				
						+ JOptionPane.OK_OPTION);
				
				BookingReg br = new BookingReg();
				br.setVisible(true);
				
			}
		});
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(397, 488, 117, 34);
		panel_1.add(btnNewButton_1);
		
	}
	}
