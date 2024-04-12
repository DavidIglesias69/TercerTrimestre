package Canciones;

public class Cancion {

	protected String titulo;
    protected int duracion;
    
    
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public Cancion(String titulo, int duracion) {

		this.titulo = titulo;
		this.duracion = duracion;
	}
	
    
    
	
	
}
