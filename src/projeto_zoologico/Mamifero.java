package projeto_zoologico;

public class Mamifero extends Animal {

	private String alimento;

	public Mamifero() {
		super();
		this.setCor("Castanho");
		this.alimento = "Mel";

	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		return super.toString() + "\nalimento: " + alimento ;
	}
	

}
