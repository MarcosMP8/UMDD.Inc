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
		if (this.desplazamiento==4 || this.desplazamiento==5) {
			System.out.println("De Oca en Oca y tiro porque me toca");
		}else if(this.desplazamiento==6 || this.desplazamiento==-6){
			System.out.println("De Puente en Puente y tiro porque me lleva la corriente");
		}else {
			System.out.println("De Dado en Ddao y tiro porque me ha tocado");
		}
		ListaJugadores.getListaJugadores().volverATirar();
	}
}
	

