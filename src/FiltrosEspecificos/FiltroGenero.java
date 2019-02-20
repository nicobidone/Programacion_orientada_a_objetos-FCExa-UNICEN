package FiltrosEspecificos;

import Estructuras.Song;

public class FiltroGenero extends FiltroString{
	
	public FiltroGenero(String g){
		super(g);
	}
	public Boolean cumple(Song s) {
		return super.cumple(s.getGenero());
	}

}
