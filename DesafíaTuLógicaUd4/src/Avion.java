
public class Avion {

	protected int idAvion;
	protected int capAvion;
	protected Piloto pilot;
	//Creación de constructor para añadir parámetros
	
	
	
	public Avion(int idAvion,int capAvion, Piloto pilot) {
		this.idAvion = idAvion;
		this.capAvion = capAvion;
		this.pilot = pilot;
	}

	
	
	public int idAvion() {
		return idAvion;
		}
	public void setIdAvion(int idAvion) {
		
		this.idAvion = idAvion;
	}


	public int getCapAvion() {
		return capAvion;
	}

	public void setCapAvion(int capAvion) {
		this.capAvion = capAvion;
	}

	public Piloto getPilot() {
		return pilot;
	}

	public void setPilot(Piloto pilot) {
		this.pilot = pilot;
	}
	
	
	
}
