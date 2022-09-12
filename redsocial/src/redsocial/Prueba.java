package redsocial;

public class Prueba {

	public static void main(String[] args) {
		
		Usuario Raúl = new Usuario("Raúl");
		
		Post p1 = new Post("Postres con café");
		
		
		PostImagen pi1 = new PostImagen("Lago azul", 500, 350);
		
		PostText pt1 = new PostText("El salto fue estratosférico") ;
		
		
		
		
		
		System.out.println(Raúl);
		System.out.println(p1);
		System.out.println(pi1);
		System.out.println(pt1);
		

	}

}
