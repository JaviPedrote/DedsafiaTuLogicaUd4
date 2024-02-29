
public class Entrenamiento extends Avion {
		 

	boolean dobleMando;


	


	public void entrenamiento() {
		
		if(dobleMando) {System.out.println("Este avión tiene doble mando");
		}
		else {System.out.println("Este avión no tiene doble mando");
			}
		
	
		
	}
	public void mostrarAvion() {
		System.out.println("--------AVIÓN--------");
		System.out.println("Id del avión nº "+idAvion+".\nCapacidad del avión "+capAvion+" personas");
		entrenamiento();
		System.out.print("El piloto asignado para este avión es "); pilot.mostrarPiloto();
	}
	
	public Entrenamiento(int idAvion,int capAvion ,Piloto p, boolean dobleMando) {
		super(idAvion,capAvion,p);
		this.dobleMando = dobleMando;
	}

	public boolean isdoble() {
		return dobleMando;
	}

	public void setdoble(boolean dobleMando) {
		this.dobleMando = dobleMando;
	}

	
	
	

}