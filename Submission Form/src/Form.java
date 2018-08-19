import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.Color;

import javax.swing.*;

public class Form  {
	
	
	public static void main (String[] args) {
		Form gui = new Form();
		gui.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		
		//boxLayout to keeps JPanel components stacked
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		//Label and text field for Name input
		JLabel labelName = new JLabel("Name:");
		JTextField name = new JTextField(20);
		
		
		//Age label and JList containing numbers 5-100
		JLabel labelAge = new JLabel("Age:");
		String [] numbers = new String[101];
		for(int i = 5; i <= 100; i++) { 
			numbers[i] = Integer.toString(i);
		}
		JList<String> listAge = new JList<String>(numbers);
		
		
		//give it a vertical scroll bar
		JScrollPane scroller = new JScrollPane(listAge);
		scroller.setViewportView(listAge);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		//Label and radio buttons for selecting Gender
		JLabel labelGender = new JLabel("Gender:");
        JRadioButton option1 = new JRadioButton("Male");
        JRadioButton option2 = new JRadioButton("Female");
        
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
       
		//Adding components to JPanel
		panel.add(labelName);
		panel.add(name);
		panel.add(labelGender);
        panel.add(option1);
        panel.add(option2);
		panel.add(labelAge);
		
		//Create submit button
		JButton button1 = new JButton("Submit");
		
		//Set window size
		frame.setSize(500, 500);
		//Add components to JFrame
		frame.getContentPane().add(BorderLayout.NORTH, panel);
		frame.getContentPane().add(BorderLayout.CENTER, scroller);
		frame.getContentPane().add(BorderLayout.SOUTH, button1);
		frame.setVisible(true);
		
		
	//Inner class for Submit button listener
		class SubmitListener implements ActionListener{
			public void actionPerformed(ActionEvent event) {
				
				String enteredName = new String();
				//limits enteredName output to 20 characters
				if (name.getText().length() > 20) {
					enteredName = name.getText().substring(0, 20);
				}
				else {
					enteredName = name.getText();
				}
				
				String gender = new String();
				if (option1.isSelected()) {
					gender = "Male";
				}
				else if(option2.isSelected()){
					gender = "Female";
				}
				
				String age = (String) listAge.getSelectedValue();
				
				JOptionPane.showMessageDialog(frame, "Submission Successful! Your Details:" 
						+ "\nName : " + enteredName + "\nGender : " + gender + "\nAge : " + age);
				}

			}
		//Event listener for submit button
		button1.addActionListener(new SubmitListener());
		}
	}
