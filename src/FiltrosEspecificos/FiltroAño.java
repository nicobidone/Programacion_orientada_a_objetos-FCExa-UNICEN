package FiltrosEspecificos;

import Estructuras.Song;

public class FiltroA�o extends FiltroInteger{
	public FiltroA�o(int a) {
		super(a);
	}
	public Boolean cumple(Song s) {
		return super.cumple(s.getA�o());
	}

}
