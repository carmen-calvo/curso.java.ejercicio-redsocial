package redsocial;

public class PostText extends Post {
	//Atributo
	private String nombre;
	
	
	//Constructores
	
	
	
	
	
	public PostText(String nombre) {
		super();
		this.nombre = nombre;
	}
	// Métodos de Getters and Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//Métodos de toString
	@Override
	public String toString() {
		return "PostText [nombre=" + nombre + "]";
	}
	
	

}
