package Tarea_5;

public class ProgressBar implements Runnable{
	
	static boolean blnTerminado = false;
	static int intProgresoHilo;
	String strNombreHilo;
	public ProgressBar (String parNombre)
	{
		this.strNombreHilo = parNombre;
	}
	
	public void run()
	{
		blnTerminado = false;		
		for(int i = 1; i <= 100; i++)
		{
			intProgresoHilo = i;
			try
			{ 			
				Thread.sleep(100);
			}
			catch(Exception ex)
			{
				System.out.println(strNombreHilo + " (Interrupción)"+i);
			}
		}
		blnTerminado = true;

	}
}	