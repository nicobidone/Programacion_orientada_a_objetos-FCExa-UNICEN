package Filtros_2;

import Estructuras.Song;


public class FiltroA�o2 extends Filtro{
	
	private int numero = 0;
	
	public FiltroA�o2(int a){
		this.numero = a;
	}
	public Boolean cumple(Song i) {
		if (i.getA�o() < numero)
			return false;
		return true;
	}
}
