package TrabajoOca;

public class CasillaDesplazamientoNoTirar extends Casilla {
	private int desplazamiento;
	
	public CasillaDesplazamientoNoTirar(int pNumCasillas, int pDesplazamiento) {
		super(pNumCasillas);
		this.desplazamiento=pDesplazamiento;
	}
	public void realizarAccion(Jugador pJugador) {
		ListaCasillas.getListaCasillas().mover(this.desplazamiento, pJugador);
	}
}
