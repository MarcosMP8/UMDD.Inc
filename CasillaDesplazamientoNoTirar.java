package TrabajoOca;

public class CasillaDesplazamientoNoTirar extends Casilla {
	private int desplazamiento;
	
	public CasillaDesplazamientoNoTirar(int pNumCasillas, int pDesplazamiento) {
		super(pNumCasillas);
		this.desplazamiento=pDesplazamiento;
	}
	public void realizarAccion(Jugador pJugador) {
		ListaCasillas.getListaCasillas().mover(this.desplazamiento, pJugador);
		if (this.desplazamiento==-12) {
			System.out.println("Lo siento, tendras que ir para atras");
		}else {
			System.out.println("Lo siento, tendras que empezar desde el principio");
		}
	}
}
