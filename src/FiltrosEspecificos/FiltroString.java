package FiltrosEspecificos;

import Estructuras.Song;
import Filtros.Filtro;


public class FiltroString extends Filtro{
	
	private String texto = "";
	
	public FiltroString(String t){
		this.texto = t;
	}
	
	public Boolean cumple(Song s) {
		//if (((Song) s).getGenero().equalsIgnoreCase(genero))
		if (((String) s).toLowerCase().contains(texto.toLowerCase()))
			return true;
		return false;
	}
	
}
