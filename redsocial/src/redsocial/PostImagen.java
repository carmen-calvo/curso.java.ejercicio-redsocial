package redsocial;

public class PostImagen extends Post {
	//Atributos
	private String tituloImagen;
	private int anchoImagen;
	private int altoImagen;
	
	
	//Contructores	
	public PostImagen() {
		super();
	}
	public PostImagen(String tituloImagen, int anchoImagen, int altoImagen) {
		super();
		this.tituloImagen = tituloImagen;
		this.anchoImagen = anchoImagen;
		this.altoImagen = altoImagen;
	}
	
	
	//Métodos getters and setters
	public String getTituloImagen() {
		return tituloImagen;
	}
	public void setTituloImagen(String tituloImagen) {
		this.tituloImagen = tituloImagen;
	}
	public int getAnchoImagen() {
		return anchoImagen;
	}
	public void setAnchoImagen(int anchoImagen) {
		this.anchoImagen = anchoImagen;
	}
	public int getAltoImagen() {
		return altoImagen;
	}
	public void setAltoImagen(int altoImagen) {
		this.altoImagen = altoImagen;
	}
	
	//Métodso de toString
	@Override
	public String toString() {
		return "PostImagen [tituloImagen=" + tituloImagen + ", anchoImagen=" + anchoImagen + ", altoImagen="
				+ altoImagen + "]";
	}
	
	
	
	
	

}
