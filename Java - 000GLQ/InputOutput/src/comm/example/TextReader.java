package comm.example;

import java.awt.EventQueue;

import java.io.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class TextReader {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextReader window = new TextReader();
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
	public TextReader() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEnterText = new JLabel("Enter Text");
		lblEnterText.setBounds(173, 11, 60, 14);
		frame.getContentPane().add(lblEnterText);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(56, 38, 321, 119);
		frame.getContentPane().add(textArea);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
		            BufferedWriter bw = new BufferedWriter(new FileWriter("input1.txt"));
		            bw.write(textArea.getText());
		            System.out.println("Text saved");
		            bw.close();
		        }catch(Exception ex){
		            ex.printStackTrace();
		        }
				
			}
		});
		btnSave.setBounds(72, 194, 89, 23);
		frame.getContentPane().add(btnSave);
		
		JButton btnRead = new JButton("Read");
		frame.setVisible(true);
		btnRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					BufferedReader br;
					br = new BufferedReader(new FileReader("input1.txt"));
					String l;
					while((l = br.readLine()) != null) {
						textArea.append(l+ '\n');
			        System.out.println("Text read");
					}
			        br.close();
				
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	          
			}
		});
		btnRead.setBounds(250, 194, 89, 23);
		frame.getContentPane().add(btnRead);
		
		
	}
}
