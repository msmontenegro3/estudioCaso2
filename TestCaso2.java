package EstudioCaso2;

public class TestCaso2 {

	public static void main(String args[]) {

		//Se instancia la clase Celular con el valor inicial de cada argumento
		Celular celular = new Celular(null, null, 0);
		
		//Se le otorgan valores a trav�s de los m�todos setters
		celular.setModelo("Xiaomi Ultra Pro");
		celular.setProcesador("Snap Dragon 3");
		celular.setEspacio(32);
		//Ejecuta el m�todo usarTarjetaSim
		celular.usarTarjetaSim();
		
		//Se instancia la clase Computador
		Computador computador = new Computador(null, null, 0);
		
		//Se le otorgan valores a trav�s de los m�todos setters
		computador.setModelo("Wholesale");
		computador.setProcesador("Intel I7");
		computador.setEspacio(64);
		//Ejectua el m�todo leerCD
		computador.leerCD();
		
		//Imprime la representaci�n toString de las clases Celular y Computador
		System.out.println("----------------------------------");
		System.out.println("Datos completos");
		System.out.println("----------------------------------");
		System.out.println(celular);
		System.out.println("----------------------------------");
		System.out.println(computador);
		
		
	}

}
