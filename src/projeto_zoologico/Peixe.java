package projeto_zoologico;

public class Peixe extends Animal {

	private String caracteristica;

	public Peixe() {
		super();
		this.setPatas(0);
		this.setAmbiente("mar");
		this.setCor("cinzenta");
		this.caracteristica = "barbatanasECaldas";
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	@Override
	public String toString() {
		return  super.toString() + "\ncaracteristica: " + caracteristica ;
	}
	
	
	
	
}
