package Filtros_2;

import Estructuras.Song;


public class FiltroNOT extends Filtro{
	private Filtro f1;
	
	public FiltroNOT(Filtro f1){
		this.f1 = f1;
	}
	
	public Boolean cumple(Song s) {
		return !f1.cumple(s);
	}


}
