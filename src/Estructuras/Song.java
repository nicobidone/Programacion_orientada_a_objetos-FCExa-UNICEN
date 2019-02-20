package Estructuras;

public class Song {
	private int id, a�o, duracion;
	private String artista, titulo, album, genero, comentario;
	
	public Song(int id, String titulo, int duracion, String artista, String album, int a�o, String genero){
		this.titulo = titulo;
		this.id = id;
		this.duracion = duracion;
		this.artista = artista;
		this.album = album;
		this.a�o = a�o;
		this.genero = genero;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getA�o() {
		return a�o;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public String toString(){
		return titulo+" - "+this.artista+"("+this.genero+", "+this.a�o+")";
	}
	public Song getCopy(){
		Song s = new Song(id,titulo,duracion,artista,album,a�o,genero);
		return s;
	}
	public String getTitulo() {
		return titulo;
	}
}
