import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgeCalculator extends JFrame {
	
	private JButton button;
	private JLabel ageLabel;
	private JLabel dayLabel;
	private JLabel monthLabel;
	private JLabel yearLabel;
	private JLabel wordLabel;

	
	
	private JTextField dayField;
	private JTextField monthField;
	private JTextField yearField;
	
	private double userAge;
	
	private static final int FRAME_WIDTH = 350;
	private static final int FRAME_HEIGHT = 350;
	
	
	private static final double TODAYS_DAY = 27;
	private static final double TODAYS_MONTH = 2;
	private static final double TODAYS_YEAR = 2022;
	
	public AgeCalculator() {
		
		TextFields();
		guiButton();
		guiPanel();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	private void TextFields() {
		
		final int FIELD_WIDTH = 3;
		dayLabel = new JLabel("Day: ");
		dayField = new JTextField(FIELD_WIDTH);
		
		//Day Label and Field Dimension
		//Dimension size1 = dayLabel.getPreferredSize();
		//dayLabel.setBounds(94,80, size1.width, size1.height);
		
		//Dimension size1a = dayField.getPreferredSize();
		//dayField.setBounds(120, 80, size1a.width, size1a.height);
		
		
		monthLabel = new JLabel("Month: ");
		monthField = new JTextField(FIELD_WIDTH);
		
		//Month Label and Field Dimension
		//Dimension size2 = monthLabel.getPreferredSize();
		//monthLabel.setBounds(80, 112, size2.width, size2.height);
		
		//Dimension size2a = monthField.getPreferredSize();
		//monthField.setBounds(120, 110, size2a.width, size2a.height);
		
		final int YEAR_WIDTH = 4;
		yearLabel = new JLabel("Birth Year: ");
		yearField = new JTextField(YEAR_WIDTH);
		
		//Year Label and Field Dimension
		//Dimension size3 = yearLabel.getPreferredSize();
		//yearLabel.setBounds(59, 140, size3.width, size3.height);
		
		//Dimension size3a = yearField.getPreferredSize();
		//yearField.setBounds(120, 140, size3a.width, size3a.height);
		
		
		ageLabel = new JLabel("");
		
		
		
		//Dimension size6 = ageLabel.getPreferredSize();
		//ageLabel.setBounds(140, 210, size6.width, size6.height);
		
		//Wording Label Dimension
		wordLabel = new JLabel("Enter your date of birth to find your current age.", JLabel.CENTER);
		Dimension size4 = wordLabel.getPreferredSize();
		wordLabel.setBounds(30,20, size4.width, size4.height);
		
		
		
		
	}
	
	private void guiButton() {
		
		button = new JButton("Calculate");
		
		Dimension size5 = button.getPreferredSize();
		button.setBounds(120, 180, size5.width, size5.height);
		
		
		button.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int userDay = 0;
				int userMonth = 0;
				int userYear = 0;
				
				userDay = Integer.parseInt(dayField.getText());
				userMonth = Integer.parseInt(yearField.getText());
				userYear = Integer.parseInt(yearField.getText());
				
				if(userMonth < TODAYS_MONTH) {
					userAge = TODAYS_YEAR - userYear;
				} else if((userMonth == TODAYS_MONTH) && (userDay < TODAYS_DAY)) {
					userAge = TODAYS_YEAR - userYear;
				} else {
					userAge = TODAYS_YEAR - userYear - 1;
				}
				
				
				ageLabel.setText("Age: " + userAge);
				
			
				
				//Dimension size6 = ageLabel.getPreferredSize();
				//ageLabel.setBounds(140, 210, size6.width, size6.height);
				
			}
		});
	}
	
	private void guiPanel() {
		JPanel panel = new JPanel();
		//panel.setLayout(null);
		panel.add(wordLabel);
		panel.add(dayLabel);
		panel.add(dayField);
		panel.add(monthLabel);
		panel.add(monthField);
		panel.add(yearLabel);
		panel.add(yearField);
		panel.add(button);
		panel.add(ageLabel);
		add(panel);
	}
	
}