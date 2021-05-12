package prueba1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JframePrueba extends JFrame 
		implements ActionListener{

	private JPanel contentPane;
	private static final long serialVersionUID = 1L; 
	private JButton b1; 
	private JButton b2; 
	private JTextField t;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JframePrueba frame = new JframePrueba();
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
	public JframePrueba() {
		setTitle("Ventana de prueba");
		setBounds(100, 100, 450, 300);
		setSize(600, 250);
		setVisible(true);
		getContentPane().setLayout(null);
		
		b1 = new JButton("Hola");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			}
		});
		b1.setBounds(100, 50, 100, 20);
		 getContentPane().add(b1); // se añade el botón a la ventana

		b2 = new JButton("Adios");
		b2.setBounds(100, 80, 100, 20);
		 getContentPane().add(b2); // se añade el botón a la ventana

		t = new JTextField(20); // Se crea el campo de texto
		t.setBounds(210, 50, 200, 50);
		 getContentPane().add(t);

		// Se le dice al botón qué tiene que hacer cuando lo pulsemos.
		// eso se hace con addActionListener
		b1.addActionListener(this);
		b2.addActionListener(this); 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		contentPane.setLayout(new BorderLayout(0, 0));
//		setContentPane(contentPane);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() ==b1) {
			t.setText("Se ha pulsado el Boton Hola");
			b1.setVisible(false);
			b2.setVisible(true);
		}
		if(e.getSource() ==b2) {
			t.setText("Se ha pulsado el Boton Adios");
			b2.setVisible(false);
			b1.setVisible(true);

		}
	}

}
