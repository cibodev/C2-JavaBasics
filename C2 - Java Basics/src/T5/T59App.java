/**
 * 
 */
package T5;

/**
 * @author Christian Rivas Pottier 
 * 
 * 3 feb. 2021
 *
 */
public class T59App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {
			if (i%2==0 && i%3==0) {//he usado el residuo para saber si son divisibles con el numero en quetion ademas de un AND con el &&
				System.out.println(i);
			}
			
		}

	}

}
