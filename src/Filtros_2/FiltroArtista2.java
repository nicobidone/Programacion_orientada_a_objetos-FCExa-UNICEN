package Filtros_2;

import Estructuras.Song;


public class FiltroArtista2 extends Filtro{
	
	private String texto = "";
	
	public FiltroArtista2(String t){
		this.texto = t;
	}
	
	public Boolean cumple(Song s) {
		//if (((Song) s).getGenero().equalsIgnoreCase(genero))
		if (s.getArtista().toLowerCase().contains(texto.toLowerCase()))
			return true;
		return false;
	}
	
}
