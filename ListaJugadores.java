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
		Casilla casilla1=null;
		if (pNum < minimoJugador || pNum > maximoJugador) {
			System.out.println("El numero de jugadores tiene que ser entre 2 y 4 ");			
			}
		else if(pNum==2) {
			Jugador j1 = new Jugador(0,"Rojo", 1);
			this.lista.add(j1);
			Casilla unaCasilla1=ListaCasillas.getListaCasillas().getCasilla(1);
			unaCasilla1.ponerJugador(j1, casilla1);
			Jugador j2 = new Jugador(0,"Verde", 2);
			this.lista.add(j2);	
			Casilla unaCasilla2=ListaCasillas.getListaCasillas().getCasilla(1);
			unaCasilla2.ponerJugador(j2, casilla1);
			
		}
		else if (pNum==3) {
			Jugador j1 = new Jugador(0,"Rojo", 1);
			this.lista.add(j1);
			Casilla unaCasilla1=ListaCasillas.getListaCasillas().getCasilla(1);
			unaCasilla1.ponerJugador(j1, casilla1);
			Jugador j2 = new Jugador(0,"Verde", 2);
			this.lista.add(j2);
			Casilla unaCasilla2=ListaCasillas.getListaCasillas().getCasilla(1);
			unaCasilla2.ponerJugador(j2, casilla1);
			Jugador j3 = new Jugador(0,"Azul", 3);
			this.lista.add(j3);
			Casilla unaCasilla3=ListaCasillas.getListaCasillas().getCasilla(1);
			unaCasilla3.ponerJugador(j3, casilla1);
		}
		else {
			Jugador j1 = new Jugador(0,"Rojo", 1);
			this.lista.add(j1);
			Casilla unaCasilla1=ListaCasillas.getListaCasillas().getCasilla(1);
			unaCasilla1.ponerJugador(j1, casilla1);
			Jugador j2 = new Jugador(0,"Verde", 2);
			this.lista.add(j2);
			Casilla unaCasilla2=ListaCasillas.getListaCasillas().getCasilla(1);
			unaCasilla2.ponerJugador(j2, casilla1);
			Jugador j3 = new Jugador(0,"Azul", 3);
			this.lista.add(j3);
			Casilla unaCasilla3=ListaCasillas.getListaCasillas().getCasilla(1);
			unaCasilla3.ponerJugador(j3, casilla1);
			Jugador j4 = new Jugador(0,"Amarillo", 4);
			this.lista.add(j4);
			Casilla unaCasilla4=ListaCasillas.getListaCasillas().getCasilla(1);
			unaCasilla4.ponerJugador(j4, casilla1);
		}
	}
	
	public Jugador elegirJugador(int pNum) {
		return this.lista.get(pNum);
	}
	public void setPosicion(int pPosicion) {
		this.posicion=pPosicion;
	}
	
	public boolean volverAlPrimero(int pNum) {
		if (pNum == this.lista.size()-1) {
			return true;
		}
		return false;
	}
	
	public boolean comprobarVictoria(Jugador pJugador) {
		Casilla cas = ListaCasillas.getListaCasillas().buscarCasilla(pJugador);
		int longitud = ListaCasillas.getListaCasillas().longitudTablero();
		if (cas.getNumCasilla()==longitud) {
			return true;
		}
			return false;
	}
	
	public void volverATirar() {
		this.posicion--;
		
	}
	
	public void jugarPartida() {
		boolean victoria=false;
		int pNum;
		int pNumDado;
		Casilla actualCasilla;
		System.out.println("Te damos la Bienvenida a la Oca Supreme de UMDD.Inc ");
		System.out.println("Podeis jugar entre dos y cuatro.");
		System.out.println("�Cuantos jugadores sois?");
		pNum=Teclado.getTeclado().elegirNumeroJugadores(); //Pide al teclado un numero
		System.out.println("El primero que llegue a la casilla 63 gana");
		System.out.println("Suerte a los " +pNum);
		this.elegirNumJugadores(pNum); //A�ade los jugadores a la lista con sus respectivos colores y pone cada jugador en la primera Casilla
		System.out.println("Empieza la partida");		
		while (!victoria) {  //Entra si no ha ganado nadie
			Teclado.getTeclado().pulsaTeclaParaContinuar();
			this.posicion++;
			Jugador pJugador=this.elegirJugador(this.posicion);
			System.out.println("Es tu turno Jugador " +pJugador.getColor());
			if (pJugador.getTurnoParado()==0) {   //Mira si puede tirar
				actualCasilla=ListaCasillas.getListaCasillas().buscarCasilla(pJugador);
				System.out.println("Estas en la casilla " +actualCasilla.getNumCasilla());
				System.out.println("No tienes que esperar, puedes moverte "+pJugador.getColor()+"."); //Mensaje en la pantalla 
				Teclado.getTeclado().pulsaTeclaParaContinuar();  //Pide al usuario que de al intro para tirar dado. He pensado estopara que sea mas interactivo con el usuario.
				pNumDado=Dado.getDado().lanzarDado();  //Llama al dado para que lance
				System.out.println("Ha salido en el dado un "+ pNumDado+" y avanzas");
				ListaCasillas.getListaCasillas().mover(pNumDado, pJugador); //Hace el metodo mover
				actualCasilla=ListaCasillas.getListaCasillas().buscarCasilla(pJugador); //Pide que busque a ListaCasillas donde se ha colocado el jugador. Lo hago esto para saber que casilla esta y despues hacer el metodo realizar accion. No me complico metiendo el realizar accion dentro de mover. 
				System.out.println("Has avanzado hasta la casilla "+actualCasilla.getNumCasilla());
				actualCasilla.realizarAccion(pJugador); //Realiza la accion
				actualCasilla=ListaCasillas.getListaCasillas().buscarCasilla(pJugador);
				System.out.println("El jugador " +pJugador.getColor()+" esta en la casilla "+ actualCasilla.getNumCasilla()+ " con Turnos parados  "+pJugador.getTurnoParado());
				if (this.comprobarVictoria(pJugador)) {
					victoria=true;
					System.out.println("Enhorabuena, has ganado_"+pJugador.getColor()+"...os esperamos para la siguiente :)");
				}
			}
			else {
				System.out.println("Lo siento, tendras que esperar "+pJugador.getColor()+"  al menos es un turno menos :)");
				pJugador.setTurnosParados(-1);
				actualCasilla=ListaCasillas.getListaCasillas().buscarCasilla(pJugador);
				System.out.println("El jugador " +pJugador.getColor()+" esta en la casilla "+ actualCasilla.getNumCasilla()+ " con Turnos parados  "+pJugador.getTurnoParado());
			} 		
			if (this.volverAlPrimero(this.posicion)){
					this.posicion=-1;  
			}
		}		
	}
	
	public static void main(String[] args) {
		ListaJugadores lj= ListaJugadores.getListaJugadores();
		lj.jugarPartida();
	}
}