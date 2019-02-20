package Filtros_2;

import Estructuras.Song;


public class FiltroDuracion2 extends Filtro{
	
	private int numero = 0;
	
	public FiltroDuracion2(int a){
		this.numero = a;
	}
	
	public Boolean cumple(Song i) {
		if (i.getDuracion() < numero)
			return false;
		return true;
	}

}
