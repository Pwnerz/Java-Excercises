package ej1;

public class Directivo extends Empleado {

	public Directivo(String nombre) {
	super(nombre);	
	}

	@Override
	public String toString() {
		return "Directivo [getNombre()=" + getNombre() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
