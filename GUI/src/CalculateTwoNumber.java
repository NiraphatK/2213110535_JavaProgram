import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.text.*;
import javax.swing.JCheckBox;

public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumber1;
	private JTextField txtNumber2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
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
	public CalculateTwoNumber() {
		setTitle("CalculateTwoNumber");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 549);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblshowDialog = new JLabel("Option to show");
		lblshowDialog.setBounds(53, 311, 103, 14);
		contentPane.add(lblshowDialog);

		final JCheckBox chckbxShowDialog = new JCheckBox("Show Result at DialogBox");
		chckbxShowDialog.setBounds(176, 307, 176, 23);
		contentPane.add(chckbxShowDialog);

		JLabel rdbOperator = new JLabel("How to show digit");
		rdbOperator.setBounds(53, 208, 103, 14);
		contentPane.add(rdbOperator);

		final JRadioButton oneDigit = new JRadioButton("1 Digit");
		oneDigit.setBounds(176, 204, 109, 23);
		contentPane.add(oneDigit);

		final JRadioButton twoDigit = new JRadioButton("2 Digit");
		twoDigit.setBounds(176, 245, 109, 23);
		contentPane.add(twoDigit);

		ButtonGroup group = new ButtonGroup();
		group.add(oneDigit);
		group.add(twoDigit);

		JLabel lblNumber1 = new JLabel("Enter Number 1");
		lblNumber1.setBounds(53, 36, 89, 14);
		contentPane.add(lblNumber1);

		JLabel lblNumber2 = new JLabel("Enter Number 2");
		lblNumber2.setBounds(53, 83, 89, 14);
		contentPane.add(lblNumber2);

		final JLabel lblResult = new JLabel("Result");
		lblResult.setForeground(Color.RED);
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResult.setBounds(314, 390, 70, 21);
		contentPane.add(lblResult);

		txtNumber1 = new JTextField();
		txtNumber1.setBounds(176, 36, 149, 20);
		contentPane.add(txtNumber1);
		txtNumber1.setColumns(10);

		txtNumber2 = new JTextField();
		txtNumber2.setColumns(10);
		txtNumber2.setBounds(176, 83, 149, 20);
		contentPane.add(txtNumber2);

		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setBounds(53, 139, 59, 14);
		contentPane.add(lblOperator);

		final JComboBox chOperator = new JComboBox();
		chOperator.setBounds(176, 135, 59, 22);
		chOperator.addItem("+");
		chOperator.addItem("-");
		chOperator.addItem("*");
		chOperator.addItem("/");
		contentPane.add(chOperator);

		final JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1, num2, sum = 0;
				String operator;

				if (e.getSource() == btnOK) {
					num1 = Double.parseDouble(txtNumber1.getText());
					num2 = Double.parseDouble(txtNumber2.getText());
					// sum = num1 + num2;
					operator = (String) chOperator.getSelectedItem();
					if (operator.equals("+"))
						sum = num1 + num2;
					if (operator.equals("-"))
						sum = num1 - num2;
					if (operator.equals("*"))
						sum = num1 * num2;
					if (operator.equals("/"))
						sum = num1 / num2;

					// JRadioBtn
					DecimalFormat frmNumber = null;
					if (oneDigit.isSelected()) {
						frmNumber = new DecimalFormat("#,###.0");
					} else if (twoDigit.isSelected()) {
						frmNumber = new DecimalFormat("#,###.00");
					}
					lblResult.setText((frmNumber.format(sum)));
					if (chckbxShowDialog.isSelected()) {
						JOptionPane.showMessageDialog(null, ("Result is : " + frmNumber.format(sum)),
								"CalculateTwoNumber", JOptionPane.INFORMATION_MESSAGE);
					}

				}
			}
		});
		btnOK.setBounds(129, 446, 89, 23);
		contentPane.add(btnOK);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(228, 446, 89, 23);
		contentPane.add(btnExit);

	}
}
