

public class Piloto {
	private int idPiloto ;
	private String nomPiloto;
	private int horasVueloPiloto;
	private String rango;
	
	
	public void mostrarPiloto() {
		System.out.println("El piloto número "+idPiloto+"."+rango+" "+nomPiloto+ " con " + horasVueloPiloto + " horas de vuelo.");
	}
	
	public Piloto(int idPiloto, String nomPiloto, int horasVueloPiloto, String rango) {
		super();
		this.idPiloto = idPiloto;
		this.nomPiloto = nomPiloto;
		this.horasVueloPiloto = horasVueloPiloto;
		this.rango = rango;
	}
	public int getIdPiloto() {
		return idPiloto;
	}
	public void setIdPiloto(int idPiloto) {
		this.idPiloto = idPiloto;
	}
	public String getNomPiloto() {
		return nomPiloto;
	}
	public void setNomPiloto(String nomPiloto) {
		this.nomPiloto = nomPiloto;
	}
	public int getHorasVueloPiloto() {
		return horasVueloPiloto;
	}
	public void setHorasVueloPiloto(int horasVueloPiloto) {
		this.horasVueloPiloto = horasVueloPiloto;
	}
	public String getRango() {
		return rango;
	}
	public void setRango(String rango) {
		this.rango = rango;
	}
	
	
	

}