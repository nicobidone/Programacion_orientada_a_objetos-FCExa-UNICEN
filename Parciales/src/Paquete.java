import java.util.ArrayList;
import java.util.List;


public class Paquete {
	
	private String nombre = " ";
	private List<Paquete> dependencias = new ArrayList<Paquete>();
	private List<String> categorias = new ArrayList<String>();
	private String version = " ";
	private Boolean instalado = true;
	private int archivos = 0;
	
	public Paquete (String nombre){
		this.setNombre(nombre);
	}
	
	public List<Paquete> getDependencias(){
		List<Paquete>  res = new ArrayList<Paquete>();
		for (Paquete p: dependencias)
			res.addAll(p.getDependencias());
		return res;
	}

	public boolean isDependiente(Paquete p) {
		return dependencias.contains(p);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
