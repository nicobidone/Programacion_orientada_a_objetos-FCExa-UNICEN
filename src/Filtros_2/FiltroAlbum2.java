package Filtros_2;

import Estructuras.Song;


public class FiltroAlbum2 extends Filtro{

	private String texto = "";
	
	public FiltroAlbum2(String t){
		this.texto = t;
	}
	
	public Boolean cumple(Song s) {
		//if (((Song) s).getGenero().equalsIgnoreCase(genero))
		if (s.getAlbum().toLowerCase().contains(texto.toLowerCase()))
			return true;
		return false;
	}

}
