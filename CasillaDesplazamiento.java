package trabajoOca;


	public class CasillaDesplazamiento extends Casilla {

		
		//Constructora
		public CasillaDesplazamiento(int pNumCasillas) {
			super(pNumCasillas);
		
		}
		//Otros Metodos	
		public void realizarAccion(Jugador pJugador) {
			int n=0;
			int casilla=this.getNumCasilla();
			if (casilla==5 || casilla==9 || casilla==14 || casilla==18 ||casilla==23 || casilla==27 ||(casilla==32) || casilla==36 || casilla==41 || casilla==45 || casilla==50 || casilla==54 || casilla==59) {
				if (casilla==5 || casilla==14 || casilla==23 || casilla==32 ||casilla==41 || casilla==50 || casilla==59){
					n=4;
					ListaCasillas.getListaCasillas().mover(n, pJugador);
					ListaJugadores.getListaJugadores().volverATirar();
				}
				else {
					n=5;
					ListaCasillas.getListaCasillas().mover(n, pJugador);
					ListaJugadores.getListaJugadores().volverATirar();
				}
				
			}
			if (casilla==6) {
				n=6;
				ListaCasillas.getListaCasillas().mover(n, pJugador);
				ListaJugadores.getListaJugadores().volverATirar();
			}
			if (casilla==12) {
				n=-6;
				ListaCasillas.getListaCasillas().mover(n, pJugador);
				ListaJugadores.getListaJugadores().volverATirar();
			}
			if (casilla==26) {
				n=27;
				ListaCasillas.getListaCasillas().mover(n, pJugador);
				
				
			}
			if(casilla==53) {
				n=-27;
				ListaCasillas.getListaCasillas().mover(n, pJugador);
				
				
			}
			if(casilla==42) {
				n=-12;
				ListaCasillas.getListaCasillas().mover(n, pJugador);
				
				
			}
			if(casilla==58) {
				n=-57;
				ListaCasillas.getListaCasillas().mover(n, pJugador);
				
				
			}
		}
		
	}
