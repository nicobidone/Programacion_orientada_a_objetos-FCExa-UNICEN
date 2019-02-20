package FiltrosEspecificos;

import Estructuras.Song;

public class FiltroCancion extends FiltroString {

	public FiltroCancion(String n){
		super(n);
	}
	public Boolean cumple(Song s) {
		return super.cumple(s.getTitulo());
	}

}
