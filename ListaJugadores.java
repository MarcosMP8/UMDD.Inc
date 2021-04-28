package TrabajoOca;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaJugadores {
	//Atributos
	private ArrayList <Jugador> lista;
	private static ListaJugadores miListaJugadores;
	private int minimoJugador = 2;
	private int maximoJugador = 4;
	private int posicion=-1;
	
	//Constructora
	private ListaJugadores() {
		this.lista = new ArrayList <Jugador>();
		
	}	
	//Otros Metodos
	public static ListaJugadores getListaJugadores() {
		if (ListaJugadores.miListaJugadores == null) {
			ListaJugadores.miListaJugadores= new ListaJugadores();
		}
		
		return ListaJugadores.miListaJugadores;
	}
	private Iterator <Jugador> getIterador(){
		return this.lista.iterator();
	}
	public void elegirNumJugadores(int pNum) {
		if (pNum < minimoJugador || pNum > maximoJugador) {
			System.out.println("El numero de jugadores tiene que ser entre 2 y 4 ");
			
				
			}
		else if(pNum==2) {
			Jugador j1 = new Jugador(0,"Rojo", 1);
			this.lista.add(j1);
			Jugador j2 = new Jugador(0,"Verde", 2);
			this.lista.add(j2);
			
		}
		else if (pNum==3) {
			Jugador j1 = new Jugador(0,"Rojo", 1);
			this.lista.add(j1);
			Jugador j2 = new Jugador(0,"Verde", 2);
			this.lista.add(j2);
			Jugador j3 = new Jugador(0,"Azul", 3);
			this.lista.add(j3);
		}
		else {
			Jugador j1 = new Jugador(0,"Rojo", 1);
			this.lista.add(j1);
			Jugador j2 = new Jugador(0,"Verde", 2);
			this.lista.add(j2);
			Jugador j3 = new Jugador(0,"Azul", 3);
			this.lista.add(j3);
			Jugador j4 = new Jugador(0,"Amarillo", 4);
			this.lista.add(j4);
		}
	}
	public Jugador elegirJugador(int pNum) {
		return this.lista.get(pNum);
	}
	public boolean volverAlPrimero(int pNum) {
		if (pNum == this.lista.size()-1) {
			return true;
		}
		return false;
	}
	
	public boolean comprobarVictoria(Jugador pJugador) {
		Casilla cas = ListaCasillas.getListaCasillas().buscarCasilla(pJugador);
		if (cas.getNumCasilla()==63) {
			return true;
		}
		return false;
	}
	
	public void jugarPartida() {
		boolean victoria=false;
		int pNum;
		//System.out.println("Te damos la Bienvenida a la Oca Supreme "); // Poner algo crema de bienvenida
		//System.out.println("");// Aqui mediante un mensaje pedimos el numero de jugadores
		pNum=Teclado.getTeclado().elegirNumeroJugadores(); //Pide al teclado un numero
		this.elegirNumJugadores(pNum); //Añade los jugadores a la lista con sus respectivos colores
		while (!victoria) {
			
		}	
	}
}
