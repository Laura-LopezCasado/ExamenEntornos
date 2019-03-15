package clases;

/**
 * Esta clase contiene un array en el que se pueden buscar números.

 * @author laura.lopezcasado
 *
 */
public class Array {
	
	private int[] array =  {5, 1, 22, 9, 12, 6, 4, 8, 15, 21, 18, 17, 2, 11, 16};
	
	/**
	 * El método permite la búsqueda en el array.
	 * @param x. Es el número a buscar
	 * @return Un booleano que indica si se ha encontrado o no el número.
	 */
	public boolean busquedaLineal(int x) {
		boolean encontrado = false;
		int i=0;
		while (i < array.length && encontrado == false) {
			if (array[i] == x) {
				encontrado = true;
			}
			i++;
		}
		return encontrado;
	}

	public void incrementarValor() {
		int i = 0;
		while (i < array.length) {
			array[i] = array[i] + 1;
			i++;
		}
		System.out.println(Arrays.toString(array));
    }	
}
