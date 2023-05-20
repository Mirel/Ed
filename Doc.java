package JavaDoc;

/**
 * @author mirelle
 *
 */
public class Doc {

	/**
	 * @param item   recibe un dato de tipo int .
	 * @param nombre y uno de tipo string
	 * @return retorna un string de la posicion de una cadena
	 */
	public static String metodoCadena(int item, String nombre) {
		String posicion = nombre.substring(item);
		return posicion;
	}

	/**
	 * @param datos recibe un array de int
	 * @return retorna el numero de datos que contine ese array.
	 */
	public static int metodoArray(int[] datos) {
		return datos.length;
	}
}
