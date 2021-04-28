package TrabajoOca;

public class Hueco {
	//Atributo
	private String color;
	//Constructora 
	public Hueco (String pColor) {
		this.color=pColor;
	}
	//Otros Metodos
	public boolean igualColor(Jugador pJugador) {
		boolean mismoColor=false;
		if (this.color==pJugador.getColor()) {
			mismoColor=true;
		}
		return mismoColor;
	}
	
}
