package FiltrosEspecificos;

import Estructuras.Song;

public class FiltroArtista extends FiltroString{
	
	public FiltroArtista(String a){
		super(a);
	}
	public Boolean cumple(Song s) {
		return super.cumple(s.getArtista());
	}
	
}
