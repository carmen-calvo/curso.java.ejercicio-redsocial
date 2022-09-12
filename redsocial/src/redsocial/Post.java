package redsocial;

public class Post {
	//Atributos
	private String tituloPost;

	
	//Constructores
	public Post() {
		super();
	}


	public Post(String tituloPost) {
		super();
		this.tituloPost = tituloPost;
	}


	//Métodos Getters and Setters
	
	
	public String getTituloPost() {
		return tituloPost;
	}


	public void setTituloPost(String tituloPost) {
		this.tituloPost = tituloPost;
	}


	@Override
	public String toString() {
		return "Post [tituloPost=" + tituloPost + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
