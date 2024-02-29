
public class Combate extends Avion {
	
	boolean furtivo ;
	
	


	public void combate() {
		
		if(furtivo) {
			System.out.println("Es un avión de combate furtivo");
		}
		else {
				System.out.println("Es un avión de combate no furtivo");
			}
		
	
		
	}
	public void mostrarAvion() {
		System.out.println("--------AVIÓN--------");
		System.out.println("Id del avión nº "+idAvion+".\nCapacidad del avión "+capAvion+" personas");
		combate();
		System.out.print("El piloto asignado para este avión es "); pilot.mostrarPiloto();
	
	}
	
	public Combate(int idAvion,int capAvion ,Piloto p, boolean furtivo) {
		super(idAvion,capAvion,p);
		this.furtivo = furtivo;
	}

	public boolean isFurtivo() {
		return furtivo;
	}

	public void setFurtivo(boolean furtivo) {
		this.furtivo = furtivo;
	}

	
	
	

}
