package EstudioCaso2;

public class Celular extends Dispositivo{

	//CONSTRUCTOR
	public Celular(String modelo, String procesador, float espacio) {
		super(modelo, procesador, espacio);
	}

	//M�todos propios
	public String usarTarjetaSim() {
		String tarjetaSim ="Se est� usando la tarjeta SIM";
		return tarjetaSim;
	}//fin m�todo usarTarjetaSim

	//M�todo toString
	public String toString() {
		return "Estado tarjeta SIM = " + usarTarjetaSim() + "\nModelo = " + getModelo() + "\nProcesador = "
				+ getProcesador() + "\nEspacio = " + getEspacio();
	}//fin del m�todo toString
		
}
