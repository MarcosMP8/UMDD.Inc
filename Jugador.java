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
		if (pTurnos!=-1) {
			this.turnoParado=pTurnos;
		} else {
			this.turnoParado--;
		}
	}
	
	public String getColor() {
		String color;
		color=this.color;
		return color;
	}
	
}
