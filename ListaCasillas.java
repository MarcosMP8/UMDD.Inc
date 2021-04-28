package TrabajoOca;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaCasillas {
	//Atributos
	private ArrayList <Casilla> lista;
	private static ListaCasillas miListaCasillas;
	//Constructora
	private ListaCasillas() {
		this.lista = new ArrayList <Casilla>();
		
	}	
	//Otros Metodos
	public static ListaCasillas getListaCasillas() {
		if (ListaCasillas.miListaCasillas == null) {
			ListaCasillas.miListaCasillas= new ListaCasillas();
		}
		
		return ListaCasillas.miListaCasillas;
	}
	private Iterator <Casilla> getIterador(){
		return this.lista.iterator();
	}
	public Casilla getCasilla(int pNum) {
		if (pNum == 0) {
			return null;
		} else {
			pNum--;
			return this.lista.get(pNum);
		}
	}
	public Casilla buscarCasilla(Jugador pJugador) {
		Casilla unaCasilla = null;
		boolean esta = false;
		Iterator <Casilla> itr = this.getIterador();
		String color=pJugador.getColor();
		while (itr.hasNext() && !esta) {
			unaCasilla = itr.next();
			if (unaCasilla.esta(color)) {
				esta = true;
			}
		}
		if (!esta) {
			unaCasilla = null;
		}
		return unaCasilla;
	}
	public void vaciarTablero() {
		
	}
	public void mover(int pNum,Jugador pJugador) {
		Casilla casillaInic = this.buscarCasilla(pJugador);
		Casilla casillaF=null;
		int i = casillaInic.getNumCasilla();		
		i = i-1;    //Restamos uno para el Id del array
		i=i+pNum;
		casillaF = this.lista.get(i);
		casillaF.ponerJugador(pJugador, casillaInic);
		i++;
		
		
	}
	

}