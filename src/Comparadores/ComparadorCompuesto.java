package Comparadores;

import java.util.ArrayList;

import Estructuras.Song;

public class ComparadorCompuesto {
	
	private ArrayList<Comparador> comparadores = new ArrayList<Comparador>();
	
	public ComparadorCompuesto(ArrayList<Comparador> c){
		comparadores.addAll(c);
	}
	public int compare(Song s1,Song s2){
		
		return 0;
	}
	
}
