package Filtros_2;

import Estructuras.Song;


public class FiltroGenero2 extends Filtro{
	
	private String texto = "";
	
	public FiltroGenero2(String t){
		this.texto = t;
	}
	
	public Boolean cumple(Song s) {
		//if (((Song) s).getGenero().equalsIgnoreCase(genero))
		if (s.getGenero().toLowerCase().contains(texto.toLowerCase()))
			return true;
		return false;
	}

}
