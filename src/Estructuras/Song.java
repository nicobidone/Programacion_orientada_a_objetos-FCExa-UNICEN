package Estructuras;

public class Song {
	private int id, año, duracion;
	private String artista, titulo, album, genero, comentario;
	
	public Song(int id, String titulo, int duracion, String artista, String album, int año, String genero){
		this.titulo = titulo;
		this.id = id;
		this.duracion = duracion;
		this.artista = artista;
		this.album = album;
		this.año = año;
		this.genero = genero;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
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
		return titulo+" - "+this.artista+"("+this.genero+", "+this.año+")";
	}
	public Song getCopy(){
		Song s = new Song(id,titulo,duracion,artista,album,año,genero);
		return s;
	}
	public String getTitulo() {
		return titulo;
	}
}
