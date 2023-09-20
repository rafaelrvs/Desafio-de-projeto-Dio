package strategy;

public class ComportamentoAgressivo implements Comportamento {

	@Override
	public void mover() {
		System.out.println("Movendo-se agressivamente...");
		desernegizando();
	}
	public void ataqueSimultaneo(){
		System.out.println("Disparando diversos ataques...");
	}
	public void desernegizando(){
		System.out.println("Gasto de energia muito alto logo menos ira acabar...");
	}

}