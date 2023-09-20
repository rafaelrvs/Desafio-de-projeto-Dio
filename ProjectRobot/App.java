
import strategy.*;


public class App {
    public static void main(String[] args) throws Exception {
       Comportamento defensivo = new ComportamentoDefensivo();
		ComportamentoNormal normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		//robo.setComportamento(normal);
	//	robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		
	//	robo.setComportamento(agressivo);
	//	robo.mover();
    }
}
