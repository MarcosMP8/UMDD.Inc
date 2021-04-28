package packlaboratorio7;

public class CursoBaile
{
	// atributos
	private static CursoBaile miCursoBaile = null;

	// constructora
	private CursoBaile() {}
	
	// otros métodos

	/**
	 * @return la única instancia de CursoBaile
	 */
	public static CursoBaile getCursoBaile()
	{
		if (CursoBaile.miCursoBaile == null) {
			CursoBaile.miCursoBaile = new CursoBaile();
		}
		return CursoBaile.miCursoBaile;
	}

	/**
	 * 
	 * @param pDNI1
	 * @param pDNI2
	 *            post: se da de alta la pareja compuesta por los alumnos cuyos
	 *            DNI son pDNI1 y pDNI2, excepto si el DNI de alguno de los dos
	 *            no se corresponde con el de ningún alumno de la lista de alumnos
	 *            del curso de baile, se trata de dos alumnos del mismo sexo, o
	 *            alguno de ellos ya tiene pareja en el curso, en cuyo caso se
	 *            avisa por pantalla con el mensaje correspondiente y no se da
	 *            de alta la nueva pareja.
	 */
	public void darDeAltaPareja(String pDNI1, String pDNI2)
	{
		
	}

	/**
	 * 
	 * @param pDNI
	 * @param pNombre
	 * @param pEdad
	 * @param pSexo
	 *            post: si el carácter pSexo es 'h' o 'H' se da de alta un nuevo
	 *            alumno de tipo Hombre. si el carácter pSexo es 'm' o 'M' se da
	 *            de alta un nuevo alumno de tipo Mujer. El DNI, el nombre y la
	 *            edad del nuevo alumno vienen dados por los parámetros pDNI, pNombre
	 *            y pEdad. Si el carácter pSexo tiene cualquier otro valor, se avisa
	 *            por pantalla y no se da de alta a ningún alumno. Si ya existe un
	 *            alumno/a cuyo DNI es igual a pDNI, entonces no se le da de alta.
	 */
	public void darDeAltaAlumno(String pDNI, String pNombre, int pEdad, char pSexo)
	{
		
	}

	/**
	 * 
	 * @param pIdQuien
	 * @param pIdSuPreferencia
	 *            post: se añade el alumno con DNI pIdSuPreferencia a la lista
	 *            de preferencias del alumno con DNI pIdQuien
	 */
	public void anadirPreferencia(String pIdQuien, String pIdSuPreferencia)
	{
		
	}

	/**
	 * post: se resetean las listas de parejas y de alumnos del curso
	 */
	public void empezarCurso()
	{
		ListaParejas.getListaParejas().resetear();
		ListaAlumnosCurso.getListaAlumnosCurso().resetear();
	}

	/**
	 * post: si quedan alumnos sin emparejar se muestra un mensaje por consola,
	 * y si no, se reajustan las parejas del curso.
	 */
	public void ajustarParejasSegunPreferencias()
	{

	}
}
