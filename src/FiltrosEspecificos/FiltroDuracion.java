package FiltrosEspecificos;

import Estructuras.Song;

public class FiltroDuracion extends FiltroInteger{
	
	public FiltroDuracion(int d){
		super(d);
	}
	public Boolean cumple(Song s) {
		return super.cumple(s.getDuracion());
	}	

}
