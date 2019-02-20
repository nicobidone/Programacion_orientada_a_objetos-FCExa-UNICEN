package FiltrosEspecificos;

import Estructuras.Song;
import Filtros.Filtro;


public class FiltroInteger extends Filtro{
	private int numero = 0;
	public FiltroInteger(int a){
		this.numero = a;
	}
	public Boolean cumple(Song i) {
		if (((Integer)i) < numero)
			return false;
		return true;
	}

}
