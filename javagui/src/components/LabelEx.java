package components;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class LabelEx extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabelEx frame = new LabelEx();
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
	public LabelEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 0));
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(255, 0, 0), 15));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("This is Title....");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblTitle.setForeground(new Color(255, 255, 0));
		lblTitle.setBounds(60, 34, 226, 52);
		contentPane.add(lblTitle);
		
		JLabel label = new JLabel("Java DB Class");
		label.setBounds(60, 101, 226, 52);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblTitle.setForeground(new Color(0,0,255));
			}
		});
		btnNewButton.setBounds(70, 168, 129, 29);
		contentPane.add(btnNewButton);
	}
}
