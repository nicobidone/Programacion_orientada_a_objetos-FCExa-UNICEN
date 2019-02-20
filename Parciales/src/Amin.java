import java.util.ArrayList;
import java.util.List;


public class Amin {
	private List<Paquete> paquetes = new ArrayList<Paquete>();
	
	public void addPaquete(Paquete p){
		paquetes.add(p);
	}
	
	public void delPaquete(Paquete p){
		Boolean elim = false;
		for(Paquete pa: paquetes)
			if (pa.isDependiente(p) == true)
				elim = true;
		if(!elim)
			paquetes.remove(p);
	}
	
	public List<Paquete> getDependencias(Paquete p){
		List<Paquete> result = new ArrayList<Paquete>();
		for(Paquete pa:p.getDependencias())
			if(!result.contains(pa))
				result.add(pa);
		return result;
	}
	
	public List<Paquete> getDepen(List<Paquete> p){
		List<Paquete> result = new ArrayList<Paquete>();
		for(Paquete pa:p)
			for(Paquete pe: this.getDependencias(pa))
				if(!result.contains(pe))
					result.add(pe);
		return result;	
	}
}
