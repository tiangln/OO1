package ar.edu.unlp.info.oo1.wallPost;

/**
 * Completar esta clase de acuerdo a lo especificado
 */
public class WallPost {
	
	private String texto;
	private int likes;
	private boolean esDestacado;

	public WallPost() {
		this.texto = "Undefined post";
		this.likes = 0;
		this.esDestacado = false;
	}
	
	/**
	 * Retorna el texto descriptivo de la publicación
	 * 
	 * @return
	 */
	public String getText() {
		return this.texto;
	};

	/**
	 * Setea el texto descriptivo de la publicación
	 * @param text
	 */
	public void setText(String text) {
		this.texto = text;
	};

	/**
	 * Retorna la cantidad de “me gusta”
	 * 
	 * @return
	 */
	public int getLikes() {
		return this.likes;
	};

	/**
	 * Incrementa la cantidad de likes en uno
	 */
	public void like() {
		this.likes++;
	};

	/**
	 * Decrementa la cantidad de likes en uno. Si ya es 0, no hace nada
	 */
	public void dislike() {
		if (this.likes > 0) {
			this.likes--;
		}
	};

	/**
	 * Retorna true si el post está marcado como destacado, false en caso contrario
	 * 
	 * @return
	 */
	public boolean isFeatured() {
		return this.esDestacado;
	};

	/**
	 * Cambia el post del estado destacado a no destacado y viceversa
	 */
	public void toggleFeatured() {
		this.esDestacado = !this.esDestacado;
	};

	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
	@Override
	public String toString() {
		return "WallPost {" +
			"text: " + getText() +
			", likes: '" + getLikes() + "'" +
			", featured: '" + isFeatured() + "'" +
			"}";
	}

}