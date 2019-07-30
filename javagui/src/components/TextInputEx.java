package components;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JList;

public class TextInputEx extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JPasswordField txtPwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextInputEx frame = new TextInputEx();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TextInputEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1280, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name ");
		lblName.setBounds(61, 83, 82, 21);
		contentPane.add(lblName);
		
		JLabel lblContents = new JLabel("Contents");
		lblContents.setBounds(61, 136, 82, 21);
		contentPane.add(lblContents);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(61, 379, 82, 21);
		contentPane.add(lblPassword);
		
		txtName = new JTextField();
		txtName.setToolTipText("this is tooltip....");
		txtName.setText("input your name");
		txtName.setBounds(225, 80, 166, 27);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(225, 137, 298, 225);
		contentPane.add(textArea);
		
		txtPwd = new JPasswordField();
		txtPwd.setBounds(225, 391, 240, 32);
		contentPane.add(txtPwd);
		
		JButton btnStore = new JButton("Store");
		btnStore.setBounds(225, 469, 129, 29);
		contentPane.add(btnStore);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				textArea.setText("");
				txtPwd.setText("");
				
			}
		});
		btnReset.setBounds(384, 469, 129, 29);
		contentPane.add(btnReset);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		tglbtnNewToggleButton.setBounds(611, 137, 189, 29);
		contentPane.add(tglbtnNewToggleButton);
		
		JCheckBox chkCpp = new JCheckBox("C++");
		chkCpp.setBounds(611, 207, 161, 29);
		contentPane.add(chkCpp);
		
		JCheckBox chkJava = new JCheckBox("Java");
		chkJava.setBounds(827, 207, 161, 29);
		contentPane.add(chkJava);
		
		ButtonGroup grp = new ButtonGroup();
		
		JRadioButton rdoMale = new JRadioButton("Male");
		rdoMale.setBounds(610, 281, 177, 29);
		contentPane.add(rdoMale);
		
		JRadioButton rdoFemale = new JRadioButton("Female");
		rdoFemale.setBounds(811, 281, 177, 29);
		contentPane.add(rdoFemale);
		
		grp.add(rdoMale);
		grp.add(rdoFemale);
		
		String[] pet = {"Make selection", "Cat", "Dog", "Rabbit", "Pig"};
		
		JList list = new JList(pet);
		list.setBounds(610, 320, 170, 100);
		contentPane.add(list);
		
		JComboBox combo = new JComboBox(pet);
		combo.setBounds(815, 320, 170, 30);
		contentPane.add(combo);
	}
}
