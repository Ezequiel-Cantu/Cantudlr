package Tarea_5;

import javax.swing.JProgressBar;
public class Progreso implements Runnable{

	private JProgressBar JProgressBar;
	public Progreso(JProgressBar JProgressBar)
	{
		this.JProgressBar = JProgressBar;
	}
	public void run()
	{
		while(!ProgressBar.blnTerminado)
		{
			JProgressBar.setValue(ProgressBar.intProgresoHilo);
			JProgressBar.repaint();
			if(ProgressBar.blnTerminado)
			{
				JProgressBar.setValue(100);
				break;
			}
		}
	}
}
