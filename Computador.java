package EstudioCaso2;

public class Computador extends Dispositivo{

	//CONSTRUCTOR
	public Computador(String modelo, String procesador, float espacio) {
		super(modelo, procesador, espacio);
	}

	//M�todos propios
	public String leerCD() {
		String lecturaCD = "Se est� leyendo el CD";
		return lecturaCD;
	}//fin m�todo leerCD

	//M�todo toString
	public String toString() {
		return "Modelo = " + getModelo() + "\nProcesador = " + getProcesador() + "\nEspacio = "
				+ getEspacio() + "\nEstado lector de CD = " + leerCD();
	}//fin m�todo toString
	
		
		
	
}
