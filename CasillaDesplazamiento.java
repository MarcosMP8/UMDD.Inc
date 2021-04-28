package TrabajoOca;

public class CasillaDesplazamiento extends Casilla {

	
	//Constructora
	public CasillaDesplazamiento(int pNumCasillas) {
		super(pNumCasillas);
	
	}
	//Otros Metodos	
	public void realizarAccion(Jugador pJugador) {
		int casilla=this.getNumCasilla();
		if (casilla==3) {
			int n=5;
			ListaCasillas.getListaCasillas().mover(n, pJugador);
			ListaJugadores.getListaJugadores().volverATirar();
		}
	}
	
}
