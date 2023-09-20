package strategy;

public class ComportamentoDefensivo implements Comportamento {

	@Override
	public void mover() {
		System.out.println("Movendo-se defensivamente...");
		System.out.println("Caltela ao pisar...");
		defesa();
	}
	public void defesa(){
		System.out.println("Campo de escudo foi erguido...");
		System.out.println("Gasto de energia Esta alto atenção ...");
	}

	

}