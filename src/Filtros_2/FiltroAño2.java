package Filtros_2;

import Estructuras.Song;


public class FiltroAño2 extends Filtro{
	
	private int numero = 0;
	
	public FiltroAño2(int a){
		this.numero = a;
	}
	public Boolean cumple(Song i) {
		if (i.getAño() < numero)
			return false;
		return true;
	}
}
