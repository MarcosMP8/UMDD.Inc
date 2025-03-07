package TrabajoOca;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPrincipal {
	Jugador j1,j2,j3;
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
	}

	@Test
	void testComprobarTodo() {
		System.out.println("TEST: comprobarVictoria");
		ListaCasillas lista1=ListaCasillas.getListaCasillas();
		Casilla estaCasilla=lista1.getCasilla(1);
		
		Casilla unaCasilla1=null;
		Casilla unaCasilla2=null;
		Casilla unaCasilla3=null;
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("El jugador1 tiene de color" + j1.getColor());
		System.out.println("El jugador2 tiene de color" + j2.getColor());
		System.out.println("El jugador3 tiene de color" + j3.getColor());
		
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
		System.out.println("");
		System.out.println("");
		System.out.println("Casilla Normal");
		lista1.mover(14, j1);
		unaCasilla1=lista1.buscarCasilla(j1);
		System.out.println("El jugador ha caido en la casilla" + unaCasilla1.getNumCasilla());
		unaCasilla1.realizarAccion(j1);
		unaCasilla1=lista1.buscarCasilla(j1);
		System.out.println("El jugador ahora esta en la casilla" + unaCasilla1.getNumCasilla());
		System.out.println("");
		System.out.println("");
		
		
		
		System.out.println("TEST: Parte3 CasillasEsperaTurnos");
		System.out.println("");
		System.out.println("");
		System.out.println("Casillas de Puente");
		
		lista1.mover(5, j2);
		unaCasilla2=lista1.buscarCasilla(j2);
		System.out.println("El jugador ha caido en la casilla" + unaCasilla2.getNumCasilla());
		unaCasilla2.realizarAccion(j2);
		unaCasilla2=lista1.buscarCasilla(j2);
		System.out.println("El jugador ahora esta en la casilla" + unaCasilla2.getNumCasilla());
		assertEquals(unaCasilla2.getNumCasilla(),12);
		
		
		System.out.println("");
		System.out.println("");
		
		
		
		estaCasilla.ponerJugador(j2, unaCasilla2);
		lista1.mover(11, j2);
		unaCasilla2=lista1.buscarCasilla(j2);
		System.out.println("El jugador ha caido en la casilla" + unaCasilla2.getNumCasilla());
		unaCasilla2.realizarAccion(j2);
		unaCasilla2=lista1.buscarCasilla(j2);
		System.out.println("El jugador ahora esta en la casilla" + unaCasilla2.getNumCasilla());
		assertEquals(unaCasilla2.getNumCasilla(),6);
		
		System.out.println("");
		System.out.println("");
		System.out.println("Casillas de Dados");
		
		lista1.mover(25, j3);
		unaCasilla3=lista1.buscarCasilla(j3);
		System.out.println("El jugador ha caido en la casilla" + unaCasilla3.getNumCasilla());
		unaCasilla3.realizarAccion(j3);
		unaCasilla3=lista1.buscarCasilla(j3);
		System.out.println("El jugador ahora esta en la casilla" + unaCasilla3.getNumCasilla());
		assertEquals(unaCasilla3.getNumCasilla(),53);
		
		
		System.out.println("");
		System.out.println("");
		
		
		
		estaCasilla.ponerJugador(j3, unaCasilla3);
		lista1.mover(52, j3);
		unaCasilla3=lista1.buscarCasilla(j3);
		System.out.println("El jugador ha caido en la casilla" + unaCasilla3.getNumCasilla());
		unaCasilla3.realizarAccion(j3);
		unaCasilla3=lista1.buscarCasilla(j3);
		System.out.println("El jugador ahora esta en la casilla" + unaCasilla3.getNumCasilla());
		assertEquals(unaCasilla3.getNumCasilla(),26);
		System.out.println("");
		System.out.println("");
		
		
		
		System.out.println("Test Mover");
		System.out.println("");
		
		System.out.println("Movimiento hacia delante");
		estaCasilla.ponerJugador(j1, unaCasilla1);
		System.out.println("El jugador ha caido en la casilla" + estaCasilla.getNumCasilla());
		lista1.mover(2, j1);
		unaCasilla1=lista1.buscarCasilla(j1);
		System.out.println("El jugador ha caido en la casilla" + unaCasilla1.getNumCasilla());
		System.out.println("");
		
		
		System.out.println("Movimiento hacia atras");
		lista1.mover(-1, j1);
		unaCasilla1=lista1.buscarCasilla(j1);
		System.out.println("El jugador ha caido en la casilla" + unaCasilla1.getNumCasilla());
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		
		System.out.println("Test Rebote en el final");
		System.out.println("");
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
		
		lista1.mover(59, j1);
		unaCasilla1=lista1.buscarCasilla(j1);
		System.out.println("El jugador ha caido en la casilla" + unaCasilla1.getNumCasilla());
		lista1.mover(5, j1);
		unaCasilla1=lista1.buscarCasilla(j1);
		System.out.println("El jugador ha caido en la casilla" + unaCasilla1.getNumCasilla());
		estaCasilla.ponerJugador(j1, unaCasilla1);
		unaCasilla1=lista1.buscarCasilla(j1);
		System.out.println("El jugador esta en la casilla" + unaCasilla1.getNumCasilla());
		lista1.mover(59, j1);
		unaCasilla1=lista1.buscarCasilla(j1);
		System.out.println("El jugador ha caido en la casilla" + unaCasilla1.getNumCasilla());
		lista1.mover(1, j1);
		unaCasilla1=lista1.buscarCasilla(j1);
		System.out.println("El jugador ha caido en la casilla" + unaCasilla1.getNumCasilla());
		lista1.mover(1, j1);
		unaCasilla1=lista1.buscarCasilla(j1);
		System.out.println("El jugador ha caido en la casilla" + unaCasilla1.getNumCasilla());
		lista1.mover(1, j1);
		unaCasilla1=lista1.buscarCasilla(j1);
		System.out.println("El jugador ha caido en la casilla" + unaCasilla1.getNumCasilla());
		assertTrue(ListaJugadores.getListaJugadores().comprobarVictoria(j1));
		lista1.mover(1, j1);
		unaCasilla1=lista1.buscarCasilla(j1);
		System.out.println("El jugador ha caido en la casilla" + unaCasilla1.getNumCasilla());
		
		
	}
	}


