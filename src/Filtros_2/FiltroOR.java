package Filtros_2;

import Estructuras.Song;


public class FiltroOR extends Filtro{
	
	private Filtro f1,f2;
	
	public FiltroOR(Filtro f1, Filtro f2){
		this.f1 = f1;
		this.f2 = f2;
	}
	
	public Boolean cumple(Song s) {
		return f1.cumple(s)||f2.cumple(s);
	}


}
