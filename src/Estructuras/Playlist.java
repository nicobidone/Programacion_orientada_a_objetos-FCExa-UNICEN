package Estructuras;
import java.util.ArrayList;


public class Playlist{
	private String nombre = "Lista de reproducción";
	private ArrayList<Song> canciones = new ArrayList<Song>();
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Playlist(ArrayList<Song> c, String n){
		this.nombre = n;
		this.canciones = c;
	}	
	public int getDuracion(){
		int suma = 0;
		for (Song s : canciones)
			suma += s.getDuracion();
		return suma;
	}	
	public int getCantCan(){
		return canciones.size();
	}	
	public Playlist getCopy(){
		Playlist p = new Playlist(canciones,nombre);
		return p;
	}	
	public void printThis(){
		System.out.println(this);
		for (Song s : canciones)
			System.out.println(s);
		System.out.println();
	}
	public String toString(){
		return nombre+":";		
	}
	public void exchange(int x, int y){
		if ((x <= canciones.size())&&(y <= canciones.size())){//try catch?
			Song s1 = canciones.get(x).getCopy(),s2 = canciones.get(y).getCopy();
			canciones.remove(x);
			canciones.remove(y);
			canciones.add(x, s2);
			canciones.add(y, s1);
		}
	}
}
