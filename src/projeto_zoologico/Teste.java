package projeto_zoologico;

public class Teste {

	public static void main(String[] args) {
	
		Animal camelo = new Animal();
		camelo.setNome("camelo");
		camelo.setComprimento(160);		
		camelo.setPatas(7);
		camelo.setCor("amarelo");
		camelo.setAmbiente("terra");
		camelo.setVelocidade(2);
		
		
		Peixe tubarao = new Peixe();
		tubarao.setNome("tubarao");
		tubarao.setComprimento(300);
		tubarao.setVelocidade(1.5);
		
		
		Mamifero urso = new Mamifero();
		urso.setNome("urso do canada");
		urso.setComprimento(180);
		urso.setCor("vermelho");
		urso.setVelocidade(0.5);
		
		
		Animal[] animais = new Animal[3];
		animais[0] = camelo;
		animais[1] = tubarao;
		animais[2] = urso;
		
		
		for(Animal animal: animais) {
			System.out.println(animal);
			System.out.println("---------------------------------------------------------------");
		}

	}

}
