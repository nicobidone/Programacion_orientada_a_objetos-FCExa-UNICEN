package Comparadores;
import java.util.Comparator;

import Estructuras.Song;


public class Comparador implements Comparator<Song>{

	public int compare(Song arg0, Song arg1){
		return arg0.getDuracion()-arg1.getDuracion();
	}

}
