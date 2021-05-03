package TrabajoOca;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListaJugadoresTest {
	Jugador j1,j2,j3;
	//ListaJugadores lista1;
	//ListaCasillas lista2;

	@BeforeEach
	void setUp() throws Exception {
		ListaJugadores.getListaJugadores().setPosicion(0);
		ListaJugadores.getListaJugadores().elegirNumJugadores(3);
		j1=ListaJugadores.getListaJugadores().elegirJugador(0);
		j2=ListaJugadores.getListaJugadores().elegirJugador(1);
		j3=ListaJugadores.getListaJugadores().elegirJugador(2);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		j1=null;
		j2=null;
		j3=null;
	}

	//@Test
	//id testGetListaJugadores() {
		//fail("Not yet implemented");
	//}

	//@Test
	//void testElegirNumJugadores() {
	//}

	//@Test
	//void testElegirJugador() {
		//fail("Not yet implemented");
	//}

	//@Test
	//void testVolverAlPrimero() {
		//fail("Not yet implemented");
	//}
	
	@Test
	void testComprobarVictoria() {
		System.out.println("TEST: comprobarVictoria");
		ListaCasillas lista1=ListaCasillas.getListaCasillas();
		Casilla estaCasilla=lista1.getCasilla(1);
		
		Casilla unaCasilla1=null;
		Casilla unaCasilla2=null;
		Casilla unaCasilla3=null;
		
		estaCasilla.ponerJugador(j1, unaCasilla1);
		estaCasilla.ponerJugador(j2, unaCasilla2);
		estaCasilla.ponerJugador(j3, unaCasilla3);
		
		unaCasilla1=lista1.buscarCasilla(j1);
		unaCasilla2=lista1.buscarCasilla(j2);
		unaCasilla3=lista1.buscarCasilla(j3);
		
		
		System.out.println("El jugador esta en la casilla" + unaCasilla1.getNumCasilla());
		System.out.println("El jugador esta en la casilla" + unaCasilla2.getNumCasilla());
		System.out.println("El jugador esta en la casilla" + unaCasilla3.getNumCasilla());
		
		assertEquals(1,unaCasilla1.getNumCasilla());
		assertEquals(1,unaCasilla2.getNumCasilla());
		assertEquals(1,unaCasilla3.getNumCasilla());
		
		lista1.mover(62, j1);
		lista1.mover(61, j2);
		lista1.mover(58, j3);
		
		System.out.println("");
		System.out.println("Los Jugadores se han movido");
		System.out.println("");
		
		unaCasilla1=lista1.buscarCasilla(j1);
		unaCasilla2=lista1.buscarCasilla(j2);
		unaCasilla3=lista1.buscarCasilla(j3);
		
		System.out.println("El jugador esta en la casilla" + unaCasilla1.getNumCasilla());
		System.out.println("El jugador esta en la casilla" + unaCasilla2.getNumCasilla());
		System.out.println("El jugador esta en la casilla" + unaCasilla3.getNumCasilla());
		
		assertEquals(63,unaCasilla1.getNumCasilla());
		assertEquals(62,unaCasilla2.getNumCasilla());
		assertEquals(59,unaCasilla3.getNumCasilla());
		
		assertTrue(ListaJugadores.getListaJugadores().comprobarVictoria(j1));
		assertFalse(ListaJugadores.getListaJugadores().comprobarVictoria(j2));
		assertFalse(ListaJugadores.getListaJugadores().comprobarVictoria(j3));
		
		System.out.println("");
		System.out.println("-----------------------------------------------------------");
		System.out.println("");
		System.out.println("TEST: realizarAccion");
		System.out.println("");
		System.out.println("");
		System.out.println("TEST: Parte1 CasillasEsperaTurnos");
		System.out.println("");
		
		estaCasilla.ponerJugador(j1, unaCasilla1);
		estaCasilla.ponerJugador(j2, unaCasilla2);
		estaCasilla.ponerJugador(j3, unaCasilla3);
		
		unaCasilla1=lista1.buscarCasilla(j1);
		unaCasilla2=lista1.buscarCasilla(j2);
		unaCasilla3=lista1.buscarCasilla(j3);
		
		System.out.println("El jugador esta en la casilla" + unaCasilla1.getNumCasilla());
		System.out.println("El jugador esta en la casilla" + unaCasilla2.getNumCasilla());
		System.out.println("El jugador esta en la casilla" + unaCasilla3.getNumCasilla());
		
		System.out.println("");
		System.out.println("");
		
		lista1.mover(18, j1);
		unaCasilla1=lista1.buscarCasilla(j1);
		unaCasilla1.realizarAccion(j1);
		unaCasilla1=lista1.buscarCasilla(j1);
		System.out.println("El jugador esta en la casilla" + unaCasilla1.getNumCasilla());
		System.out.println("" +j1.getTurnoParado());
		assertEquals(19, unaCasilla1.getNumCasilla());
		assertEquals(2,j1.getTurnoParado());
		
		System.out.println("");
		System.out.println("-----------------------------------------------------------");
		System.out.println("");
		
		lista1.mover(55, j2);
		unaCasilla2=lista1.buscarCasilla(j2);
		unaCasilla2.realizarAccion(j2);
		unaCasilla2=lista1.buscarCasilla(j2);
		System.out.println("El jugador esta en la casilla" + unaCasilla2.getNumCasilla());
		System.out.println("" +j2.getTurnoParado());
		assertEquals(56, unaCasilla2.getNumCasilla());
		assertEquals(3,j2.getTurnoParado());
		
		System.out.println("");
		System.out.println("-----------------------------------------------------------");
		System.out.println("");
		
		lista1.mover(30, j3);
		unaCasilla3=lista1.buscarCasilla(j3);
		unaCasilla3.realizarAccion(j3);
		unaCasilla3=lista1.buscarCasilla(j3);
		System.out.println("El jugador esta en la casilla" + unaCasilla3.getNumCasilla());
		System.out.println("" +j3.getTurnoParado());
		assertEquals(31, unaCasilla3.getNumCasilla());
		assertEquals(4,j3.getTurnoParado());
		
		System.out.println("");
		System.out.println("");
		System.out.println("TEST: Parte2 CasillasDesplazamientos");
		System.out.println("");
		System.out.println("");
		System.out.println("Casillas de la Oca");
		
		estaCasilla.ponerJugador(j1, unaCasilla1);
		estaCasilla.ponerJugador(j2, unaCasilla2);
		estaCasilla.ponerJugador(j3, unaCasilla3);
		
		unaCasilla1=lista1.buscarCasilla(j1);
		unaCasilla2=lista1.buscarCasilla(j2);
		unaCasilla3=lista1.buscarCasilla(j3);
		
		System.out.println("El jugador esta en la casilla" + unaCasilla1.getNumCasilla());
		System.out.println("El jugador esta en la casilla" + unaCasilla2.getNumCasilla());
		System.out.println("El jugador esta en la casilla" + unaCasilla3.getNumCasilla());
		
		System.out.println("");
		System.out.println("");
		
		lista1.mover(8, j1);
		unaCasilla1=lista1.buscarCasilla(j1);
		System.out.println("El jugador ha caido en la casilla" + unaCasilla1.getNumCasilla());
		unaCasilla1.realizarAccion(j1);
		unaCasilla1=lista1.buscarCasilla(j1);
		System.out.println("El jugador ahora esta en la casilla" + unaCasilla1.getNumCasilla());
		assertEquals(unaCasilla1.getNumCasilla(),14);
		
		System.out.println("");
		System.out.println("");
		
		lista1.mover(4, j1);
		unaCasilla1=lista1.buscarCasilla(j1);
		System.out.println("El jugador ha caido en la casilla" + unaCasilla1.getNumCasilla());
		unaCasilla1.realizarAccion(j1);
		unaCasilla1=lista1.buscarCasilla(j1);
		System.out.println("El jugador ahora esta en la casilla" + unaCasilla1.getNumCasilla());

		System.out.println("");
		System.out.println("");
		
		lista1.mover(4, j1);
		unaCasilla1=lista1.buscarCasilla(j1);
		System.out.println("El jugador ha caido en la casilla" + unaCasilla1.getNumCasilla());
		unaCasilla1.realizarAccion(j1);
		unaCasilla1=lista1.buscarCasilla(j1);
		System.out.println("El jugador ahora esta en la casilla" + unaCasilla1.getNumCasilla());
		
		System.out.println("");
		System.out.println("");
		
		lista1.mover(9, j1);
		unaCasilla1=lista1.buscarCasilla(j1);
		System.out.println("El jugador ha caido en la casilla" + unaCasilla1.getNumCasilla());
		unaCasilla1.realizarAccion(j1);
		unaCasilla1=lista1.buscarCasilla(j1);
		System.out.println("El jugador ahora esta en la casilla" + unaCasilla1.getNumCasilla());
		
		System.out.println("");
		System.out.println("");
		
		lista1.mover(14, j1);
		unaCasilla1=lista1.buscarCasilla(j1);
		System.out.println("El jugador ha caido en la casilla" + unaCasilla1.getNumCasilla());
		unaCasilla1.realizarAccion(j1);
		unaCasilla1=lista1.buscarCasilla(j1);
		System.out.println("El jugador ahora esta en la casilla" + unaCasilla1.getNumCasilla());
		
		
		
		
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("Casillas de Puente");
		
		lista1.mover(5, j2);
		unaCasilla2=lista1.buscarCasilla(j2);
		System.out.println("El jugador ha caido en la casilla" + unaCasilla2.getNumCasilla());
		unaCasilla2.realizarAccion(j2);
		unaCasilla2=lista1.buscarCasilla(j2);
		System.out.println("El jugador ahora esta en la casilla" + unaCasilla2.getNumCasilla());
		
		
		
		System.out.println("");
		System.out.println("");
		
		
		
		estaCasilla.ponerJugador(j2, unaCasilla2);
		lista1.mover(11, j2);
		unaCasilla2=lista1.buscarCasilla(j2);
		System.out.println("El jugador ha caido en la casilla" + unaCasilla2.getNumCasilla());
		unaCasilla2.realizarAccion(j2);
		unaCasilla2=lista1.buscarCasilla(j2);
		System.out.println("El jugador ahora esta en la casilla" + unaCasilla2.getNumCasilla());
		
		System.out.println("");
		System.out.println("");
		System.out.println("Casillas de Dados");
		
		lista1.mover(25, j3);
		unaCasilla3=lista1.buscarCasilla(j3);
		System.out.println("El jugador ha caido en la casilla" + unaCasilla3.getNumCasilla());
		unaCasilla3.realizarAccion(j3);
		unaCasilla3=lista1.buscarCasilla(j3);
		System.out.println("El jugador ahora esta en la casilla" + unaCasilla3.getNumCasilla());
		
		
		
		System.out.println("");
		System.out.println("");
		
		
		
		estaCasilla.ponerJugador(j3, unaCasilla3);
		lista1.mover(52, j3);
		unaCasilla3=lista1.buscarCasilla(j3);
		System.out.println("El jugador ha caido en la casilla" + unaCasilla3.getNumCasilla());
		unaCasilla3.realizarAccion(j3);
		unaCasilla3=lista1.buscarCasilla(j3);
		System.out.println("El jugador ahora esta en la casilla" + unaCasilla3.getNumCasilla());
		
		System.out.println("");
		System.out.println("");
		estaCasilla.ponerJugador(j1, unaCasilla1);
		System.out.println("El jugador ha caido en la casilla" + estaCasilla.getNumCasilla());
		lista1.mover(2, j1);
		unaCasilla1=lista1.buscarCasilla(j1);
		System.out.println("El jugador ha caido en la casilla" + unaCasilla1.getNumCasilla());
		lista1.mover(-1, j1);
		unaCasilla1=lista1.buscarCasilla(j1);
		System.out.println("El jugador ha caido en la casilla" + unaCasilla1.getNumCasilla());
		
	}
	
	
	

	//@Test
	//void testVolverATirar() {
		//fail("Not yet implemented");
	//}

	//@Test
	//void testJugarPartida() {
		//fail("Not yet implemented");
	//}

}
