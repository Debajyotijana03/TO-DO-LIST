package classes;

import java.awt.Font;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.border.EmptyBorder;

public class Spaash extends JWindow {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		JFrame frame =new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(200,100,400,400);
		
		Spaash sp =	new Spaash(frame,"Welcome to TO DO APP");
	}

	/**
	 * Create the frame.
	 */
	public Spaash(JFrame frame,String msg) {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(msg);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(139, 163, 100, 74);
		contentPane.add(lblNewLabel);
		setLocationRelativeTo(null);
		setAlwaysOnTop(true);
		setVisible(true);
		int width=400,height =600;
	//	outerHeight	: 672outerWidth: 	1280
		 int totalWidth=1366,totalHeigth=744;
		 setSize(width,height);
		this.setLocation((int)(totalWidth-width)/2,(int)(totalHeigth -height)/2);
		
		Timer timer=  new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
			frame.setVisible(true);
			dispose();
			}
			},5000);
		
	
	}
}
