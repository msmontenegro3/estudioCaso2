package EstudioCaso2;

public class TestCaso2 {

	public static void main(String args[]) {

		//Se instancia la clase Celular con el valor inicial de cada argumento
		Celular celular = new Celular(null, null, 0);
		
		//Se le otorgan valores a través de los métodos setters
		celular.setModelo("Xiaomi Ultra Pro");
		celular.setProcesador("Snap Dragon 3");
		celular.setEspacio(32);
		//Ejecuta el método usarTarjetaSim
		celular.usarTarjetaSim();
		
		//Se instancia la clase Computador
		Computador computador = new Computador(null, null, 0);
		
		//Se le otorgan valores a través de los métodos setters
		computador.setModelo("Wholesale");
		computador.setProcesador("Intel I7");
		computador.setEspacio(64);
		//Ejectua el método leerCD
		computador.leerCD();
		
		//Imprime la representación toString de las clases Celular y Computador
		System.out.println("----------------------------------");
		System.out.println("Datos completos");
		System.out.println("----------------------------------");
		System.out.println(celular);
		System.out.println("----------------------------------");
		System.out.println(computador);
		
		
	}

}
