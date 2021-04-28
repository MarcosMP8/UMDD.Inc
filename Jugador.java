package TrabajoOca;

public class Jugador {
	//Atributos
	private int turnoParado;
	private String color;
	private int id;
	
	//Constructora
	public  Jugador(int pTurnoParado,String pColor,int pId ) {
		this.color=pColor;
		this.turnoParado=pTurnoParado;
		this.id=pId;
	}
	//Otros Metodos
	public int getTurnoParado() {
		int turno=0;
		turno=this.turnoParado;
		return turno;
	}
	public void setTurnosParados(int pTurnos) {
		this.turnoParado=pTurnos;
	}
	
	public String getColor() {
		String color;
		color=this.color;
		return color;
	}
	
	public void mover(int pNum) {
		
	}
	public boolean igualColor(String pColor) {
		boolean mismoColor=false;
		if (this.color==pColor) {
			mismoColor=true;
		}
		return mismoColor;
	}
}
