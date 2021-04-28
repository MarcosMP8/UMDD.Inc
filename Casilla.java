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
		
	}
	public void limpiar() {
		
	}
	public void ponerJugador(Jugador pJugador) {
		
	}
	//public boolean comprobarVictoria() {
		
	//}
	public boolean esta(String pColor) {
		boolean esta;
		esta=this.lista.mirarPorColor(pColor);
		return esta;
	}
	
	
	// hace falta cabecera aunque no se implemente.
	public  abstract void realizarAccion(Jugador pJugador) {
		
	}
}
