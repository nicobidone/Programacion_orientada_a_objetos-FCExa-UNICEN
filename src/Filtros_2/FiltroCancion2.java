package Filtros_2;

import Estructuras.Song;



public class FiltroCancion2 extends Filtro {

	private String texto = "";
	
	public FiltroCancion2(String t){
		this.texto = t;
	}
	
	public Boolean cumple(Song s) {
		//if (((Song) s).getGenero().equalsIgnoreCase(genero))
		if (s.getTitulo().toLowerCase().contains(texto.toLowerCase()))
			return true;
		return false;
	}

}
