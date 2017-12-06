package bubbleandselection;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Sirala {

	private JFrame frame;
	private JTextField textBoyut;
	private JTextField textElemanSayi;
	int elemansayi;
	listele liste;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sirala window = new Sirala();
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
	public Sirala() {
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
		
		JLabel lblDiziBoyut = new JLabel("Dizi Boyutunu Giriniz:");
		lblDiziBoyut.setBounds(10, 11, 115, 21);
		frame.getContentPane().add(lblDiziBoyut);
		
		textBoyut = new JTextField();
		textBoyut.setBounds(135, 11, 86, 20);
		frame.getContentPane().add(textBoyut);
		textBoyut.setColumns(10);
		
		JLabel lblElemanGiriniz = new JLabel(" 1  . Eleman\u0131 Giriniz:");
		lblElemanGiriniz.setVisible(false);
		lblElemanGiriniz.setBounds(10, 53, 115, 21);
		frame.getContentPane().add(lblElemanGiriniz);
		
		textElemanSayi = new JTextField();
		textElemanSayi.setVisible(false);
		textElemanSayi.setBounds(135, 53, 86, 20);
		frame.getContentPane().add(textElemanSayi);
		textElemanSayi.setColumns(10);
		
		JButton btnEkle = new JButton("EKLE");
		for(int i=0;  i<=elemansayi; i++)
		{ int a=i+2;
		btnEkle.addActionListener(new ActionListener() {									
			public void actionPerformed(ActionEvent arg0) 
			{
				
				
				int eleman= Integer.parseInt(textElemanSayi.getText());
				liste.arayaekle(eleman,0 );				
				//liste.yaz();
				System.out.println("********");
				lblElemanGiriniz.setText(a+"  . elemaný giriniz");
				textElemanSayi.setText("");
				
				
				
				
			}			
		});
		}
		btnEkle.setVisible(false);
		btnEkle.setBounds(255, 52, 89, 23);
		frame.getContentPane().add(btnEkle);
		
		JButton btnKur = new JButton("Dizi Kur");
		btnKur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				elemansayi=Integer.parseInt(textBoyut.getText());
				liste= new listele(elemansayi);
				lblElemanGiriniz.setVisible(true);
				btnEkle.setVisible(true);
				textElemanSayi.setVisible(true);
				
			}
		});
		btnKur.setBounds(255, 10, 89, 23);
		frame.getContentPane().add(btnKur);
		
		JLabel lblBubble = new JLabel("BUBBLE :");
		lblBubble.setBounds(10, 85, 115, 14);
		frame.getContentPane().add(lblBubble);
		
		JTextArea textBubble = new JTextArea();
		textBubble.setBounds(135, 84, 209, 74);
		frame.getContentPane().add(textBubble);
		
		JLabel lblSelecton = new JLabel("SELECTION:");
		lblSelecton.setBounds(10, 162, 115, 14);
		frame.getContentPane().add(lblSelecton);
		
		JTextArea textSelection = new JTextArea();
		textSelection.setBounds(135, 169, 209, 81);
		frame.getContentPane().add(textSelection);
		
		JButton btnSirala = new JButton("SIRALA");
		btnSirala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				liste.BubbleSort();
				for(int j=0;j<elemansayi;j++)
				{
					System.out.println(elemansayi);
					textBubble.append("  "+Integer.toString(liste.yazs(j))+"-");
					liste.yaz();
					
				}
				
				liste.SelectionSort();
				for(int j=0;j<elemansayi;j++)
				{
					System.out.println(elemansayi);
					textSelection.append("  "+Integer.toString(liste.yazs(j))+"-");
					liste.yaz();
					
				}
				
			}
		});
		btnSirala.setBounds(354, 52, 80, 23);
		frame.getContentPane().add(btnSirala);
		
		
		
		
		
	}
}
