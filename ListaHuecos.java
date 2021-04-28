package TrabajoOca;

import java.util.ArrayList;
import java.util.Iterator;



public class ListaHuecos {
	//Atributos
	private ArrayList<Jugador> lista;
	//Constructora
	public ListaHuecos() {
		this.lista= new ArrayList<Jugador>();
	}
	private Iterator <Jugador> getIterator(){
		return this.lista.iterator();
	}
	public void eliminar(Jugador pJugador) {
		
	}
	public void añadir(Jugador pJugador) {
		
	}
	public boolean mirarPorColor(String  pColor) {
		boolean colorIgual=false;
		Jugador esteJugador=null;
		Iterator<Jugador>itr=this.getIterator();
		while ((!colorIgual)&&(itr.hasNext())) {
			esteJugador=itr.next();
			if (esteJugador.igualColor(pColor)) {
				colorIgual=true;
			}
		}
		return colorIgual;
	}
}
