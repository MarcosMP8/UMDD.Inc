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
		if (this.esperaTurnos==2) {
			System.out.println("Has caido en la Posada :(");
		}else if (this.esperaTurnos==3) {
			System.out.println("Has caido en la Prision :(");
		}else {
			System.out.println("Has caido en el Pozo :(");
		}
	}		
}