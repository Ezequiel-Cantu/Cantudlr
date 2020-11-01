package Tarea_5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppProgreso {

	private JFrame frmHIL;

	JProgressBar psbProcess = new JProgressBar();
	
	/**
	 * Solo hice una barra para demostrar el funcionamiento de hilos, espero no sea necesario haber hecho las dos:(
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppProgreso window = new AppProgreso();
					window.frmHIL.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppProgreso() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHIL = new JFrame();
		frmHIL.setTitle("H i l o s");
		frmHIL.setBounds(100, 100, 254, 107);
		frmHIL.setBounds(100, 100, 416, 107);
		frmHIL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHIL.getContentPane().setLayout(null);
				
		psbProcess.setBounds(26, 11, 252, 21);
		frmHIL.getContentPane().add(psbProcess);
		
		JButton btnIniciarProcesos = new JButton("I n i c i a r");
		btnIniciarProcesos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ProgressBar objHilo1 = new ProgressBar("Hilo 1");
				Thread varHilo1 = new Thread(objHilo1);
				
				Progreso objHilo2 = new Progreso(psbProcess);
				Thread varHilo2 = new Thread(objHilo2);
				
				varHilo1.start();
				varHilo2.start();
			}
		});
		btnIniciarProcesos.setBounds(278, 34, 112, 23);
		frmHIL.getContentPane().add(btnIniciarProcesos);
	}

}
