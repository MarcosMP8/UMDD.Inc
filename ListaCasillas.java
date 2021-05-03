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
			else if (pos==4 ||pos==13 ||pos==22 || pos==31 || pos==40 || pos==49 /*pos==58*/ ){
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
				Casilla casillaDesplazamiento= new CasillaDesplazamiento(pos+1,27);
				this.lista.add(casillaDesplazamiento);
			}
			else if(pos==52) {
				Casilla casillaDesplazamiento= new CasillaDesplazamiento(pos+1,-27);
				this.lista.add(casillaDesplazamiento);
			}
			else if(pos==41) {
				Casilla casillaDesplazamientoNoTirar= new CasillaDesplazamientoNoTirar(pos+1,-12);
				this.lista.add(casillaDesplazamientoNoTirar);
			}
			else if (pos==57) {
				Casilla casillaDesplazamientoNoTirar= new CasillaDesplazamientoNoTirar(pos+1,-57);
				this.lista.add(casillaDesplazamientoNoTirar);
			}
			else {
				Casilla casillaNormal= new Normal(pos+1);
				this.lista.add(casillaNormal);
			}
		}
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
		int fin=this.lista.size();
		int idx=0;
		if (i+pNum<=fin) {
			i = i-1; //Restamos uno para el Id del array
			i=i+pNum;
			casillaF = this.lista.get(i);
			casillaF.ponerJugador(pJugador, casillaInic);
		}
		else {
			i=i+pNum;
			i=i-fin;
			idx=fin-i;
			idx=idx-1;
			casillaF = this.lista.get(idx);
			casillaF.ponerJugador(pJugador, casillaInic);
		}
		i++;		
	}	
	
	/*public void mover(int pNum, Jugador pJugador){
		Casilla casillaInic = this.buscarCasilla(pJugador);
		Casilla casillaF=null;
		int i = casillaInic.getNumCasilla();
		int idx = casillaInic.getNumCasilla();
		int indice;
		int fin=this.lista.size();
		i--;
		i=i+pNum;
		if (i>fin) {
			idx=i-fin;
			casillaF=this.lista.get(fin-idx);
			casillaF.ponerJugador(pJugador, casillaInic);
		}else {
			i=i+pNum;
			casillaF = this.lista.get(i);
			casillaF.ponerJugador(pJugador, casillaInic);
		}
		
		
	}*/
}