package TrabajoOca;

public abstract class Casilla {
	//Atributos
	private int numCasillas;
	private ListaHuecos lista;
	//Constructora
	public Casilla(int pNumCasillas) {
		this.numCasillas=pNumCasillas;
		this.lista= new ListaHuecos();
	}
	//Otros Metodos
	public int getNumCasilla() {
		return this.numCasillas;
	}
	public void limpiar() {
		this.lista=null;//Como limpiar la lista 
	}
	public void ponerJugador(Jugador pJugador, Casilla pCasilla) {
		if (pCasilla != null) {
			pCasilla.lista.eliminar(pJugador);
		}
		this.lista.añadir(pJugador);
	}
	
	public boolean esta(String pColor) {
		boolean esta;
		esta=this.lista.mirarPorColor(pColor);
		return esta;
	}
	
	
	// hace falta cabecera aunque no se implemente.
	public  abstract void realizarAccion(Jugador pJugador) {
		
	}
}
