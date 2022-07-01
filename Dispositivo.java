package EstudioCaso2;

public class Dispositivo {
	
	//ATRIBUTOS
	private String modelo;
	private String procesador;
	private float espacio;

	//CONSTRUCTOR
	public Dispositivo(String modelo, String procesador, float espacio) {
		this.modelo = modelo;
		this.procesador = procesador;
		this.espacio = espacio;
	}
	
	
	//GETTERS Y SETTERS
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getProcesador() {
		return procesador;
	}
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	public float getEspacio() {
		return espacio;
	}
	public void setEspacio(float espacio) {
		this.espacio = espacio;
	}

	//Método toString
	public String toString() {
		return "Dispositivo [getModelo()=" + getModelo() + ", getProcesador()=" + getProcesador() + ", getEspacio()="
				+ getEspacio() + "]";
	}//fin método to string

	
}
