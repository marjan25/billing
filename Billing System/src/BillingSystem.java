import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import javax.swing.text.JTextComponent;

import java.awt.Color;
import java.awt.TextField;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.TextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BillingSystem {
	
	

	private JFrame frame;
	private JTextField jtxtCoustomerRef;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_21;
	private JTextField jtxtTax;
	private JTextField jtxtSubTotal;
	private JTextField jtxtTotal;
	private JFrame frame2;
	String iTax,iSubTotal ,iTotal;
	double [] itemcost = new double[20];
	

	/**
	 * Launch the application.
	 */
	static final String DB_URL = "jdbc:mysql://localhost/billing";
	   static final String USER = "marzan";
	   static final String PASS = "Khamar123@";
	
	public static void main(String[] args) {
	
		
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		// TODO Auto-generated method stub
		 try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		     Statement stmt = conn.createStatement();
			      ) {
	         
	            System.out.println("Database is connected !");    

	            conn.close();
	        }
	        catch(Exception e) {
	            System.out.print("Do not connect to DB - Error:"+e);
	        }
		 
		 
		 
		 
		 ///////////////////////////////////////////////////////////////////////////////////////////////
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BillingSystem window = new BillingSystem();
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
	public BillingSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				jtxtCoustomerRef.setText(null);
				jtxtCoustomerRef.setEnabled(false);
				int refs= 5015 + (int) (Math.random()*17238);
				String cRef = "";
				cRef += refs + 1560;
				jtxtCoustomerRef.setText(cRef);
			}
		});
		frame.setBounds(100, 100, 1100, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		JPanel panel = new JPanel();
		panel.setForeground(new Color(51, 51, 51));
		panel.setBounds(0, 0, 1098, 684);
		panel.setBackground(new Color(176, 224, 230));
		panel.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(0, 128, 128)));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setToolTipText("");
		panel_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(0, 128, 128)));
		panel_1.setBackground(new Color(176, 224, 230));
		panel_1.setBounds(23, 77, 347, 554);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		jtxtCoustomerRef = new JTextField();
		jtxtCoustomerRef.setForeground(Color.BLACK);
		jtxtCoustomerRef.setFont(new Font("Dialog", Font.PLAIN, 12));
		jtxtCoustomerRef.setBounds(162, 41, 155, 19);
		panel_1.add(jtxtCoustomerRef);
		jtxtCoustomerRef.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Customer Ref");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(37, 41, 131, 19);
		panel_1.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.BLACK);
		textField_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(162, 83, 155, 19);
		panel_1.add(textField_1);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		lblFirstName.setBounds(37, 83, 131, 19);
		panel_1.add(lblFirstName);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(162, 125, 155, 19);
		panel_1.add(textField_2);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		lblLastName.setBounds(37, 125, 131, 19);
		panel_1.add(lblLastName);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(162, 165, 155, 19);
		panel_1.add(textField_3);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		lblAddress.setBounds(37, 165, 131, 19);
		panel_1.add(lblAddress);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(162, 207, 155, 19);
		panel_1.add(textField_4);
		
		JLabel lblMobileNo = new JLabel("Mobile No");
		lblMobileNo.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		lblMobileNo.setBounds(37, 207, 131, 19);
		panel_1.add(lblMobileNo);
		
		JLabel lblCat = new JLabel("Items");
		lblCat.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		lblCat.setBounds(37, 252, 131, 19);
		panel_1.add(lblCat);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"windows", "pipes", "fhgsd", "dfzg", "fgsdfgs", "dfghdfsh"}));
		comboBox.setBounds(162, 249, 155, 24);
		panel_1.add(comboBox);
		
		JLabel lblSizes = new JLabel("Sizes");
		lblSizes.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		lblSizes.setBounds(37, 298, 56, 19);
		panel_1.add(lblSizes);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(117, 298, 106, 19);
		panel_1.add(textField_5);
		
		JPanel panel_1_1_1_2_1 = new JPanel();
		panel_1_1_1_2_1.setLayout(null);
		panel_1_1_1_2_1.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 128, 128)));
		panel_1_1_1_2_1.setBackground(new Color(0, 128, 128));
		panel_1_1_1_2_1.setBounds(22, 375, 302, 155);
		panel_1.add(panel_1_1_1_2_1);
		
		JPanel panel_1_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(0, 128, 128)));
		panel_1_1_1_1_1_1.setBackground(new Color(176, 224, 230));
		panel_1_1_1_1_1_1.setBounds(-116, 101, 125, 554);
		panel_1_1_1_2_1.add(panel_1_1_1_1_1_1);
		JTextArea jtxtReceipt = new JTextArea();
		jtxtReceipt.setBounds(21, 25, 294, 393);
	
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {

		

			public void actionPerformed(ActionEvent arg0) {
			
	try(Connection conn2 = DriverManager.getConnection(DB_URL, USER, PASS);
		     Statement stmt = conn2.createStatement();
		      )
	{
		PreparedStatement pstmt = null;
		//pstmt = conn2.prepareStatement("INSERT INTO billing VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?) ");
		pstmt = conn2.prepareStatement("INSERT INTO billing VALUES(? ,?, ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,0) ");
		pstmt.setInt(1, 22);
		
		pstmt.setString(2,textField_1.getText())	;
		pstmt.setString(3,textField_2.getText())	;
		pstmt.setString(4,textField_3.getText())	;
		pstmt.setInt(5, (int) Long.parseLong(textField_4.getText()));
		pstmt.setInt(6, Integer.parseInt(textField_6.getText()));
		pstmt.setInt(7, Integer.parseInt(textField_7.getText()));
		pstmt.setInt(8, Integer.parseInt(textField_8.getText()));
		pstmt.setInt(9, Integer.parseInt(textField_9.getText()));
		pstmt.setInt(10, Integer.parseInt(textField_13.getText()));
		pstmt.setInt(11, Integer.parseInt(textField_10.getText()));
		pstmt.setInt(12, Integer.parseInt(textField_11.getText()));
		pstmt.setInt(13, Integer.parseInt(textField_17.getText()));
		pstmt.setInt(14, Integer.parseInt(textField_16.getText()));
		pstmt.setInt(15, Integer.parseInt(textField_14.getText()));
		pstmt.setInt(16, Integer.parseInt(textField_15.getText()));
		pstmt.setInt(17, Integer.parseInt(textField_21.getText()));
	
		//pstmt.setInt(5, Integer.parseInt(textField_4.getText()));
		pstmt.executeUpdate();
		// String sql = "INSERT INTO billing VALUES (1 ,'Zara', 'g','sfgkf',1,2,3,4,5,6,7,8,9,10,11,12,13,0)";
    //     stmt.executeUpdate(sql);
          System.out.println("Inserting records into the table...");     
		jtxtReceipt.print();
	}
	catch(java.awt.print.PrinterException e) {
		System.err.format("No printer found", e.getMessage());
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
			
			}
		});
		btnPrint.setFont(new Font("DejaVu Math TeX Gyre", Font.PLAIN, 20));
		btnPrint.setBounds(12, 57, 117, 48);
		panel_1_1_1_2_1.add(btnPrint);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				itemcost[0] = Double.parseDouble(textField_6.getText())*1.50;
				itemcost[1] = Double.parseDouble(textField_7.getText())*1.50;
				itemcost[2] = Double.parseDouble(textField_8.getText())*1.50;
				itemcost[3] = Double.parseDouble(textField_9.getText())*1.50;
				itemcost[4] = Double.parseDouble(textField_10.getText())*1.50;
				itemcost[5] = Double.parseDouble(textField_11.getText())*1.50;
				itemcost[6] = Double.parseDouble(textField_12.getText())*1.50;
				itemcost[7] = Double.parseDouble(textField_13.getText())*1.50;
				itemcost[8] = Double.parseDouble(textField_14.getText())*1.50;
				itemcost[9] = Double.parseDouble(textField_15.getText())*1.50;
				itemcost[10] = Double.parseDouble(textField_16.getText())*1.50;
				itemcost[11] = Double.parseDouble(textField_17.getText())*1.50;
				itemcost[12] = Double.parseDouble(textField_21.getText())*1.50;	
				
				itemcost[13] =itemcost[0]+itemcost[1] +itemcost[2]+itemcost[3]+itemcost[4]+itemcost[5];
				itemcost[14] =itemcost[6]+itemcost[7] +itemcost[8]+itemcost[9]+itemcost[10]+itemcost[11]+itemcost[12];
				
				itemcost[15] = itemcost[13]+itemcost[14];
				iTax = String.format("£ %.2f", itemcost[15]/100);
				iSubTotal = String.format("£ %.2f", itemcost[15]);
				iTotal =String.format("£ %.2f", itemcost[15]+(itemcost[15]/100));
				
				jtxtTax.setText(iTax);
				jtxtSubTotal.setText(iSubTotal);
				jtxtTotal.setText(iTotal);
				
				//=======================================================================
				jtxtReceipt.setEnabled(true);
				//======================================================================================
				int refs=1325+(int) (Math.random()*4238);
				
				//======================================================================================
				
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				tTime.format(timer.getTime());
				SimpleDateFormat Tdate = new SimpleDateFormat("dd:MMM:yyyy");
				Tdate.format(timer.getTime());
				
				
				//======================================================================================
				jtxtReceipt.append(("\t    FALIH INTERIORS      \n  "  )+
				"Reference :\t\t\t"+refs +
				"\n==========================================================="+
				
				           "\n==========================================================="+
				        "\nCoustomer Ref:\t\t"+jtxtCoustomerRef.getText()+
				        "\nFirst Name:\t\t"+textField_1.getText()+
				        "\nSurname:\t\t"+textField_2.getText()+
				        "\nMobile No:\t\t"+textField_4.getText()+
				        "\nNew Check Box:\t\t"+textField_6.getText()+
				        "\nNew Check Box:\t\t"+textField_7.getText()+
				        "\nNew Check Box:\t\t"+textField_8.getText()+
				        "\nNew Check Box:\t\t"+textField_9.getText()+
				        "\nNew Check Box:\t\t"+textField_13.getText()+
				        "\nNew Check Box:\t\t"+textField_12.getText()+
				        "\nNew Check Box:\t\t"+textField_10.getText()+
				        "\nNew Check Box:\t\t"+textField_11.getText()+
				        "\nNew Check Box:\t\t"+textField_17.getText()+
				        "\nNew Check Box:\t\t"+textField_16.getText()+
				        "\nNew Check Box:\t\t"+textField_14.getText()+
				        "\nNew Check Box:\t\t"+textField_15.getText()+
				        "\nNew Check Box:\t\t"+textField_21.getText()+
				     
				        "\n============================================================\t"+
				        
				        "\nTax\t\t"+iTax+
				        "\nSub Total:\t\t"+iSubTotal+
				        "\nTotal:\t\t"+iTotal+
				        "\n=============================================================\t"+
				       "\nDate:"+Tdate.format(timer.getTime())+
				             "\t\tTime:"+tTime.format(timer.getTime())+
				             "\n\n\t Thank you for Shopping at \n");
						
			}
		});
		btnTotal.setFont(new Font("DejaVu Math TeX Gyre", Font.PLAIN, 20));
		btnTotal.setBounds(159, 57, 117, 48);
		panel_1_1_1_2_1.add(btnTotal);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(0, 128, 128)));
		panel_1_1.setBackground(new Color(176, 224, 230));
		panel_1_1.setBounds(388, 77, 318, 554);
		panel.add(panel_1_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxNewCheckBox.isSelected()) {
					textField_6.setEnabled(true);
					textField_6.setText("")	;
					textField_6.requestFocus();
					}
				else {
					textField_6.setEnabled(false);
					textField_6.setText("0");
				}
			}
		});
		chckbxNewCheckBox.setBackground(new Color(176, 224, 230));
		chckbxNewCheckBox.setBounds(21, 31, 157, 23);
		panel_1_1.add(chckbxNewCheckBox);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setText("0");
		textField_6.setColumns(10);
		textField_6.setBounds(186, 33, 109, 19);
		panel_1_1.add(textField_6);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxNewCheckBox_1.isSelected()) {
					textField_7.setEnabled(true);
					textField_7.setText("")	;
					textField_7.requestFocus();
					}
				else {
					textField_7.setEnabled(false);
					textField_7.setText("0");
				}
			}
		});
		chckbxNewCheckBox_1.setBackground(new Color(176, 224, 230));
		chckbxNewCheckBox_1.setBounds(21, 58, 157, 23);
		panel_1_1.add(chckbxNewCheckBox_1);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setText("0");
		textField_7.setColumns(10);
		textField_7.setBounds(186, 60, 109, 19);
		panel_1_1.add(textField_7);
		
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxNewCheckBox_1_1.isSelected()) {
					textField_9.setEnabled(true);
					textField_9.setText("")	;
					textField_9.requestFocus();
					}
				else {
					textField_9.setEnabled(false);
					textField_9.setText("0");
				}
			}
		});
		chckbxNewCheckBox_1_1.setBackground(new Color(176, 224, 230));
		chckbxNewCheckBox_1_1.setBounds(21, 112, 157, 23);
		panel_1_1.add(chckbxNewCheckBox_1_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("New check box");
		chckbxNewCheckBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxNewCheckBox_2.isSelected()) {
					textField_8.setEnabled(true);
					textField_8.setText("")	;
					textField_8.requestFocus();
					}
				else {
					textField_8.setEnabled(false);
					textField_8.setText("0");
				}
			}
		});
		chckbxNewCheckBox_2.setBackground(new Color(176, 224, 230));
		chckbxNewCheckBox_2.setBounds(21, 85, 157, 23);
		panel_1_1.add(chckbxNewCheckBox_2);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setText("0");
		textField_8.setColumns(10);
		textField_8.setBounds(186, 87, 109, 19);
		panel_1_1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setText("0");
		textField_9.setColumns(10);
		textField_9.setBounds(186, 114, 109, 19);
		panel_1_1.add(textField_9);
		
		JCheckBox chckbxNewCheckBox_1_1_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxNewCheckBox_1_1_1.isSelected()) {
					textField_11.setEnabled(true);
					textField_11.setText("")	;
					textField_11.requestFocus();
					}
				else {
					textField_11.setEnabled(false);
					textField_11.setText("0");
				}
			}
		});
		chckbxNewCheckBox_1_1_1.setBackground(new Color(176, 224, 230));
		chckbxNewCheckBox_1_1_1.setBounds(21, 220, 157, 23);
		panel_1_1.add(chckbxNewCheckBox_1_1_1);
		
		JCheckBox chckbxNewCheckBox_2_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxNewCheckBox_2_1.isSelected()) {
					textField_10.setEnabled(true);
					textField_10.setText("")	;
					textField_10.requestFocus();
					}
				else {
					textField_10.setEnabled(false);
					textField_10.setText("0");
				}
			}
		});
		chckbxNewCheckBox_2_1.setBackground(new Color(176, 224, 230));
		chckbxNewCheckBox_2_1.setBounds(21, 193, 157, 23);
		panel_1_1.add(chckbxNewCheckBox_2_1);
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setText("0");
		textField_10.setColumns(10);
		textField_10.setBounds(186, 195, 109, 19);
		panel_1_1.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setText("0");
		textField_11.setColumns(10);
		textField_11.setBounds(186, 222, 109, 19);
		panel_1_1.add(textField_11);
		
		JCheckBox chckbxNewCheckBox_1_2 = new JCheckBox("New check box");
		chckbxNewCheckBox_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxNewCheckBox_1_2.isSelected()) {
					textField_12.setEnabled(true);
					textField_12.setText("")	;
					textField_12.requestFocus();
					}
				else {
					textField_12.setEnabled(false);
					textField_12.setText("0");
				}
			}
		});
		chckbxNewCheckBox_1_2.setBackground(new Color(176, 224, 230));
		chckbxNewCheckBox_1_2.setBounds(21, 166, 157, 23);
		panel_1_1.add(chckbxNewCheckBox_1_2);
		
		textField_12 = new JTextField();
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setText("0");
		textField_12.setColumns(10);
		textField_12.setBounds(186, 168, 109, 19);
		panel_1_1.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setText("0");
		textField_13.setColumns(10);
		textField_13.setBounds(186, 141, 109, 19);
		panel_1_1.add(textField_13);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("New check box");
		chckbxNewCheckBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxNewCheckBox_3.isSelected()) {
					textField_13.setEnabled(true);
					textField_13.setText("")	;
					textField_13.requestFocus();
					}
				else {
					textField_13.setEnabled(false);
					textField_13.setText("0");
				}
			}
		});
		chckbxNewCheckBox_3.setBackground(new Color(176, 224, 230));
		chckbxNewCheckBox_3.setBounds(21, 139, 157, 23);
		panel_1_1.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_1_1_2 = new JCheckBox("New check box");
		chckbxNewCheckBox_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxNewCheckBox_1_1_2.isSelected()) {
					textField_15.setEnabled(true);
					textField_15.setText("")	;
					textField_15.requestFocus();
					}
				else {
					textField_15.setEnabled(false);
					textField_15.setText("0");
				}
			}
		});
		chckbxNewCheckBox_1_1_2.setBackground(new Color(176, 224, 230));
		chckbxNewCheckBox_1_1_2.setBounds(21, 328, 157, 23);
		panel_1_1.add(chckbxNewCheckBox_1_1_2);
		
		JCheckBox chckbxNewCheckBox_2_2 = new JCheckBox("New check box");
		chckbxNewCheckBox_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxNewCheckBox_2_2.isSelected()) {
					textField_14.setEnabled(true);
					textField_14.setText("")	;
					textField_14.requestFocus();
					}
				else {
					textField_14.setEnabled(false);
					textField_14.setText("0");
				}
			}
		});
		chckbxNewCheckBox_2_2.setBackground(new Color(176, 224, 230));
		chckbxNewCheckBox_2_2.setBounds(21, 301, 157, 23);
		panel_1_1.add(chckbxNewCheckBox_2_2);
		
		textField_14 = new JTextField();
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setText("0");
		textField_14.setColumns(10);
		textField_14.setBounds(186, 303, 109, 19);
		panel_1_1.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setText("0");
		textField_15.setColumns(10);
		textField_15.setBounds(186, 330, 109, 19);
		panel_1_1.add(textField_15);
		
		JCheckBox chckbxNewCheckBox_1_3 = new JCheckBox("New check box");
		chckbxNewCheckBox_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxNewCheckBox_1_3.isSelected()) {
					textField_16.setEnabled(true);
					textField_16.setText("")	;
					textField_16.requestFocus();
					}
				else {
					textField_16.setEnabled(false);
					textField_16.setText("0");
				}
			}
		});
		chckbxNewCheckBox_1_3.setBackground(new Color(176, 224, 230));
		chckbxNewCheckBox_1_3.setBounds(21, 274, 157, 23);
		panel_1_1.add(chckbxNewCheckBox_1_3);
		
		textField_16 = new JTextField();
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setText("0");
		textField_16.setColumns(10);
		textField_16.setBounds(186, 276, 109, 19);
		panel_1_1.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setText("0");
		textField_17.setColumns(10);
		textField_17.setBounds(186, 249, 109, 19);
		panel_1_1.add(textField_17);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("New check box");
		chckbxNewCheckBox_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxNewCheckBox_4.isSelected()) {
					textField_17.setEnabled(true);
					textField_17.setText("")	;
					textField_17.requestFocus();
					}
				else {
					textField_17.setEnabled(false);
					textField_17.setText("0");
				}
			}
		});
		chckbxNewCheckBox_4.setBackground(new Color(176, 224, 230));
		chckbxNewCheckBox_4.setBounds(21, 247, 157, 23);
		panel_1_1.add(chckbxNewCheckBox_4);
		
		textField_21 = new JTextField();
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setText("0");
		textField_21.setColumns(10);
		textField_21.setBounds(186, 356, 109, 19);
		panel_1_1.add(textField_21);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("New check box");
		chckbxNewCheckBox_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxNewCheckBox_5.isSelected()) {
					textField_21.setEnabled(true);
					textField_21.setText("")	;
					textField_21.requestFocus();
					}
				else {
					textField_21.setEnabled(false);
					textField_21.setText("0");
				}
			}
			
		});
		chckbxNewCheckBox_5.setBackground(new Color(176, 224, 230));
		chckbxNewCheckBox_5.setBounds(21, 354, 157, 23);
		panel_1_1.add(chckbxNewCheckBox_5);
		
		JPanel panel_1_1_1_2 = new JPanel();
		panel_1_1_1_2.setBounds(21, 387, 274, 145);
		panel_1_1.add(panel_1_1_1_2);
		panel_1_1_1_2.setLayout(null);
		panel_1_1_1_2.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 128, 128)));
		panel_1_1_1_2.setBackground(new Color(0, 128, 128));
		
		JPanel panel_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(0, 128, 128)));
		panel_1_1_1_1_1.setBackground(new Color(176, 224, 230));
		panel_1_1_1_1_1.setBounds(-116, 101, 125, 554);
		panel_1_1_1_2.add(panel_1_1_1_1_1);
		
		jtxtTax = new JTextField();
		jtxtTax.setColumns(10);
		jtxtTax.setBounds(113, 11, 149, 19);
		panel_1_1_1_2.add(jtxtTax);
		
		JLabel jlblTax = new JLabel("Tax");
		jlblTax.setForeground(new Color(0, 0, 0));
		jlblTax.setFont(new Font("Dialog", Font.BOLD, 17));
		jlblTax.setBounds(10, 11, 97, 19);
		panel_1_1_1_2.add(jlblTax);
		
		JLabel jlblSubtotal = new JLabel("SubTotal");
		jlblSubtotal.setForeground(new Color(0, 0, 0));
		jlblSubtotal.setFont(new Font("Dialog", Font.BOLD, 17));
		jlblSubtotal.setBounds(10, 51, 131, 19);
		panel_1_1_1_2.add(jlblSubtotal);
		
		jtxtSubTotal = new JTextField();
		jtxtSubTotal.setColumns(10);
		jtxtSubTotal.setBounds(113, 51, 149, 19);
		panel_1_1_1_2.add(jtxtSubTotal);
		
		JLabel jlblTotal = new JLabel("Total");
		jlblTotal.setForeground(new Color(0, 0, 0));
		jlblTotal.setFont(new Font("Dialog", Font.BOLD, 17));
		jlblTotal.setBounds(10, 93, 131, 19);
		panel_1_1_1_2.add(jlblTotal);
		
		jtxtTotal = new JTextField();
		jtxtTotal.setColumns(10);
		jtxtTotal.setBounds(113, 93, 149, 19);
		panel_1_1_1_2.add(jtxtTotal);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(23, -18, 200, 1);
		panel.add(textArea);
		
		JEditorPane dtrpnBilling = new JEditorPane();
		dtrpnBilling.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 25));
		dtrpnBilling.setBackground(new Color(176, 224, 230));
		dtrpnBilling.setText("Billing");
		dtrpnBilling.setBounds(465, 30, 115, 35);
		panel.add(dtrpnBilling);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(0, 128, 128)));
		panel_1_1_1.setBackground(new Color(176, 224, 230));
		panel_1_1_1.setBounds(735, 77, 338, 554);
		panel.add(panel_1_1_1);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(0, 128, 128)));
		panel_1_1_1_1.setBackground(new Color(176, 224, 230));
		panel_1_1_1_1.setBounds(-116, 101, 125, 554);
		panel_1_1_1.add(panel_1_1_1_1);
		
		JPanel panel_1_1_1_2_1_1 = new JPanel();
		panel_1_1_1_2_1_1.setLayout(null);
		panel_1_1_1_2_1_1.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 128, 128)));
		panel_1_1_1_2_1_1.setBackground(new Color(0, 128, 128));
		panel_1_1_1_2_1_1.setBounds(21, 430, 294, 99);
		panel_1_1_1.add(panel_1_1_1_2_1_1);
		
		JPanel panel_1_1_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1_1_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(0, 128, 128)));
		panel_1_1_1_1_1_1_1.setBackground(new Color(176, 224, 230));
		panel_1_1_1_1_1_1_1.setBounds(-116, 101, 125, 554);
		panel_1_1_1_2_1_1.add(panel_1_1_1_1_1_1_1);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_1.setText("")	;
				textField_2.setText("")	;
				textField_3.setText("")	;
				textField_4.setText("")	;
				textField_5.setText("")	;
	
				textField_6.setText("")	;
				textField_7.setText("")	;
				textField_8.setText("")	;
				textField_9.setText("")	;
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");
				textField_15.setText("");
				textField_16.setText("");
				textField_17.setText("");
				textField_21.setText("");
				chckbxNewCheckBox.setSelected(false);
				chckbxNewCheckBox_1.setSelected(false);
				chckbxNewCheckBox_2.setSelected(false);
				chckbxNewCheckBox_3.setSelected(false);
				chckbxNewCheckBox_1_1.setSelected(false);
				chckbxNewCheckBox_4.setSelected(false);
				chckbxNewCheckBox_5.setSelected(false);
				chckbxNewCheckBox_1_2.setSelected(false);
				chckbxNewCheckBox_1_3.setSelected(false);
				chckbxNewCheckBox_2_1.setSelected(false);
				chckbxNewCheckBox_1_1_1.setSelected(false);
				chckbxNewCheckBox_2_2.setSelected(false);
				chckbxNewCheckBox_1_1_2.setSelected(false);
				jtxtCoustomerRef.setText(null);
				jtxtCoustomerRef.setEnabled(false);
				int refs= 5015 + (int) (Math.random()*17238);
				String cRef = "";
				cRef += refs + 1560;
				jtxtCoustomerRef.setText(cRef);
				jtxtReceipt.setText("");
				jtxtTax.setText("");				
				jtxtSubTotal.setText("");	
				jtxtTotal.setText("");	
			}
		});
		btnReset.setFont(new Font("DejaVu Math TeX Gyre", Font.PLAIN, 20));
		btnReset.setBounds(12, 39, 117, 48);
		panel_1_1_1_2_1_1.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
		
				frame2 = new JFrame();
				if(JOptionPane.showConfirmDialog(frame2, "Confirm if you want to exit","costomer Billing System",
						JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			
			
			}
		});
		panel_1_1_1.add(jtxtReceipt);
		btnExit.setFont(new Font("DejaVu Math TeX Gyre", Font.PLAIN, 20));
		btnExit.setBounds(154, 39, 117, 48);
		panel_1_1_1_2_1_1.add(btnExit);
		
	
	}
}
