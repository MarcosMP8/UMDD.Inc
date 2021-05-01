package TrabajoOca;

public class CasillaDesplazamiento extends Casilla {
	private int desplazamiento;
	
	//Constructora
	public CasillaDesplazamiento(int pNumCasillas, int pDesplazamiento) {
		super(pNumCasillas);
		this.desplazamiento=pDesplazamiento;
	
	}
	//Otros Metodos	
	public void realizarAccion(Jugador pJugador) {
		ListaCasillas.getListaCasillas().mover(this.desplazamiento, pJugador);
		ListaJugadores.getListaJugadores().volverATirar();
		}
}
	

