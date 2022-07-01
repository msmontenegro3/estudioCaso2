package EstudioCaso2;

public class Computador extends Dispositivo{

	//CONSTRUCTOR
	public Computador(String modelo, String procesador, float espacio) {
		super(modelo, procesador, espacio);
	}

	//Métodos propios
	public String leerCD() {
		String lecturaCD = "Se está leyendo el CD";
		return lecturaCD;
	}//fin método leerCD

	//Método toString
	public String toString() {
		return "Modelo = " + getModelo() + "\nProcesador = " + getProcesador() + "\nEspacio = "
				+ getEspacio() + "\nEstado lector de CD = " + leerCD();
	}//fin método toString
	
		
		
	
}
