import java.util.List;


public class Agregar implements Accion{

	private Paquete paq;
	private List<Paquete> lisPaq;
	
	public Agregar(List<Paquete> lisPaq, Paquete paq){
		this.paq = paq;
		this.lisPaq = lisPaq;
	}
	
	public void hacer() {
		lisPaq.add(paq);
		
	}

	public void deshacer() {
		
		
	}

}
