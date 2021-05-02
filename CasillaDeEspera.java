package TrabajoOca;

public class CasillaDeEspera extends Casilla{
	
	//Atributos
	private int posada=2;
	private int pozo=4;
	private int prision=3;
	

	public CasillaDeEspera(int pNumCas) {
		super(pNumCas);
			
	}

	
	public void realizarAccion(Jugador pJugador) {
		
		if (this.getNumCasilla()==19) {
			pJugador.setTurnosParados(this.posada);
		}
		if (this.getNumCasilla()==56) {
			pJugador.setTurnosParados(this.prision);
		}
		else {
			pJugador.setTurnosParados(this.pozo);
		}
		
		
		}
		
	}


