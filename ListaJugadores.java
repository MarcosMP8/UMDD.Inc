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
	public void setPosicion(int pPosicion) {
		this.posicion=pPosicion;
	}
	
	public boolean volverAlPrimero(int pNum) {
		if (pNum == this.lista.size()-1) {
			return true;
		}
		return false;
	}
	
	//public boolean comprobarVictoria(Jugador pJugador) {
		//Casilla cas = ListaCasillas.getListaCasillas().buscarCasilla(pJugador);
		//if (cas.getNumCasilla()==63) {
			//return true;
		//}
		//return false;
	//}
	
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
		System.out.println("Vuelves a tirar,suerte");
	}
	
	public void jugarPartida() {
		boolean victoria=false;
		int pNum;
		int pNumDado;
		Casilla actualCasilla;
		System.out.println("Te damos la Bienvenida a la Oca Supreme de UMDD.Inc ");
		System.out.println("Podeis jugar entre dos y cuatro.");
		System.out.println("¿Cuantos jugadores sois?");
		pNum=Teclado.getTeclado().elegirNumeroJugadores(); //Pide al teclado un numero
		this.elegirNumJugadores(pNum); //Añade los jugadores a la lista con sus respectivos colores
		while (!victoria) {  //Entra si no ha ganado nadie 
			this.posicion++;
			Jugador pJugador=this.elegirJugador(this.posicion);
			if (pJugador.getTurnoParado()==0) {   //Mira si puede tirar
				System.out.println("Tienes suerte, puedes moverte"+pJugador.getColor()+"."); //Mensaje en la pantalla 
				Teclado.getTeclado().pulsaTeclaParaContinuar();  //Pide al usuario que de al intro para tirar dado. He pensado estopara que sea mas interactivo con el usuario.
				pNumDado=Dado.getDado().lanzarDado();  //Llama al dado para que lance
				ListaCasillas.getListaCasillas().mover(pNumDado, pJugador); //Hace el metodo mover
				actualCasilla=ListaCasillas.getListaCasillas().buscarCasilla(pJugador); //Pide que busque a ListaCasillas donde se ha colocado el jugador. Lo hago esto para saber que casilla esta y despues hacer el metodo realizar accion. No me complico metiendo el realizar accion dentro de mover. Mañana comentarlo.
				actualCasilla.realizarAccion(pJugador); //Realiza la accion
				if (this.comprobarVictoria(pJugador)) {
					victoria=true;
					System.out.println("Enhorabuena, has ganado"+pJugador.getColor()+".");
				}
			}
			else {
				System.out.println("Lo siento, tendras que esperar"+pJugador.getColor()+".");
				pJugador.setTurnosParados(-1);
			} 
			//Los siguientes ifs mirar porque si no vas a mover para que comprobarVictoria, en caso de volverAlPrimero se puede mirar moviendio o no
			if (this.comprobarVictoria(pJugador)) {
				victoria=true;
				System.out.println("Enhorabuena, has ganado"+pJugador.getColor()+".");
			
			}
			if (this.volverAlPrimero(this.posicion)){
					this.posicion=-1;  
			}
			//Preguntar mañana comprobarVictoria
			
			
		}
		
	}
}


// Hay dos comprobarWin porque por temas de eficiencia igual es mejor solo comprobarWin cuando el jugador se ha movido y no cuando da igual lo que haga compruebawin. Despues he inicializado posicion en 0 y en vez de actualizarlo el atributo posicion al principio de la tirada, lo hago al final. Eso discutirlo mañana aunque me gusta mas de la otra forma pero depende de como penseis.
// He modificado el metodo setTurnosParados para que se pueda disminuir incluso con ese metodo solo
// Mirar para tirar de nuevo 
// Estos dias duros, colaborando tanto cuando nos reunimos y tanto cuando no, incluido yo.