

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] parametro) {
    	
    		//Set<String> hola = new HashSet<String>();
    		
    		
    	
    		Paquete p = new Paquete("p");
    		Paquete x = new Paquete("x");
    		Set<Paquete> paquetes = new HashSet<Paquete>(Arrays.asList(new Paquete("d"),new Paquete("e"),p,x,p));
    		paquetes.add(new Paquete("a"));
    		paquetes.add(new Paquete("b"));
    		paquetes.add(p);
    		paquetes.add(x);
    		paquetes.addAll(Arrays.asList(new Paquete("d"),new Paquete("e"),p,x,p));

    		List<Paquete> lista = new ArrayList<Paquete>(new HashSet<Paquete>(Arrays.asList(new Paquete("d"),new Paquete("e"),p,x,p)));
     		Agregar agre = new Agregar(lista,new Paquete("g"));
     		agre.hacer();
    		for(Paquete s:lista)
    			System.out.println(s.getNombre());
    		
    		
    		if (paquetes.contains(x))
    			System.out.print("YES");
    		else
    			System.out.print("NOP");
    }
}
