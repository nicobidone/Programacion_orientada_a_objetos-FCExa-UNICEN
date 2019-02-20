package FiltrosEspecificos;

import Estructuras.Song;

public class FiltroAño extends FiltroInteger{
	public FiltroAño(int a) {
		super(a);
	}
	public Boolean cumple(Song s) {
		return super.cumple(s.getAño());
	}

}
