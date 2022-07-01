package EstudioCaso2;

public class Celular extends Dispositivo{

	//CONSTRUCTOR
	public Celular(String modelo, String procesador, float espacio) {
		super(modelo, procesador, espacio);
	}

	//Métodos propios
	public String usarTarjetaSim() {
		String tarjetaSim ="Se está usando la tarjeta SIM";
		return tarjetaSim;
	}//fin método usarTarjetaSim

	//Método toString
	public String toString() {
		return "Estado tarjeta SIM = " + usarTarjetaSim() + "\nModelo = " + getModelo() + "\nProcesador = "
				+ getProcesador() + "\nEspacio = " + getEspacio();
	}//fin del método toString
		
}
