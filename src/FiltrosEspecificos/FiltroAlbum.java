package FiltrosEspecificos;

import Estructuras.Song;

public class FiltroAlbum extends FiltroString{

	public FiltroAlbum(String a){
		super(a);
	}
	public Boolean cumple (Song s) {
		return super.cumple(s.getAlbum());
	}

}
