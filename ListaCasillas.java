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
		while (itr.hasNext() && !esta) {
			unaCasilla = itr.next();
			if (unaCasilla.esta(pJugador)) {
				esta = true;
			}
		}
		if (!esta) {
			unaCasilla = null;
		}
		return unaCasilla;
	}

//	public void tablero() {
	//	for (int pos=0; pos<63; ++pos) {
		//	if (pos==18 || pos==55 || pos==30 ) {
			//	Casilla casillaEsperaTurnos= new CasillaEsperaTurnos(pos+1);
				//this.lista.add(casillaEsperaTurnos);
			//}
			//else if (pos==4 || pos==5 || pos==8 || pos==11 || pos==13 || pos==17 || pos==22 || pos==25 || pos==26 || pos==31 || pos==35 || pos==40 || pos==44 || pos==49 || pos==52 || pos==53 || pos==57 || pos==58){
				//Casilla casillaDesplazamiento= new CasillaDesplazamiento(pos+1);
				//this.lista.add(casillaDesplazamiento);
			//}
			//else {
				//Casilla casillaNormal= new Normal(pos+1);
				//this.lista.add(casillaNormal);
		//	}
		//}
	//}
	
	public void tablero() {
		for (int pos=0; pos<63; ++pos) {
			if (pos==18) {
				Casilla casillaEsperaTurnos= new CasillaEsperaTurnos(pos+1,2);
				this.lista.add(casillaEsperaTurnos);
			}
			else if (pos==55) {
				Casilla casillaEsperaTurnos= new CasillaEsperaTurnos(pos+1,3);
				this.lista.add(casillaEsperaTurnos);
			}
			else if (pos==30 ) {
				Casilla casillaEsperaTurnos= new CasillaEsperaTurnos(pos+1,4);
				this.lista.add(casillaEsperaTurnos);
			}
			else if (pos==8 ||pos==17 ||pos==26 || pos==35 || pos==44 || pos==53 ){
				Casilla casillaDesplazamiento= new CasillaDesplazamiento(pos+1,5);
				this.lista.add(casillaDesplazamiento);
			}
			else if (pos==4 ||pos==13 ||pos==22 || pos==31 || pos==40 || pos==49 || pos==58 ){
				Casilla casillaDesplazamiento= new CasillaDesplazamiento(pos+1,4);
				this.lista.add(casillaDesplazamiento);
			}
			else if (pos==5) {
				Casilla casillaDesplazamiento= new CasillaDesplazamiento(pos+1,6);
				this.lista.add(casillaDesplazamiento);
			}
			else if (pos==11){
				Casilla casillaDesplazamiento= new CasillaDesplazamiento(pos+1,-6);
				this.lista.add(casillaDesplazamiento);
			}
			else if(pos==25) {
				Casilla casillaDesplazamiento= new CasillaDesplazamiento(pos+1,25);
				this.lista.add(casillaDesplazamiento);
			}
			else if(pos==52) {
				Casilla casillaDesplazamiento= new CasillaDesplazamiento(pos+1,-25);
				this.lista.add(casillaDesplazamiento);
			}
			else if(pos==41) {
				Casilla casillaDesplazamientoNoTirar= new CasillaDesplazamiento(pos+1,-12);
				this.lista.add(casillaDesplazamientoNoTirar);
			}
			else if (pos==57) {
				Casilla casillaDesplazamientoNoTirar= new CasillaDesplazamiento(pos+1,-57);
				this.lista.add(casillaDesplazamientoNoTirar);
			}
			else {
				Casilla casillaNormal= new Normal(pos+1);
				this.lista.add(casillaNormal);
			}
		}
	}
	
	public int longitudTablero(){
		return this.lista.size();
	}
	
	public void vaciarTablero() {
		Casilla estaCasilla;
		Iterator <Casilla> itr = this.getIterador();
		
		while (itr.hasNext()) {
			estaCasilla = itr.next();
			estaCasilla.limpiar();
		}
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