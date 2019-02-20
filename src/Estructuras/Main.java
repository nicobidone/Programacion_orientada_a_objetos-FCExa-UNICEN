package Estructuras;

import java.util.ArrayList;
import java.util.Arrays;

import Filtros.Filtro;
import Filtros.FiltroAND;
import Filtros.FiltroOR;
import Filtros.FiltroNOT;
import Filtros.FiltroArtista;
import Filtros.FiltroAño;
import Filtros.FiltroCancion;
import Filtros.FiltroDuracion;
import Filtros.FiltroGenero;



public class Main {
	public static void imprimirCanciones(String t, ArrayList<Song> coleccion, Filtro f){
        System.out.println(t);
        for(Song s : coleccion)
        	if (f.cumple(s))
        		System.out.println(s);
        System.out.println();
	}

    public static void main(String[] parametro) {
        Song etnp = new Song(1,"El Tiempo No Para",311,"Bersuit Vergarabat","De la cabeza",2002,"Rock nacional"),
        	 mc = new Song(2,"Mi caramelo",290,"Bersuit Vergarabat","De la cabeza",2002,"Rock Nacional"),
        	 pra = new Song(3,"Party Rock Anthem",408,"LMFAO","Sorry for Party Rocking",2011,"Electro Pop"),
        	 sfpr = new Song(4,"Sorry for party rocking",421,"LMFAO","Sorry for party rocking",2011,"Electro Pop"),
        	 fy = new Song(5,"Fix you",255,"Coldplay","X&Y",2005,"Rock alternativo"),
        	 sos = new Song(6,"Speed of Sound",455,"Coldplay","X&Y",2005,"Rock alternativo"),
        	 vlv = new Song(7,"Viva la vida",320,"Coldplay","Viva la vida",2008,"Rock alternativo"),
        	 wowy = new Song(8,"With of without you",360,"U2","The joshua tree",1987,"Rock"),
        	 v = new Song(9,"Vertigo",355,"U2","How to dismantele an atomic bomb",2004,"rock"),
        	 cobl = new Song(10,"City of Bliding Lights",284,"U2","How to dismantele an atomic bomb",2004,"Rock"),
        	 alldll = new Song(11,"A la luz de la luna",438,"El indio solari","Pajaritos, bravos muchachitos", 2013, "rock nacional"),
        	 yc = new Song(12,"Yo Canibal",258,"Patricio rey y sus redonditos de ricota","Lobo Suelto, Cordero atado",1993,"Rock Nacional");

        ArrayList<Song> canciones = new ArrayList<Song>(Arrays.asList(etnp,mc,pra,sfpr,fy,sos,vlv,wowy,v,cobl,alldll,yc));

        Playlist cdr = new Playlist(new ArrayList<Song>(Arrays.asList(etnp,mc,sfpr,v,wowy,cobl,yc)),"Clasicos del Rock"), //Agregada wowy        
         		 lm = new Playlist(new ArrayList<Song>(Arrays.asList(pra,sfpr,vlv,yc)),"Lo mejor"),
         		 c = new Playlist(new ArrayList<Song>(Arrays.asList(fy,sos,vlv)),"Coldplay"),
         		 ei = new Playlist(new ArrayList<Song>(Arrays.asList(yc,alldll)),"El Indio"); 
        
        ArrayList<Playlist> listas = new ArrayList<Playlist>(Arrays.asList(cdr,lm,c,ei));
        cdr.printThis();
        lm.printThis();
        c.printThis();
        ei.printThis(); //Agregada
        
        imprimirCanciones("Busqueda 4a",canciones,new FiltroDuracion(400));
        imprimirCanciones("Busqueda 4b",canciones,new FiltroGenero("rock"));
        imprimirCanciones("Busqueda 4c",canciones,new FiltroAND(new FiltroCancion("rock"),new FiltroNOT(new FiltroArtista("LMFAO"))));
        imprimirCanciones("Busqueda 4d",canciones,new FiltroAño(2006));
        
        System.out.println("Busqueda 5");
        for(Playlist s : listas)
        	System.out.println(s.getDuracion());
        System.out.println();
        
        
        Playlist lmc = lm.getCopy();
        lmc.setNombre("Lo mejor++");
        lmc.printThis();
        lmc.exchange(3, 7);
        lmc.printThis();
        
        canciones.add(new Song(13,"Paradise",365,"Coldplay","Mylo Xyloto",2011,"Rock alternativo"));
        
        ArrayList<Song> autolista = new ArrayList<Song>();
        for(Song s : canciones)
        	if (new FiltroArtista("coldplay").cumple(s))
        		autolista.add(s);
        Playlist tldc = new Playlist(autolista,"Todo lo de Coldplay");
        tldc.printThis();
    }
}
