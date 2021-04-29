package TrabajoOca;

public class CasillaEsperaTurnos extends Casilla{
	
	//Atributos
	private int esperaTurnos;
	

	public CasillaEsperaTurnos(int pNumCasillas, int pEsperaTurnos) {
		super(pNumCasillas);
		this.esperaTurnos=pEsperaTurnos;
		
	}	
	public void realizarAccion(Jugador pJugador) {
		pJugador.setTurnosParados(this.esperaTurnos);	
	}		
}