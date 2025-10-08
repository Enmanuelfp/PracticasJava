package dia3_Bucles;

public class RelojDigital {
	 /*
	  * RelojDigital empezar = new RelojDigital();
		empezar.reloj();
	  */
	public void reloj() {
		String horas;
		String minutos;
		String segundos;

		for (int i = 0; i <= 23; i++) {
				horas = String.format("%02d", i);

			for (int j = 0; j < 60; j++) {
				minutos = String.format("%02d", j);
				for (int y = 0; y < 60; y++) {
					segundos = String.format("%02d", y);
					System.out.println(horas + ":" + minutos + ":" + segundos);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					  if (y >= 9) { return; }
					 
				}
			}
		}
	}
}
