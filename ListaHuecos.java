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
		this.lista.remove(pJugador);
	}
	
	public void añadir(Jugador pJugador) {
		this.lista.add(pJugador);
	}
	
	public boolean mirarSiMismoJugador(Jugador pJugador) {
		boolean igual=false;
		Jugador esteJugador=null;
		Iterator<Jugador>itr=this.getIterator();
		while ((!igual)&&(itr.hasNext())) {
			esteJugador=itr.next();
			if (esteJugador.equals(pJugador)) {
				igual=true;
			}
		}
		return igual;
	}
}
